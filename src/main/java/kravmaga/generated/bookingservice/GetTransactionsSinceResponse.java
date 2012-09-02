
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
 *         &lt;element name="GetTransactionsSinceResult" type="{http://tandberg.net/2004/02/tms/external/booking/}ArrayOfTransaction" minOccurs="0"/>
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
    "getTransactionsSinceResult"
})
@XmlRootElement(name = "GetTransactionsSinceResponse")
public class GetTransactionsSinceResponse {

    @XmlElement(name = "GetTransactionsSinceResult")
    protected ArrayOfTransaction getTransactionsSinceResult;

    /**
     * Gets the value of the getTransactionsSinceResult property.
     * 
     * @return
     *     possible object is
     *     {@link kravmaga.generated.bookingservice.ArrayOfTransaction }
     *     
     */
    public ArrayOfTransaction getGetTransactionsSinceResult() {
        return getTransactionsSinceResult;
    }

    /**
     * Sets the value of the getTransactionsSinceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link kravmaga.generated.bookingservice.ArrayOfTransaction }
     *     
     */
    public void setGetTransactionsSinceResult(ArrayOfTransaction value) {
        this.getTransactionsSinceResult = value;
    }

}
