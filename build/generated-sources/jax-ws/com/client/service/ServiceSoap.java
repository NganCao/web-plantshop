
package com.client.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServiceSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServiceSoap {


    /**
     * \u0110\u1ebfm s\u1ed1 menu
     * 
     * @return
     *     returns int
     */
    @WebMethod(operationName = "CountMenu", action = "http://tempuri.org/CountMenu")
    @WebResult(name = "CountMenuResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CountMenu", targetNamespace = "http://tempuri.org/", className = "com.client.service.CountMenu")
    @ResponseWrapper(localName = "CountMenuResponse", targetNamespace = "http://tempuri.org/", className = "com.client.service.CountMenuResponse")
    public int countMenu();

    /**
     * Liet ke menu
     * 
     * @return
     *     returns com.client.service.ArrayOfMenu
     */
    @WebMethod(operationName = "GetListMenu", action = "http://tempuri.org/GetListMenu")
    @WebResult(name = "GetListMenuResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetListMenu", targetNamespace = "http://tempuri.org/", className = "com.client.service.GetListMenu")
    @ResponseWrapper(localName = "GetListMenuResponse", targetNamespace = "http://tempuri.org/", className = "com.client.service.GetListMenuResponse")
    public ArrayOfMenu getListMenu();

    /**
     * Tim menu theo id
     * 
     * @param maMenu
     * @return
     *     returns com.client.service.Menu
     */
    @WebMethod(operationName = "GetMenu", action = "http://tempuri.org/GetMenu")
    @WebResult(name = "GetMenuResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetMenu", targetNamespace = "http://tempuri.org/", className = "com.client.service.GetMenu")
    @ResponseWrapper(localName = "GetMenuResponse", targetNamespace = "http://tempuri.org/", className = "com.client.service.GetMenuResponse")
    public Menu getMenu(
        @WebParam(name = "maMenu", targetNamespace = "http://tempuri.org/")
        int maMenu);

    /**
     * Them menu
     * 
     * @param menu
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "InsertMenu", action = "http://tempuri.org/InsertMenu")
    @WebResult(name = "InsertMenuResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "InsertMenu", targetNamespace = "http://tempuri.org/", className = "com.client.service.InsertMenu")
    @ResponseWrapper(localName = "InsertMenuResponse", targetNamespace = "http://tempuri.org/", className = "com.client.service.InsertMenuResponse")
    public boolean insertMenu(
        @WebParam(name = "menu", targetNamespace = "http://tempuri.org/")
        String menu);

    /**
     * Xoa menu
     * 
     * @param maMenu
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "DeleteMenu", action = "http://tempuri.org/DeleteMenu")
    @WebResult(name = "DeleteMenuResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "DeleteMenu", targetNamespace = "http://tempuri.org/", className = "com.client.service.DeleteMenu")
    @ResponseWrapper(localName = "DeleteMenuResponse", targetNamespace = "http://tempuri.org/", className = "com.client.service.DeleteMenuResponse")
    public boolean deleteMenu(
        @WebParam(name = "maMenu", targetNamespace = "http://tempuri.org/")
        int maMenu);

    /**
     * Cap nhat menu
     * 
     * @param maMenu
     * @param menu
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "UpdateMenu", action = "http://tempuri.org/UpdateMenu")
    @WebResult(name = "UpdateMenuResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "UpdateMenu", targetNamespace = "http://tempuri.org/", className = "com.client.service.UpdateMenu")
    @ResponseWrapper(localName = "UpdateMenuResponse", targetNamespace = "http://tempuri.org/", className = "com.client.service.UpdateMenuResponse")
    public boolean updateMenu(
        @WebParam(name = "maMenu", targetNamespace = "http://tempuri.org/")
        int maMenu,
        @WebParam(name = "menu", targetNamespace = "http://tempuri.org/")
        String menu);

    /**
     * Liet ke san pham
     * 
     * @return
     *     returns com.client.service.ArrayOfSanPham
     */
    @WebMethod(operationName = "GetListSanPham", action = "http://tempuri.org/GetListSanPham")
    @WebResult(name = "GetListSanPhamResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetListSanPham", targetNamespace = "http://tempuri.org/", className = "com.client.service.GetListSanPham")
    @ResponseWrapper(localName = "GetListSanPhamResponse", targetNamespace = "http://tempuri.org/", className = "com.client.service.GetListSanPhamResponse")
    public ArrayOfSanPham getListSanPham();

    /**
     * Liet ke san pham theo menu
     * 
     * @param mamenu
     * @return
     *     returns com.client.service.ArrayOfSanPham
     */
    @WebMethod(operationName = "GetListSanPhamTheoMenu", action = "http://tempuri.org/GetListSanPhamTheoMenu")
    @WebResult(name = "GetListSanPhamTheoMenuResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetListSanPhamTheoMenu", targetNamespace = "http://tempuri.org/", className = "com.client.service.GetListSanPhamTheoMenu")
    @ResponseWrapper(localName = "GetListSanPhamTheoMenuResponse", targetNamespace = "http://tempuri.org/", className = "com.client.service.GetListSanPhamTheoMenuResponse")
    public ArrayOfSanPham getListSanPhamTheoMenu(
        @WebParam(name = "mamenu", targetNamespace = "http://tempuri.org/")
        int mamenu);

    /**
     * Tim san pham theo id
     * 
     * @param maSP
     * @return
     *     returns com.client.service.SanPham
     */
    @WebMethod(operationName = "GetSanPham", action = "http://tempuri.org/GetSanPham")
    @WebResult(name = "GetSanPhamResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetSanPham", targetNamespace = "http://tempuri.org/", className = "com.client.service.GetSanPham")
    @ResponseWrapper(localName = "GetSanPhamResponse", targetNamespace = "http://tempuri.org/", className = "com.client.service.GetSanPhamResponse")
    public SanPham getSanPham(
        @WebParam(name = "maSP", targetNamespace = "http://tempuri.org/")
        int maSP);

    /**
     *  3 san pham cung loai - nhap n (s\u1ed1 sp), mamenu, masp
     * 
     * @param masp
     * @param mamenu
     * @param n
     * @return
     *     returns com.client.service.ArrayOfSanPham
     */
    @WebMethod(operationName = "Get3SPCungLoai", action = "http://tempuri.org/Get3SPCungLoai")
    @WebResult(name = "Get3SPCungLoaiResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Get3SPCungLoai", targetNamespace = "http://tempuri.org/", className = "com.client.service.Get3SPCungLoai")
    @ResponseWrapper(localName = "Get3SPCungLoaiResponse", targetNamespace = "http://tempuri.org/", className = "com.client.service.Get3SPCungLoaiResponse")
    public ArrayOfSanPham get3SPCungLoai(
        @WebParam(name = "n", targetNamespace = "http://tempuri.org/")
        int n,
        @WebParam(name = "mamenu", targetNamespace = "http://tempuri.org/")
        int mamenu,
        @WebParam(name = "masp", targetNamespace = "http://tempuri.org/")
        int masp);

    /**
     * Them san pham
     * 
     * @param img
     * @param price
     * @param name
     * @param type
     * @param infor
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "InsertSanPham", action = "http://tempuri.org/InsertSanPham")
    @WebResult(name = "InsertSanPhamResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "InsertSanPham", targetNamespace = "http://tempuri.org/", className = "com.client.service.InsertSanPham")
    @ResponseWrapper(localName = "InsertSanPhamResponse", targetNamespace = "http://tempuri.org/", className = "com.client.service.InsertSanPhamResponse")
    public boolean insertSanPham(
        @WebParam(name = "name", targetNamespace = "http://tempuri.org/")
        String name,
        @WebParam(name = "img", targetNamespace = "http://tempuri.org/")
        String img,
        @WebParam(name = "infor", targetNamespace = "http://tempuri.org/")
        String infor,
        @WebParam(name = "price", targetNamespace = "http://tempuri.org/")
        int price,
        @WebParam(name = "type", targetNamespace = "http://tempuri.org/")
        int type);

    /**
     * Xoa san pham
     * 
     * @param maSP
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "DeleteSanPham", action = "http://tempuri.org/DeleteSanPham")
    @WebResult(name = "DeleteSanPhamResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "DeleteSanPham", targetNamespace = "http://tempuri.org/", className = "com.client.service.DeleteSanPham")
    @ResponseWrapper(localName = "DeleteSanPhamResponse", targetNamespace = "http://tempuri.org/", className = "com.client.service.DeleteSanPhamResponse")
    public boolean deleteSanPham(
        @WebParam(name = "maSP", targetNamespace = "http://tempuri.org/")
        int maSP);

    /**
     * Cap nhat san pham
     * 
     * @param maSP
     * @param img
     * @param price
     * @param name
     * @param type
     * @param infor
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "UpdateSanPham", action = "http://tempuri.org/UpdateSanPham")
    @WebResult(name = "UpdateSanPhamResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "UpdateSanPham", targetNamespace = "http://tempuri.org/", className = "com.client.service.UpdateSanPham")
    @ResponseWrapper(localName = "UpdateSanPhamResponse", targetNamespace = "http://tempuri.org/", className = "com.client.service.UpdateSanPhamResponse")
    public boolean updateSanPham(
        @WebParam(name = "maSP", targetNamespace = "http://tempuri.org/")
        int maSP,
        @WebParam(name = "name", targetNamespace = "http://tempuri.org/")
        String name,
        @WebParam(name = "img", targetNamespace = "http://tempuri.org/")
        String img,
        @WebParam(name = "infor", targetNamespace = "http://tempuri.org/")
        String infor,
        @WebParam(name = "price", targetNamespace = "http://tempuri.org/")
        int price,
        @WebParam(name = "type", targetNamespace = "http://tempuri.org/")
        int type);

    /**
     * Liet ke ddh
     * 
     * @return
     *     returns com.client.service.ArrayOfDonDatHang
     */
    @WebMethod(operationName = "GetListDDH", action = "http://tempuri.org/GetListDDH")
    @WebResult(name = "GetListDDHResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetListDDH", targetNamespace = "http://tempuri.org/", className = "com.client.service.GetListDDH")
    @ResponseWrapper(localName = "GetListDDHResponse", targetNamespace = "http://tempuri.org/", className = "com.client.service.GetListDDHResponse")
    public ArrayOfDonDatHang getListDDH();

    /**
     * Tim ddh theo id
     * 
     * @param maDDH
     * @return
     *     returns com.client.service.DonDatHang
     */
    @WebMethod(operationName = "GetDDH", action = "http://tempuri.org/GetDDH")
    @WebResult(name = "GetDDHResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetDDH", targetNamespace = "http://tempuri.org/", className = "com.client.service.GetDDH")
    @ResponseWrapper(localName = "GetDDHResponse", targetNamespace = "http://tempuri.org/", className = "com.client.service.GetDDHResponse")
    public DonDatHang getDDH(
        @WebParam(name = "maDDH", targetNamespace = "http://tempuri.org/")
        int maDDH);

    /**
     * Them DDH
     * 
     * @param diachi
     * @param sdt
     * @param trangthai
     * @param ngaygiao
     * @param ngaydat
     * @param mota
     * @param username
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "InsertDDH", action = "http://tempuri.org/InsertDDH")
    @WebResult(name = "InsertDDHResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "InsertDDH", targetNamespace = "http://tempuri.org/", className = "com.client.service.InsertDDH")
    @ResponseWrapper(localName = "InsertDDHResponse", targetNamespace = "http://tempuri.org/", className = "com.client.service.InsertDDHResponse")
    public boolean insertDDH(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username,
        @WebParam(name = "trangthai", targetNamespace = "http://tempuri.org/")
        int trangthai,
        @WebParam(name = "diachi", targetNamespace = "http://tempuri.org/")
        String diachi,
        @WebParam(name = "sdt", targetNamespace = "http://tempuri.org/")
        int sdt,
        @WebParam(name = "ngaygiao", targetNamespace = "http://tempuri.org/")
        XMLGregorianCalendar ngaygiao,
        @WebParam(name = "ngaydat", targetNamespace = "http://tempuri.org/")
        XMLGregorianCalendar ngaydat,
        @WebParam(name = "mota", targetNamespace = "http://tempuri.org/")
        String mota);

    /**
     * Xoa ddh
     * 
     * @param maddh
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "DeleteDDH", action = "http://tempuri.org/DeleteDDH")
    @WebResult(name = "DeleteDDHResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "DeleteDDH", targetNamespace = "http://tempuri.org/", className = "com.client.service.DeleteDDH")
    @ResponseWrapper(localName = "DeleteDDHResponse", targetNamespace = "http://tempuri.org/", className = "com.client.service.DeleteDDHResponse")
    public boolean deleteDDH(
        @WebParam(name = "maddh", targetNamespace = "http://tempuri.org/")
        int maddh);

    /**
     * Cap nhat ddh
     * 
     * @param diachi
     * @param sdt
     * @param trangthai
     * @param ngaygiao
     * @param ngaydat
     * @param maddh
     * @param mota
     * @param username
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "UpdateDDH", action = "http://tempuri.org/UpdateDDH")
    @WebResult(name = "UpdateDDHResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "UpdateDDH", targetNamespace = "http://tempuri.org/", className = "com.client.service.UpdateDDH")
    @ResponseWrapper(localName = "UpdateDDHResponse", targetNamespace = "http://tempuri.org/", className = "com.client.service.UpdateDDHResponse")
    public boolean updateDDH(
        @WebParam(name = "maddh", targetNamespace = "http://tempuri.org/")
        int maddh,
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username,
        @WebParam(name = "trangthai", targetNamespace = "http://tempuri.org/")
        int trangthai,
        @WebParam(name = "diachi", targetNamespace = "http://tempuri.org/")
        String diachi,
        @WebParam(name = "sdt", targetNamespace = "http://tempuri.org/")
        int sdt,
        @WebParam(name = "ngaygiao", targetNamespace = "http://tempuri.org/")
        XMLGregorianCalendar ngaygiao,
        @WebParam(name = "ngaydat", targetNamespace = "http://tempuri.org/")
        XMLGregorianCalendar ngaydat,
        @WebParam(name = "mota", targetNamespace = "http://tempuri.org/")
        String mota);

    /**
     * Liet ke ct_ddh
     * 
     * @return
     *     returns com.client.service.ArrayOfCTDDH
     */
    @WebMethod(operationName = "GetListCT_DDH", action = "http://tempuri.org/GetListCT_DDH")
    @WebResult(name = "GetListCT_DDHResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetListCT_DDH", targetNamespace = "http://tempuri.org/", className = "com.client.service.GetListCTDDH")
    @ResponseWrapper(localName = "GetListCT_DDHResponse", targetNamespace = "http://tempuri.org/", className = "com.client.service.GetListCTDDHResponse")
    public ArrayOfCTDDH getListCTDDH();

    /**
     * Tim ct_ddh theo id
     * 
     * @param masp
     * @param maDDH
     * @return
     *     returns com.client.service.CTDDH
     */
    @WebMethod(operationName = "GetCT_DDH", action = "http://tempuri.org/GetCT_DDH")
    @WebResult(name = "GetCT_DDHResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetCT_DDH", targetNamespace = "http://tempuri.org/", className = "com.client.service.GetCTDDH")
    @ResponseWrapper(localName = "GetCT_DDHResponse", targetNamespace = "http://tempuri.org/", className = "com.client.service.GetCTDDHResponse")
    public CTDDH getCTDDH(
        @WebParam(name = "maDDH", targetNamespace = "http://tempuri.org/")
        int maDDH,
        @WebParam(name = "masp", targetNamespace = "http://tempuri.org/")
        int masp);

    /**
     * Them ct_ddh
     * 
     * @param masp
     * @param dongia
     * @param maddh
     * @param soluong
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "InsertCT_DDH", action = "http://tempuri.org/InsertCT_DDH")
    @WebResult(name = "InsertCT_DDHResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "InsertCT_DDH", targetNamespace = "http://tempuri.org/", className = "com.client.service.InsertCTDDH")
    @ResponseWrapper(localName = "InsertCT_DDHResponse", targetNamespace = "http://tempuri.org/", className = "com.client.service.InsertCTDDHResponse")
    public boolean insertCTDDH(
        @WebParam(name = "maddh", targetNamespace = "http://tempuri.org/")
        int maddh,
        @WebParam(name = "masp", targetNamespace = "http://tempuri.org/")
        int masp,
        @WebParam(name = "soluong", targetNamespace = "http://tempuri.org/")
        int soluong,
        @WebParam(name = "dongia", targetNamespace = "http://tempuri.org/")
        int dongia);

    /**
     * Xoa CT_ddh
     * 
     * @param masp
     * @param maddh
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "DeleteCT_DDH", action = "http://tempuri.org/DeleteCT_DDH")
    @WebResult(name = "DeleteCT_DDHResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "DeleteCT_DDH", targetNamespace = "http://tempuri.org/", className = "com.client.service.DeleteCTDDH")
    @ResponseWrapper(localName = "DeleteCT_DDHResponse", targetNamespace = "http://tempuri.org/", className = "com.client.service.DeleteCTDDHResponse")
    public boolean deleteCTDDH(
        @WebParam(name = "maddh", targetNamespace = "http://tempuri.org/")
        int maddh,
        @WebParam(name = "masp", targetNamespace = "http://tempuri.org/")
        int masp);

    /**
     * Cap nhat ct_ddh
     * 
     * @param masp
     * @param dongia
     * @param maddh
     * @param soluong
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "UpdateCT_DDH", action = "http://tempuri.org/UpdateCT_DDH")
    @WebResult(name = "UpdateCT_DDHResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "UpdateCT_DDH", targetNamespace = "http://tempuri.org/", className = "com.client.service.UpdateCTDDH")
    @ResponseWrapper(localName = "UpdateCT_DDHResponse", targetNamespace = "http://tempuri.org/", className = "com.client.service.UpdateCTDDHResponse")
    public boolean updateCTDDH(
        @WebParam(name = "maddh", targetNamespace = "http://tempuri.org/")
        int maddh,
        @WebParam(name = "masp", targetNamespace = "http://tempuri.org/")
        int masp,
        @WebParam(name = "soluong", targetNamespace = "http://tempuri.org/")
        int soluong,
        @WebParam(name = "dongia", targetNamespace = "http://tempuri.org/")
        int dongia);

    /**
     * Liet ke tai khoan
     * 
     * @return
     *     returns com.client.service.ArrayOfTaiKhoan
     */
    @WebMethod(operationName = "GetListTaiKhoan", action = "http://tempuri.org/GetListTaiKhoan")
    @WebResult(name = "GetListTaiKhoanResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetListTaiKhoan", targetNamespace = "http://tempuri.org/", className = "com.client.service.GetListTaiKhoan")
    @ResponseWrapper(localName = "GetListTaiKhoanResponse", targetNamespace = "http://tempuri.org/", className = "com.client.service.GetListTaiKhoanResponse")
    public ArrayOfTaiKhoan getListTaiKhoan();

    /**
     * Tim tai khoan theo username
     * 
     * @param username
     * @return
     *     returns com.client.service.TaiKhoan
     */
    @WebMethod(operationName = "GetTaiKhoan", action = "http://tempuri.org/GetTaiKhoan")
    @WebResult(name = "GetTaiKhoanResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetTaiKhoan", targetNamespace = "http://tempuri.org/", className = "com.client.service.GetTaiKhoan")
    @ResponseWrapper(localName = "GetTaiKhoanResponse", targetNamespace = "http://tempuri.org/", className = "com.client.service.GetTaiKhoanResponse")
    public TaiKhoan getTaiKhoan(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username);

    /**
     * Them tai khoan
     * 
     * @param diachi
     * @param sdt
     * @param pass
     * @param tenkh
     * @param email
     * @param username
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "InsertTaiKhoan", action = "http://tempuri.org/InsertTaiKhoan")
    @WebResult(name = "InsertTaiKhoanResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "InsertTaiKhoan", targetNamespace = "http://tempuri.org/", className = "com.client.service.InsertTaiKhoan")
    @ResponseWrapper(localName = "InsertTaiKhoanResponse", targetNamespace = "http://tempuri.org/", className = "com.client.service.InsertTaiKhoanResponse")
    public boolean insertTaiKhoan(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username,
        @WebParam(name = "pass", targetNamespace = "http://tempuri.org/")
        String pass,
        @WebParam(name = "tenkh", targetNamespace = "http://tempuri.org/")
        String tenkh,
        @WebParam(name = "diachi", targetNamespace = "http://tempuri.org/")
        String diachi,
        @WebParam(name = "sdt", targetNamespace = "http://tempuri.org/")
        int sdt,
        @WebParam(name = "email", targetNamespace = "http://tempuri.org/")
        String email);

    /**
     * Xoa tai khoan
     * 
     * @param username
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "DeleteTaiKhoan", action = "http://tempuri.org/DeleteTaiKhoan")
    @WebResult(name = "DeleteTaiKhoanResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "DeleteTaiKhoan", targetNamespace = "http://tempuri.org/", className = "com.client.service.DeleteTaiKhoan")
    @ResponseWrapper(localName = "DeleteTaiKhoanResponse", targetNamespace = "http://tempuri.org/", className = "com.client.service.DeleteTaiKhoanResponse")
    public boolean deleteTaiKhoan(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username);

    /**
     * Cap nhat tai khoan
     * 
     * @param diachi
     * @param sdt
     * @param pass
     * @param tenkh
     * @param email
     * @param username
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "UpdateTaiKhoan", action = "http://tempuri.org/UpdateTaiKhoan")
    @WebResult(name = "UpdateTaiKhoanResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "UpdateTaiKhoan", targetNamespace = "http://tempuri.org/", className = "com.client.service.UpdateTaiKhoan")
    @ResponseWrapper(localName = "UpdateTaiKhoanResponse", targetNamespace = "http://tempuri.org/", className = "com.client.service.UpdateTaiKhoanResponse")
    public boolean updateTaiKhoan(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username,
        @WebParam(name = "pass", targetNamespace = "http://tempuri.org/")
        String pass,
        @WebParam(name = "tenkh", targetNamespace = "http://tempuri.org/")
        String tenkh,
        @WebParam(name = "diachi", targetNamespace = "http://tempuri.org/")
        String diachi,
        @WebParam(name = "sdt", targetNamespace = "http://tempuri.org/")
        int sdt,
        @WebParam(name = "email", targetNamespace = "http://tempuri.org/")
        String email);

    /**
     * Kiem tra dang nhap: (-1: không có username, 0: không \u0111úng pass, 1: \u0111úng)
     * 
     * @param pass
     * @param user
     * @return
     *     returns int
     */
    @WebMethod(operationName = "KiemTraDangNhap", action = "http://tempuri.org/KiemTraDangNhap")
    @WebResult(name = "KiemTraDangNhapResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "KiemTraDangNhap", targetNamespace = "http://tempuri.org/", className = "com.client.service.KiemTraDangNhap")
    @ResponseWrapper(localName = "KiemTraDangNhapResponse", targetNamespace = "http://tempuri.org/", className = "com.client.service.KiemTraDangNhapResponse")
    public int kiemTraDangNhap(
        @WebParam(name = "user", targetNamespace = "http://tempuri.org/")
        String user,
        @WebParam(name = "pass", targetNamespace = "http://tempuri.org/")
        String pass);

}
