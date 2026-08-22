
package com.techstack.corebanking.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClosureData-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClosureData-Modify-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ENTITY_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ENTITY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLOSURE_ALLOWED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SOURCE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MAKER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MAKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClosureData-Modify-IO-Type", propOrder = {
    "entitytype",
    "entityid",
    "closureallowed",
    "sourcecode",
    "maker",
    "makerstamp"
})
public class ClosureDataModifyIOType {

    @XmlElement(name = "ENTITY_TYPE")
    protected String entitytype;
    @XmlElement(name = "ENTITY_ID")
    protected String entityid;
    @XmlElement(name = "CLOSURE_ALLOWED")
    protected String closureallowed;
    @XmlElement(name = "SOURCE_CODE")
    protected String sourcecode;
    @XmlElement(name = "MAKER")
    protected String maker;
    @XmlElement(name = "MAKERSTAMP")
    protected String makerstamp;

    /**
     * Gets the value of the entitytype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENTITYTYPE() {
        return entitytype;
    }

    /**
     * Sets the value of the entitytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENTITYTYPE(String value) {
        this.entitytype = value;
    }

    /**
     * Gets the value of the entityid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENTITYID() {
        return entityid;
    }

    /**
     * Sets the value of the entityid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENTITYID(String value) {
        this.entityid = value;
    }

    /**
     * Gets the value of the closureallowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLOSUREALLOWED() {
        return closureallowed;
    }

    /**
     * Sets the value of the closureallowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLOSUREALLOWED(String value) {
        this.closureallowed = value;
    }

    /**
     * Gets the value of the sourcecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOURCECODE() {
        return sourcecode;
    }

    /**
     * Sets the value of the sourcecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOURCECODE(String value) {
        this.sourcecode = value;
    }

    /**
     * Gets the value of the maker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAKER() {
        return maker;
    }

    /**
     * Sets the value of the maker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAKER(String value) {
        this.maker = value;
    }

    /**
     * Gets the value of the makerstamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAKERSTAMP() {
        return makerstamp;
    }

    /**
     * Sets the value of the makerstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAKERSTAMP(String value) {
        this.makerstamp = value;
    }

}
