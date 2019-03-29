
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
 *         &lt;element name="InsertCT_DDHResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "insertCTDDHResult"
})
@XmlRootElement(name = "InsertCT_DDHResponse")
public class InsertCTDDHResponse {

    @XmlElement(name = "InsertCT_DDHResult")
    protected boolean insertCTDDHResult;

    /**
     * Gets the value of the insertCTDDHResult property.
     * 
     */
    public boolean isInsertCTDDHResult() {
        return insertCTDDHResult;
    }

    /**
     * Sets the value of the insertCTDDHResult property.
     * 
     */
    public void setInsertCTDDHResult(boolean value) {
        this.insertCTDDHResult = value;
    }

}
