
package com.client.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetCT_DDHResult" type="{http://tempuri.org/}CT_DDH" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getCTDDHResult"
})
@XmlRootElement(name = "GetCT_DDHResponse")
public class GetCTDDHResponse {

    @XmlElement(name = "GetCT_DDHResult")
    protected CTDDH getCTDDHResult;

    /**
     * Gets the value of the getCTDDHResult property.
     * 
     * @return
     *     possible object is
     *     {@link CTDDH }
     *     
     */
    public CTDDH getGetCTDDHResult() {
        return getCTDDHResult;
    }

    /**
     * Sets the value of the getCTDDHResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTDDH }
     *     
     */
    public void setGetCTDDHResult(CTDDH value) {
        this.getCTDDHResult = value;
    }

}
