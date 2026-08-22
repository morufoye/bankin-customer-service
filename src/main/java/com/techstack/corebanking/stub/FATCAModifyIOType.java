
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
 * <p>Java class for FATCA-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FATCA-Modify-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ENTITY_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="US_INDICIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FATCA_CLASFCN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RECALCITRANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CUST_TIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TIN_EXP_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CUST_EIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EIN_ISSUE_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="EIN_EXP_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRACK_REQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRACKING_CLSE_DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="GIIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GIINISSUEDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="GIINEXPIRYDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="GIINVERIFIED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RESPONSIBLEOFFICERNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RESPONSIBLEOFFICERDESIGNATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RESPONSIBLEOFFICERADDRESSLINE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RESPONSIBLEOFFICERADDRESSLINE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RESPONSIBLEOFFICERADDRESSLINE3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RESPONSIBLEOFFICERADDRESSLINE4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RESPONSIBLEOFFICETELEPHONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RESPONSIBLEOFFICEREMAILID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EWFI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IGA_STATUS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MAKER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MAKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sttbs-Cust-Fatca-Oblog" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OBLIGID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="OBLIGTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="OBLIGSOURCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="OBLIGSOURCETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="OBLIGPRODUCTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="OBLIGOPENDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="OBLIGCLOSEDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="OBLIGCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="OBLIGAMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="USSOURCEDOBLIG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="GRANDFATHEREDOBLIG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INCLUDEBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UDFDETAILS" type="{http://fcubs.ofss.com/service/FCUBSCustomerService}UDFDETAILSType2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FATCA-Modify-IO-Type", propOrder = {
    "entityid",
    "usindicia",
    "fatcaclasfcn",
    "recalcitrant",
    "custtin",
    "tinexpdt",
    "custein",
    "einissuedt",
    "einexpdt",
    "remarks",
    "trackreqd",
    "trackingclsedt",
    "giin",
    "giinissuedate",
    "giinexpirydate",
    "giinverified",
    "responsibleofficername",
    "responsibleofficerdesignation",
    "responsibleofficeraddressline1",
    "responsibleofficeraddressline2",
    "responsibleofficeraddressline3",
    "responsibleofficeraddressline4",
    "responsibleofficetelephone",
    "responsibleofficeremailid",
    "ewfi",
    "igastatus",
    "maker",
    "makerstamp",
    "sttbsCustFatcaOblog",
    "udfdetails"
})
public class FATCAModifyIOType {

    @XmlElement(name = "ENTITY_ID", required = true)
    protected String entityid;
    @XmlElement(name = "US_INDICIA")
    protected String usindicia;
    @XmlElement(name = "FATCA_CLASFCN")
    protected String fatcaclasfcn;
    @XmlElement(name = "RECALCITRANT")
    protected String recalcitrant;
    @XmlElement(name = "CUST_TIN")
    protected String custtin;
    @XmlElement(name = "TIN_EXP_DT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tinexpdt;
    @XmlElement(name = "CUST_EIN")
    protected String custein;
    @XmlElement(name = "EIN_ISSUE_DT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar einissuedt;
    @XmlElement(name = "EIN_EXP_DT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar einexpdt;
    @XmlElement(name = "REMARKS")
    protected String remarks;
    @XmlElement(name = "TRACK_REQD")
    protected String trackreqd;
    @XmlElement(name = "TRACKING_CLSE_DT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar trackingclsedt;
    @XmlElement(name = "GIIN")
    protected String giin;
    @XmlElement(name = "GIINISSUEDATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar giinissuedate;
    @XmlElement(name = "GIINEXPIRYDATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar giinexpirydate;
    @XmlElement(name = "GIINVERIFIED")
    protected String giinverified;
    @XmlElement(name = "RESPONSIBLEOFFICERNAME")
    protected String responsibleofficername;
    @XmlElement(name = "RESPONSIBLEOFFICERDESIGNATION")
    protected String responsibleofficerdesignation;
    @XmlElement(name = "RESPONSIBLEOFFICERADDRESSLINE1")
    protected String responsibleofficeraddressline1;
    @XmlElement(name = "RESPONSIBLEOFFICERADDRESSLINE2")
    protected String responsibleofficeraddressline2;
    @XmlElement(name = "RESPONSIBLEOFFICERADDRESSLINE3")
    protected String responsibleofficeraddressline3;
    @XmlElement(name = "RESPONSIBLEOFFICERADDRESSLINE4")
    protected String responsibleofficeraddressline4;
    @XmlElement(name = "RESPONSIBLEOFFICETELEPHONE")
    protected String responsibleofficetelephone;
    @XmlElement(name = "RESPONSIBLEOFFICEREMAILID")
    protected String responsibleofficeremailid;
    @XmlElement(name = "EWFI")
    protected String ewfi;
    @XmlElement(name = "IGA_STATUS")
    protected BigDecimal igastatus;
    @XmlElement(name = "MAKER")
    protected String maker;
    @XmlElement(name = "MAKERSTAMP")
    protected String makerstamp;
    @XmlElement(name = "Sttbs-Cust-Fatca-Oblog")
    protected List<SttbsCustFatcaOblog> sttbsCustFatcaOblog;
    @XmlElement(name = "UDFDETAILS")
    protected List<UDFDETAILSType2> udfdetails;

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
     * Gets the value of the usindicia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSINDICIA() {
        return usindicia;
    }

    /**
     * Sets the value of the usindicia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSINDICIA(String value) {
        this.usindicia = value;
    }

    /**
     * Gets the value of the fatcaclasfcn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFATCACLASFCN() {
        return fatcaclasfcn;
    }

    /**
     * Sets the value of the fatcaclasfcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFATCACLASFCN(String value) {
        this.fatcaclasfcn = value;
    }

    /**
     * Gets the value of the recalcitrant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECALCITRANT() {
        return recalcitrant;
    }

    /**
     * Sets the value of the recalcitrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECALCITRANT(String value) {
        this.recalcitrant = value;
    }

    /**
     * Gets the value of the custtin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTTIN() {
        return custtin;
    }

    /**
     * Sets the value of the custtin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTTIN(String value) {
        this.custtin = value;
    }

    /**
     * Gets the value of the tinexpdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTINEXPDT() {
        return tinexpdt;
    }

    /**
     * Sets the value of the tinexpdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTINEXPDT(XMLGregorianCalendar value) {
        this.tinexpdt = value;
    }

    /**
     * Gets the value of the custein property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTEIN() {
        return custein;
    }

    /**
     * Sets the value of the custein property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTEIN(String value) {
        this.custein = value;
    }

    /**
     * Gets the value of the einissuedt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEINISSUEDT() {
        return einissuedt;
    }

    /**
     * Sets the value of the einissuedt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEINISSUEDT(XMLGregorianCalendar value) {
        this.einissuedt = value;
    }

    /**
     * Gets the value of the einexpdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEINEXPDT() {
        return einexpdt;
    }

    /**
     * Sets the value of the einexpdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEINEXPDT(XMLGregorianCalendar value) {
        this.einexpdt = value;
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
     * Gets the value of the trackreqd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRACKREQD() {
        return trackreqd;
    }

    /**
     * Sets the value of the trackreqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRACKREQD(String value) {
        this.trackreqd = value;
    }

    /**
     * Gets the value of the trackingclsedt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTRACKINGCLSEDT() {
        return trackingclsedt;
    }

    /**
     * Sets the value of the trackingclsedt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTRACKINGCLSEDT(XMLGregorianCalendar value) {
        this.trackingclsedt = value;
    }

    /**
     * Gets the value of the giin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGIIN() {
        return giin;
    }

    /**
     * Sets the value of the giin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGIIN(String value) {
        this.giin = value;
    }

    /**
     * Gets the value of the giinissuedate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGIINISSUEDATE() {
        return giinissuedate;
    }

    /**
     * Sets the value of the giinissuedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGIINISSUEDATE(XMLGregorianCalendar value) {
        this.giinissuedate = value;
    }

    /**
     * Gets the value of the giinexpirydate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGIINEXPIRYDATE() {
        return giinexpirydate;
    }

    /**
     * Sets the value of the giinexpirydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGIINEXPIRYDATE(XMLGregorianCalendar value) {
        this.giinexpirydate = value;
    }

    /**
     * Gets the value of the giinverified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGIINVERIFIED() {
        return giinverified;
    }

    /**
     * Sets the value of the giinverified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGIINVERIFIED(String value) {
        this.giinverified = value;
    }

    /**
     * Gets the value of the responsibleofficername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESPONSIBLEOFFICERNAME() {
        return responsibleofficername;
    }

    /**
     * Sets the value of the responsibleofficername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESPONSIBLEOFFICERNAME(String value) {
        this.responsibleofficername = value;
    }

    /**
     * Gets the value of the responsibleofficerdesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESPONSIBLEOFFICERDESIGNATION() {
        return responsibleofficerdesignation;
    }

    /**
     * Sets the value of the responsibleofficerdesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESPONSIBLEOFFICERDESIGNATION(String value) {
        this.responsibleofficerdesignation = value;
    }

    /**
     * Gets the value of the responsibleofficeraddressline1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESPONSIBLEOFFICERADDRESSLINE1() {
        return responsibleofficeraddressline1;
    }

    /**
     * Sets the value of the responsibleofficeraddressline1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESPONSIBLEOFFICERADDRESSLINE1(String value) {
        this.responsibleofficeraddressline1 = value;
    }

    /**
     * Gets the value of the responsibleofficeraddressline2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESPONSIBLEOFFICERADDRESSLINE2() {
        return responsibleofficeraddressline2;
    }

    /**
     * Sets the value of the responsibleofficeraddressline2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESPONSIBLEOFFICERADDRESSLINE2(String value) {
        this.responsibleofficeraddressline2 = value;
    }

    /**
     * Gets the value of the responsibleofficeraddressline3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESPONSIBLEOFFICERADDRESSLINE3() {
        return responsibleofficeraddressline3;
    }

    /**
     * Sets the value of the responsibleofficeraddressline3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESPONSIBLEOFFICERADDRESSLINE3(String value) {
        this.responsibleofficeraddressline3 = value;
    }

    /**
     * Gets the value of the responsibleofficeraddressline4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESPONSIBLEOFFICERADDRESSLINE4() {
        return responsibleofficeraddressline4;
    }

    /**
     * Sets the value of the responsibleofficeraddressline4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESPONSIBLEOFFICERADDRESSLINE4(String value) {
        this.responsibleofficeraddressline4 = value;
    }

    /**
     * Gets the value of the responsibleofficetelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESPONSIBLEOFFICETELEPHONE() {
        return responsibleofficetelephone;
    }

    /**
     * Sets the value of the responsibleofficetelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESPONSIBLEOFFICETELEPHONE(String value) {
        this.responsibleofficetelephone = value;
    }

    /**
     * Gets the value of the responsibleofficeremailid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESPONSIBLEOFFICEREMAILID() {
        return responsibleofficeremailid;
    }

    /**
     * Sets the value of the responsibleofficeremailid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESPONSIBLEOFFICEREMAILID(String value) {
        this.responsibleofficeremailid = value;
    }

    /**
     * Gets the value of the ewfi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEWFI() {
        return ewfi;
    }

    /**
     * Sets the value of the ewfi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEWFI(String value) {
        this.ewfi = value;
    }

    /**
     * Gets the value of the igastatus property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIGASTATUS() {
        return igastatus;
    }

    /**
     * Sets the value of the igastatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIGASTATUS(BigDecimal value) {
        this.igastatus = value;
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

    /**
     * Gets the value of the sttbsCustFatcaOblog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sttbsCustFatcaOblog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttbsCustFatcaOblog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SttbsCustFatcaOblog }
     * 
     * 
     */
    public List<SttbsCustFatcaOblog> getSttbsCustFatcaOblog() {
        if (sttbsCustFatcaOblog == null) {
            sttbsCustFatcaOblog = new ArrayList<SttbsCustFatcaOblog>();
        }
        return this.sttbsCustFatcaOblog;
    }

    /**
     * Gets the value of the udfdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the udfdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUDFDETAILS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UDFDETAILSType2 }
     * 
     * 
     */
    public List<UDFDETAILSType2> getUDFDETAILS() {
        if (udfdetails == null) {
            udfdetails = new ArrayList<UDFDETAILSType2>();
        }
        return this.udfdetails;
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
     *         &lt;element name="OBLIGID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="OBLIGTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="OBLIGSOURCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="OBLIGSOURCETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="OBLIGPRODUCTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="OBLIGOPENDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="OBLIGCLOSEDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="OBLIGCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="OBLIGAMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="USSOURCEDOBLIG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="GRANDFATHEREDOBLIG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INCLUDEBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "obligid",
        "obligtype",
        "obligsource",
        "obligsourcetype",
        "obligproductcode",
        "obligopendate",
        "obligclosedate",
        "obligccy",
        "obligamount",
        "ussourcedoblig",
        "grandfatheredoblig",
        "includebal",
        "remarks"
    })
    public static class SttbsCustFatcaOblog {

        @XmlElement(name = "OBLIGID")
        protected String obligid;
        @XmlElement(name = "OBLIGTYPE")
        protected String obligtype;
        @XmlElement(name = "OBLIGSOURCE")
        protected String obligsource;
        @XmlElement(name = "OBLIGSOURCETYPE")
        protected String obligsourcetype;
        @XmlElement(name = "OBLIGPRODUCTCODE")
        protected String obligproductcode;
        @XmlElement(name = "OBLIGOPENDATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar obligopendate;
        @XmlElement(name = "OBLIGCLOSEDATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar obligclosedate;
        @XmlElement(name = "OBLIGCCY")
        protected String obligccy;
        @XmlElement(name = "OBLIGAMOUNT")
        protected BigDecimal obligamount;
        @XmlElement(name = "USSOURCEDOBLIG")
        protected String ussourcedoblig;
        @XmlElement(name = "GRANDFATHEREDOBLIG")
        protected String grandfatheredoblig;
        @XmlElement(name = "INCLUDEBAL")
        protected String includebal;
        @XmlElement(name = "REMARKS")
        protected String remarks;

        /**
         * Gets the value of the obligid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOBLIGID() {
            return obligid;
        }

        /**
         * Sets the value of the obligid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOBLIGID(String value) {
            this.obligid = value;
        }

        /**
         * Gets the value of the obligtype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOBLIGTYPE() {
            return obligtype;
        }

        /**
         * Sets the value of the obligtype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOBLIGTYPE(String value) {
            this.obligtype = value;
        }

        /**
         * Gets the value of the obligsource property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOBLIGSOURCE() {
            return obligsource;
        }

        /**
         * Sets the value of the obligsource property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOBLIGSOURCE(String value) {
            this.obligsource = value;
        }

        /**
         * Gets the value of the obligsourcetype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOBLIGSOURCETYPE() {
            return obligsourcetype;
        }

        /**
         * Sets the value of the obligsourcetype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOBLIGSOURCETYPE(String value) {
            this.obligsourcetype = value;
        }

        /**
         * Gets the value of the obligproductcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOBLIGPRODUCTCODE() {
            return obligproductcode;
        }

        /**
         * Sets the value of the obligproductcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOBLIGPRODUCTCODE(String value) {
            this.obligproductcode = value;
        }

        /**
         * Gets the value of the obligopendate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getOBLIGOPENDATE() {
            return obligopendate;
        }

        /**
         * Sets the value of the obligopendate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setOBLIGOPENDATE(XMLGregorianCalendar value) {
            this.obligopendate = value;
        }

        /**
         * Gets the value of the obligclosedate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getOBLIGCLOSEDATE() {
            return obligclosedate;
        }

        /**
         * Sets the value of the obligclosedate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setOBLIGCLOSEDATE(XMLGregorianCalendar value) {
            this.obligclosedate = value;
        }

        /**
         * Gets the value of the obligccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOBLIGCCY() {
            return obligccy;
        }

        /**
         * Sets the value of the obligccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOBLIGCCY(String value) {
            this.obligccy = value;
        }

        /**
         * Gets the value of the obligamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getOBLIGAMOUNT() {
            return obligamount;
        }

        /**
         * Sets the value of the obligamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setOBLIGAMOUNT(BigDecimal value) {
            this.obligamount = value;
        }

        /**
         * Gets the value of the ussourcedoblig property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUSSOURCEDOBLIG() {
            return ussourcedoblig;
        }

        /**
         * Sets the value of the ussourcedoblig property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUSSOURCEDOBLIG(String value) {
            this.ussourcedoblig = value;
        }

        /**
         * Gets the value of the grandfatheredoblig property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGRANDFATHEREDOBLIG() {
            return grandfatheredoblig;
        }

        /**
         * Sets the value of the grandfatheredoblig property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGRANDFATHEREDOBLIG(String value) {
            this.grandfatheredoblig = value;
        }

        /**
         * Gets the value of the includebal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINCLUDEBAL() {
            return includebal;
        }

        /**
         * Sets the value of the includebal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINCLUDEBAL(String value) {
            this.includebal = value;
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

    }

}
