
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
 *         &lt;element name="GetListTaiKhoanResult" type="{http://tempuri.org/}ArrayOfTaiKhoan" minOccurs="0"/>
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
    "getListTaiKhoanResult"
})
@XmlRootElement(name = "GetListTaiKhoanResponse")
public class GetListTaiKhoanResponse {

    @XmlElement(name = "GetListTaiKhoanResult")
    protected ArrayOfTaiKhoan getListTaiKhoanResult;

    /**
     * Gets the value of the getListTaiKhoanResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTaiKhoan }
     *     
     */
    public ArrayOfTaiKhoan getGetListTaiKhoanResult() {
        return getListTaiKhoanResult;
    }

    /**
     * Sets the value of the getListTaiKhoanResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTaiKhoan }
     *     
     */
    public void setGetListTaiKhoanResult(ArrayOfTaiKhoan value) {
        this.getListTaiKhoanResult = value;
    }

}
