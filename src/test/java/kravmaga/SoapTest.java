package kravmaga;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import kravmaga.generated.bookingservice.ArrayOfParticipant;
import kravmaga.generated.bookingservice.Conference;
import kravmaga.generated.bookingservice.Participant;

public class SoapTest {

    @Test
    public void testCreate() {
        SoapServiceSimulator simulator = new SoapServiceSimulator();
        Conference conference = new Conference();
        conference.setStartTimeUTC("2012-10-10 12:00:00Z");
        conference.setEndTimeUTC("2012-10-10 13:00:00Z");
        conference.setParticipants(new ArrayOfParticipant() {
            @Override
            public List<Participant> getParticipant() {
                return new ArrayList<Participant>();
            }
        });
        simulator.saveConference(conference);
    }
}
