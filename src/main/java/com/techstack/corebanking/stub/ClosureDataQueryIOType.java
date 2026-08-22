
package com.techstack.corebanking.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClosureData-Query-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClosureData-Query-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ENTITY_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ENTITY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SOURCE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClosureData-Query-IO-Type", propOrder = {
    "entitytype",
    "entityid",
    "sourcecode"
})
public class ClosureDataQueryIOType {

    @XmlElement(name = "ENTITY_TYPE")
    protected String entitytype;
    @XmlElement(name = "ENTITY_ID")
    protected String entityid;
    @XmlElement(name = "SOURCE_CODE")
    protected String sourcecode;

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

}
