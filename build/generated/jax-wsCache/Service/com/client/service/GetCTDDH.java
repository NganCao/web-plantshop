
package com.client.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="maDDH" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="masp" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "maDDH",
    "masp"
})
@XmlRootElement(name = "GetCT_DDH")
public class GetCTDDH {

    protected int maDDH;
    protected int masp;

    /**
     * Gets the value of the maDDH property.
     * 
     */
    public int getMaDDH() {
        return maDDH;
    }

    /**
     * Sets the value of the maDDH property.
     * 
     */
    public void setMaDDH(int value) {
        this.maDDH = value;
    }

    /**
     * Gets the value of the masp property.
     * 
     */
    public int getMasp() {
        return masp;
    }

    /**
     * Sets the value of the masp property.
     * 
     */
    public void setMasp(int value) {
        this.masp = value;
    }

}
