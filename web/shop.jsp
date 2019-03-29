<%-- 
    Document   : shop
    Created on : Feb 28, 2019, 12:07:54 PM
    Author     : Administrator
--%>

<%@page import="model.Cart"%>
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
            ArrayOfMenu Menu = com.servlet.getMenu.getListMenu();
            String id_menu = "";
        %>

        <header class="tz-header tz-header2" style="background-color: black;">
            <div class="container">
                <h3 class="tz-logo pull-left">
                    <a href="index.jsp">
                        <h1><a class="navbar-brand" href="index.jsp"><span>Green</span> <i style="color: white;">Decoration</i></a></h1>
                    </a>
                </h3>
                <button data-target=".nav-collapse" class="btn-navbar tz_icon_menu pull-right" type="button">
                    <i class="fa fa-bars"></i>
                </button>
                <button class="pull-right tz-search"> <i class="fa fa-search" style="font-size: 20px;"></i></button>
                <button class="pull-right tz-user" onclick="document.getElementById('login01').style.display = 'block'" style="opacity: 1;"> <i class="fa fa-user" style="font-size: 20px;"></i></button>
                <button class="pull-right tz-cart" onclick="document.getElementById('cart01').style.display = 'block'" style="opacity: 1;"> <i class="fa fa-shopping-cart" style="font-size: 20px;"><span class="badge">0</span></i></button>
                
                <!-- form login -->
                <div id="login01" class="modal">
                    <form class="modal-content animate" action="/action_page.php">
                        <div class="imgcontainer">
                            <span onclick="document.getElementById('login01').style.display = 'none'" class="close" title="Close Modal">&times;</span>
                            <img src="images/ava.png" alt="Avatar" class="avatar" style="border-radius: 50%;width: 20%;">
                        </div>

                        <div class="container1">
                            <label for="uname"><b>Username</b></label>
                            <input type="text" placeholder="Enter Username" name="uname" required style="">

                            <label for="psw"><b>Password</b></label>
                            <input type="password" placeholder="Enter Password" name="psw" required>

                            <button class="loginbtn" type="submit">Login</button>
                            <label>
                                <input type="checkbox" checked="checked" name="remember"> Remember me
                            </label>
                        </div>

                        <div class="container1" style="background-color:#f1f1f1; text-align: center;">
                            <button type="button" onclick="document.getElementById('login01').style.display = 'none'" class="cancelbtn">Cancel</button>
                            <span class="psw">Chưa có tài khoản <a href="dangky.jsp">đăng ký ngay</a></span>
                        </div>
                    </form>
                </div>
                <!-- /end form login -->


                <!--   shopping-cart   -->
                <div id="cart01" class="modal modal1">
                    <form method="post" action="#" class="modal-content animate" style="width: auto; float: right;">
                        <div class="imgcontainer">
                            <span onclick="document.getElementById('cart01').style.display = 'none'" class="close" title="Close Modal" >&times;</span>
                        </div>
                        <table class="shop_table">
                            <thead>
                                <tr>
                                    <th class="product-image">Image</th>
                                    <th class="name">Product Name</th>
                                    <th class="porduct-quantity">Quantity</th>
                                    <th class="product-price">Price </th>
                                    <th class="product-remove">Action</th>
                                </tr>
                            </thead>
                            <tbody>
                            <td  colspan="5"><p style="text-align: center;font-size: 15px;"><code>Bạn chưa có món hàng nào trong giỏ</code></p></td>
                            </tbody>

                        </table>
                    </form>
                </div>

                <nav class="pull-right">
                    <ul class="nav-collapse">
                        <li>
                            <a href="index.jsp">HOME</a>
                        </li>
                        <li>
                            <a href="shop.jsp">SHOP</a>
                            <div class="nav-child dropdown-menu mega-dropdown-menu">
                                <div class="mega-dropdown-inner">
                                    <div class="row">
                                        <div data-width="12" class="col-md-12 mega-col-nav">
                                            <div class="mega-inner">
                                                <ul class="mega-nav level1">
                                                    <%                                                        
                                                        for (Menu menu : Menu.getMenu()) {
                                                            int id = menu.getMaMenu();
                                                    %>
                                                    <li class="rendermenu">

                                                        <a href="shop.jsp?Menu_id=<%=menu.getMaMenu()%>" id="category_id"><%=menu.getTenMenu()%></a>

                                                        <ul class="mega-nav level1">
                                                            <%
                                                                ArrayOfSanPham list = com.servlet.getListSPtheoMenu.getListSanPhamTheoMenu(id);
                                                                for (SanPham sp : list.getSanPham()) {
                                                            %>    
                                                            <li>
                                                                <a href="details.jsp?sanpham_id=<%=sp.getMaSP()%>"><%=sp.getTenSP()%></a>
                                                            </li>
                                                            <%
                                                                }
                                                            %>
                                                        </ul>
                                                        <%
                                                            }
                                                        %>
                                                    </li>

                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </li>
                        <li>
                            <a href="dangky.jsp">ĐĂNG KÝ</a>

                        </li>
                    </ul>
                </nav>
            </div><!--end class container-->

            <div class="tz-form-search">
                <div class="container">
                    <form method="get" action="#">
                        <input type="search" placeholder="Click enter after typing..." name="search" id="tz-search-input" class="tz-search-input">
                        <input class="hidden" type="submit" value="Search">
                        <i class="fa fa-times tz-form-close"></i>
                    </form>
                </div>
            </div><!--end class tz-form-search-->
        </header>

        <section class="parallax parallax_bk7">
            <div class="tz-custom-product">
                <div class="container">
                    <h6>
                        THE ROLE OF THE TREES
                        <span>Comfortable</span>
                        <span>Living-space</span>
                        <span>Creative art</span>
                    </h6>
                </div>
            </div>
        </section>
        <!--end class tzpage-default-->


        <div class="tzcategory-shop-wrap">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12 tzshop-aside">
                        <aside class="widget_categories widget">
                            <h3 class="module-title title-widget"><span>Danh mục</span></h3>
                            <section class="tzpage-shortcode" style="background-color: #FFF;padding-top: 0;padding-bottom: 0;">
                                <div class="page-content container">
                                    <div class="row">
                                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12" style="width: 188px; height: 100%; padding-left: 0px;">
                                            <div class="tzaccordion">
                                                <%
                                                    for (Menu menu1 : Menu.getMenu()) {
                                                        int id = menu1.getMaMenu();
                                                %>
                                                <h6><i class="fa fa-chevron-right"></i><%=menu1.getTenMenu()%></h6>
                                                <p>
                                                    <%
                                                        ArrayOfSanPham list = com.servlet.getListSPtheoMenu.getListSanPhamTheoMenu(id);
                                                        for (SanPham sp : list.getSanPham()) {
                                                    %>
                                                    <!--<i class="fa fa-chevron-circle-right"></i>-->
                                                    <a href="details.jsp?sanpham_id=<%=sp.getMaSP()%>" >- <%=sp.getTenSP()%></a><br>
                                                    <%
                                                            }
                                                        }
                                                    %>
                                                </p>
                                            </div>
                                        </div>

                                    </div>
                                </div><!--end class container-->
                            </section>

                        </aside>
                        <aside class="shop_inner_inf">
                            <div class="left-side">
                                <h3 class="agileits-sear-head">Phạm vi giá</h3>
                                <ul>
                                    <li>
                                        <input type="checkbox" class="checked">
                                        <span class="span">> 400</span>
                                    </li>
                                    <li>
                                        <input type="checkbox" class="checked">
                                        <span class="span">400-600</span>
                                    </li>
                                    <li>
                                        <input type="checkbox" class="checked">
                                        <span class="span">> 600</span>
                                    </li>
                                </ul>
                            </div>
                        </aside>
                        <aside class="widget_bestsellers">
                            <h3 class="module-title title-widget"><span>BESTSELLERS</span></h3>
                            <ul>
                                <li>

                                    <%
                                        SanPham spb1 = com.servlet.getSPById.getSanPham(16);
                                        SanPham spb2 = com.servlet.getSPById.getSanPham(6);
                                        SanPham spb3 = com.servlet.getSPById.getSanPham(10);
                                        SanPham spb4 = com.servlet.getSPById.getSanPham(15);
                                    %>

                                    <div class="as_bestsellers_thumb">
                                        <img src="<%=spb1.getHinhAnh()%>" alt="<%=spb1.getTenSP()%>" style="width: 80px;" href="details.jsp?sanpham_id=<%=spb1.getMaSP()%>">
                                    </div>
                                    <div class="as_bestsellers_content">
                                        <a href="details.jsp?sanpham_id=<%=spb1.getMaSP()%>"><%=spb1.getTenSP()%></a>
                                        <span><%=spb1.getGia()%> vnđ</span>
                                    </div>
                                </li>
                                <li>
                                    <div class="as_bestsellers_thumb">
                                        <img src="<%=spb2.getHinhAnh()%>" alt="<%=spb2.getTenSP()%>" style="width: 80px;" href="details.jsp?sanpham_id=<%=spb1.getMaSP()%>">
                                    </div>
                                    <div class="as_bestsellers_content">
                                        <a href="details.jsp?sanpham_id=<%=spb2.getMaSP()%>"><%=spb2.getTenSP()%></a>
                                        <span><%=spb2.getGia()%> vnđ</span>
                                    </div>
                                </li>
                                <li>
                                    <div class="as_bestsellers_thumb">
                                        <img src="<%=spb3.getHinhAnh()%>" alt="<%=spb3.getTenSP()%>" style="width: 80px;" href="details.jsp?sanpham_id=<%=spb1.getMaSP()%>">
                                    </div>
                                    <div class="as_bestsellers_content">
                                        <a href="details.jsp?sanpham_id=<%=spb3.getMaSP()%>"><%=spb3.getTenSP()%></a>
                                        <span><%=spb3.getGia()%> vnđ</span>
                                    </div>
                                </li>
                                <li>
                                    <div class="as_bestsellers_thumb">
                                        <img src="<%=spb4.getHinhAnh()%>" alt="<%=spb4.getTenSP()%>" style="width: 80px;" href="details.jsp?sanpham_id=<%=spb1.getMaSP()%>">
                                    </div>
                                    <div class="as_bestsellers_content">
                                        <a href="details.jsp?sanpham_id=<%=spb4.getTenSP()%>"><%=spb4.getTenSP()%></a>
                                        <span><%=spb4.getTenSP()%> vnđ</span>
                                    </div>
                                </li>
                            </ul>
                        </aside>
                    </div>

                    <!--san pham-->
                    <div class="col-lg-9 col-md-9 col-sm-9 col-xs-12">

                        <div class="tzshopcat-description">
                            <h1 class="tz-title-bold-3" id="tieude">Sản Phẩm</h1>
                        </div>

                        <%
                            if (request.getParameter("Menu_id") != null) {
                                id_menu = request.getParameter("Menu_id");
                                ArrayOfSanPham listsp = com.servlet.getListSPtheoMenu.getListSanPhamTheoMenu(Integer.parseInt(id_menu));
                                for (SanPham sp : listsp.getSanPham()) {
                        %>

                        <div class="row">
                            <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 laster-shop-item" id="pro-<%=sp.getMaSP()%>">
                                <div class="laster-thumb">
                                    <!--<div class="shop-icon-data">
                                            <img src="images/hosts.png" alt="hosts">
                                        </div>-->
                                    <img src="<%=sp.getHinhAnh()%>" alt="<%=sp.getTenSP()%>">
                                    <span class="tz-shop-meta">
                                        <a productId="<%=sp.getMaSP()%>" class="tzshopping add2cart">
                                            <i class="fa fa-shopping-cart"></i>
                                        </a>
                                        <a href="details.jsp?sanpham_id=<%=sp.getMaSP()%>" class="tztasks">
                                            <i class="fa fa-tasks"></i>
                                        </a>
                                    </span>
                                </div>
                                <h6 id="productName"><a id="productName" href="details.jsp?sanpham_id=<%=sp.getMaSP()%>"><%=sp.getTenSP()%></a></h6>
                                <small id="price" ><%=sp.getGia()%></small>
                            </div>
                            
                            <%
                                }
                            } else {
                                ArrayOfSanPham listsp = com.servlet.getListSPtheoMenu.getListSanPham();
                                for (SanPham sp : listsp.getSanPham()) {
                            %>

                            <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 laster-shop-item" id="pro-<%=sp.getMaSP()%>">
                                <div class="laster-thumb">
                                    <!--<div class="shop-icon-data">
                                            <img src="images/hosts.png" alt="hosts">
                                        </div>-->
                                    <img src="<%=sp.getHinhAnh()%>" alt="<%=sp.getTenSP()%>">
                                    <span class="tz-shop-meta">
                                        <a productId="<%=sp.getMaSP()%>" class="tzshopping add2cart">
                                            <i class="fa fa-shopping-cart"></i>
                                        </a>
                                        <a href="details.jsp?sanpham_id=<%=sp.getMaSP()%>" class="tztasks">
                                            <i class="fa fa-tasks"></i>
                                        </a>
                                    </span>
                                </div>
                                <h6 id="productName"><a id="productName" href="details.jsp?sanpham_id=<%=sp.getMaSP()%>"><%=sp.getTenSP()%></a></h6>
                                <small id="price" ><%=sp.getGia()%></small>
                            </div>

                            <%
                                    }
                                }
                            %>

                        </div>

                        <div class="tzpagenavi-shop">
                            <a class="active">1</a>
                            <a href="#">2</a>
                            <a href="#">3</a>
                        </div>
                        <div class="tzshopcat-description">
                            <img src="images/pic8.jpeg" style="margin-top: 0px;">
                        </div>

                    </div>
                </div>
            </div>
        </div><!--end class tzblog-wrap-->   


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
        <script src="js/custom.js"></script>
        <script src="js/cart.js"></script>
        <script src="js/slider.js"></script>
        <script type='text/javascript' src='rs-plugin/js/jquery.themepunch.tools.min.js'></script>
        <script type='text/javascript' src='rs-plugin/js/jquery.themepunch.revolution.min.js'></script>
    </body>
</html>
