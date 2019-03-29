
package com.client.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trangthai" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="diachi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sdt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ngaygiao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ngaydat" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="mota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "username",
    "trangthai",
    "diachi",
    "sdt",
    "ngaygiao",
    "ngaydat",
    "mota"
})
@XmlRootElement(name = "UpdateDDH")
public class UpdateDDH {

    protected int maddh;
    protected String username;
    protected int trangthai;
    protected String diachi;
    protected int sdt;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ngaygiao;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ngaydat;
    protected String mota;

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
     * Gets the value of the trangthai property.
     * 
     */
    public int getTrangthai() {
        return trangthai;
    }

    /**
     * Sets the value of the trangthai property.
     * 
     */
    public void setTrangthai(int value) {
        this.trangthai = value;
    }

    /**
     * Gets the value of the diachi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiachi() {
        return diachi;
    }

    /**
     * Sets the value of the diachi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiachi(String value) {
        this.diachi = value;
    }

    /**
     * Gets the value of the sdt property.
     * 
     */
    public int getSdt() {
        return sdt;
    }

    /**
     * Sets the value of the sdt property.
     * 
     */
    public void setSdt(int value) {
        this.sdt = value;
    }

    /**
     * Gets the value of the ngaygiao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNgaygiao() {
        return ngaygiao;
    }

    /**
     * Sets the value of the ngaygiao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNgaygiao(XMLGregorianCalendar value) {
        this.ngaygiao = value;
    }

    /**
     * Gets the value of the ngaydat property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNgaydat() {
        return ngaydat;
    }

    /**
     * Sets the value of the ngaydat property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNgaydat(XMLGregorianCalendar value) {
        this.ngaydat = value;
    }

    /**
     * Gets the value of the mota property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMota() {
        return mota;
    }

    /**
     * Sets the value of the mota property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMota(String value) {
        this.mota = value;
    }

}
