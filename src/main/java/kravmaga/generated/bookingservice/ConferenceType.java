
package kravmaga.generated.bookingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConferenceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConferenceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Reservation Only"/>
 *     &lt;enumeration value="Automatic Call Launch"/>
 *     &lt;enumeration value="Manual Call Launch"/>
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Ad-Hoc conference"/>
 *     &lt;enumeration value="One Button To Push"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConferenceType")
@XmlEnum
public enum ConferenceType {

    @XmlEnumValue("Reservation Only")
    RESERVATION_ONLY("Reservation Only"),
    @XmlEnumValue("Automatic Call Launch")
    AUTOMATIC_CALL_LAUNCH("Automatic Call Launch"),
    @XmlEnumValue("Manual Call Launch")
    MANUAL_CALL_LAUNCH("Manual Call Launch"),
    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Ad-Hoc conference")
    AD_HOC_CONFERENCE("Ad-Hoc conference"),
    @XmlEnumValue("One Button To Push")
    ONE_BUTTON_TO_PUSH("One Button To Push");
    private final String value;

    ConferenceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConferenceType fromValue(String v) {
        for (ConferenceType c: ConferenceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
