package kravmaga;

import javax.xml.namespace.QName;

import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URI;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

import kravmaga.generated.bookingservice.BookingService;
import kravmaga.generated.bookingservice.BookingServiceSoap;

public class BookingServiceSoapFactory {

    public static BookingServiceSoap createSoapConnection(String host, final String username, final String password) {
        Authenticator.setDefault(new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password.toCharArray());
            }
        });

        BookingService bookingService = null;
        try {
            bookingService = new BookingService(URI.create("http://" + host + "/tms/external/booking/bookingservice.asmx?WSDL").toURL(),
                new QName("http://tandberg.net/2004/02/tms/external/booking/", "BookingService"));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        BookingServiceSoap soap = bookingService.getBookingServiceSoap();

        Client client = ClientProxy.getClient(soap);
        HTTPConduit httpConduit = (HTTPConduit) client.getConduit();

        HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
        httpClientPolicy.setAllowChunking(false);
        httpConduit.setClient(httpClientPolicy);
        return soap;
    }
}
