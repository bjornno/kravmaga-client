
package kravmaga.generated.remotesetupservice;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for ExternalAPIVersionSoapHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalAPIVersionSoapHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientVersionIn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ClientIdentifierIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientLatestNamespaceIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewServiceURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalAPIVersionSoapHeader", propOrder = {
    "clientVersionIn",
    "clientIdentifierIn",
    "clientLatestNamespaceIn",
    "newServiceURL"
})
public class ExternalAPIVersionSoapHeader {

    @XmlElement(name = "ClientVersionIn")
    protected int clientVersionIn;
    @XmlElement(name = "ClientIdentifierIn")
    protected String clientIdentifierIn;
    @XmlElement(name = "ClientLatestNamespaceIn")
    protected String clientLatestNamespaceIn;
    @XmlElement(name = "NewServiceURL")
    protected String newServiceURL;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the clientVersionIn property.
     * 
     */
    public int getClientVersionIn() {
        return clientVersionIn;
    }

    /**
     * Sets the value of the clientVersionIn property.
     * 
     */
    public void setClientVersionIn(int value) {
        this.clientVersionIn = value;
    }

    /**
     * Gets the value of the clientIdentifierIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientIdentifierIn() {
        return clientIdentifierIn;
    }

    /**
     * Sets the value of the clientIdentifierIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientIdentifierIn(String value) {
        this.clientIdentifierIn = value;
    }

    /**
     * Gets the value of the clientLatestNamespaceIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientLatestNamespaceIn() {
        return clientLatestNamespaceIn;
    }

    /**
     * Sets the value of the clientLatestNamespaceIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientLatestNamespaceIn(String value) {
        this.clientLatestNamespaceIn = value;
    }

    /**
     * Gets the value of the newServiceURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewServiceURL() {
        return newServiceURL;
    }

    /**
     * Sets the value of the newServiceURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewServiceURL(String value) {
        this.newServiceURL = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
