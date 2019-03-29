
package com.client.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SanPham complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SanPham">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaSP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TenSP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HinhAnh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThongTin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaMenu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Menu" type="{http://tempuri.org/}Menu" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SanPham", propOrder = {
    "maSP",
    "tenSP",
    "hinhAnh",
    "thongTin",
    "gia",
    "maMenu",
    "menu"
})
public class SanPham {

    @XmlElement(name = "MaSP")
    protected int maSP;
    @XmlElement(name = "TenSP")
    protected String tenSP;
    @XmlElement(name = "HinhAnh")
    protected String hinhAnh;
    @XmlElement(name = "ThongTin")
    protected String thongTin;
    @XmlElement(name = "Gia", required = true, type = Integer.class, nillable = true)
    protected Integer gia;
    @XmlElement(name = "MaMenu", required = true, type = Integer.class, nillable = true)
    protected Integer maMenu;
    @XmlElement(name = "Menu")
    protected Menu menu;

    /**
     * Gets the value of the maSP property.
     * 
     */
    public int getMaSP() {
        return maSP;
    }

    /**
     * Sets the value of the maSP property.
     * 
     */
    public void setMaSP(int value) {
        this.maSP = value;
    }

    /**
     * Gets the value of the tenSP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenSP() {
        return tenSP;
    }

    /**
     * Sets the value of the tenSP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenSP(String value) {
        this.tenSP = value;
    }

    /**
     * Gets the value of the hinhAnh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHinhAnh() {
        return hinhAnh;
    }

    /**
     * Sets the value of the hinhAnh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHinhAnh(String value) {
        this.hinhAnh = value;
    }

    /**
     * Gets the value of the thongTin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThongTin() {
        return thongTin;
    }

    /**
     * Sets the value of the thongTin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThongTin(String value) {
        this.thongTin = value;
    }

    /**
     * Gets the value of the gia property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGia() {
        return gia;
    }

    /**
     * Sets the value of the gia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGia(Integer value) {
        this.gia = value;
    }

    /**
     * Gets the value of the maMenu property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaMenu() {
        return maMenu;
    }

    /**
     * Sets the value of the maMenu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaMenu(Integer value) {
        this.maMenu = value;
    }

    /**
     * Gets the value of the menu property.
     * 
     * @return
     *     possible object is
     *     {@link Menu }
     *     
     */
    public Menu getMenu() {
        return menu;
    }

    /**
     * Sets the value of the menu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Menu }
     *     
     */
    public void setMenu(Menu value) {
        this.menu = value;
    }

}
