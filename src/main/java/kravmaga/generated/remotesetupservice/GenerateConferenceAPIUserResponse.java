
package kravmaga.generated.remotesetupservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="GenerateConferenceAPIUserResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "generateConferenceAPIUserResult"
})
@XmlRootElement(name = "GenerateConferenceAPIUserResponse")
public class GenerateConferenceAPIUserResponse {

    @XmlElement(name = "GenerateConferenceAPIUserResult")
    protected String generateConferenceAPIUserResult;

    /**
     * Gets the value of the generateConferenceAPIUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenerateConferenceAPIUserResult() {
        return generateConferenceAPIUserResult;
    }

    /**
     * Sets the value of the generateConferenceAPIUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenerateConferenceAPIUserResult(String value) {
        this.generateConferenceAPIUserResult = value;
    }

}
