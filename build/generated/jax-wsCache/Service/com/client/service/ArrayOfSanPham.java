
package com.client.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSanPham complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSanPham">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SanPham" type="{http://tempuri.org/}SanPham" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSanPham", propOrder = {
    "sanPham"
})
public class ArrayOfSanPham {

    @XmlElement(name = "SanPham", nillable = true)
    protected List<SanPham> sanPham;

    /**
     * Gets the value of the sanPham property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sanPham property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSanPham().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SanPham }
     * 
     * 
     */
    public List<SanPham> getSanPham() {
        if (sanPham == null) {
            sanPham = new ArrayList<SanPham>();
        }
        return this.sanPham;
    }

}
