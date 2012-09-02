
package kravmaga.generated.bookingservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebExTelephony complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebExTelephony">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocalCallInTollNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalCallInTollFreeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalCallInNumberUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DtmfSequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebExTelephony", propOrder = {
    "localCallInTollNumber",
    "localCallInTollFreeNumber",
    "globalCallInNumberUrl",
    "dtmfSequence"
})
public class WebExTelephony {

    @XmlElement(name = "LocalCallInTollNumber")
    protected String localCallInTollNumber;
    @XmlElement(name = "LocalCallInTollFreeNumber")
    protected String localCallInTollFreeNumber;
    @XmlElement(name = "GlobalCallInNumberUrl")
    protected String globalCallInNumberUrl;
    @XmlElement(name = "DtmfSequence")
    protected String dtmfSequence;

    /**
     * Gets the value of the localCallInTollNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalCallInTollNumber() {
        return localCallInTollNumber;
    }

    /**
     * Sets the value of the localCallInTollNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalCallInTollNumber(String value) {
        this.localCallInTollNumber = value;
    }

    /**
     * Gets the value of the localCallInTollFreeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalCallInTollFreeNumber() {
        return localCallInTollFreeNumber;
    }

    /**
     * Sets the value of the localCallInTollFreeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalCallInTollFreeNumber(String value) {
        this.localCallInTollFreeNumber = value;
    }

    /**
     * Gets the value of the globalCallInNumberUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalCallInNumberUrl() {
        return globalCallInNumberUrl;
    }

    /**
     * Sets the value of the globalCallInNumberUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalCallInNumberUrl(String value) {
        this.globalCallInNumberUrl = value;
    }

    /**
     * Gets the value of the dtmfSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtmfSequence() {
        return dtmfSequence;
    }

    /**
     * Sets the value of the dtmfSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtmfSequence(String value) {
        this.dtmfSequence = value;
    }

}
