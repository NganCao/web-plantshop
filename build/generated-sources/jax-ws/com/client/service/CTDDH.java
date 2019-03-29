
package com.client.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_DDH complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_DDH">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaDDH" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaSP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SoLuong" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DonGia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DonDatHang" type="{http://tempuri.org/}DonDatHang" minOccurs="0"/>
 *         &lt;element name="SanPham" type="{http://tempuri.org/}SanPham" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_DDH", propOrder = {
    "maDDH",
    "maSP",
    "soLuong",
    "donGia",
    "donDatHang",
    "sanPham"
})
public class CTDDH {

    @XmlElement(name = "MaDDH")
    protected int maDDH;
    @XmlElement(name = "MaSP")
    protected int maSP;
    @XmlElement(name = "SoLuong")
    protected int soLuong;
    @XmlElement(name = "DonGia")
    protected int donGia;
    @XmlElement(name = "DonDatHang")
    protected DonDatHang donDatHang;
    @XmlElement(name = "SanPham")
    protected SanPham sanPham;

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
     * Gets the value of the soLuong property.
     * 
     */
    public int getSoLuong() {
        return soLuong;
    }

    /**
     * Sets the value of the soLuong property.
     * 
     */
    public void setSoLuong(int value) {
        this.soLuong = value;
    }

    /**
     * Gets the value of the donGia property.
     * 
     */
    public int getDonGia() {
        return donGia;
    }

    /**
     * Sets the value of the donGia property.
     * 
     */
    public void setDonGia(int value) {
        this.donGia = value;
    }

    /**
     * Gets the value of the donDatHang property.
     * 
     * @return
     *     possible object is
     *     {@link DonDatHang }
     *     
     */
    public DonDatHang getDonDatHang() {
        return donDatHang;
    }

    /**
     * Sets the value of the donDatHang property.
     * 
     * @param value
     *     allowed object is
     *     {@link DonDatHang }
     *     
     */
    public void setDonDatHang(DonDatHang value) {
        this.donDatHang = value;
    }

    /**
     * Gets the value of the sanPham property.
     * 
     * @return
     *     possible object is
     *     {@link SanPham }
     *     
     */
    public SanPham getSanPham() {
        return sanPham;
    }

    /**
     * Sets the value of the sanPham property.
     * 
     * @param value
     *     allowed object is
     *     {@link SanPham }
     *     
     */
    public void setSanPham(SanPham value) {
        this.sanPham = value;
    }

}
