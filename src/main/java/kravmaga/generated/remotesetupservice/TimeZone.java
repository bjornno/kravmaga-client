
package kravmaga.generated.remotesetupservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeZone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeZone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimezoneName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartTimeDTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndTimeDTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GMTOffset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeZone", propOrder = {
    "timezoneName",
    "startTimeDTS",
    "endTimeDTS",
    "gmtOffset"
})
public class TimeZone {

    @XmlElement(name = "TimezoneName")
    protected String timezoneName;
    @XmlElement(name = "StartTimeDTS")
    protected String startTimeDTS;
    @XmlElement(name = "EndTimeDTS")
    protected String endTimeDTS;
    @XmlElement(name = "GMTOffset")
    protected String gmtOffset;

    /**
     * Gets the value of the timezoneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimezoneName() {
        return timezoneName;
    }

    /**
     * Sets the value of the timezoneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimezoneName(String value) {
        this.timezoneName = value;
    }

    /**
     * Gets the value of the startTimeDTS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTimeDTS() {
        return startTimeDTS;
    }

    /**
     * Sets the value of the startTimeDTS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTimeDTS(String value) {
        this.startTimeDTS = value;
    }

    /**
     * Gets the value of the endTimeDTS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTimeDTS() {
        return endTimeDTS;
    }

    /**
     * Sets the value of the endTimeDTS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTimeDTS(String value) {
        this.endTimeDTS = value;
    }

    /**
     * Gets the value of the gmtOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGMTOffset() {
        return gmtOffset;
    }

    /**
     * Sets the value of the gmtOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGMTOffset(String value) {
        this.gmtOffset = value;
    }

}
