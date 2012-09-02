
package kravmaga.generated.bookingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncryptionRequested.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EncryptionRequested">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Yes"/>
 *     &lt;enumeration value="No"/>
 *     &lt;enumeration value="If Possible"/>
 *     &lt;enumeration value="Default"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EncryptionRequested")
@XmlEnum
public enum EncryptionRequested {

    @XmlEnumValue("Yes")
    YES("Yes"),
    @XmlEnumValue("No")
    NO("No"),
    @XmlEnumValue("If Possible")
    IF_POSSIBLE("If Possible"),
    @XmlEnumValue("Default")
    DEFAULT("Default");
    private final String value;

    EncryptionRequested(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EncryptionRequested fromValue(String v) {
        for (EncryptionRequested c: EncryptionRequested.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
