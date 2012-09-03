package kravmaga;

import kravmaga.generated.bookingservice.BookingServiceSoap;

public class SimpleService {

    private final BookingServiceSoap bookingServiceSoap;

    public SimpleService(String hostname) {
        bookingServiceSoap = BookingServiceSoapFactory.createSoapConnection("vimimreg1.tms.lab", "administrator", "sat4sat!");
    }

    public SimpleConference getDefaultConference() {
        return new SimpleConference(bookingServiceSoap.getDefaultConference());
    }

    public void saveConference(SimpleConference conference) {
        bookingServiceSoap.saveConference(conference.getConference());
    }

}
