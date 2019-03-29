
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
 *         &lt;element name="UpdateCT_DDHResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "updateCTDDHResult"
})
@XmlRootElement(name = "UpdateCT_DDHResponse")
public class UpdateCTDDHResponse {

    @XmlElement(name = "UpdateCT_DDHResult")
    protected boolean updateCTDDHResult;

    /**
     * Gets the value of the updateCTDDHResult property.
     * 
     */
    public boolean isUpdateCTDDHResult() {
        return updateCTDDHResult;
    }

    /**
     * Sets the value of the updateCTDDHResult property.
     * 
     */
    public void setUpdateCTDDHResult(boolean value) {
        this.updateCTDDHResult = value;
    }

}
