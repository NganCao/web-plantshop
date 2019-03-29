
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
 *         &lt;element name="GetListCT_DDHResult" type="{http://tempuri.org/}ArrayOfCT_DDH" minOccurs="0"/>
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
    "getListCTDDHResult"
})
@XmlRootElement(name = "GetListCT_DDHResponse")
public class GetListCTDDHResponse {

    @XmlElement(name = "GetListCT_DDHResult")
    protected ArrayOfCTDDH getListCTDDHResult;

    /**
     * Gets the value of the getListCTDDHResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCTDDH }
     *     
     */
    public ArrayOfCTDDH getGetListCTDDHResult() {
        return getListCTDDHResult;
    }

    /**
     * Sets the value of the getListCTDDHResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCTDDH }
     *     
     */
    public void setGetListCTDDHResult(ArrayOfCTDDH value) {
        this.getListCTDDHResult = value;
    }

}
