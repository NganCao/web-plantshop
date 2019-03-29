<%-- 
    Document   : shoptest
    Created on : Mar 17, 2019, 10:22:43 PM
    Author     : Administrator
--%>

<%@page import="com.client.service.SanPham"%>
<%@page import="com.client.service.ArrayOfSanPham"%>
<%@page import="com.client.service.Menu"%>
<%@page import="com.client.service.ArrayOfMenu"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Green Decoration | Shop</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="css/bootstrap.min.css" rel="stylesheet" />
        <link href="fonts/awesome/css/font-awesome.min.css" rel="stylesheet" />
        <link href="http://fonts.googleapis.com/css?family=Raleway:400,700,600,500,300,100,200,800" rel="stylesheet" />
        <link href="css/owl.carousel.css" rel="stylesheet" />
        <link href="css/owl.theme.css" rel="stylesheet" />
        <link rel='stylesheet' href='rs-plugin/css/settings.css' />
        <link href="style.css" rel="stylesheet" />
    </head>
    <body>

        <%

            ArrayOfMenu listSP = com.servlet.getMenu.getListMenu();
            String id_menu = "";
            if (request.getParameter("Menu_id") != null) {
                id_menu = request.getParameter("Menu_id");
            }
            String category_id = "";
            String brand_id = "";
            if (request.getParameter("category") != null) {
                category_id = request.getParameter("category");
            }
            if (request.getParameter("brand") != null) {
                brand_id = request.getParameter("brand");
            }
            String category_id_1 = "1";

        %>

        <!--header-->
        <jsp:include page="header.jsp"></jsp:include>
            <!--end class tz-header-->


            

                       
                            <%                                
                                ArrayOfSanPham list = com.servlet.getListSPtheoMenu.getListSanPhamTheoMenu(Integer.parseInt(id_menu));
                                for (SanPham sp1 : list.getSanPham()) {
                            %>
                            <div >
                                
                                <img src="images/shop1.jpg" alt="Linen Shirt With Mao Color">
                                <h6><a><%=sp1.getTenSP()%></a></h6>
                                <a>27</a>
                            </div>
                            <%
                                
                                }
                            %>
        

        <!--footer-->
        <jsp:include page="footer.jsp"></jsp:include>
        <!--end class tz-footer-->


        <script src="js/jquery.min.js"></script>
        <script>
            jQuery.noConflict();
        </script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.parallax-1.1.3.js"></script>
        <script src="js/owl.carousel.js"></script>
        <script src="js/resize.js"></script>
        <script src="js/off-canvas.js"></script>
        <script src="js/jquery.isotope.min.js"></script>
        <script src="js/custom-portfolio.js"></script>
        <script src="js/custom.js"></script>
        <script src="js/leaflet/leaflet.js"></script>  
        <script src="js/main.js"></script>
        <script src="js/cart.js"></script>
        <script src="js/slider.js"></script>
        <script type='text/javascript' src='rs-plugin/js/jquery.themepunch.tools.min.js'></script>
        <script type='text/javascript' src='rs-plugin/js/jquery.themepunch.revolution.min.js'></script>
    </body>
</html>
