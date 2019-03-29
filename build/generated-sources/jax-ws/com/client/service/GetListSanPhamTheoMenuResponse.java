
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
 *         &lt;element name="GetListSanPhamTheoMenuResult" type="{http://tempuri.org/}ArrayOfSanPham" minOccurs="0"/>
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
    "getListSanPhamTheoMenuResult"
})
@XmlRootElement(name = "GetListSanPhamTheoMenuResponse")
public class GetListSanPhamTheoMenuResponse {

    @XmlElement(name = "GetListSanPhamTheoMenuResult")
    protected ArrayOfSanPham getListSanPhamTheoMenuResult;

    /**
     * Gets the value of the getListSanPhamTheoMenuResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSanPham }
     *     
     */
    public ArrayOfSanPham getGetListSanPhamTheoMenuResult() {
        return getListSanPhamTheoMenuResult;
    }

    /**
     * Sets the value of the getListSanPhamTheoMenuResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSanPham }
     *     
     */
    public void setGetListSanPhamTheoMenuResult(ArrayOfSanPham value) {
        this.getListSanPhamTheoMenuResult = value;
    }

}
