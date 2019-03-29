
package com.client.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaiKhoan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaiKhoan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TenKH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiaChi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SDT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaiKhoan", propOrder = {
    "username",
    "password",
    "tenKH",
    "diaChi",
    "sdt",
    "email"
})
public class TaiKhoan {

    @XmlElement(name = "Username")
    protected String username;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "TenKH")
    protected String tenKH;
    @XmlElement(name = "DiaChi")
    protected String diaChi;
    @XmlElement(name = "SDT")
    protected int sdt;
    @XmlElement(name = "Email")
    protected String email;

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
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the tenKH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenKH() {
        return tenKH;
    }

    /**
     * Sets the value of the tenKH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenKH(String value) {
        this.tenKH = value;
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
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

}
