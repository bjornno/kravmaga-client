
package kravmaga.generated.bookingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConferenceStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConferenceStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="AllExceptDeleted"/>
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="Ongoing"/>
 *     &lt;enumeration value="Finished"/>
 *     &lt;enumeration value="PendingAndOngoing"/>
 *     &lt;enumeration value="MeetingRequest"/>
 *     &lt;enumeration value="Rejected"/>
 *     &lt;enumeration value="Finished"/>
 *     &lt;enumeration value="Deleted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConferenceStatus")
@XmlEnum
public enum ConferenceStatus {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("AllExceptDeleted")
    ALL_EXCEPT_DELETED("AllExceptDeleted"),
    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Ongoing")
    ONGOING("Ongoing"),
    @XmlEnumValue("Finished")
    FINISHED("Finished"),
    @XmlEnumValue("PendingAndOngoing")
    PENDING_AND_ONGOING("PendingAndOngoing"),
    @XmlEnumValue("MeetingRequest")
    MEETING_REQUEST("MeetingRequest"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted");
    private final String value;

    ConferenceStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConferenceStatus fromValue(String v) {
        for (ConferenceStatus c: ConferenceStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
