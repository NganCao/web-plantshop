/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.client.service.SanPham;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Cart;
import model.Item;

/**
 *
 * @author Administrator
 */
@WebServlet(name = "CartSevlet", urlPatterns = {"/CartSevlet"})
public class CartSevlet extends HttpServlet {

//    private final SanPham sanpham;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        HttpSession session = request.getSession();
        String command = request.getParameter("command");
        String sanphamID = request.getParameter("productID");
        Cart cart = (Cart) session.getAttribute("cart");
        
        try{
            int idSp = Integer.parseInt("productID");
            SanPham sanpham = com.servlet.getSPById.getSanPham(Integer.parseInt("productID"));
            switch(command){
                case "plus" :
                    if(cart.getCartItems().containsKey(idSp)){
                        cart.insertToCart(idSp, new Item(sanpham, cart.getCartItems().get(idSp).getQuantity()));
                    }else{
                        cart.insertToCart(idSp, new Item(sanpham, 1));
                    }
                    break;
            }
        }catch (Exception e){
            e.printStackTrace();
            response.sendRedirect("/plantshop/shop.jsp");
        }
        session.setAttribute("cart", cart);
        response.sendRedirect("/plantshop/shop.jsp");
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

}
