
package kravmaga.generated.bookingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendOptionRequested.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExtendOptionRequested">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Yes"/>
 *     &lt;enumeration value="No"/>
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="AutomaticBestEffort"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExtendOptionRequested")
@XmlEnum
public enum ExtendOptionRequested {

    @XmlEnumValue("Yes")
    YES("Yes"),
    @XmlEnumValue("No")
    NO("No"),
    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("AutomaticBestEffort")
    AUTOMATIC_BEST_EFFORT("AutomaticBestEffort");
    private final String value;

    ExtendOptionRequested(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExtendOptionRequested fromValue(String v) {
        for (ExtendOptionRequested c: ExtendOptionRequested.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
