
package kravmaga.generated.bookingservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Participant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Participant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParticipantId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NameOrNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParticipantCallType" type="{http://tandberg.net/2004/02/tms/external/booking/}ParticipantType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Participant", propOrder = {
    "participantId",
    "nameOrNumber",
    "participantCallType"
})
public class Participant {

    @XmlElement(name = "ParticipantId")
    protected int participantId;
    @XmlElement(name = "NameOrNumber")
    protected String nameOrNumber;
    @XmlElement(name = "ParticipantCallType", required = true)
    protected String participantCallType;

    /**
     * Gets the value of the participantId property.
     * 
     */
    public int getParticipantId() {
        return participantId;
    }

    /**
     * Sets the value of the participantId property.
     * 
     */
    public void setParticipantId(int value) {
        this.participantId = value;
    }

    /**
     * Gets the value of the nameOrNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOrNumber() {
        return nameOrNumber;
    }

    /**
     * Sets the value of the nameOrNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOrNumber(String value) {
        this.nameOrNumber = value;
    }

    /**
     * Gets the value of the participantCallType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantCallType() {
        return participantCallType;
    }

    /**
     * Sets the value of the participantCallType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantCallType(String value) {
        this.participantCallType = value;
    }

}
