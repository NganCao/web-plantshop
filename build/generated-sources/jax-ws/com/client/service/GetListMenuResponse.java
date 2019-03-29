
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
 *         &lt;element name="GetListMenuResult" type="{http://tempuri.org/}ArrayOfMenu" minOccurs="0"/>
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
    "getListMenuResult"
})
@XmlRootElement(name = "GetListMenuResponse")
public class GetListMenuResponse {

    @XmlElement(name = "GetListMenuResult")
    protected ArrayOfMenu getListMenuResult;

    /**
     * Gets the value of the getListMenuResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMenu }
     *     
     */
    public ArrayOfMenu getGetListMenuResult() {
        return getListMenuResult;
    }

    /**
     * Sets the value of the getListMenuResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMenu }
     *     
     */
    public void setGetListMenuResult(ArrayOfMenu value) {
        this.getListMenuResult = value;
    }

}
