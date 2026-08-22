
package com.techstack.corebanking.stub;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustAccDetail-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustAccDetail-Full-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Stvws-Stdaccqy" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ACCOUNT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACC_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACY_AVL_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="AC_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AC_OPEN_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="AC_STAT_CR_OVD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AC_STAT_DR_OVD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AC_STMT_CYCLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ADDRESS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ADDRESS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ADDRESS3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ADDRESS4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CARD_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CHECKER_DT_STAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CUST_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="IBAN_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MIN_REQD_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustAccDetail-Full-Type", propOrder = {
    "custno",
    "stvwsStdaccqy"
})
public class CustAccDetailFullType {

    @XmlElement(name = "CUSTNO", required = true)
    protected String custno;
    @XmlElement(name = "Stvws-Stdaccqy")
    protected List<StvwsStdaccqy> stvwsStdaccqy;

    /**
     * Gets the value of the custno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTNO() {
        return custno;
    }

    /**
     * Sets the value of the custno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTNO(String value) {
        this.custno = value;
    }

    /**
     * Gets the value of the stvwsStdaccqy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the stvwsStdaccqy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStvwsStdaccqy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StvwsStdaccqy }
     * 
     * 
     */
    public List<StvwsStdaccqy> getStvwsStdaccqy() {
        if (stvwsStdaccqy == null) {
            stvwsStdaccqy = new ArrayList<StvwsStdaccqy>();
        }
        return this.stvwsStdaccqy;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ACCOUNT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACC_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACY_AVL_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="AC_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AC_OPEN_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="AC_STAT_CR_OVD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AC_STAT_DR_OVD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AC_STMT_CYCLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ADDRESS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ADDRESS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ADDRESS3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ADDRESS4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CARD_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CHECKER_DT_STAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CUST_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IBAN_AC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MIN_REQD_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "accounttype",
        "accstatus",
        "acyavlbal",
        "acdesc",
        "acopendate",
        "acstatcrovd",
        "acstatdrovd",
        "acstmtcycle",
        "address1",
        "address2",
        "address3",
        "address4",
        "branchcode",
        "cardno",
        "ccy",
        "checkerdtstamp",
        "custacno",
        "ibanacno",
        "minreqdbal"
    })
    public static class StvwsStdaccqy {

        @XmlElement(name = "ACCOUNT_TYPE")
        protected String accounttype;
        @XmlElement(name = "ACC_STATUS")
        protected String accstatus;
        @XmlElement(name = "ACY_AVL_BAL")
        protected BigDecimal acyavlbal;
        @XmlElement(name = "AC_DESC")
        protected String acdesc;
        @XmlElement(name = "AC_OPEN_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar acopendate;
        @XmlElement(name = "AC_STAT_CR_OVD")
        protected String acstatcrovd;
        @XmlElement(name = "AC_STAT_DR_OVD")
        protected String acstatdrovd;
        @XmlElement(name = "AC_STMT_CYCLE")
        protected String acstmtcycle;
        @XmlElement(name = "ADDRESS1")
        protected String address1;
        @XmlElement(name = "ADDRESS2")
        protected String address2;
        @XmlElement(name = "ADDRESS3")
        protected String address3;
        @XmlElement(name = "ADDRESS4")
        protected String address4;
        @XmlElement(name = "BRANCH_CODE")
        protected String branchcode;
        @XmlElement(name = "CARD_NO")
        protected String cardno;
        @XmlElement(name = "CCY")
        protected String ccy;
        @XmlElement(name = "CHECKER_DT_STAMP")
        protected String checkerdtstamp;
        @XmlElement(name = "CUST_AC_NO")
        protected String custacno;
        @XmlElement(name = "IBAN_AC_NO")
        protected String ibanacno;
        @XmlElement(name = "MIN_REQD_BAL")
        protected BigDecimal minreqdbal;

        /**
         * Gets the value of the accounttype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCOUNTTYPE() {
            return accounttype;
        }

        /**
         * Sets the value of the accounttype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCOUNTTYPE(String value) {
            this.accounttype = value;
        }

        /**
         * Gets the value of the accstatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCSTATUS() {
            return accstatus;
        }

        /**
         * Sets the value of the accstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCSTATUS(String value) {
            this.accstatus = value;
        }

        /**
         * Gets the value of the acyavlbal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACYAVLBAL() {
            return acyavlbal;
        }

        /**
         * Sets the value of the acyavlbal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACYAVLBAL(BigDecimal value) {
            this.acyavlbal = value;
        }

        /**
         * Gets the value of the acdesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACDESC() {
            return acdesc;
        }

        /**
         * Sets the value of the acdesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACDESC(String value) {
            this.acdesc = value;
        }

        /**
         * Gets the value of the acopendate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getACOPENDATE() {
            return acopendate;
        }

        /**
         * Sets the value of the acopendate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setACOPENDATE(XMLGregorianCalendar value) {
            this.acopendate = value;
        }

        /**
         * Gets the value of the acstatcrovd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACSTATCROVD() {
            return acstatcrovd;
        }

        /**
         * Sets the value of the acstatcrovd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACSTATCROVD(String value) {
            this.acstatcrovd = value;
        }

        /**
         * Gets the value of the acstatdrovd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACSTATDROVD() {
            return acstatdrovd;
        }

        /**
         * Sets the value of the acstatdrovd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACSTATDROVD(String value) {
            this.acstatdrovd = value;
        }

        /**
         * Gets the value of the acstmtcycle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACSTMTCYCLE() {
            return acstmtcycle;
        }

        /**
         * Sets the value of the acstmtcycle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACSTMTCYCLE(String value) {
            this.acstmtcycle = value;
        }

        /**
         * Gets the value of the address1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADDRESS1() {
            return address1;
        }

        /**
         * Sets the value of the address1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADDRESS1(String value) {
            this.address1 = value;
        }

        /**
         * Gets the value of the address2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADDRESS2() {
            return address2;
        }

        /**
         * Sets the value of the address2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADDRESS2(String value) {
            this.address2 = value;
        }

        /**
         * Gets the value of the address3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADDRESS3() {
            return address3;
        }

        /**
         * Sets the value of the address3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADDRESS3(String value) {
            this.address3 = value;
        }

        /**
         * Gets the value of the address4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADDRESS4() {
            return address4;
        }

        /**
         * Sets the value of the address4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADDRESS4(String value) {
            this.address4 = value;
        }

        /**
         * Gets the value of the branchcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBRANCHCODE() {
            return branchcode;
        }

        /**
         * Sets the value of the branchcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBRANCHCODE(String value) {
            this.branchcode = value;
        }

        /**
         * Gets the value of the cardno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCARDNO() {
            return cardno;
        }

        /**
         * Sets the value of the cardno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCARDNO(String value) {
            this.cardno = value;
        }

        /**
         * Gets the value of the ccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCY() {
            return ccy;
        }

        /**
         * Sets the value of the ccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCY(String value) {
            this.ccy = value;
        }

        /**
         * Gets the value of the checkerdtstamp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHECKERDTSTAMP() {
            return checkerdtstamp;
        }

        /**
         * Sets the value of the checkerdtstamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHECKERDTSTAMP(String value) {
            this.checkerdtstamp = value;
        }

        /**
         * Gets the value of the custacno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTACNO() {
            return custacno;
        }

        /**
         * Sets the value of the custacno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTACNO(String value) {
            this.custacno = value;
        }

        /**
         * Gets the value of the ibanacno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIBANACNO() {
            return ibanacno;
        }

        /**
         * Sets the value of the ibanacno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIBANACNO(String value) {
            this.ibanacno = value;
        }

        /**
         * Gets the value of the minreqdbal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMINREQDBAL() {
            return minreqdbal;
        }

        /**
         * Sets the value of the minreqdbal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMINREQDBAL(BigDecimal value) {
            this.minreqdbal = value;
        }

    }

}
