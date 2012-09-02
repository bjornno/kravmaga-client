
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
 *         &lt;element name="GetSystemByIdResult" type="{http://tandberg.net/2004/02/tms/external/booking/remotesetup/}TMSSystem" minOccurs="0"/>
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
    "getSystemByIdResult"
})
@XmlRootElement(name = "GetSystemByIdResponse")
public class GetSystemByIdResponse {

    @XmlElement(name = "GetSystemByIdResult")
    protected TMSSystem getSystemByIdResult;

    /**
     * Gets the value of the getSystemByIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link TMSSystem }
     *     
     */
    public TMSSystem getGetSystemByIdResult() {
        return getSystemByIdResult;
    }

    /**
     * Sets the value of the getSystemByIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMSSystem }
     *     
     */
    public void setGetSystemByIdResult(TMSSystem value) {
        this.getSystemByIdResult = value;
    }

}
