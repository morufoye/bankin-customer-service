
package com.techstack.corebanking.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustSignImge-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustSignImge-Full-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Svtm-Cif-Sig-Det" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CIF_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SIG_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Sttm-Cust-Image" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="IMAGE_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "CustSignImge-Full-Type", propOrder = {
    "custno",
    "svtmCifSigDet",
    "sttmCustImage"
})
public class CustSignImgeFullType {

    @XmlElement(name = "CUSTNO")
    protected String custno;
    @XmlElement(name = "Svtm-Cif-Sig-Det")
    protected SvtmCifSigDet svtmCifSigDet;
    @XmlElement(name = "Sttm-Cust-Image")
    protected SttmCustImage sttmCustImage;

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
     * Gets the value of the svtmCifSigDet property.
     * 
     * @return
     *     possible object is
     *     {@link SvtmCifSigDet }
     *     
     */
    public SvtmCifSigDet getSvtmCifSigDet() {
        return svtmCifSigDet;
    }

    /**
     * Sets the value of the svtmCifSigDet property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvtmCifSigDet }
     *     
     */
    public void setSvtmCifSigDet(SvtmCifSigDet value) {
        this.svtmCifSigDet = value;
    }

    /**
     * Gets the value of the sttmCustImage property.
     * 
     * @return
     *     possible object is
     *     {@link SttmCustImage }
     *     
     */
    public SttmCustImage getSttmCustImage() {
        return sttmCustImage;
    }

    /**
     * Sets the value of the sttmCustImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link SttmCustImage }
     *     
     */
    public void setSttmCustImage(SttmCustImage value) {
        this.sttmCustImage = value;
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
     *         &lt;element name="CUSTOMER_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IMAGE_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "customerno",
        "imagetext"
    })
    public static class SttmCustImage {

        @XmlElement(name = "CUSTOMER_NO")
        protected String customerno;
        @XmlElement(name = "IMAGE_TEXT")
        protected String imagetext;

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
         * Gets the value of the imagetext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIMAGETEXT() {
            return imagetext;
        }

        /**
         * Sets the value of the imagetext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIMAGETEXT(String value) {
            this.imagetext = value;
        }

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
     *         &lt;element name="CIF_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SIG_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "cifid",
        "sigtext"
    })
    public static class SvtmCifSigDet {

        @XmlElement(name = "CIF_ID")
        protected String cifid;
        @XmlElement(name = "SIG_TEXT")
        protected String sigtext;

        /**
         * Gets the value of the cifid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCIFID() {
            return cifid;
        }

        /**
         * Sets the value of the cifid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCIFID(String value) {
            this.cifid = value;
        }

        /**
         * Gets the value of the sigtext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSIGTEXT() {
            return sigtext;
        }

        /**
         * Sets the value of the sigtext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSIGTEXT(String value) {
            this.sigtext = value;
        }

    }

}
