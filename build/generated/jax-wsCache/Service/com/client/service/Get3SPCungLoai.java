
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
 *         &lt;element name="n" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mamenu" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "n",
    "mamenu",
    "masp"
})
@XmlRootElement(name = "Get3SPCungLoai")
public class Get3SPCungLoai {

    protected int n;
    protected int mamenu;
    protected int masp;

    /**
     * Gets the value of the n property.
     * 
     */
    public int getN() {
        return n;
    }

    /**
     * Sets the value of the n property.
     * 
     */
    public void setN(int value) {
        this.n = value;
    }

    /**
     * Gets the value of the mamenu property.
     * 
     */
    public int getMamenu() {
        return mamenu;
    }

    /**
     * Sets the value of the mamenu property.
     * 
     */
    public void setMamenu(int value) {
        this.mamenu = value;
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
