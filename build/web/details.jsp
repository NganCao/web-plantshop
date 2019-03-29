<%@page import="com.client.service.ArrayOfSanPham"%>
<%@page import="com.client.service.ArrayOfMenu"%>
<%@page import="com.client.service.SanPham"%>
<%@page import="com.client.service.Menu"%>

<!DOCTYPE html>
<html>

    <%@ page language="java" contentType="text/html; charset=UTF-8"
             pageEncoding="UTF-8"%>
    <head>
        <meta charset="utf-8">
        <title>Green Decoration | Shop Product Details </title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="css/bootstrap.min.css" rel="stylesheet" />
        <link href="fonts/awesome/css/font-awesome.min.css" rel="stylesheet" />
        <link href="http://fonts.googleapis.com/css?family=Raleway:400,700,600,500,300,100,200,800" rel="stylesheet" />
        <link href="css/owl.carousel.css" rel="stylesheet" />
        <link href="css/owl.theme.css" rel="stylesheet" />
        <link rel='stylesheet' href='rs-plugin/css/settings.css' />
        <link href="style.css" rel="stylesheet" />
        <link href="style.css" rel="stylesheet" />
        <script>
            // Get the modal
            var modal = document.getElementById('login01');

            // When the user clicks anywhere outside of the modal, close it
            window.onclick = function (event) {
                if (event.target == modal) {
                    modal.style.display = "none";
                }
            }

            // Get the modal1
            var modal1 = document.getElementById('cart01');

            // When the user clicks anywhere outside of the modal, close it
            window.onclick = function (event) {
                if (event.target == modal1) {
                    modal1.style.display = "none";
                }
            }
        </script>
        <style>

            .xyznav:hover {
                background-color: blue;
                color: red;
            }

            /* Full-width input fields */
            input[type=text], input[type=password] {
                width: 100%;
                padding: 12px 20px;
                margin: 8px 0;
                display: inline-block;
                border: 1px solid #ccc;
                box-sizing: border-box;
            }

            /* Set a style for all buttons */
            .loginbtn, .cancelbtn{
                background-color: #4CAF50;
                color: white;
                padding: 14px 20px;
                margin: 8px 0;
                border: none;
                cursor: pointer;
                width: 100%;
            }

            .loginbtn:hover ,.cancelbtn:hover {
                opacity: 0.8;
            }

            /* Extra styles for the cancel button */
            .cancelbtn {
                width: auto;
                padding: 10px 18px;
                background-color: #f44336;
            }

            /* Center the image and position the close button */
            .imgcontainer {
                text-align: center;
                margin: 24px 0 12px 0;
                position: relative;
            }

            .img.avatar {
                width: 20%;
                border-radius: 50%;
            }

            .container1 {
                padding: 16px;
            }

            .span.psw {
                float: right;
                padding-top: 16px;
            }

            /* The Modal (background) */
            .modal {
                display: none; /* Hidden by default */
                position: fixed; /* Stay in place */
                z-index: 1; /* Sit on top */
                left: 0;
                top: 0;
                width: 100%; /* Full width */
                height: 100%; /* Full height */
                overflow: auto; /* Enable scroll if needed */
                background-color: rgb(0,0,0); /* Fallback color */
                background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
                padding-top: 60px;
            }

            /* Modal Content/Box */
            .modal-content {
                background-color: #fefefe;
                margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
                border: 1px solid #888;
                width: 50%; /* Could be more or less, depending on screen size */
            }

            /* The Close Button (x) */
            .close {
                position: absolute;
                right: 25px;
                top: 0;
                color: #000;
                font-size: 35px;
                font-weight: bold;
            }

            .close:hover,
            .close:focus {
                color: red;
                cursor: pointer;
            }

            /* Add Zoom Animation */
            .animate {
                -webkit-animation: animatezoom 0.6s;
                animation: animatezoom 0.6s
            }

            @-webkit-keyframes animatezoom {
                from {-webkit-transform: scale(0)} 
                to {-webkit-transform: scale(1)}
            }

            @keyframes animatezoom {
                from {transform: scale(0)} 
                to {transform: scale(1)}
            }

            /* Change styles for span and cancel button on extra small screens */
            @media screen and (max-width: 300px) {
                span.psw {
                    display: block;
                    float: none;
                }
                .cancelbtn {
                    width: 100%;
                }
            }



            .col-25 {
                -ms-flex: 25%; /* IE10 */
                flex: 25%;
            }

            .col-50 {
                -ms-flex: 50%; /* IE10 */
                flex: 50%;
            }

            .col-75 {
                -ms-flex: 75%; /* IE10 */
                flex: 75%;
            }

            .col-25,
            .col-50,
            .col-75 {
                padding: 0 16px;
            }


            .btn {
                background-color: #4CAF50;
                color: white;
                padding: 12px;
                margin: 10px 0;
                border: none;
                width: 100%;
                border-radius: 3px;
                cursor: pointer;
                font-size: 17px;
            }

            .btn:hover {
                background-color: #45a049;
            }

            a {
                color: #2196F3;
            }

            hr {
                border: 1px solid lightgrey;
            }

            span.price {
                float: right;
                color: grey;
            }

            /* Responsive layout - when the screen is less than 800px wide, make the two columns stack on top of each other instead of next to each other (also change the direction - make the "cart" column go on top) */
            @media (max-width: 800px) {
                .row {
                    flex-direction: column-reverse;
                }
                .col-25 {
                    margin-bottom: 20px;
                }
            }
        </style>
    </head>
    <body>

        <%
            ArrayOfMenu Menu = com.servlet.getMenu.getListMenu();
            String id_sanpham = "";

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
                <button class="pull-right tz-cart" onclick="document.getElementById('cart01').style.display = 'block'" style="opacity: 1;"> <i class="fa fa-shopping-cart" style="font-size: 20px;"></i></button>

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
                                                    <%                                                        //Menu menu = new Menu();
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
                                                                <a href="details.jsp?Menu_id=<%=sp.getMaSP()%>"><%=sp.getTenSP()%></a>
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
                    </h6>
                </div>
            </div>
        </section>

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
<!--                        <aside class="shop_inner_inf">
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
                        </aside>-->
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
                                        <span id="price"><%=spb1.getGia()%></span>
                                    </div>
                                </li>
                                <li>
                                    <div class="as_bestsellers_thumb">
                                        <img src="<%=spb2.getHinhAnh()%>" alt="<%=spb2.getTenSP()%>" style="width: 80px;" href="details.jsp?sanpham_id=<%=spb1.getMaSP()%>">
                                    </div>
                                    <div class="as_bestsellers_content">
                                        <a href="details.jsp?sanpham_id=<%=spb2.getMaSP()%>"><%=spb2.getTenSP()%></a>
                                        <span id="price"><%=spb2.getGia()%></span>
                                    </div>
                                </li>
                                <li>
                                    <div class="as_bestsellers_thumb">
                                        <img src="<%=spb3.getHinhAnh()%>" alt="<%=spb3.getTenSP()%>" style="width: 80px;" href="details.jsp?sanpham_id=<%=spb1.getMaSP()%>">
                                    </div>
                                    <div class="as_bestsellers_content">
                                        <a href="details.jsp?sanpham_id=<%=spb3.getMaSP()%>"><%=spb3.getTenSP()%></a>
                                        <span id="price"><%=spb3.getGia()%></span>
                                    </div>
                                </li>
                                <li>
                                    <div class="as_bestsellers_thumb">
                                        <img src="<%=spb4.getHinhAnh()%>" alt="<%=spb4.getTenSP()%>" style="width: 80px;" href="details.jsp?sanpham_id=<%=spb1.getMaSP()%>">
                                    </div>
                                    <div class="as_bestsellers_content">
                                        <a href="details.jsp?sanpham_id=<%=spb4.getTenSP()%>"><%=spb4.getTenSP()%></a>
                                        <span id="price"><%=spb4.getTenSP()%></span>
                                    </div>
                                </li>
                            </ul>
                        </aside>
                    </div>

                    <!--chi tiet san pham-->
                    <div id="tz-wp-content" class="col-lg-9 col-md-9 col-sm-9 col-xs-12">

                        <h3 class="tz-title-bold-3">CHI TIẾT SẢN PHẨM</h3>

                        <%
                            if (request.getParameter("sanpham_id") != null) {
                                id_sanpham = request.getParameter("sanpham_id");
                                SanPham sp1 = com.servlet.getSPById.getSanPham(Integer.parseInt(id_sanpham));
                        %>

                        <div id="tz-shop-content" class="row" id="pro-<%=sp1.getMaSP()%>">
                            <div class="col-lg-5 col-md-5 col-sm-12 col-xs-12">
                                <div id="slider" class="flexslider">
                                    <ul class="slides">
                                        <li>
                                            <img src="<%=sp1.getHinhAnh()%>" alt="<%=sp1.getTenSP()%>"/>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                            <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
                                <div class="tzshop-summary">
                                    <h3 id="productName"><%=sp1.getTenSP()%></h3>
                                    <span class="tzproduct-single-price" id="price" product-price="<%=sp1.getGia()%>" >
                                        <%=sp1.getGia()%><span> vnđ</span>
                                    </span>
                                    <h6 class="tz-title-details">Thông tin sản phẩm</h6>
                                    <ul class="tzshop-status">
                                        <li>
                                            <span>Mã Sản Phẩm:</span><%=sp1.getMaSP()%>
                                        </li>
                                    </ul>
                                    <p style="font-family: 'Times New Roman", sans-serif;">
                                       <%=sp1.getThongTin()%> 
                                </p>
                                <div class="tzqty">
                                    Số lượng: <strong>1</strong>
                                </div>
                                <button productId="<%=sp1.getMaSP()%>" class="tz-cart xyznav add2card" style="opacity: 1; background-color: #32CD32; border-radius: 10%; padding: 0px 15px 0px 10px; text-align: center; color:#fff; font-family: 'Raleway', sans-serif;display: inline-block; margin: 20px 0 0 0; font-size: 15px;" onMouseOver="this.style.backgroundColor = '#90EE90'" onMouseOut="this.style.backgroundColor = '#32CD32'"> <i class="fa fa-shopping-cart" style="font-size: 25px; color: #fff; padding-right: 10px;"></i>Thêm vào giỏ</button>

                            </div>
                        </div>
                    </div>
                                
                    <div class="tzrelated-shop">
                        <h3 class="tz-title-bold-3">Sản phẩm cùng loại</h3>
                        <div class="row">

                            <%
                                if (request.getParameter("sanpham_id") != null) {
                                    id_sanpham = request.getParameter("sanpham_id");
                                    ArrayOfSanPham sanpham = com.servlet.getSPcungloai.get3SPCungLoai(3,sp1.getMaMenu(),Integer.parseInt(id_sanpham));
                                    for (SanPham sp : sanpham.getSanPham()) {
                            %>

                            <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 laster-shop-item" id="pro-<%=sp.getMaSP()%>">
                                <div class="laster-thumb">
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
                                <small id="price" product-price="<%=sp.getGia()%>" ><%=sp.getGia()%><span> vnđ</span></small>
                            </div>

                            <%
                                        }
                                    }
                                }
                            %>
                        </div>
                    </div>
                </div>
            </div>
        </div><!--end class container-->
    </div><!--end class tzblog-wrap-->
    <!--footer-->
    <jsp:include page="footer.jsp"></jsp:include>
    <!--end class tz-footer-->

    <script src="js/jquery.min.js"></script>
    <script>
                                    jQuery.noConflict();
    </script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/owl.carousel.js"></script>
    <script src="js/resize.js"></script>
    <script src="js/off-canvas.js"></script>
    <script src="js/jquery.isotope.min.js"></script>
    <script src="js/jquery.flexslider.js"></script>
    <script src="js/custom.js"></script>
    <script src="js/cart.js"></script>
    <script>
                                    // jQuery for flexslider------------------
                                    jQuery(window).load(function () {
                                        // The slider being synced must be initialized first
                                        jQuery('#carousel').flexslider({
                                            animation: "slide",
                                            controlNav: false,
                                            animationLoop: false,
                                            slideshow: false,
                                            directionNav: false,
                                            autoHeight: true,
                                            itemWidth: 80,
                                            itemMargin: 80,
                                            asNavFor: '#slider'
                                        });

                                        jQuery('#slider').flexslider({
                                            animation: "slide",
                                            controlNav: false,
                                            animationLoop: false,
                                            directionNav: false,
                                            autoHeight: true,
                                            slideshow: false,
                                            sync: "#carousel"
                                        });

                                    });
    </script>

</body>

<!-- Mirrored from demo.templaza.com/html/dekor/shop-productdetails.jsp by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 24 Nov 2014 09:03:51 GMT -->
</html>