
package kravmaga.generated.bookingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecurrenceEndType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecurrenceEndType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EndByDate"/>
 *     &lt;enumeration value="EndByInstances"/>
 *     &lt;enumeration value="EndNever"/>
 *     &lt;enumeration value="Default"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RecurrenceEndType")
@XmlEnum
public enum RecurrenceEndType {

    @XmlEnumValue("EndByDate")
    END_BY_DATE("EndByDate"),
    @XmlEnumValue("EndByInstances")
    END_BY_INSTANCES("EndByInstances"),
    @XmlEnumValue("EndNever")
    END_NEVER("EndNever"),
    @XmlEnumValue("Default")
    DEFAULT("Default");
    private final String value;

    RecurrenceEndType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecurrenceEndType fromValue(String v) {
        for (RecurrenceEndType c: RecurrenceEndType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
