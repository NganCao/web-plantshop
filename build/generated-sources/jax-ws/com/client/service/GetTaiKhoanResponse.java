
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
 *         &lt;element name="GetTaiKhoanResult" type="{http://tempuri.org/}TaiKhoan" minOccurs="0"/>
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
    "getTaiKhoanResult"
})
@XmlRootElement(name = "GetTaiKhoanResponse")
public class GetTaiKhoanResponse {

    @XmlElement(name = "GetTaiKhoanResult")
    protected TaiKhoan getTaiKhoanResult;

    /**
     * Gets the value of the getTaiKhoanResult property.
     * 
     * @return
     *     possible object is
     *     {@link TaiKhoan }
     *     
     */
    public TaiKhoan getGetTaiKhoanResult() {
        return getTaiKhoanResult;
    }

    /**
     * Sets the value of the getTaiKhoanResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaiKhoan }
     *     
     */
    public void setGetTaiKhoanResult(TaiKhoan value) {
        this.getTaiKhoanResult = value;
    }

}
