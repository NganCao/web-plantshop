
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
 *         &lt;element name="maddh" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "maddh",
    "masp"
})
@XmlRootElement(name = "DeleteCT_DDH")
public class DeleteCTDDH {

    protected int maddh;
    protected int masp;

    /**
     * Gets the value of the maddh property.
     * 
     */
    public int getMaddh() {
        return maddh;
    }

    /**
     * Sets the value of the maddh property.
     * 
     */
    public void setMaddh(int value) {
        this.maddh = value;
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
