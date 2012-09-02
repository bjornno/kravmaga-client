
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
 *         &lt;element name="IsTMSServiceUserResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "isTMSServiceUserResult"
})
@XmlRootElement(name = "IsTMSServiceUserResponse")
public class IsTMSServiceUserResponse {

    @XmlElement(name = "IsTMSServiceUserResult")
    protected boolean isTMSServiceUserResult;

    /**
     * Gets the value of the isTMSServiceUserResult property.
     * 
     */
    public boolean isIsTMSServiceUserResult() {
        return isTMSServiceUserResult;
    }

    /**
     * Sets the value of the isTMSServiceUserResult property.
     * 
     */
    public void setIsTMSServiceUserResult(boolean value) {
        this.isTMSServiceUserResult = value;
    }

}
