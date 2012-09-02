
package kravmaga.generated.bookingservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecurrencePattern complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurrencePattern">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FrequencyType" type="{http://tandberg.net/2004/02/tms/external/booking/}RecurringFrequency"/>
 *         &lt;element name="Interval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DaysOfWeek" type="{http://tandberg.net/2004/02/tms/external/booking/}ArrayOfDayOfWeek" minOccurs="0"/>
 *         &lt;element name="FirstDayOfWeek" type="{http://tandberg.net/2004/02/tms/external/booking/}DayOfWeek"/>
 *         &lt;element name="BySetPosition" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PatternEndType" type="{http://tandberg.net/2004/02/tms/external/booking/}RecurrenceEndType"/>
 *         &lt;element name="PatternEndDateUTC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstOccurrenceRecInstanceIdUTC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PatternInstances" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Exceptions" type="{http://tandberg.net/2004/02/tms/external/booking/}ArrayOfRecurrenceException" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurrencePattern", propOrder = {
    "frequencyType",
    "interval",
    "daysOfWeek",
    "firstDayOfWeek",
    "bySetPosition",
    "patternEndType",
    "patternEndDateUTC",
    "firstOccurrenceRecInstanceIdUTC",
    "patternInstances",
    "exceptions"
})
public class RecurrencePattern {

    @XmlElement(name = "FrequencyType", required = true)
    protected RecurringFrequency frequencyType;
    @XmlElement(name = "Interval")
    protected int interval;
    @XmlElement(name = "DaysOfWeek")
    protected ArrayOfDayOfWeek daysOfWeek;
    @XmlElement(name = "FirstDayOfWeek", required = true)
    protected DayOfWeek firstDayOfWeek;
    @XmlElement(name = "BySetPosition")
    protected int bySetPosition;
    @XmlElement(name = "PatternEndType", required = true)
    protected RecurrenceEndType patternEndType;
    @XmlElement(name = "PatternEndDateUTC")
    protected String patternEndDateUTC;
    @XmlElement(name = "FirstOccurrenceRecInstanceIdUTC")
    protected String firstOccurrenceRecInstanceIdUTC;
    @XmlElement(name = "PatternInstances")
    protected int patternInstances;
    @XmlElement(name = "Exceptions")
    protected ArrayOfRecurrenceException exceptions;

    /**
     * Gets the value of the frequencyType property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringFrequency }
     *     
     */
    public RecurringFrequency getFrequencyType() {
        return frequencyType;
    }

    /**
     * Sets the value of the frequencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringFrequency }
     *     
     */
    public void setFrequencyType(RecurringFrequency value) {
        this.frequencyType = value;
    }

    /**
     * Gets the value of the interval property.
     * 
     */
    public int getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     */
    public void setInterval(int value) {
        this.interval = value;
    }

    /**
     * Gets the value of the daysOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link kravmaga.generated.bookingservice.ArrayOfDayOfWeek }
     *     
     */
    public ArrayOfDayOfWeek getDaysOfWeek() {
        return daysOfWeek;
    }

    /**
     * Sets the value of the daysOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link kravmaga.generated.bookingservice.ArrayOfDayOfWeek }
     *     
     */
    public void setDaysOfWeek(ArrayOfDayOfWeek value) {
        this.daysOfWeek = value;
    }

    /**
     * Gets the value of the firstDayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link kravmaga.generated.bookingservice.DayOfWeek }
     *     
     */
    public DayOfWeek getFirstDayOfWeek() {
        return firstDayOfWeek;
    }

    /**
     * Sets the value of the firstDayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link kravmaga.generated.bookingservice.DayOfWeek }
     *     
     */
    public void setFirstDayOfWeek(DayOfWeek value) {
        this.firstDayOfWeek = value;
    }

    /**
     * Gets the value of the bySetPosition property.
     * 
     */
    public int getBySetPosition() {
        return bySetPosition;
    }

    /**
     * Sets the value of the bySetPosition property.
     * 
     */
    public void setBySetPosition(int value) {
        this.bySetPosition = value;
    }

    /**
     * Gets the value of the patternEndType property.
     * 
     * @return
     *     possible object is
     *     {@link kravmaga.generated.bookingservice.RecurrenceEndType }
     *     
     */
    public RecurrenceEndType getPatternEndType() {
        return patternEndType;
    }

    /**
     * Sets the value of the patternEndType property.
     * 
     * @param value
     *     allowed object is
     *     {@link kravmaga.generated.bookingservice.RecurrenceEndType }
     *     
     */
    public void setPatternEndType(RecurrenceEndType value) {
        this.patternEndType = value;
    }

    /**
     * Gets the value of the patternEndDateUTC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatternEndDateUTC() {
        return patternEndDateUTC;
    }

    /**
     * Sets the value of the patternEndDateUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatternEndDateUTC(String value) {
        this.patternEndDateUTC = value;
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
     * Gets the value of the patternInstances property.
     * 
     */
    public int getPatternInstances() {
        return patternInstances;
    }

    /**
     * Sets the value of the patternInstances property.
     * 
     */
    public void setPatternInstances(int value) {
        this.patternInstances = value;
    }

    /**
     * Gets the value of the exceptions property.
     * 
     * @return
     *     possible object is
     *     {@link kravmaga.generated.bookingservice.ArrayOfRecurrenceException }
     *     
     */
    public ArrayOfRecurrenceException getExceptions() {
        return exceptions;
    }

    /**
     * Sets the value of the exceptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link kravmaga.generated.bookingservice.ArrayOfRecurrenceException }
     *     
     */
    public void setExceptions(ArrayOfRecurrenceException value) {
        this.exceptions = value;
    }

}
