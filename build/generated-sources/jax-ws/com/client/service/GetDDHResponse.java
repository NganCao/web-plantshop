
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
 *         &lt;element name="GetDDHResult" type="{http://tempuri.org/}DonDatHang" minOccurs="0"/>
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
    "getDDHResult"
})
@XmlRootElement(name = "GetDDHResponse")
public class GetDDHResponse {

    @XmlElement(name = "GetDDHResult")
    protected DonDatHang getDDHResult;

    /**
     * Gets the value of the getDDHResult property.
     * 
     * @return
     *     possible object is
     *     {@link DonDatHang }
     *     
     */
    public DonDatHang getGetDDHResult() {
        return getDDHResult;
    }

    /**
     * Sets the value of the getDDHResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DonDatHang }
     *     
     */
    public void setGetDDHResult(DonDatHang value) {
        this.getDDHResult = value;
    }

}
