
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
 *         &lt;element name="SetPrimarySystemResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "setPrimarySystemResult"
})
@XmlRootElement(name = "SetPrimarySystemResponse")
public class SetPrimarySystemResponse {

    @XmlElement(name = "SetPrimarySystemResult")
    protected boolean setPrimarySystemResult;

    /**
     * Gets the value of the setPrimarySystemResult property.
     * 
     */
    public boolean isSetPrimarySystemResult() {
        return setPrimarySystemResult;
    }

    /**
     * Sets the value of the setPrimarySystemResult property.
     * 
     */
    public void setSetPrimarySystemResult(boolean value) {
        this.setPrimarySystemResult = value;
    }

}
