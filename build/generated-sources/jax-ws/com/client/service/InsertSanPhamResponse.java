
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
 *         &lt;element name="InsertSanPhamResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "insertSanPhamResult"
})
@XmlRootElement(name = "InsertSanPhamResponse")
public class InsertSanPhamResponse {

    @XmlElement(name = "InsertSanPhamResult")
    protected boolean insertSanPhamResult;

    /**
     * Gets the value of the insertSanPhamResult property.
     * 
     */
    public boolean isInsertSanPhamResult() {
        return insertSanPhamResult;
    }

    /**
     * Sets the value of the insertSanPhamResult property.
     * 
     */
    public void setInsertSanPhamResult(boolean value) {
        this.insertSanPhamResult = value;
    }

}
