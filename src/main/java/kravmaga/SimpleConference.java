package kravmaga;

import java.util.List;

import kravmaga.generated.bookingservice.ArrayOfParticipant;
import kravmaga.generated.bookingservice.Conference;
import kravmaga.generated.bookingservice.Participant;

public class SimpleConference {

    private Conference conference;

    public SimpleConference(Conference conference) {
        this.conference = conference;
    }

    public void setStartTimeUtc(String startTimeUtc) {
        conference.setStartTimeUTC(startTimeUtc);
    }

    public String getStartTimeUtc() {
        return conference.getStartTimeUTC();
    }

    public void setEndTimeUtc(String endTimeUtc) {
        conference.setEndTimeUTC(endTimeUtc);
    }

    public String getEndTimeUtc() {
        return conference.getEndTimeUTC();
    }

    public void addParticipant(String callType) {
        if (conference.getParticipants() == null) {
            conference.setParticipants(new ArrayOfParticipant());
        }
        List<Participant> participants = conference.getParticipants().getParticipant();
        Participant participant = new Participant();
        participant.setParticipantCallType(callType);
        participants.add(participant);
    }

    Conference getConference() {
        return conference;
    }
}
