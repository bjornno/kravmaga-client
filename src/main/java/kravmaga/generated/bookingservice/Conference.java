
package kravmaga.generated.bookingservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Conference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Conference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConferenceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartTimeUTC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndTimeUTC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurrenceInstanceIdUTC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurrenceInstanceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstOccurrenceRecInstanceIdUTC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurrencePattern" type="{http://tandberg.net/2004/02/tms/external/booking/}RecurrencePattern" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="OwnerUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConferenceType" type="{http://tandberg.net/2004/02/tms/external/booking/}ConferenceType"/>
 *         &lt;element name="Bandwidth" type="{http://tandberg.net/2004/02/tms/external/booking/}Bandwidth"/>
 *         &lt;element name="PictureMode" type="{http://tandberg.net/2004/02/tms/external/booking/}PictureMode"/>
 *         &lt;element name="Encrypted" type="{http://tandberg.net/2004/02/tms/external/booking/}EncryptionRequested"/>
 *         &lt;element name="DataConference" type="{http://tandberg.net/2004/02/tms/external/booking/}DataConferenceMode"/>
 *         &lt;element name="ShowExtendOption" type="{http://tandberg.net/2004/02/tms/external/booking/}ExtendOptionRequested"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISDNRestrict" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ExternalConference" type="{http://tandberg.net/2004/02/tms/external/booking/}ExternalConference" minOccurs="0"/>
 *         &lt;element name="ConferenceInfoText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConferenceInfoHtml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserMessageText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalSourceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalPrimaryKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Participants" type="{http://tandberg.net/2004/02/tms/external/booking/}ArrayOfParticipant" minOccurs="0"/>
 *         &lt;element name="RecordedConferenceUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WebConferencePresenterUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WebConferenceAttendeeUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISDNBandwidth" type="{http://tandberg.net/2004/02/tms/external/booking/}BandwidthOverride" minOccurs="0"/>
 *         &lt;element name="IPBandwidth" type="{http://tandberg.net/2004/02/tms/external/booking/}BandwidthOverride" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conference", propOrder = {
    "conferenceId",
    "title",
    "startTimeUTC",
    "endTimeUTC",
    "recurrenceInstanceIdUTC",
    "recurrenceInstanceType",
    "firstOccurrenceRecInstanceIdUTC",
    "recurrencePattern",
    "ownerId",
    "ownerUserName",
    "ownerFirstName",
    "ownerLastName",
    "ownerEmailAddress",
    "conferenceType",
    "bandwidth",
    "pictureMode",
    "encrypted",
    "dataConference",
    "showExtendOption",
    "password",
    "billingCode",
    "isdnRestrict",
    "externalConference",
    "conferenceInfoText",
    "conferenceInfoHtml",
    "userMessageText",
    "externalSourceId",
    "externalPrimaryKey",
    "participants",
    "recordedConferenceUri",
    "webConferencePresenterUri",
    "webConferenceAttendeeUri",
    "isdnBandwidth",
    "ipBandwidth"
})
public class Conference {

    @XmlElement(name = "ConferenceId")
    protected int conferenceId;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "StartTimeUTC")
    protected String startTimeUTC;
    @XmlElement(name = "EndTimeUTC")
    protected String endTimeUTC;
    @XmlElement(name = "RecurrenceInstanceIdUTC")
    protected String recurrenceInstanceIdUTC;
    @XmlElement(name = "RecurrenceInstanceType")
    protected String recurrenceInstanceType;
    @XmlElement(name = "FirstOccurrenceRecInstanceIdUTC")
    protected String firstOccurrenceRecInstanceIdUTC;
    @XmlElement(name = "RecurrencePattern")
    protected RecurrencePattern recurrencePattern;
    @XmlElement(name = "OwnerId")
    protected long ownerId;
    @XmlElement(name = "OwnerUserName")
    protected String ownerUserName;
    @XmlElement(name = "OwnerFirstName")
    protected String ownerFirstName;
    @XmlElement(name = "OwnerLastName")
    protected String ownerLastName;
    @XmlElement(name = "OwnerEmailAddress")
    protected String ownerEmailAddress;
    @XmlElement(name = "ConferenceType", required = true)
    protected ConferenceType conferenceType;
    @XmlElement(name = "Bandwidth", required = true)
    protected String bandwidth;
    @XmlElement(name = "PictureMode", required = true)
    protected PictureMode pictureMode;
    @XmlElement(name = "Encrypted", required = true)
    protected EncryptionRequested encrypted;
    @XmlElement(name = "DataConference", required = true)
    protected DataConferenceMode dataConference;
    @XmlElement(name = "ShowExtendOption", required = true)
    protected ExtendOptionRequested showExtendOption;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "BillingCode")
    protected String billingCode;
    @XmlElement(name = "ISDNRestrict")
    protected boolean isdnRestrict;
    @XmlElement(name = "ExternalConference")
    protected ExternalConference externalConference;
    @XmlElement(name = "ConferenceInfoText")
    protected String conferenceInfoText;
    @XmlElement(name = "ConferenceInfoHtml")
    protected String conferenceInfoHtml;
    @XmlElement(name = "UserMessageText")
    protected String userMessageText;
    @XmlElement(name = "ExternalSourceId")
    protected String externalSourceId;
    @XmlElement(name = "ExternalPrimaryKey")
    protected String externalPrimaryKey;
    @XmlElement(name = "Participants")
    protected ArrayOfParticipant participants;
    @XmlElement(name = "RecordedConferenceUri")
    protected String recordedConferenceUri;
    @XmlElement(name = "WebConferencePresenterUri")
    protected String webConferencePresenterUri;
    @XmlElement(name = "WebConferenceAttendeeUri")
    protected String webConferenceAttendeeUri;
    @XmlElement(name = "ISDNBandwidth")
    protected BandwidthOverride isdnBandwidth;
    @XmlElement(name = "IPBandwidth")
    protected BandwidthOverride ipBandwidth;

    /**
     * Gets the value of the conferenceId property.
     * 
     */
    public int getConferenceId() {
        return conferenceId;
    }

    /**
     * Sets the value of the conferenceId property.
     * 
     */
    public void setConferenceId(int value) {
        this.conferenceId = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the startTimeUTC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTimeUTC() {
        return startTimeUTC;
    }

    /**
     * Sets the value of the startTimeUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTimeUTC(String value) {
        this.startTimeUTC = value;
    }

    /**
     * Gets the value of the endTimeUTC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTimeUTC() {
        return endTimeUTC;
    }

    /**
     * Sets the value of the endTimeUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTimeUTC(String value) {
        this.endTimeUTC = value;
    }

    /**
     * Gets the value of the recurrenceInstanceIdUTC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrenceInstanceIdUTC() {
        return recurrenceInstanceIdUTC;
    }

    /**
     * Sets the value of the recurrenceInstanceIdUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurrenceInstanceIdUTC(String value) {
        this.recurrenceInstanceIdUTC = value;
    }

    /**
     * Gets the value of the recurrenceInstanceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrenceInstanceType() {
        return recurrenceInstanceType;
    }

    /**
     * Sets the value of the recurrenceInstanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurrenceInstanceType(String value) {
        this.recurrenceInstanceType = value;
    }

    /**
     * Gets the value of the firstOccurrenceRecInstanceIdUTC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstOccurrenceRecInstanceIdUTC() {
        return firstOccurrenceRecInstanceIdUTC;
    }

    /**
     * Sets the value of the firstOccurrenceRecInstanceIdUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstOccurrenceRecInstanceIdUTC(String value) {
        this.firstOccurrenceRecInstanceIdUTC = value;
    }

    /**
     * Gets the value of the recurrencePattern property.
     * 
     * @return
     *     possible object is
     *     {@link RecurrencePattern }
     *     
     */
    public RecurrencePattern getRecurrencePattern() {
        return recurrencePattern;
    }

    /**
     * Sets the value of the recurrencePattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrencePattern }
     *     
     */
    public void setRecurrencePattern(RecurrencePattern value) {
        this.recurrencePattern = value;
    }

    /**
     * Gets the value of the ownerId property.
     * 
     */
    public long getOwnerId() {
        return ownerId;
    }

    /**
     * Sets the value of the ownerId property.
     * 
     */
    public void setOwnerId(long value) {
        this.ownerId = value;
    }

    /**
     * Gets the value of the ownerUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerUserName() {
        return ownerUserName;
    }

    /**
     * Sets the value of the ownerUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerUserName(String value) {
        this.ownerUserName = value;
    }

    /**
     * Gets the value of the ownerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    /**
     * Sets the value of the ownerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerFirstName(String value) {
        this.ownerFirstName = value;
    }

    /**
     * Gets the value of the ownerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerLastName() {
        return ownerLastName;
    }

    /**
     * Sets the value of the ownerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerLastName(String value) {
        this.ownerLastName = value;
    }

    /**
     * Gets the value of the ownerEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerEmailAddress() {
        return ownerEmailAddress;
    }

    /**
     * Sets the value of the ownerEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerEmailAddress(String value) {
        this.ownerEmailAddress = value;
    }

    /**
     * Gets the value of the conferenceType property.
     * 
     * @return
     *     possible object is
     *     {@link ConferenceType }
     *     
     */
    public ConferenceType getConferenceType() {
        return conferenceType;
    }

    /**
     * Sets the value of the conferenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConferenceType }
     *     
     */
    public void setConferenceType(ConferenceType value) {
        this.conferenceType = value;
    }

    /**
     * Gets the value of the bandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBandwidth() {
        return bandwidth;
    }

    /**
     * Sets the value of the bandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBandwidth(String value) {
        this.bandwidth = value;
    }

    /**
     * Gets the value of the pictureMode property.
     * 
     * @return
     *     possible object is
     *     {@link PictureMode }
     *     
     */
    public PictureMode getPictureMode() {
        return pictureMode;
    }

    /**
     * Sets the value of the pictureMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PictureMode }
     *     
     */
    public void setPictureMode(PictureMode value) {
        this.pictureMode = value;
    }

    /**
     * Gets the value of the encrypted property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptionRequested }
     *     
     */
    public EncryptionRequested getEncrypted() {
        return encrypted;
    }

    /**
     * Sets the value of the encrypted property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptionRequested }
     *     
     */
    public void setEncrypted(EncryptionRequested value) {
        this.encrypted = value;
    }

    /**
     * Gets the value of the dataConference property.
     * 
     * @return
     *     possible object is
     *     {@link DataConferenceMode }
     *     
     */
    public DataConferenceMode getDataConference() {
        return dataConference;
    }

    /**
     * Sets the value of the dataConference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataConferenceMode }
     *     
     */
    public void setDataConference(DataConferenceMode value) {
        this.dataConference = value;
    }

    /**
     * Gets the value of the showExtendOption property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendOptionRequested }
     *     
     */
    public ExtendOptionRequested getShowExtendOption() {
        return showExtendOption;
    }

    /**
     * Sets the value of the showExtendOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendOptionRequested }
     *     
     */
    public void setShowExtendOption(ExtendOptionRequested value) {
        this.showExtendOption = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the billingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCode() {
        return billingCode;
    }

    /**
     * Sets the value of the billingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCode(String value) {
        this.billingCode = value;
    }

    /**
     * Gets the value of the isdnRestrict property.
     * 
     */
    public boolean isISDNRestrict() {
        return isdnRestrict;
    }

    /**
     * Sets the value of the isdnRestrict property.
     * 
     */
    public void setISDNRestrict(boolean value) {
        this.isdnRestrict = value;
    }

    /**
     * Gets the value of the externalConference property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalConference }
     *     
     */
    public ExternalConference getExternalConference() {
        return externalConference;
    }

    /**
     * Sets the value of the externalConference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalConference }
     *     
     */
    public void setExternalConference(ExternalConference value) {
        this.externalConference = value;
    }

    /**
     * Gets the value of the conferenceInfoText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConferenceInfoText() {
        return conferenceInfoText;
    }

    /**
     * Sets the value of the conferenceInfoText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConferenceInfoText(String value) {
        this.conferenceInfoText = value;
    }

    /**
     * Gets the value of the conferenceInfoHtml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConferenceInfoHtml() {
        return conferenceInfoHtml;
    }

    /**
     * Sets the value of the conferenceInfoHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConferenceInfoHtml(String value) {
        this.conferenceInfoHtml = value;
    }

    /**
     * Gets the value of the userMessageText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserMessageText() {
        return userMessageText;
    }

    /**
     * Sets the value of the userMessageText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserMessageText(String value) {
        this.userMessageText = value;
    }

    /**
     * Gets the value of the externalSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalSourceId() {
        return externalSourceId;
    }

    /**
     * Sets the value of the externalSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalSourceId(String value) {
        this.externalSourceId = value;
    }

    /**
     * Gets the value of the externalPrimaryKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalPrimaryKey() {
        return externalPrimaryKey;
    }

    /**
     * Sets the value of the externalPrimaryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalPrimaryKey(String value) {
        this.externalPrimaryKey = value;
    }

    /**
     * Gets the value of the participants property.
     * 
     * @return
     *     possible object is
     *     {@link kravmaga.generated.bookingservice.ArrayOfParticipant }
     *     
     */
    public ArrayOfParticipant getParticipants() {
        return participants;
    }

    /**
     * Sets the value of the participants property.
     * 
     * @param value
     *     allowed object is
     *     {@link kravmaga.generated.bookingservice.ArrayOfParticipant }
     *     
     */
    public void setParticipants(ArrayOfParticipant value) {
        this.participants = value;
    }

    /**
     * Gets the value of the recordedConferenceUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordedConferenceUri() {
        return recordedConferenceUri;
    }

    /**
     * Sets the value of the recordedConferenceUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordedConferenceUri(String value) {
        this.recordedConferenceUri = value;
    }

    /**
     * Gets the value of the webConferencePresenterUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebConferencePresenterUri() {
        return webConferencePresenterUri;
    }

    /**
     * Sets the value of the webConferencePresenterUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebConferencePresenterUri(String value) {
        this.webConferencePresenterUri = value;
    }

    /**
     * Gets the value of the webConferenceAttendeeUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebConferenceAttendeeUri() {
        return webConferenceAttendeeUri;
    }

    /**
     * Sets the value of the webConferenceAttendeeUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebConferenceAttendeeUri(String value) {
        this.webConferenceAttendeeUri = value;
    }

    /**
     * Gets the value of the isdnBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link kravmaga.generated.bookingservice.BandwidthOverride }
     *     
     */
    public BandwidthOverride getISDNBandwidth() {
        return isdnBandwidth;
    }

    /**
     * Sets the value of the isdnBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link kravmaga.generated.bookingservice.BandwidthOverride }
     *     
     */
    public void setISDNBandwidth(BandwidthOverride value) {
        this.isdnBandwidth = value;
    }

    /**
     * Gets the value of the ipBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link kravmaga.generated.bookingservice.BandwidthOverride }
     *     
     */
    public BandwidthOverride getIPBandwidth() {
        return ipBandwidth;
    }

    /**
     * Sets the value of the ipBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link kravmaga.generated.bookingservice.BandwidthOverride }
     *     
     */
    public void setIPBandwidth(BandwidthOverride value) {
        this.ipBandwidth = value;
    }

}
