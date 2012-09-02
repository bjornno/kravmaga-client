
package kravmaga.generated.remotesetupservice;

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
 *         &lt;element name="GetSystemsResult" type="{http://tandberg.net/2004/02/tms/external/booking/remotesetup/}ArrayOfTMSSystem" minOccurs="0"/>
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
    "getSystemsResult"
})
@XmlRootElement(name = "GetSystemsResponse")
public class GetSystemsResponse {

    @XmlElement(name = "GetSystemsResult")
    protected ArrayOfTMSSystem getSystemsResult;

    /**
     * Gets the value of the getSystemsResult property.
     * 
     * @return
     *     possible object is
     *     {@link kravmaga.generated.remotesetupservice.ArrayOfTMSSystem }
     *     
     */
    public ArrayOfTMSSystem getGetSystemsResult() {
        return getSystemsResult;
    }

    /**
     * Sets the value of the getSystemsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link kravmaga.generated.remotesetupservice.ArrayOfTMSSystem }
     *     
     */
    public void setGetSystemsResult(ArrayOfTMSSystem value) {
        this.getSystemsResult = value;
    }

}
