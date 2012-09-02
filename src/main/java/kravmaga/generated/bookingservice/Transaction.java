
package kravmaga.generated.bookingservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Transaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Transaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConferenceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TransType" type="{http://tandberg.net/2004/02/tms/external/booking/}TransactionType"/>
 *         &lt;element name="PerformedByUserId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ParticipantIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction", propOrder = {
    "transactionId",
    "conferenceId",
    "transType",
    "performedByUserId",
    "participantIds"
})
public class Transaction {

    @XmlElement(name = "TransactionId")
    protected int transactionId;
    @XmlElement(name = "ConferenceId")
    protected int conferenceId;
    @XmlElement(name = "TransType", required = true)
    protected TransactionType transType;
    @XmlElement(name = "PerformedByUserId")
    protected int performedByUserId;
    @XmlElement(name = "ParticipantIds")
    protected String participantIds;

    /**
     * Gets the value of the transactionId property.
     * 
     */
    public int getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     */
    public void setTransactionId(int value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the conferenceId property.
     * 
     */
    public int getConferenceId() {
        return conferenceId;
    }

    /**
     * Sets the value of the conferenceId property.
     * 
     */
    public void setConferenceId(int value) {
        this.conferenceId = value;
    }

    /**
     * Gets the value of the transType property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType }
     *     
     */
    public TransactionType getTransType() {
        return transType;
    }

    /**
     * Sets the value of the transType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType }
     *     
     */
    public void setTransType(TransactionType value) {
        this.transType = value;
    }

    /**
     * Gets the value of the performedByUserId property.
     * 
     */
    public int getPerformedByUserId() {
        return performedByUserId;
    }

    /**
     * Sets the value of the performedByUserId property.
     * 
     */
    public void setPerformedByUserId(int value) {
        this.performedByUserId = value;
    }

    /**
     * Gets the value of the participantIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantIds() {
        return participantIds;
    }

    /**
     * Sets the value of the participantIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantIds(String value) {
        this.participantIds = value;
    }

}
