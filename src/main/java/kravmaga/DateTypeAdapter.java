package kravmaga;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;


public class DateTypeAdapter {
    private final DateFormat dateFormat;

    public static final TimeZone UTC = TimeZone.getTimeZone("UTC");

    DateTypeAdapter() {
        dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        dateFormat.setTimeZone(UTC);
    }

    public static DateFormat tmsDateFormat() {
        DateFormat result = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss'Z'", Locale.US);
        result.setTimeZone(UTC);
        return result;
    }

    public static Date parseTmsDate(String dateString) {
        try {
            return tmsDateFormat().parse(dateString);
        } catch (ParseException e) {
            return javax.xml.bind.DatatypeConverter.parseDateTime(dateString).getTime();
        }
    }

    public static String formatTMSDate(Date date) {
        return tmsDateFormat().format(date);
    }

    public static XMLGregorianCalendar asXMLGregorianCalendar(Date date) {
        if (date == null) {
            return null;
        }
        return xmlGregorianCalendarFromMillis(date.getTime());
    }

    public static XMLGregorianCalendar xmlGregorianCalendarFromMillis(long millis) {
        DatatypeFactory df = null;
        try {
            df = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException(e);
        }
        GregorianCalendar gc = new GregorianCalendar(UTC);
        gc.setTimeInMillis(millis);
        return df.newXMLGregorianCalendar(gc);
    }
}
 
