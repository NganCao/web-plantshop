
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
 *         &lt;element name="GetSanPhamResult" type="{http://tempuri.org/}SanPham" minOccurs="0"/>
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
    "getSanPhamResult"
})
@XmlRootElement(name = "GetSanPhamResponse")
public class GetSanPhamResponse {

    @XmlElement(name = "GetSanPhamResult")
    protected SanPham getSanPhamResult;

    /**
     * Gets the value of the getSanPhamResult property.
     * 
     * @return
     *     possible object is
     *     {@link SanPham }
     *     
     */
    public SanPham getGetSanPhamResult() {
        return getSanPhamResult;
    }

    /**
     * Sets the value of the getSanPhamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SanPham }
     *     
     */
    public void setGetSanPhamResult(SanPham value) {
        this.getSanPhamResult = value;
    }

}
