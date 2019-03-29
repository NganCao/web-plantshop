
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
 *         &lt;element name="GetListDDHResult" type="{http://tempuri.org/}ArrayOfDonDatHang" minOccurs="0"/>
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
    "getListDDHResult"
})
@XmlRootElement(name = "GetListDDHResponse")
public class GetListDDHResponse {

    @XmlElement(name = "GetListDDHResult")
    protected ArrayOfDonDatHang getListDDHResult;

    /**
     * Gets the value of the getListDDHResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDonDatHang }
     *     
     */
    public ArrayOfDonDatHang getGetListDDHResult() {
        return getListDDHResult;
    }

    /**
     * Sets the value of the getListDDHResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDonDatHang }
     *     
     */
    public void setGetListDDHResult(ArrayOfDonDatHang value) {
        this.getListDDHResult = value;
    }

}
