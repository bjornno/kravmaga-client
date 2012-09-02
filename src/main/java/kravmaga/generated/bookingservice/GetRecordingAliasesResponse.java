
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
 *         &lt;element name="GetRecordingAliasesResult" type="{http://tandberg.net/2004/02/tms/external/booking/}ArrayOfRecordingDevice" minOccurs="0"/>
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
    "getRecordingAliasesResult"
})
@XmlRootElement(name = "GetRecordingAliasesResponse")
public class GetRecordingAliasesResponse {

    @XmlElement(name = "GetRecordingAliasesResult")
    protected ArrayOfRecordingDevice getRecordingAliasesResult;

    /**
     * Gets the value of the getRecordingAliasesResult property.
     * 
     * @return
     *     possible object is
     *     {@link kravmaga.generated.bookingservice.ArrayOfRecordingDevice }
     *     
     */
    public ArrayOfRecordingDevice getGetRecordingAliasesResult() {
        return getRecordingAliasesResult;
    }

    /**
     * Sets the value of the getRecordingAliasesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link kravmaga.generated.bookingservice.ArrayOfRecordingDevice }
     *     
     */
    public void setGetRecordingAliasesResult(ArrayOfRecordingDevice value) {
        this.getRecordingAliasesResult = value;
    }

}
