
package com.client.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Menu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Menu">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaMenu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TenMenu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Menu", propOrder = {
    "maMenu",
    "tenMenu"
})
public class Menu {

    @XmlElement(name = "MaMenu")
    protected int maMenu;
    @XmlElement(name = "TenMenu")
    protected String tenMenu;

    /**
     * Gets the value of the maMenu property.
     * 
     */
    public int getMaMenu() {
        return maMenu;
    }

    /**
     * Sets the value of the maMenu property.
     * 
     */
    public void setMaMenu(int value) {
        this.maMenu = value;
    }

    /**
     * Gets the value of the tenMenu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenMenu() {
        return tenMenu;
    }

    /**
     * Sets the value of the tenMenu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenMenu(String value) {
        this.tenMenu = value;
    }

}
