
package com.nttdata.sf.tooling;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ApexCodeCoverageAggregate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApexCodeCoverageAggregate">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:tooling.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="ApexClassOrTrigger" type="{urn:tooling.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="ApexClassOrTriggerId" type="{urn:tooling.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Coverage" type="{urn:tooling.soap.sforce.com}Coverage" minOccurs="0"/>
 *         &lt;element name="CoverageLastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:tooling.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:tooling.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:tooling.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:tooling.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NumLinesCovered" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumLinesUncovered" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApexCodeCoverageAggregate", propOrder = {
    "apexClassOrTrigger",
    "apexClassOrTriggerId",
    "coverage",
    "coverageLastModifiedDate",
    "createdBy",
    "createdById",
    "createdDate",
    "isDeleted",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "numLinesCovered",
    "numLinesUncovered",
    "systemModstamp"
})
public class ApexCodeCoverageAggregate
    extends SObject
{

    @XmlElementRef(name = "ApexClassOrTrigger", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Name> apexClassOrTrigger;
    @XmlElementRef(name = "ApexClassOrTriggerId", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apexClassOrTriggerId;
    @XmlElementRef(name = "Coverage", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Coverage> coverage;
    @XmlElementRef(name = "CoverageLastModifiedDate", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> coverageLastModifiedDate;
    @XmlElementRef(name = "CreatedBy", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> createdBy;
    @XmlElementRef(name = "CreatedById", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdById;
    @XmlElementRef(name = "CreatedDate", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> createdDate;
    @XmlElementRef(name = "IsDeleted", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDeleted;
    @XmlElementRef(name = "LastModifiedBy", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> lastModifiedBy;
    @XmlElementRef(name = "LastModifiedById", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastModifiedById;
    @XmlElementRef(name = "LastModifiedDate", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastModifiedDate;
    @XmlElementRef(name = "NumLinesCovered", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numLinesCovered;
    @XmlElementRef(name = "NumLinesUncovered", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numLinesUncovered;
    @XmlElementRef(name = "SystemModstamp", namespace = "urn:tooling.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> systemModstamp;

    /**
     * Gets the value of the apexClassOrTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Name }{@code >}
     *     
     */
    public JAXBElement<Name> getApexClassOrTrigger() {
        return apexClassOrTrigger;
    }

    /**
     * Sets the value of the apexClassOrTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Name }{@code >}
     *     
     */
    public void setApexClassOrTrigger(JAXBElement<Name> value) {
        this.apexClassOrTrigger = value;
    }

    /**
     * Gets the value of the apexClassOrTriggerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApexClassOrTriggerId() {
        return apexClassOrTriggerId;
    }

    /**
     * Sets the value of the apexClassOrTriggerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApexClassOrTriggerId(JAXBElement<String> value) {
        this.apexClassOrTriggerId = value;
    }

    /**
     * Gets the value of the coverage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coverage }{@code >}
     *     
     */
    public JAXBElement<Coverage> getCoverage() {
        return coverage;
    }

    /**
     * Sets the value of the coverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coverage }{@code >}
     *     
     */
    public void setCoverage(JAXBElement<Coverage> value) {
        this.coverage = value;
    }

    /**
     * Gets the value of the coverageLastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCoverageLastModifiedDate() {
        return coverageLastModifiedDate;
    }

    /**
     * Sets the value of the coverageLastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCoverageLastModifiedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.coverageLastModifiedDate = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public JAXBElement<User> getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public void setCreatedBy(JAXBElement<User> value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the createdById property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreatedById() {
        return createdById;
    }

    /**
     * Sets the value of the createdById property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreatedById(JAXBElement<String> value) {
        this.createdById = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCreatedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the isDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDeleted() {
        return isDeleted;
    }

    /**
     * Sets the value of the isDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDeleted(JAXBElement<Boolean> value) {
        this.isDeleted = value;
    }

    /**
     * Gets the value of the lastModifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public JAXBElement<User> getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * Sets the value of the lastModifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public void setLastModifiedBy(JAXBElement<User> value) {
        this.lastModifiedBy = value;
    }

    /**
     * Gets the value of the lastModifiedById property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastModifiedById() {
        return lastModifiedById;
    }

    /**
     * Sets the value of the lastModifiedById property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastModifiedById(JAXBElement<String> value) {
        this.lastModifiedById = value;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastModifiedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastModifiedDate = value;
    }

    /**
     * Gets the value of the numLinesCovered property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumLinesCovered() {
        return numLinesCovered;
    }

    /**
     * Sets the value of the numLinesCovered property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumLinesCovered(JAXBElement<Integer> value) {
        this.numLinesCovered = value;
    }

    /**
     * Gets the value of the numLinesUncovered property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumLinesUncovered() {
        return numLinesUncovered;
    }

    /**
     * Sets the value of the numLinesUncovered property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumLinesUncovered(JAXBElement<Integer> value) {
        this.numLinesUncovered = value;
    }

    /**
     * Gets the value of the systemModstamp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSystemModstamp() {
        return systemModstamp;
    }

    /**
     * Sets the value of the systemModstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSystemModstamp(JAXBElement<XMLGregorianCalendar> value) {
        this.systemModstamp = value;
    }

}
