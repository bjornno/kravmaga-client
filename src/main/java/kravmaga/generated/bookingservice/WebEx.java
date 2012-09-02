
package kravmaga.generated.bookingservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebEx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MeetingKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SipUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MeetingPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="JoinMeetingUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HostMeetingUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HostKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JoinBeforeHostTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Telephony" type="{http://tandberg.net/2004/02/tms/external/booking/}WebExTelephony" minOccurs="0"/>
 *         &lt;element name="Errors" type="{http://tandberg.net/2004/02/tms/external/booking/}ArrayOfWebExError" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebEx", propOrder = {
    "meetingKey",
    "sipUrl",
    "meetingPassword",
    "joinMeetingUrl",
    "hostMeetingUrl",
    "hostKey",
    "joinBeforeHostTime",
    "telephony",
    "errors"
})
public class WebEx {

    @XmlElement(name = "MeetingKey", required = true, nillable = true)
    protected String meetingKey;
    @XmlElement(name = "SipUrl", required = true, nillable = true)
    protected String sipUrl;
    @XmlElement(name = "MeetingPassword", required = true, nillable = true)
    protected String meetingPassword;
    @XmlElement(name = "JoinMeetingUrl", required = true, nillable = true)
    protected String joinMeetingUrl;
    @XmlElement(name = "HostMeetingUrl", required = true, nillable = true)
    protected String hostMeetingUrl;
    @XmlElement(name = "HostKey")
    protected String hostKey;
    @XmlElement(name = "JoinBeforeHostTime")
    protected String joinBeforeHostTime;
    @XmlElement(name = "Telephony")
    protected WebExTelephony telephony;
    @XmlElement(name = "Errors")
    protected ArrayOfWebExError errors;

    /**
     * Gets the value of the meetingKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetingKey() {
        return meetingKey;
    }

    /**
     * Sets the value of the meetingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetingKey(String value) {
        this.meetingKey = value;
    }

    /**
     * Gets the value of the sipUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSipUrl() {
        return sipUrl;
    }

    /**
     * Sets the value of the sipUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSipUrl(String value) {
        this.sipUrl = value;
    }

    /**
     * Gets the value of the meetingPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetingPassword() {
        return meetingPassword;
    }

    /**
     * Sets the value of the meetingPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetingPassword(String value) {
        this.meetingPassword = value;
    }

    /**
     * Gets the value of the joinMeetingUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJoinMeetingUrl() {
        return joinMeetingUrl;
    }

    /**
     * Sets the value of the joinMeetingUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJoinMeetingUrl(String value) {
        this.joinMeetingUrl = value;
    }

    /**
     * Gets the value of the hostMeetingUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostMeetingUrl() {
        return hostMeetingUrl;
    }

    /**
     * Sets the value of the hostMeetingUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostMeetingUrl(String value) {
        this.hostMeetingUrl = value;
    }

    /**
     * Gets the value of the hostKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostKey() {
        return hostKey;
    }

    /**
     * Sets the value of the hostKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostKey(String value) {
        this.hostKey = value;
    }

    /**
     * Gets the value of the joinBeforeHostTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJoinBeforeHostTime() {
        return joinBeforeHostTime;
    }

    /**
     * Sets the value of the joinBeforeHostTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJoinBeforeHostTime(String value) {
        this.joinBeforeHostTime = value;
    }

    /**
     * Gets the value of the telephony property.
     * 
     * @return
     *     possible object is
     *     {@link WebExTelephony }
     *     
     */
    public WebExTelephony getTelephony() {
        return telephony;
    }

    /**
     * Sets the value of the telephony property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebExTelephony }
     *     
     */
    public void setTelephony(WebExTelephony value) {
        this.telephony = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link kravmaga.generated.bookingservice.ArrayOfWebExError }
     *     
     */
    public ArrayOfWebExError getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link kravmaga.generated.bookingservice.ArrayOfWebExError }
     *     
     */
    public void setErrors(ArrayOfWebExError value) {
        this.errors = value;
    }

}
