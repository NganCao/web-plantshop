
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
 *         &lt;element name="InsertTaiKhoanResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "insertTaiKhoanResult"
})
@XmlRootElement(name = "InsertTaiKhoanResponse")
public class InsertTaiKhoanResponse {

    @XmlElement(name = "InsertTaiKhoanResult")
    protected boolean insertTaiKhoanResult;

    /**
     * Gets the value of the insertTaiKhoanResult property.
     * 
     */
    public boolean isInsertTaiKhoanResult() {
        return insertTaiKhoanResult;
    }

    /**
     * Sets the value of the insertTaiKhoanResult property.
     * 
     */
    public void setInsertTaiKhoanResult(boolean value) {
        this.insertTaiKhoanResult = value;
    }

}
