
package com.client.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DonDatHang complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DonDatHang">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaDDH" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrangThai" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DiaChi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SDT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NgayDat" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NgayGiao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MoTa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaiKhoan" type="{http://tempuri.org/}TaiKhoan" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DonDatHang", propOrder = {
    "maDDH",
    "username",
    "trangThai",
    "diaChi",
    "sdt",
    "ngayDat",
    "ngayGiao",
    "moTa",
    "taiKhoan"
})
public class DonDatHang {

    @XmlElement(name = "MaDDH")
    protected int maDDH;
    @XmlElement(name = "Username")
    protected String username;
    @XmlElement(name = "TrangThai")
    protected int trangThai;
    @XmlElement(name = "DiaChi")
    protected String diaChi;
    @XmlElement(name = "SDT")
    protected int sdt;
    @XmlElement(name = "NgayDat", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ngayDat;
    @XmlElement(name = "NgayGiao", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ngayGiao;
    @XmlElement(name = "MoTa")
    protected String moTa;
    @XmlElement(name = "TaiKhoan")
    protected TaiKhoan taiKhoan;

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
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the trangThai property.
     * 
     */
    public int getTrangThai() {
        return trangThai;
    }

    /**
     * Sets the value of the trangThai property.
     * 
     */
    public void setTrangThai(int value) {
        this.trangThai = value;
    }

    /**
     * Gets the value of the diaChi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiaChi() {
        return diaChi;
    }

    /**
     * Sets the value of the diaChi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiaChi(String value) {
        this.diaChi = value;
    }

    /**
     * Gets the value of the sdt property.
     * 
     */
    public int getSDT() {
        return sdt;
    }

    /**
     * Sets the value of the sdt property.
     * 
     */
    public void setSDT(int value) {
        this.sdt = value;
    }

    /**
     * Gets the value of the ngayDat property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNgayDat() {
        return ngayDat;
    }

    /**
     * Sets the value of the ngayDat property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNgayDat(XMLGregorianCalendar value) {
        this.ngayDat = value;
    }

    /**
     * Gets the value of the ngayGiao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNgayGiao() {
        return ngayGiao;
    }

    /**
     * Sets the value of the ngayGiao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNgayGiao(XMLGregorianCalendar value) {
        this.ngayGiao = value;
    }

    /**
     * Gets the value of the moTa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoTa() {
        return moTa;
    }

    /**
     * Sets the value of the moTa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoTa(String value) {
        this.moTa = value;
    }

    /**
     * Gets the value of the taiKhoan property.
     * 
     * @return
     *     possible object is
     *     {@link TaiKhoan }
     *     
     */
    public TaiKhoan getTaiKhoan() {
        return taiKhoan;
    }

    /**
     * Sets the value of the taiKhoan property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaiKhoan }
     *     
     */
    public void setTaiKhoan(TaiKhoan value) {
        this.taiKhoan = value;
    }

}
