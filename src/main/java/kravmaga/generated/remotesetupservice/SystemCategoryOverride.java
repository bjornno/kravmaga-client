
package kravmaga.generated.remotesetupservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemCategoryOverride complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemCategoryOverride">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="systemCategory" type="{http://tandberg.net/2004/02/tms/external/booking/remotesetup/}SystemCategory"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemCategoryOverride", propOrder = {
    "systemCategory"
})
public class SystemCategoryOverride {

    @XmlElement(required = true)
    protected SystemCategory systemCategory;

    /**
     * Gets the value of the systemCategory property.
     * 
     * @return
     *     possible object is
     *     {@link kravmaga.generated.remotesetupservice.SystemCategory }
     *     
     */
    public SystemCategory getSystemCategory() {
        return systemCategory;
    }

    /**
     * Sets the value of the systemCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link kravmaga.generated.remotesetupservice.SystemCategory }
     *     
     */
    public void setSystemCategory(SystemCategory value) {
        this.systemCategory = value;
    }

}
