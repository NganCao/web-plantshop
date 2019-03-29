
package com.client.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTaiKhoan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTaiKhoan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaiKhoan" type="{http://tempuri.org/}TaiKhoan" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTaiKhoan", propOrder = {
    "taiKhoan"
})
public class ArrayOfTaiKhoan {

    @XmlElement(name = "TaiKhoan", nillable = true)
    protected List<TaiKhoan> taiKhoan;

    /**
     * Gets the value of the taiKhoan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taiKhoan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaiKhoan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaiKhoan }
     * 
     * 
     */
    public List<TaiKhoan> getTaiKhoan() {
        if (taiKhoan == null) {
            taiKhoan = new ArrayList<TaiKhoan>();
        }
        return this.taiKhoan;
    }

}
