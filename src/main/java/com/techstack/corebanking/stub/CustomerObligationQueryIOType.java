
package com.techstack.corebanking.stub;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerObligation-Query-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerObligation-Query-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GUARANTOR_CIF_NO." type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LIABID" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="COLLATCD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerObligation-Query-IO-Type", propOrder = {
    "guarantorcifno",
    "liabid",
    "collatcd"
})
public class CustomerObligationQueryIOType {

    @XmlElement(name = "GUARANTOR_CIF_NO.", required = true)
    protected String guarantorcifno;
    @XmlElement(name = "LIABID", required = true)
    protected BigDecimal liabid;
    @XmlElement(name = "COLLATCD", required = true)
    protected String collatcd;

    /**
     * Gets the value of the guarantorcifno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGUARANTORCIFNO() {
        return guarantorcifno;
    }

    /**
     * Sets the value of the guarantorcifno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGUARANTORCIFNO(String value) {
        this.guarantorcifno = value;
    }

    /**
     * Gets the value of the liabid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLIABID() {
        return liabid;
    }

    /**
     * Sets the value of the liabid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLIABID(BigDecimal value) {
        this.liabid = value;
    }

    /**
     * Gets the value of the collatcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOLLATCD() {
        return collatcd;
    }

    /**
     * Sets the value of the collatcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOLLATCD(String value) {
        this.collatcd = value;
    }

}
