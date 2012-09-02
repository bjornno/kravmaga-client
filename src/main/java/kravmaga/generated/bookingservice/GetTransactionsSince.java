
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
 *         &lt;element name="CurrentTransactionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "currentTransactionId"
})
@XmlRootElement(name = "GetTransactionsSince")
public class GetTransactionsSince {

    @XmlElement(name = "CurrentTransactionId")
    protected int currentTransactionId;

    /**
     * Gets the value of the currentTransactionId property.
     * 
     */
    public int getCurrentTransactionId() {
        return currentTransactionId;
    }

    /**
     * Sets the value of the currentTransactionId property.
     * 
     */
    public void setCurrentTransactionId(int value) {
        this.currentTransactionId = value;
    }

}
