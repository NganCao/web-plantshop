
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
 *         &lt;element name="CountMenuResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "countMenuResult"
})
@XmlRootElement(name = "CountMenuResponse")
public class CountMenuResponse {

    @XmlElement(name = "CountMenuResult")
    protected int countMenuResult;

    /**
     * Gets the value of the countMenuResult property.
     * 
     */
    public int getCountMenuResult() {
        return countMenuResult;
    }

    /**
     * Sets the value of the countMenuResult property.
     * 
     */
    public void setCountMenuResult(int value) {
        this.countMenuResult = value;
    }

}
