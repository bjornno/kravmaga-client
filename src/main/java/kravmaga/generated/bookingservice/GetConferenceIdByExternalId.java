
package kravmaga.generated.bookingservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExternalSourceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalConferenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurrenceIdUTC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "externalSourceId",
    "externalConferenceId",
    "recurrenceIdUTC"
})
@XmlRootElement(name = "GetConferenceIdByExternalId")
public class GetConferenceIdByExternalId {

    @XmlElement(name = "ExternalSourceId")
    protected String externalSourceId;
    @XmlElement(name = "ExternalConferenceId")
    protected String externalConferenceId;
    @XmlElement(name = "RecurrenceIdUTC")
    protected String recurrenceIdUTC;

    /**
     * Gets the value of the externalSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalSourceId() {
        return externalSourceId;
    }

    /**
     * Sets the value of the externalSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalSourceId(String value) {
        this.externalSourceId = value;
    }

    /**
     * Gets the value of the externalConferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalConferenceId() {
        return externalConferenceId;
    }

    /**
     * Sets the value of the externalConferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalConferenceId(String value) {
        this.externalConferenceId = value;
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

}
