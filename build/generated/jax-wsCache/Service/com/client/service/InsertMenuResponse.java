
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
 *         &lt;element name="InsertMenuResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "insertMenuResult"
})
@XmlRootElement(name = "InsertMenuResponse")
public class InsertMenuResponse {

    @XmlElement(name = "InsertMenuResult")
    protected boolean insertMenuResult;

    /**
     * Gets the value of the insertMenuResult property.
     * 
     */
    public boolean isInsertMenuResult() {
        return insertMenuResult;
    }

    /**
     * Sets the value of the insertMenuResult property.
     * 
     */
    public void setInsertMenuResult(boolean value) {
        this.insertMenuResult = value;
    }

}
