<%-- 
    Document   : headermenu
    Created on : Feb 26, 2019, 9:05:39 PM
    Author     : Administrator
--%>

<%@page import="com.client.service.SanPham"%>
<%@page import="com.client.service.ArrayOfSanPham"%>
<%@page import="com.servlet.getMenu"%>
<%@page import="com.client.service.ArrayOfMenu"%>
<%@page import="com.client.service.Menu"%>
<%@page import="javax.servlet.ServletException" %>
<%@page import ="javax.servlet.annotation.WebServlet"%>
<%@page import ="javax.servlet.http.HttpServlet"%>
<%@page import ="javax.servlet.http.HttpServletRequest"%>
<%@page import ="javax.servlet.http.HttpServletResponse" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="css/bootstrap.min.css" rel="stylesheet" />
        <link href="fonts/awesome/css/font-awesome.min.css" rel="stylesheet" />
        <link href="http://fonts.googleapis.com/css?family=Raleway:400,700,600,500,300,100,200,800" rel="stylesheet" />
        <link href="css/owl.carousel.css" rel="stylesheet" />
        <link href="css/owl.theme.css" rel="stylesheet" />
        <link rel='stylesheet' href='rs-plugin/css/settings.css' />
        <link href="style.css" rel="stylesheet" />
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script>
            // Get the modal
            var modal = document.getElementById('login01');

            // When the user clicks anywhere outside of the modal, close it
            window.onclick = function (event) {
                if (event.target === modal) {
                    modal.style.display = "none";
                }
            };
            // Get the modal1
            var modal1 = document.getElementById('cart01');

            // When the user clicks anywhere outside of the modal, close it
            window.onclick = function (event) {
                if (event.target === modal1) {
                    modal1.style.display = "none";
                }
            };

            function changepsw() {
                var x = document.getElementById("mypsw");
                if (x.type === "password") {
                    x.type = "text";
                } else {
                    x.type = "password";
                }
            };
        </script>
        <style>
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
                    <form class="modal-content animate" action="/action_page.php" name="login" action="">
                        <div class="imgcontainer">
                            <span onclick="document.getElementById('login01').style.display = 'none'" class="close" title="Close Modal">&times;</span>
                            <img src="images/ava.png" alt="Avatar" class="avatar" style="border-radius: 50%;width: 20%;">
                        </div>

                        <div class="container1">
                            <label for="uname"><b>Username</b></label>
                            <input type="text" placeholder="Enter Username" name="uname" required style="">

                            <label for="psw" id="mypsw"><b>Password</b></label>
                            <!--<input type="password" id="mypsw" placeholder="Enter Password" name="psw" required>
                            <input type="checkbox" onclick="changepsw()">Show Password-->

                            <input type="password" id="myInput" placeholder="Enter Password" name="psw" required>
                            <input type="checkbox" onclick="myFunction()">Show Password

                            <script>
                                function myFunction() {
                                    var x = document.getElementById("myInput");
                                    if (x.type === "password") {
                                        x.type = "text";
                                    } else {
                                        x.type = "password";
                                    }
                                }
                            </script>

                            <button class="loginbtn" type="submit" name="loginbtn">Login</button>
                            <label>
                                <input type="checkbox" checked="checked" name="remember"> Remember me
                            </label>
                        </div>

                        <div class="container1" style="background-color:#f1f1f1; text-align: center;">
                            <button type="button" onclick="document.getElementById('login01').style.display = 'none'" class="cancelbtn">Cancel</button>
                            <span class="psw">Chưa có tài khoản <a href="dangky.jsp" name="dangky">đăng ký ngay</a></span>
                        </div>
                    </form>
                </div>

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
                            <a href="shop.jsp" id="menugoc">SHOP</a>
                            <div class="nav-child dropdown-menu mega-dropdown-menu">
                                <div class="mega-dropdown-inner">
                                    <div class="row">
                                        <div data-width="12" class="col-md-12 mega-col-nav">
                                            <div class="mega-inner">
                                                <ul class="mega-nav level1">
                                                    <%
                                                        ArrayOfMenu listSP = com.servlet.getMenu.getListMenu();
                                                        //Menu menu = new Menu();
                                                        for (Menu menu : listSP.getMenu()) {
                                                            int id = menu.getMaMenu();
                                                    %>
                                                    <li class="rendermenu">

                                                        <a href="shop.jsp?Menu_id=<%=menu.getMaMenu()%>"><%=menu.getTenMenu()%></a>

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
                            <a href="dangky.jsp" name="dangky">ĐĂNG KÝ</a>

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
        <!--
                <script>
                    function filterFunction() {
                        var input, filter, ul, li, a, i;
                        input = document.getElementById("myInput");
                        filter = input.value.toUpperCase();
                        div = document.getElementById("myDropdown");
                        a = div.getElementsByTagName("a");
                        for (i = 0; i < a.length; i++) {
                            txtValue = a[i].textContent || a[i].innerText;
                            if (txtValue.toUpperCase().indexOf(filter) > -1) {
                                a[i].style.display = "";
                            } else {
                                a[i].style.display = "none";
                            }
                        }
                    }
                </script>-->
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
        <script src="js/cart.js"></script>
        <script src="js/custom.js"></script>
        
        <script type='text/javascript' src='rs-plugin/js/jquery.themepunch.tools.min.js'></script>
        <script type='text/javascript' src='rs-plugin/js/jquery.themepunch.revolution.min.js'></script>
    </body>
</html>
