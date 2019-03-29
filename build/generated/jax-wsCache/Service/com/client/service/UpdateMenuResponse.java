
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
 *         &lt;element name="UpdateMenuResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "updateMenuResult"
})
@XmlRootElement(name = "UpdateMenuResponse")
public class UpdateMenuResponse {

    @XmlElement(name = "UpdateMenuResult")
    protected boolean updateMenuResult;

    /**
     * Gets the value of the updateMenuResult property.
     * 
     */
    public boolean isUpdateMenuResult() {
        return updateMenuResult;
    }

    /**
     * Sets the value of the updateMenuResult property.
     * 
     */
    public void setUpdateMenuResult(boolean value) {
        this.updateMenuResult = value;
    }

}
