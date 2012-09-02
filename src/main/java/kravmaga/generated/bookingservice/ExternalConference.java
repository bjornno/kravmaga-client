
package kravmaga.generated.bookingservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalConference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalConference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WebEx" type="{http://tandberg.net/2004/02/tms/external/booking/}WebEx" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalConference", propOrder = {
    "webEx"
})
public class ExternalConference {

    @XmlElement(name = "WebEx")
    protected WebEx webEx;

    /**
     * Gets the value of the webEx property.
     * 
     * @return
     *     possible object is
     *     {@link WebEx }
     *     
     */
    public WebEx getWebEx() {
        return webEx;
    }

    /**
     * Sets the value of the webEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebEx }
     *     
     */
    public void setWebEx(WebEx value) {
        this.webEx = value;
    }

}
