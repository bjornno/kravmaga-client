
package kravmaga.generated.bookingservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRecurrenceException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRecurrenceException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecurrenceException" type="{http://tandberg.net/2004/02/tms/external/booking/}RecurrenceException" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRecurrenceException", propOrder = {
    "recurrenceException"
})
public class ArrayOfRecurrenceException {

    @XmlElement(name = "RecurrenceException", nillable = true)
    protected List<RecurrenceException> recurrenceException;

    /**
     * Gets the value of the recurrenceException property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recurrenceException property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecurrenceException().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecurrenceException }
     * 
     * 
     */
    public List<RecurrenceException> getRecurrenceException() {
        if (recurrenceException == null) {
            recurrenceException = new ArrayList<RecurrenceException>();
        }
        return this.recurrenceException;
    }

}
