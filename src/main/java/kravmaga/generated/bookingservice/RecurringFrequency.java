
package kravmaga.generated.bookingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecurringFrequency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecurringFrequency">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Daily"/>
 *     &lt;enumeration value="DailyWeekday"/>
 *     &lt;enumeration value="Weekly"/>
 *     &lt;enumeration value="Monthly"/>
 *     &lt;enumeration value="Yearly"/>
 *     &lt;enumeration value="Secondly"/>
 *     &lt;enumeration value="Minutely"/>
 *     &lt;enumeration value="Hourly"/>
 *     &lt;enumeration value="Default"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RecurringFrequency")
@XmlEnum
public enum RecurringFrequency {

    @XmlEnumValue("Daily")
    DAILY("Daily"),
    @XmlEnumValue("DailyWeekday")
    DAILY_WEEKDAY("DailyWeekday"),
    @XmlEnumValue("Weekly")
    WEEKLY("Weekly"),
    @XmlEnumValue("Monthly")
    MONTHLY("Monthly"),
    @XmlEnumValue("Yearly")
    YEARLY("Yearly"),
    @XmlEnumValue("Secondly")
    SECONDLY("Secondly"),
    @XmlEnumValue("Minutely")
    MINUTELY("Minutely"),
    @XmlEnumValue("Hourly")
    HOURLY("Hourly"),
    @XmlEnumValue("Default")
    DEFAULT("Default");
    private final String value;

    RecurringFrequency(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecurringFrequency fromValue(String v) {
        for (RecurringFrequency c: RecurringFrequency.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
