
package kravmaga.generated.remotesetupservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTMSSystem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTMSSystem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TMSSystem" type="{http://tandberg.net/2004/02/tms/external/booking/remotesetup/}TMSSystem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTMSSystem", propOrder = {
    "tmsSystem"
})
public class ArrayOfTMSSystem {

    @XmlElement(name = "TMSSystem", nillable = true)
    protected List<TMSSystem> tmsSystem;

    /**
     * Gets the value of the tmsSystem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tmsSystem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTMSSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TMSSystem }
     * 
     * 
     */
    public List<TMSSystem> getTMSSystem() {
        if (tmsSystem == null) {
            tmsSystem = new ArrayList<TMSSystem>();
        }
        return this.tmsSystem;
    }

}
