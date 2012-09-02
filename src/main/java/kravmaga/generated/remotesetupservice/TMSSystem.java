
package kravmaga.generated.remotesetupservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TMSSystem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TMSSystem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SystemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SystemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NetworkAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISDNNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WebInterfaceURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SIPUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="H323Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="E164Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeZone" type="{http://tandberg.net/2004/02/tms/external/booking/remotesetup/}TimeZone" minOccurs="0"/>
 *         &lt;element name="SystemCategory" type="{http://tandberg.net/2004/02/tms/external/booking/remotesetup/}SystemCategoryOverride" minOccurs="0"/>
 *         &lt;element name="SystemStatus" type="{http://tandberg.net/2004/02/tms/external/booking/remotesetup/}SystemStatusOverride" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMSSystem", propOrder = {
    "systemId",
    "systemName",
    "contact",
    "manufacturer",
    "description",
    "systemType",
    "networkAddress",
    "location",
    "isdnNumber",
    "qNumber",
    "webInterfaceURL",
    "sipUri",
    "h323Id",
    "e164Alias",
    "timeZone",
    "systemCategory",
    "systemStatus"
})
public class TMSSystem {

    @XmlElement(name = "SystemId")
    protected long systemId;
    @XmlElement(name = "SystemName")
    protected String systemName;
    @XmlElement(name = "Contact")
    protected String contact;
    @XmlElement(name = "Manufacturer")
    protected String manufacturer;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "SystemType")
    protected String systemType;
    @XmlElement(name = "NetworkAddress")
    protected String networkAddress;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "ISDNNumber")
    protected String isdnNumber;
    @XmlElement(name = "QNumber")
    protected String qNumber;
    @XmlElement(name = "WebInterfaceURL")
    protected String webInterfaceURL;
    @XmlElement(name = "SIPUri")
    protected String sipUri;
    @XmlElement(name = "H323Id")
    protected String h323Id;
    @XmlElement(name = "E164Alias")
    protected String e164Alias;
    @XmlElement(name = "TimeZone")
    protected TimeZone timeZone;
    @XmlElement(name = "SystemCategory")
    protected SystemCategoryOverride systemCategory;
    @XmlElement(name = "SystemStatus")
    protected SystemStatusOverride systemStatus;

    /**
     * Gets the value of the systemId property.
     * 
     */
    public long getSystemId() {
        return systemId;
    }

    /**
     * Sets the value of the systemId property.
     * 
     */
    public void setSystemId(long value) {
        this.systemId = value;
    }

    /**
     * Gets the value of the systemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemName() {
        return systemName;
    }

    /**
     * Sets the value of the systemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemName(String value) {
        this.systemName = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact(String value) {
        this.contact = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the systemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemType() {
        return systemType;
    }

    /**
     * Sets the value of the systemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemType(String value) {
        this.systemType = value;
    }

    /**
     * Gets the value of the networkAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkAddress() {
        return networkAddress;
    }

    /**
     * Sets the value of the networkAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkAddress(String value) {
        this.networkAddress = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the isdnNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISDNNumber() {
        return isdnNumber;
    }

    /**
     * Sets the value of the isdnNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISDNNumber(String value) {
        this.isdnNumber = value;
    }

    /**
     * Gets the value of the qNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQNumber() {
        return qNumber;
    }

    /**
     * Sets the value of the qNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQNumber(String value) {
        this.qNumber = value;
    }

    /**
     * Gets the value of the webInterfaceURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebInterfaceURL() {
        return webInterfaceURL;
    }

    /**
     * Sets the value of the webInterfaceURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebInterfaceURL(String value) {
        this.webInterfaceURL = value;
    }

    /**
     * Gets the value of the sipUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIPUri() {
        return sipUri;
    }

    /**
     * Sets the value of the sipUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIPUri(String value) {
        this.sipUri = value;
    }

    /**
     * Gets the value of the h323Id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getH323Id() {
        return h323Id;
    }

    /**
     * Sets the value of the h323Id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setH323Id(String value) {
        this.h323Id = value;
    }

    /**
     * Gets the value of the e164Alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE164Alias() {
        return e164Alias;
    }

    /**
     * Sets the value of the e164Alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE164Alias(String value) {
        this.e164Alias = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link kravmaga.generated.remotesetupservice.TimeZone }
     *     
     */
    public TimeZone getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link kravmaga.generated.remotesetupservice.TimeZone }
     *     
     */
    public void setTimeZone(TimeZone value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the systemCategory property.
     * 
     * @return
     *     possible object is
     *     {@link kravmaga.generated.remotesetupservice.SystemCategoryOverride }
     *     
     */
    public SystemCategoryOverride getSystemCategory() {
        return systemCategory;
    }

    /**
     * Sets the value of the systemCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link kravmaga.generated.remotesetupservice.SystemCategoryOverride }
     *     
     */
    public void setSystemCategory(SystemCategoryOverride value) {
        this.systemCategory = value;
    }

    /**
     * Gets the value of the systemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link kravmaga.generated.remotesetupservice.SystemStatusOverride }
     *     
     */
    public SystemStatusOverride getSystemStatus() {
        return systemStatus;
    }

    /**
     * Sets the value of the systemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link kravmaga.generated.remotesetupservice.SystemStatusOverride }
     *     
     */
    public void setSystemStatus(SystemStatusOverride value) {
        this.systemStatus = value;
    }

}
