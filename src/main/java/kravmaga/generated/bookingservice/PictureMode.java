
package kravmaga.generated.bookingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PictureMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PictureMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Continuous Presence"/>
 *     &lt;enumeration value="Enhanced CP"/>
 *     &lt;enumeration value="Voice Switched"/>
 *     &lt;enumeration value="Default"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PictureMode")
@XmlEnum
public enum PictureMode {

    @XmlEnumValue("Continuous Presence")
    CONTINUOUS_PRESENCE("Continuous Presence"),
    @XmlEnumValue("Enhanced CP")
    ENHANCED_CP("Enhanced CP"),
    @XmlEnumValue("Voice Switched")
    VOICE_SWITCHED("Voice Switched"),
    @XmlEnumValue("Default")
    DEFAULT("Default");
    private final String value;

    PictureMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PictureMode fromValue(String v) {
        for (PictureMode c: PictureMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
