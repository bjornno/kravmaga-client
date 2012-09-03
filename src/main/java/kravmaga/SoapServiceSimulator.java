package kravmaga;

import javax.jws.WebParam;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.soap.SOAPFaultException;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import kravmaga.generated.bookingservice.ArrayOfConference;
import kravmaga.generated.bookingservice.ArrayOfParticipant;
import kravmaga.generated.bookingservice.ArrayOfRecordingDevice;
import kravmaga.generated.bookingservice.ArrayOfTransaction;
import kravmaga.generated.bookingservice.BookingServiceSoap;
import kravmaga.generated.bookingservice.Conference;
import kravmaga.generated.bookingservice.ConferenceStatus;
import kravmaga.generated.bookingservice.Participant;
import kravmaga.generated.remotesetupservice.ArrayOfTMSSystem;
import kravmaga.generated.remotesetupservice.ArrayOfUser;
import kravmaga.generated.remotesetupservice.RemoteSetupServiceSoap;
import kravmaga.generated.remotesetupservice.TMSSystem;


public class SoapServiceSimulator implements RemoteSetupServiceSoap, BookingServiceSoap {

    private final HashMap<Long, TMSSystem> systems;
    private final HashMap<Long, Conference> conferences;
    private int nextId = 1;
    private boolean noAvailablePorts;

    public void setNoAvailablePorts(boolean noAvailablePorts) {
        this.noAvailablePorts = noAvailablePorts;
    }

    public SoapServiceSimulator() {
        systems = new HashMap<Long, TMSSystem>();
        TMSSystem system1 = new TMSSystem();
        system1.setSystemId(5);
        system1.setSystemName("Frank Robert");
        systems.put(system1.getSystemId(), system1);
        TMSSystem system2 = new TMSSystem();
        system2.setSystemId(6);
        system2.setSystemName("Johansen");
        systems.put(system2.getSystemId(), system2);
        conferences = new HashMap<Long, Conference>();
    }

    @Override
    public boolean setPrimarySystem(@WebParam(name = "primSys", targetNamespace = "http://tandberg.net/2004/02/tms/external/booking/remotesetup/") String primSys) {
        return false; // To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ArrayOfUser getUsers() {
        return null; // To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ArrayOfTMSSystem getSystemsForUser() {
        return null; // To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ArrayOfTMSSystem getSystems() {
        ArrayOfTMSSystem result = new ArrayOfTMSSystem();
        for (TMSSystem system : systems.values()) {
            result.getTMSSystem().add(system);
        }
        return result;
    }

    @Override
    public TMSSystem getSystemById(@WebParam(name = "TMSSystemId", targetNamespace = "http://tandberg.net/2004/02/tms/external/booking/remotesetup/") long tmsSystemId) {
        return systems.get(tmsSystemId);
    }

    @Override
    public String generateConferenceAPIUser(@WebParam(name = "userNameBase", targetNamespace = "http://tandberg.net/2004/02/tms/external/booking/remotesetup/") String userNameBase,
            @WebParam(name = "encPassword", targetNamespace = "http://tandberg.net/2004/02/tms/external/booking/remotesetup/") String encPassword,
            @WebParam(name = "emailAddress", targetNamespace = "http://tandberg.net/2004/02/tms/external/booking/remotesetup/") String emailAddress,
            @WebParam(name = "sendNotifications", targetNamespace = "http://tandberg.net/2004/02/tms/external/booking/remotesetup/") boolean sendNotifications) {
        return null; // To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void disableConferenceAPIUser(@WebParam(name = "userName", targetNamespace = "http://tandberg.net/2004/02/tms/external/booking/remotesetup/") String userName) {
        // To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isAlive() {
        return false; // To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isTMSSiteAdmin() {
        return false; // To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isTMSServiceUser() {
        return false; // To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isTMSBookOnBehalfUser() {
        return false; // To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isLocalAdmin() {
        return false; // To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ArrayOfConference getConferencesForSystems(@WebParam(name = "SystemIds", targetNamespace = "http://tandberg.net/2004/02/tms/external/booking/") List<Integer> systemIds,
            @WebParam(name = "StartTime", targetNamespace = "http://tandberg.net/2004/02/tms/external/booking/") XMLGregorianCalendar startTime,
            @WebParam(name = "EndTime", targetNamespace = "http://tandberg.net/2004/02/tms/external/booking/") XMLGregorianCalendar endTime,
            @WebParam(name = "ConferenceStatus", targetNamespace = "http://tandberg.net/2004/02/tms/external/booking/") ConferenceStatus conferenceStatus) {
        if (systemIds.size() != 1) {
            throw new RuntimeException("only one system supported");
        }
        ArrayOfConference result = new ArrayOfConference();
        List<Conference> resultList = result.getConference();
        if (startTime == null) {
            startTime = DateTypeAdapter.xmlGregorianCalendarFromMillis(0);
        }
        if (endTime == null) {
            endTime = DateTypeAdapter.xmlGregorianCalendarFromMillis(Long.MAX_VALUE);
        }
        startTime = (XMLGregorianCalendar) startTime.clone();
        startTime.setTime(0, 0, 0);
        endTime = (XMLGregorianCalendar) endTime.clone();
        endTime.setTime(23, 59, 59);
        for (Conference conference : conferences.values()) {
            XMLGregorianCalendar conferenceStartTime = DateTypeAdapter.asXMLGregorianCalendar(DateTypeAdapter.parseTmsDate(conference.getStartTimeUTC()));
            XMLGregorianCalendar conferenceEndTime = DateTypeAdapter.asXMLGregorianCalendar(DateTypeAdapter.parseTmsDate(conference.getEndTimeUTC()));
            if (conferenceStartTime.compare(endTime) == 1 || conferenceEndTime.compare(startTime) == -1) {
                continue;
            }
            ArrayOfParticipant participants = conference.getParticipants();
            for (Participant participant : participants.getParticipant()) {
                if (participant.getParticipantId() == systemIds.get(0)) {
                    resultList.add(conference);
                    break;
                }
            }
        }
        return result;
    }

    @Override
    public Conference getConferenceById(@WebParam(name = "ConferenceId", targetNamespace = "http://tandberg.net/2004/02/tms/external/booking/") int conferenceId) {
        return conferences.get((long) conferenceId);
    }

    @Override
    public Conference getRecurrentConferenceById(@WebParam(name = "ConferenceId", targetNamespace = "http://tandberg.net/2004/02/tms/external/booking/") int conferenceId) {
        return null; // To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Conference getDefaultConference() {
        Conference result = new Conference();
        result.setConferenceId(-1);
        Date start = new Date();
        start.setHours(start.getHours() + 1);
        result.setStartTimeUTC(DateTypeAdapter.formatTMSDate(start));
        start.setHours(start.getHours() + 1);
        result.setEndTimeUTC(DateTypeAdapter.formatTMSDate(start));
        return result;
    }

    @Override
    public Conference saveConference(@WebParam(name = "Conference", targetNamespace = "http://tandberg.net/2004/02/tms/external/booking/") Conference conference) {
        if (noAvailablePorts) {
            throw new RuntimeException("No ports available");
        }
        if (conference.getConferenceId() < 1) {
            conference.setConferenceId(generateNewId());
        }
        checkConference(conference);

        conference.setConferenceInfoText("sip:12345@example.org");
        conferences.put((long) conference.getConferenceId(), conference);
        return conference;
    }

    private void checkConference(Conference conference) {
        Date conferenceStart = DateTypeAdapter.parseTmsDate(conference.getStartTimeUTC());
        Date conferenceEnd = DateTypeAdapter.parseTmsDate(conference.getEndTimeUTC());
        if (conferenceStart.compareTo(conferenceEnd) == 1) {
            throw new SOAPFaultException(new OurSoapFault());
        }
        if (conferenceStart.compareTo(new Date()) == -1) {
            throw new SOAPFaultException(new OurSoapFault());
        }
        ArrayOfParticipant participants = conference.getParticipants();
        List<Participant> conferenceParticipants = participants.getParticipant();
        for (Participant participant : conferenceParticipants) {
            checkConferenceParticipant(conference, participant);
        }
    }

    private void checkConferenceParticipant(Conference conference, Participant participant) {
        if (!participant.getParticipantCallType().equals("IP Video <-")) {
            if (!systems.containsKey((long) participant.getParticipantId())) {
                throw new SOAPFaultException(new OurSoapFault());
            }
        }
        Date conferenceStart = DateTypeAdapter.parseTmsDate(conference.getStartTimeUTC());
        Date conferenceEnd = DateTypeAdapter.parseTmsDate(conference.getEndTimeUTC());
        for (Conference otherConference : conferences.values()) {
            if (otherConference.getConferenceId() == conference.getConferenceId()) {
                continue;
            }
            Date otherConferenceStart = DateTypeAdapter.parseTmsDate(otherConference.getStartTimeUTC());
            Date otherConferenceEnd = DateTypeAdapter.parseTmsDate(otherConference.getEndTimeUTC());
            if (otherConferenceStart.compareTo(conferenceEnd) == 1 || otherConferenceEnd.compareTo(conferenceStart) == -1) {
                continue;
            }
            for (Participant otherConferenceParticipant : otherConference.getParticipants().getParticipant()) {
                if (participant.getParticipantId() == otherConferenceParticipant.getParticipantId()) {
                    throw new SOAPFaultException(new OurSoapFault());
                }
            }
        }
    }

    private int generateNewId() {
        int result = nextId;
        nextId++;
        return result;
    }

    @Override
    public ArrayOfConference saveConferences(@WebParam(name = "Conferences", targetNamespace = "http://tandberg.net/2004/02/tms/external/booking/") List<Conference> conferences,
            @WebParam(name = "oneTransaction", targetNamespace = "http://tandberg.net/2004/02/tms/external/booking/") boolean oneTransaction) {
        return null; // To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Conference saveConferenceRecInstance(@WebParam(name = "Conference", targetNamespace = "http://tandberg.net/2004/02/tms/external/booking/") Conference conference) {
        return null; // To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void deleteConferenceById(@WebParam(name = "ConferenceId", targetNamespace = "http://tandberg.net/2004/02/tms/external/booking/") int conferenceId) {
        // To change body of implemented methods use File | Settings | File Templates.
        conferences.remove((long) conferenceId);
    }

    @Override
    public void endConferenceById(@WebParam(name = "ConferenceId", targetNamespace = "http://tandberg.net/2004/02/tms/external/booking/") int conferenceId) {
        // To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void deleteConferenceRecInstanceById(@WebParam(name = "ConferenceId", targetNamespace = "http://tandberg.net/2004/02/tms/external/booking/") int conferenceId) {
        // To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getConferenceIdByExternalId(@WebParam(name = "ExternalSourceId", targetNamespace = "http://tandberg.net/2004/02/tms/external/booking/") String externalSourceId,
            @WebParam(name = "ExternalConferenceId", targetNamespace = "http://tandberg.net/2004/02/tms/external/booking/") String externalConferenceId,
            @WebParam(name = "RecurrenceIdUTC", targetNamespace = "http://tandberg.net/2004/02/tms/external/booking/") String recurrenceIdUTC) {
        return 0; // To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ArrayOfTransaction getTransactionsSince(@WebParam(name = "CurrentTransactionId", targetNamespace = "http://tandberg.net/2004/02/tms/external/booking/") int currentTransactionId) {
        return null; // To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ArrayOfConference getConferencesForUser(@WebParam(name = "UserName", targetNamespace = "http://tandberg.net/2004/02/tms/external/booking/") String userName,
            @WebParam(name = "StartTime", targetNamespace = "http://tandberg.net/2004/02/tms/external/booking/") XMLGregorianCalendar startTime,
            @WebParam(name = "EndTime", targetNamespace = "http://tandberg.net/2004/02/tms/external/booking/") XMLGregorianCalendar endTime,
            @WebParam(name = "ConferenceStatus", targetNamespace = "http://tandberg.net/2004/02/tms/external/booking/") ConferenceStatus conferenceStatus) {
        ArrayOfConference result = new ArrayOfConference();
        List<Conference> resultList = result.getConference();
        for (Conference conference : conferences.values()) {
            if (userName.equals(conference.getOwnerUserName())) {
                resultList.add(conference);
            }
        }
        return result;
    }

    @Override
    public ArrayOfRecordingDevice getRecordingAliases(@WebParam(name = "UserName", targetNamespace = "http://tandberg.net/2004/02/tms/external/booking/") String userName) {
        return null; // To change body of implemented methods use File | Settings | File Templates.
    }
}
