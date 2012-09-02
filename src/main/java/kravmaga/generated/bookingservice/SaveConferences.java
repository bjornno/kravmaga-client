
package kravmaga.generated.bookingservice;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="Conferences" type="{http://tandberg.net/2004/02/tms/external/booking/}Conference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="oneTransaction" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "conferences",
    "oneTransaction"
})
@XmlRootElement(name = "SaveConferences")
public class SaveConferences {

    @XmlElement(name = "Conferences")
    protected List<Conference> conferences;
    protected boolean oneTransaction;

    /**
     * Gets the value of the conferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link kravmaga.generated.bookingservice.Conference }
     * 
     * 
     */
    public List<Conference> getConferences() {
        if (conferences == null) {
            conferences = new ArrayList<Conference>();
        }
        return this.conferences;
    }

    /**
     * Gets the value of the oneTransaction property.
     * 
     */
    public boolean isOneTransaction() {
        return oneTransaction;
    }

    /**
     * Sets the value of the oneTransaction property.
     * 
     */
    public void setOneTransaction(boolean value) {
        this.oneTransaction = value;
    }

}
