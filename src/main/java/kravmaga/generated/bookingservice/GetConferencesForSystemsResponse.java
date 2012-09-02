
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
 *         &lt;element name="GetConferencesForSystemsResult" type="{http://tandberg.net/2004/02/tms/external/booking/}ArrayOfConference" minOccurs="0"/>
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
    "getConferencesForSystemsResult"
})
@XmlRootElement(name = "GetConferencesForSystemsResponse")
public class GetConferencesForSystemsResponse {

    @XmlElement(name = "GetConferencesForSystemsResult")
    protected ArrayOfConference getConferencesForSystemsResult;

    /**
     * Gets the value of the getConferencesForSystemsResult property.
     * 
     * @return
     *     possible object is
     *     {@link kravmaga.generated.bookingservice.ArrayOfConference }
     *     
     */
    public ArrayOfConference getGetConferencesForSystemsResult() {
        return getConferencesForSystemsResult;
    }

    /**
     * Sets the value of the getConferencesForSystemsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link kravmaga.generated.bookingservice.ArrayOfConference }
     *     
     */
    public void setGetConferencesForSystemsResult(ArrayOfConference value) {
        this.getConferencesForSystemsResult = value;
    }

}
