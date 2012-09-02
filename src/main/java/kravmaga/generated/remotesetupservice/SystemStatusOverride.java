
package kravmaga.generated.remotesetupservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemStatusOverride complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemStatusOverride">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="systemStatus" type="{http://tandberg.net/2004/02/tms/external/booking/remotesetup/}SystemStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemStatusOverride", propOrder = {
    "systemStatus"
})
public class SystemStatusOverride {

    @XmlElement(required = true)
    protected SystemStatus systemStatus;

    /**
     * Gets the value of the systemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link kravmaga.generated.remotesetupservice.SystemStatus }
     *     
     */
    public SystemStatus getSystemStatus() {
        return systemStatus;
    }

    /**
     * Sets the value of the systemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link kravmaga.generated.remotesetupservice.SystemStatus }
     *     
     */
    public void setSystemStatus(SystemStatus value) {
        this.systemStatus = value;
    }

}
