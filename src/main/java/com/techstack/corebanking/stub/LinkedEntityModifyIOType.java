
package com.techstack.corebanking.stub;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkedEntity-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkedEntity-Modify-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CUSTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Relationship-Linkage" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="RELATIONSHIP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="INHERIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DESCP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="APP_FOR_SIGNATURE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "LinkedEntity-Modify-IO-Type", propOrder = {
    "custno",
    "relationshipLinkage"
})
public class LinkedEntityModifyIOType {

    @XmlElement(name = "CUSTNO")
    protected String custno;
    @XmlElement(name = "Relationship-Linkage", required = true)
    protected List<RelationshipLinkage> relationshipLinkage;

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
     * Gets the value of the relationshipLinkage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the relationshipLinkage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationshipLinkage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationshipLinkage }
     * 
     * 
     */
    public List<RelationshipLinkage> getRelationshipLinkage() {
        if (relationshipLinkage == null) {
            relationshipLinkage = new ArrayList<RelationshipLinkage>();
        }
        return this.relationshipLinkage;
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
     *         &lt;element name="CUSTOMER" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="RELATIONSHIP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="INHERIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DESCP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="APP_FOR_SIGNATURE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "customer",
        "relationship",
        "inherit",
        "descp",
        "appforsignature"
    })
    public static class RelationshipLinkage {

        @XmlElement(name = "CUSTOMER", required = true)
        protected String customer;
        @XmlElement(name = "RELATIONSHIP", required = true)
        protected String relationship;
        @XmlElement(name = "INHERIT")
        protected String inherit;
        @XmlElement(name = "DESCP")
        protected String descp;
        @XmlElement(name = "APP_FOR_SIGNATURE")
        protected String appforsignature;

        /**
         * Gets the value of the customer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTOMER() {
            return customer;
        }

        /**
         * Sets the value of the customer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTOMER(String value) {
            this.customer = value;
        }

        /**
         * Gets the value of the relationship property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRELATIONSHIP() {
            return relationship;
        }

        /**
         * Sets the value of the relationship property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRELATIONSHIP(String value) {
            this.relationship = value;
        }

        /**
         * Gets the value of the inherit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINHERIT() {
            return inherit;
        }

        /**
         * Sets the value of the inherit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINHERIT(String value) {
            this.inherit = value;
        }

        /**
         * Gets the value of the descp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDESCP() {
            return descp;
        }

        /**
         * Sets the value of the descp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDESCP(String value) {
            this.descp = value;
        }

        /**
         * Gets the value of the appforsignature property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAPPFORSIGNATURE() {
            return appforsignature;
        }

        /**
         * Sets the value of the appforsignature property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAPPFORSIGNATURE(String value) {
            this.appforsignature = value;
        }

    }

}
