
package kravmaga.generated.remotesetupservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SystemCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Endpoint"/>
 *     &lt;enumeration value="Equipment"/>
 *     &lt;enumeration value="Room"/>
 *     &lt;enumeration value="Recording"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SystemCategory")
@XmlEnum
public enum SystemCategory {

    @XmlEnumValue("Endpoint")
    ENDPOINT("Endpoint"),
    @XmlEnumValue("Equipment")
    EQUIPMENT("Equipment"),
    @XmlEnumValue("Room")
    ROOM("Room"),
    @XmlEnumValue("Recording")
    RECORDING("Recording");
    private final String value;

    SystemCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SystemCategory fromValue(String v) {
        for (SystemCategory c: SystemCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
