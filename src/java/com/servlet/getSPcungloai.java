/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.client.service.ArrayOfSanPham;
import com.client.service.SanPham;
import static com.servlet.getListSPtheoMenu.getListSanPhamTheoMenu;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
@WebServlet(name = "getSPcungloai", urlPatterns = {"/getSPcungloai"})
public class getSPcungloai extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String action = request.getParameter("btnlay");
            if(action.equals("lay")){
                int id = Integer.parseInt(request.getParameter("nhapid"));
                int id1 = Integer.parseInt(request.getParameter("nhapid1"));
                int id2 = Integer.parseInt(request.getParameter("nhapid2"));
                ArrayOfSanPham list = get3SPCungLoai(id,id1,id2);
               for(SanPham sp : list.getSanPham()){
                    out.print("<body style='text-align:center; display: inline-block; float; left;' ><div>"+ sp.getMaSP()+"</div><br>"  +"<div>"+sp.getTenSP()+"</div><br>" +"<div>"+sp.getGia()+"</div><br>" +"<div><img src='"+sp.getHinhAnh()+"' /></div><br><hr></body>");
                }
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    public static ArrayOfSanPham get3SPCungLoai(int n, int mamenu, int masp) {
        com.client.service.Service service = new com.client.service.Service();
        com.client.service.ServiceSoap port = service.getServiceSoap();
        return port.get3SPCungLoai(n, mamenu, masp);
    }

}
