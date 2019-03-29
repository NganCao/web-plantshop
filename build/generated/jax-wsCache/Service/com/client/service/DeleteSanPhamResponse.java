
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
 *         &lt;element name="DeleteSanPhamResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "deleteSanPhamResult"
})
@XmlRootElement(name = "DeleteSanPhamResponse")
public class DeleteSanPhamResponse {

    @XmlElement(name = "DeleteSanPhamResult")
    protected boolean deleteSanPhamResult;

    /**
     * Gets the value of the deleteSanPhamResult property.
     * 
     */
    public boolean isDeleteSanPhamResult() {
        return deleteSanPhamResult;
    }

    /**
     * Sets the value of the deleteSanPhamResult property.
     * 
     */
    public void setDeleteSanPhamResult(boolean value) {
        this.deleteSanPhamResult = value;
    }

}
