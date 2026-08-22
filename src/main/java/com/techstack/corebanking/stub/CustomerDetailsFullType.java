
package com.techstack.corebanking.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerDetails-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerDetails-Full-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KEY_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Stvws-Stdcifqy" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CUSTOMER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="FIRST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LAST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="GENDER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SHORT_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ADDRESS_LINE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ADDRESS_LINE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ADDRESS_LINE3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ADDRESS_LINE4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PINCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ADDRESS_COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="HOME_PHONE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MOBILE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="FAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PHONE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="IS_VERIFIED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NAITONALITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MARITAL_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="UNIQUE_ID_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="UNIQUE_ID_VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CREATED_AT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="UPDATED_AT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="CUSTOMER_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "CustomerDetails-Full-Type", propOrder = {
    "keyid",
    "value",
    "stvwsStdcifqy"
})
public class CustomerDetailsFullType {

    @XmlElement(name = "KEY_ID", required = true)
    protected String keyid;
    @XmlElement(name = "VALUE", required = true)
    protected String value;
    @XmlElement(name = "Stvws-Stdcifqy")
    protected List<StvwsStdcifqy> stvwsStdcifqy;

    /**
     * Gets the value of the keyid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKEYID() {
        return keyid;
    }

    /**
     * Sets the value of the keyid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKEYID(String value) {
        this.keyid = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALUE() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALUE(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the stvwsStdcifqy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the stvwsStdcifqy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStvwsStdcifqy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StvwsStdcifqy }
     * 
     * 
     */
    public List<StvwsStdcifqy> getStvwsStdcifqy() {
        if (stvwsStdcifqy == null) {
            stvwsStdcifqy = new ArrayList<StvwsStdcifqy>();
        }
        return this.stvwsStdcifqy;
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
     *         &lt;element name="CUSTOMER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="FIRST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LAST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="GENDER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SHORT_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ADDRESS_LINE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ADDRESS_LINE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ADDRESS_LINE3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ADDRESS_LINE4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PINCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ADDRESS_COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="HOME_PHONE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MOBILE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="FAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PHONE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="IS_VERIFIED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NAITONALITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MARITAL_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="UNIQUE_ID_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="UNIQUE_ID_VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CREATED_AT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="UPDATED_AT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="CUSTOMER_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "customerid",
        "email",
        "firstname",
        "lastname",
        "gender",
        "title",
        "shortname",
        "addressline1",
        "addressline2",
        "addressline3",
        "addressline4",
        "pincode",
        "addresscountry",
        "homephoneno",
        "mobileno",
        "fax",
        "phoneno",
        "dob",
        "isverified",
        "naitonality",
        "maritalstatus",
        "uniqueidname",
        "uniqueidvalue",
        "createdat",
        "updatedat",
        "customertype",
        "category"
    })
    public static class StvwsStdcifqy {

        @XmlElement(name = "CUSTOMER_ID")
        protected String customerid;
        @XmlElement(name = "EMAIL")
        protected String email;
        @XmlElement(name = "FIRST_NAME")
        protected String firstname;
        @XmlElement(name = "LAST_NAME")
        protected String lastname;
        @XmlElement(name = "GENDER")
        protected String gender;
        @XmlElement(name = "TITLE")
        protected String title;
        @XmlElement(name = "SHORT_NAME")
        protected String shortname;
        @XmlElement(name = "ADDRESS_LINE1")
        protected String addressline1;
        @XmlElement(name = "ADDRESS_LINE2")
        protected String addressline2;
        @XmlElement(name = "ADDRESS_LINE3")
        protected String addressline3;
        @XmlElement(name = "ADDRESS_LINE4")
        protected String addressline4;
        @XmlElement(name = "PINCODE")
        protected String pincode;
        @XmlElement(name = "ADDRESS_COUNTRY")
        protected String addresscountry;
        @XmlElement(name = "HOME_PHONE_NO")
        protected String homephoneno;
        @XmlElement(name = "MOBILE_NO")
        protected String mobileno;
        @XmlElement(name = "FAX")
        protected String fax;
        @XmlElement(name = "PHONE_NO")
        protected String phoneno;
        @XmlElement(name = "DOB")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dob;
        @XmlElement(name = "IS_VERIFIED")
        protected String isverified;
        @XmlElement(name = "NAITONALITY")
        protected String naitonality;
        @XmlElement(name = "MARITAL_STATUS")
        protected String maritalstatus;
        @XmlElement(name = "UNIQUE_ID_NAME")
        protected String uniqueidname;
        @XmlElement(name = "UNIQUE_ID_VALUE")
        protected String uniqueidvalue;
        @XmlElement(name = "CREATED_AT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar createdat;
        @XmlElement(name = "UPDATED_AT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar updatedat;
        @XmlElement(name = "CUSTOMER_TYPE")
        protected String customertype;
        @XmlElement(name = "CATEGORY")
        protected String category;

        /**
         * Gets the value of the customerid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTOMERID() {
            return customerid;
        }

        /**
         * Sets the value of the customerid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTOMERID(String value) {
            this.customerid = value;
        }

        /**
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEMAIL() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEMAIL(String value) {
            this.email = value;
        }

        /**
         * Gets the value of the firstname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFIRSTNAME() {
            return firstname;
        }

        /**
         * Sets the value of the firstname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFIRSTNAME(String value) {
            this.firstname = value;
        }

        /**
         * Gets the value of the lastname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLASTNAME() {
            return lastname;
        }

        /**
         * Sets the value of the lastname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLASTNAME(String value) {
            this.lastname = value;
        }

        /**
         * Gets the value of the gender property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGENDER() {
            return gender;
        }

        /**
         * Sets the value of the gender property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGENDER(String value) {
            this.gender = value;
        }

        /**
         * Gets the value of the title property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTITLE() {
            return title;
        }

        /**
         * Sets the value of the title property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTITLE(String value) {
            this.title = value;
        }

        /**
         * Gets the value of the shortname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSHORTNAME() {
            return shortname;
        }

        /**
         * Sets the value of the shortname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSHORTNAME(String value) {
            this.shortname = value;
        }

        /**
         * Gets the value of the addressline1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADDRESSLINE1() {
            return addressline1;
        }

        /**
         * Sets the value of the addressline1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADDRESSLINE1(String value) {
            this.addressline1 = value;
        }

        /**
         * Gets the value of the addressline2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADDRESSLINE2() {
            return addressline2;
        }

        /**
         * Sets the value of the addressline2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADDRESSLINE2(String value) {
            this.addressline2 = value;
        }

        /**
         * Gets the value of the addressline3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADDRESSLINE3() {
            return addressline3;
        }

        /**
         * Sets the value of the addressline3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADDRESSLINE3(String value) {
            this.addressline3 = value;
        }

        /**
         * Gets the value of the addressline4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADDRESSLINE4() {
            return addressline4;
        }

        /**
         * Sets the value of the addressline4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADDRESSLINE4(String value) {
            this.addressline4 = value;
        }

        /**
         * Gets the value of the pincode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPINCODE() {
            return pincode;
        }

        /**
         * Sets the value of the pincode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPINCODE(String value) {
            this.pincode = value;
        }

        /**
         * Gets the value of the addresscountry property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADDRESSCOUNTRY() {
            return addresscountry;
        }

        /**
         * Sets the value of the addresscountry property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADDRESSCOUNTRY(String value) {
            this.addresscountry = value;
        }

        /**
         * Gets the value of the homephoneno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHOMEPHONENO() {
            return homephoneno;
        }

        /**
         * Sets the value of the homephoneno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHOMEPHONENO(String value) {
            this.homephoneno = value;
        }

        /**
         * Gets the value of the mobileno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMOBILENO() {
            return mobileno;
        }

        /**
         * Sets the value of the mobileno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMOBILENO(String value) {
            this.mobileno = value;
        }

        /**
         * Gets the value of the fax property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFAX() {
            return fax;
        }

        /**
         * Sets the value of the fax property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFAX(String value) {
            this.fax = value;
        }

        /**
         * Gets the value of the phoneno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPHONENO() {
            return phoneno;
        }

        /**
         * Sets the value of the phoneno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPHONENO(String value) {
            this.phoneno = value;
        }

        /**
         * Gets the value of the dob property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDOB() {
            return dob;
        }

        /**
         * Sets the value of the dob property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDOB(XMLGregorianCalendar value) {
            this.dob = value;
        }

        /**
         * Gets the value of the isverified property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getISVERIFIED() {
            return isverified;
        }

        /**
         * Sets the value of the isverified property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setISVERIFIED(String value) {
            this.isverified = value;
        }

        /**
         * Gets the value of the naitonality property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNAITONALITY() {
            return naitonality;
        }

        /**
         * Sets the value of the naitonality property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNAITONALITY(String value) {
            this.naitonality = value;
        }

        /**
         * Gets the value of the maritalstatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMARITALSTATUS() {
            return maritalstatus;
        }

        /**
         * Sets the value of the maritalstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMARITALSTATUS(String value) {
            this.maritalstatus = value;
        }

        /**
         * Gets the value of the uniqueidname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUNIQUEIDNAME() {
            return uniqueidname;
        }

        /**
         * Sets the value of the uniqueidname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUNIQUEIDNAME(String value) {
            this.uniqueidname = value;
        }

        /**
         * Gets the value of the uniqueidvalue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUNIQUEIDVALUE() {
            return uniqueidvalue;
        }

        /**
         * Sets the value of the uniqueidvalue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUNIQUEIDVALUE(String value) {
            this.uniqueidvalue = value;
        }

        /**
         * Gets the value of the createdat property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCREATEDAT() {
            return createdat;
        }

        /**
         * Sets the value of the createdat property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCREATEDAT(XMLGregorianCalendar value) {
            this.createdat = value;
        }

        /**
         * Gets the value of the updatedat property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getUPDATEDAT() {
            return updatedat;
        }

        /**
         * Sets the value of the updatedat property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setUPDATEDAT(XMLGregorianCalendar value) {
            this.updatedat = value;
        }

        /**
         * Gets the value of the customertype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTOMERTYPE() {
            return customertype;
        }

        /**
         * Sets the value of the customertype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTOMERTYPE(String value) {
            this.customertype = value;
        }

        /**
         * Gets the value of the category property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCATEGORY() {
            return category;
        }

        /**
         * Sets the value of the category property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCATEGORY(String value) {
            this.category = value;
        }

    }

}
