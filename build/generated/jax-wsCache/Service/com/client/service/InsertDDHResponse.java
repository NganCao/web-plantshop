
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
 *         &lt;element name="InsertDDHResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "insertDDHResult"
})
@XmlRootElement(name = "InsertDDHResponse")
public class InsertDDHResponse {

    @XmlElement(name = "InsertDDHResult")
    protected boolean insertDDHResult;

    /**
     * Gets the value of the insertDDHResult property.
     * 
     */
    public boolean isInsertDDHResult() {
        return insertDDHResult;
    }

    /**
     * Sets the value of the insertDDHResult property.
     * 
     */
    public void setInsertDDHResult(boolean value) {
        this.insertDDHResult = value;
    }

}
