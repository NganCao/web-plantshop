
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
 *         &lt;element name="GetListSanPhamResult" type="{http://tempuri.org/}ArrayOfSanPham" minOccurs="0"/>
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
    "getListSanPhamResult"
})
@XmlRootElement(name = "GetListSanPhamResponse")
public class GetListSanPhamResponse {

    @XmlElement(name = "GetListSanPhamResult")
    protected ArrayOfSanPham getListSanPhamResult;

    /**
     * Gets the value of the getListSanPhamResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSanPham }
     *     
     */
    public ArrayOfSanPham getGetListSanPhamResult() {
        return getListSanPhamResult;
    }

    /**
     * Sets the value of the getListSanPhamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSanPham }
     *     
     */
    public void setGetListSanPhamResult(ArrayOfSanPham value) {
        this.getListSanPhamResult = value;
    }

}
