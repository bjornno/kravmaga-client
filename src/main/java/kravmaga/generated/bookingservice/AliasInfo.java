
package kravmaga.generated.bookingservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AliasInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AliasInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SystemId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AliasId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AliasInfo", propOrder = {
    "systemId",
    "aliasId"
})
public class AliasInfo {

    @XmlElement(name = "SystemId")
    protected int systemId;
    @XmlElement(name = "AliasId")
    protected String aliasId;

    /**
     * Gets the value of the systemId property.
     * 
     */
    public int getSystemId() {
        return systemId;
    }

    /**
     * Sets the value of the systemId property.
     * 
     */
    public void setSystemId(int value) {
        this.systemId = value;
    }

    /**
     * Gets the value of the aliasId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasId() {
        return aliasId;
    }

    /**
     * Sets the value of the aliasId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasId(String value) {
        this.aliasId = value;
    }

}
