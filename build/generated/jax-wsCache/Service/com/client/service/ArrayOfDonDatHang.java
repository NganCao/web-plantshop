
package com.client.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDonDatHang complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDonDatHang">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DonDatHang" type="{http://tempuri.org/}DonDatHang" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDonDatHang", propOrder = {
    "donDatHang"
})
public class ArrayOfDonDatHang {

    @XmlElement(name = "DonDatHang", nillable = true)
    protected List<DonDatHang> donDatHang;

    /**
     * Gets the value of the donDatHang property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the donDatHang property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDonDatHang().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DonDatHang }
     * 
     * 
     */
    public List<DonDatHang> getDonDatHang() {
        if (donDatHang == null) {
            donDatHang = new ArrayList<DonDatHang>();
        }
        return this.donDatHang;
    }

}
