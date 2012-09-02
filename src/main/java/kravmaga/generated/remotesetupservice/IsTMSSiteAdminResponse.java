
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
 *         &lt;element name="IsTMSSiteAdminResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "isTMSSiteAdminResult"
})
@XmlRootElement(name = "IsTMSSiteAdminResponse")
public class IsTMSSiteAdminResponse {

    @XmlElement(name = "IsTMSSiteAdminResult")
    protected boolean isTMSSiteAdminResult;

    /**
     * Gets the value of the isTMSSiteAdminResult property.
     * 
     */
    public boolean isIsTMSSiteAdminResult() {
        return isTMSSiteAdminResult;
    }

    /**
     * Sets the value of the isTMSSiteAdminResult property.
     * 
     */
    public void setIsTMSSiteAdminResult(boolean value) {
        this.isTMSSiteAdminResult = value;
    }

}
