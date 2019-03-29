
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
 *         &lt;element name="DeleteCT_DDHResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "deleteCTDDHResult"
})
@XmlRootElement(name = "DeleteCT_DDHResponse")
public class DeleteCTDDHResponse {

    @XmlElement(name = "DeleteCT_DDHResult")
    protected boolean deleteCTDDHResult;

    /**
     * Gets the value of the deleteCTDDHResult property.
     * 
     */
    public boolean isDeleteCTDDHResult() {
        return deleteCTDDHResult;
    }

    /**
     * Sets the value of the deleteCTDDHResult property.
     * 
     */
    public void setDeleteCTDDHResult(boolean value) {
        this.deleteCTDDHResult = value;
    }

}
