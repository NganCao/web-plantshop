
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
 *         &lt;element name="Get3SPCungLoaiResult" type="{http://tempuri.org/}ArrayOfSanPham" minOccurs="0"/>
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
    "get3SPCungLoaiResult"
})
@XmlRootElement(name = "Get3SPCungLoaiResponse")
public class Get3SPCungLoaiResponse {

    @XmlElement(name = "Get3SPCungLoaiResult")
    protected ArrayOfSanPham get3SPCungLoaiResult;

    /**
     * Gets the value of the get3SPCungLoaiResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSanPham }
     *     
     */
    public ArrayOfSanPham getGet3SPCungLoaiResult() {
        return get3SPCungLoaiResult;
    }

    /**
     * Sets the value of the get3SPCungLoaiResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSanPham }
     *     
     */
    public void setGet3SPCungLoaiResult(ArrayOfSanPham value) {
        this.get3SPCungLoaiResult = value;
    }

}
