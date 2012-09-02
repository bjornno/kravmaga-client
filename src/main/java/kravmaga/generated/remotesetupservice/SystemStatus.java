
package kravmaga.generated.remotesetupservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SystemStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Alive"/>
 *     &lt;enumeration value="Idle"/>
 *     &lt;enumeration value="InCall"/>
 *     &lt;enumeration value="NoResponse"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SystemStatus")
@XmlEnum
public enum SystemStatus {

    @XmlEnumValue("Alive")
    ALIVE("Alive"),
    @XmlEnumValue("Idle")
    IDLE("Idle"),
    @XmlEnumValue("InCall")
    IN_CALL("InCall"),
    @XmlEnumValue("NoResponse")
    NO_RESPONSE("NoResponse"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    SystemStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SystemStatus fromValue(String v) {
        for (SystemStatus c: SystemStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
