
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
 *         &lt;element name="TMSSystemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "tmsSystemId"
})
@XmlRootElement(name = "GetSystemById")
public class GetSystemById {

    @XmlElement(name = "TMSSystemId")
    protected long tmsSystemId;

    /**
     * Gets the value of the tmsSystemId property.
     * 
     */
    public long getTMSSystemId() {
        return tmsSystemId;
    }

    /**
     * Sets the value of the tmsSystemId property.
     * 
     */
    public void setTMSSystemId(long value) {
        this.tmsSystemId = value;
    }

}
