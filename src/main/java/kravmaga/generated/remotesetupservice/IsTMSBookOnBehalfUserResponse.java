
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
 *         &lt;element name="IsTMSBookOnBehalfUserResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "isTMSBookOnBehalfUserResult"
})
@XmlRootElement(name = "IsTMSBookOnBehalfUserResponse")
public class IsTMSBookOnBehalfUserResponse {

    @XmlElement(name = "IsTMSBookOnBehalfUserResult")
    protected boolean isTMSBookOnBehalfUserResult;

    /**
     * Gets the value of the isTMSBookOnBehalfUserResult property.
     * 
     */
    public boolean isIsTMSBookOnBehalfUserResult() {
        return isTMSBookOnBehalfUserResult;
    }

    /**
     * Sets the value of the isTMSBookOnBehalfUserResult property.
     * 
     */
    public void setIsTMSBookOnBehalfUserResult(boolean value) {
        this.isTMSBookOnBehalfUserResult = value;
    }

}
