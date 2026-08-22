
package com.techstack.corebanking.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Stdnsfms-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Stdnsfms-Create-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="REF_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SETT_TXN_STAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CHEQUE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Stdnsfms-Create-IO-Type", propOrder = {
    "refno",
    "customerno",
    "setttxnstat",
    "remarks",
    "chequeno"
})
public class StdnsfmsCreateIOType {

    @XmlElement(name = "REF_NO")
    protected String refno;
    @XmlElement(name = "CUSTOMER_NO")
    protected String customerno;
    @XmlElement(name = "SETT_TXN_STAT")
    protected String setttxnstat;
    @XmlElement(name = "REMARKS")
    protected String remarks;
    @XmlElement(name = "CHEQUE_NO")
    protected String chequeno;

    /**
     * Gets the value of the refno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFNO() {
        return refno;
    }

    /**
     * Sets the value of the refno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFNO(String value) {
        this.refno = value;
    }

    /**
     * Gets the value of the customerno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMERNO() {
        return customerno;
    }

    /**
     * Sets the value of the customerno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMERNO(String value) {
        this.customerno = value;
    }

    /**
     * Gets the value of the setttxnstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSETTTXNSTAT() {
        return setttxnstat;
    }

    /**
     * Sets the value of the setttxnstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSETTTXNSTAT(String value) {
        this.setttxnstat = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMARKS() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMARKS(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the chequeno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHEQUENO() {
        return chequeno;
    }

    /**
     * Sets the value of the chequeno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHEQUENO(String value) {
        this.chequeno = value;
    }

}
