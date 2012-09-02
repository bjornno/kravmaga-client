
package kravmaga.generated.bookingservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecurrenceException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurrenceException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExceptionType" type="{http://tandberg.net/2004/02/tms/external/booking/}ExceptionType"/>
 *         &lt;element name="RecurrenceIdUTC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurrenceIdRange" type="{http://tandberg.net/2004/02/tms/external/booking/}ExceptionIdRange"/>
 *         &lt;element name="ModifiedMask" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ModifiedData" type="{http://tandberg.net/2004/02/tms/external/booking/}Conference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurrenceException", propOrder = {
    "exceptionType",
    "recurrenceIdUTC",
    "recurrenceIdRange",
    "modifiedMask",
    "modifiedData"
})
public class RecurrenceException {

    @XmlElement(name = "ExceptionType", required = true)
    protected ExceptionType exceptionType;
    @XmlElement(name = "RecurrenceIdUTC")
    protected String recurrenceIdUTC;
    @XmlElement(name = "RecurrenceIdRange", required = true)
    protected ExceptionIdRange recurrenceIdRange;
    @XmlElement(name = "ModifiedMask")
    protected int modifiedMask;
    @XmlElement(name = "ModifiedData")
    protected Conference modifiedData;

    /**
     * Gets the value of the exceptionType property.
     * 
     * @return
     *     possible object is
     *     {@link kravmaga.generated.bookingservice.ExceptionType }
     *     
     */
    public ExceptionType getExceptionType() {
        return exceptionType;
    }

    /**
     * Sets the value of the exceptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link kravmaga.generated.bookingservice.ExceptionType }
     *     
     */
    public void setExceptionType(ExceptionType value) {
        this.exceptionType = value;
    }

    /**
     * Gets the value of the recurrenceIdUTC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrenceIdUTC() {
        return recurrenceIdUTC;
    }

    /**
     * Sets the value of the recurrenceIdUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurrenceIdUTC(String value) {
        this.recurrenceIdUTC = value;
    }

    /**
     * Gets the value of the recurrenceIdRange property.
     * 
     * @return
     *     possible object is
     *     {@link kravmaga.generated.bookingservice.ExceptionIdRange }
     *     
     */
    public ExceptionIdRange getRecurrenceIdRange() {
        return recurrenceIdRange;
    }

    /**
     * Sets the value of the recurrenceIdRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link kravmaga.generated.bookingservice.ExceptionIdRange }
     *     
     */
    public void setRecurrenceIdRange(ExceptionIdRange value) {
        this.recurrenceIdRange = value;
    }

    /**
     * Gets the value of the modifiedMask property.
     * 
     */
    public int getModifiedMask() {
        return modifiedMask;
    }

    /**
     * Sets the value of the modifiedMask property.
     * 
     */
    public void setModifiedMask(int value) {
        this.modifiedMask = value;
    }

    /**
     * Gets the value of the modifiedData property.
     * 
     * @return
     *     possible object is
     *     {@link kravmaga.generated.bookingservice.Conference }
     *     
     */
    public Conference getModifiedData() {
        return modifiedData;
    }

    /**
     * Sets the value of the modifiedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link kravmaga.generated.bookingservice.Conference }
     *     
     */
    public void setModifiedData(Conference value) {
        this.modifiedData = value;
    }

}
