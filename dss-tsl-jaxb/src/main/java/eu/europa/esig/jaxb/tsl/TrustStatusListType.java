//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 01:57:18 PM CEST 
//


package eu.europa.esig.jaxb.tsl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.europa.esig.jaxb.xmldsig.SignatureType;


/**
 * <p>Java class for TrustStatusListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrustStatusListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://uri.etsi.org/02231/v2#}SchemeInformation"/>
 *         &lt;element ref="{http://uri.etsi.org/02231/v2#}TrustServiceProviderList" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TSLTag" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrustStatusListType", propOrder = {
    "schemeInformation",
    "trustServiceProviderList",
    "signature"
})
public class TrustStatusListType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SchemeInformation", required = true)
    protected TSLSchemeInformationType schemeInformation;
    @XmlElement(name = "TrustServiceProviderList")
    protected TrustServiceProviderListType trustServiceProviderList;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;
    @XmlAttribute(name = "TSLTag", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String tslTag;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the schemeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TSLSchemeInformationType }
     *     
     */
    public TSLSchemeInformationType getSchemeInformation() {
        return schemeInformation;
    }

    /**
     * Sets the value of the schemeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSLSchemeInformationType }
     *     
     */
    public void setSchemeInformation(TSLSchemeInformationType value) {
        this.schemeInformation = value;
    }

    /**
     * Gets the value of the trustServiceProviderList property.
     * 
     * @return
     *     possible object is
     *     {@link TrustServiceProviderListType }
     *     
     */
    public TrustServiceProviderListType getTrustServiceProviderList() {
        return trustServiceProviderList;
    }

    /**
     * Sets the value of the trustServiceProviderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrustServiceProviderListType }
     *     
     */
    public void setTrustServiceProviderList(TrustServiceProviderListType value) {
        this.trustServiceProviderList = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

    /**
     * Gets the value of the tslTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSLTag() {
        return tslTag;
    }

    /**
     * Sets the value of the tslTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSLTag(String value) {
        this.tslTag = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}