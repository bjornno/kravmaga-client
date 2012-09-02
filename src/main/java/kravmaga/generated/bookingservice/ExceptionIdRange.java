
package kravmaga.generated.bookingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExceptionIdRange.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExceptionIdRange">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="ThisAndFuture"/>
 *     &lt;enumeration value="ThisAndPrior"/>
 *     &lt;enumeration value="Default"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExceptionIdRange")
@XmlEnum
public enum ExceptionIdRange {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("ThisAndFuture")
    THIS_AND_FUTURE("ThisAndFuture"),
    @XmlEnumValue("ThisAndPrior")
    THIS_AND_PRIOR("ThisAndPrior"),
    @XmlEnumValue("Default")
    DEFAULT("Default");
    private final String value;

    ExceptionIdRange(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExceptionIdRange fromValue(String v) {
        for (ExceptionIdRange c: ExceptionIdRange.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
