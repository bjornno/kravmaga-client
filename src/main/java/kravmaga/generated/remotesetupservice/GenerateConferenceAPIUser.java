
package kravmaga.generated.remotesetupservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="userNameBase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="encPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendNotifications" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "userNameBase",
    "encPassword",
    "emailAddress",
    "sendNotifications"
})
@XmlRootElement(name = "GenerateConferenceAPIUser")
public class GenerateConferenceAPIUser {

    protected String userNameBase;
    protected String encPassword;
    protected String emailAddress;
    protected boolean sendNotifications;

    /**
     * Gets the value of the userNameBase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserNameBase() {
        return userNameBase;
    }

    /**
     * Sets the value of the userNameBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserNameBase(String value) {
        this.userNameBase = value;
    }

    /**
     * Gets the value of the encPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncPassword() {
        return encPassword;
    }

    /**
     * Sets the value of the encPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncPassword(String value) {
        this.encPassword = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the sendNotifications property.
     * 
     */
    public boolean isSendNotifications() {
        return sendNotifications;
    }

    /**
     * Sets the value of the sendNotifications property.
     * 
     */
    public void setSendNotifications(boolean value) {
        this.sendNotifications = value;
    }

}
