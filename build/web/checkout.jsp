<%-- 
    Document   : checkout
    Created on : Mar 15, 2019, 8:09:53 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="css/bootstrap.min.css" rel="stylesheet" />
    <link href="fonts/awesome/css/font-awesome.min.css" rel="stylesheet" />
    <link href="http://fonts.googleapis.com/css?family=Raleway:400,700,600,500,300,100,200,800" rel="stylesheet" />
    <link href="css/owl.carousel.css" rel="stylesheet" />
    <link href="css/owl.theme.css" rel="stylesheet" />
    <link rel='stylesheet' href='rs-plugin/css/settings.css' />
    <link href="style.css" rel="stylesheet" />
    <script src="js/cart.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
        
        /* Add padding to containers */
        .container3 {
            padding: 16px;
            background-color: white;
            padding-left: 150px;
            padding-right: 150px;
        }

        /* Full-width input fields */
        input[type=text], input[type=password] {
            width: 100%;
            padding: 15px;
            margin: 5px 0 22px 0;
            display: inline-block;
            border: none;
            background: #f1f1f1;
        }

        input[type=text]:focus, input[type=password]:focus {
            background-color: #ddd;
            outline: none;
        }

        /* Overwrite default styles of hr */
        hr {
            border: 1px solid #f1f1f1;
            margin-bottom: 25px;
        }

        /* Set a style for the submit button */
        .registerbtn {
            background-color: #4CAF50;
            color: white;
            padding: 16px 20px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 100%;
            opacity: 0.9;
        }

        .registerbtn:hover {
            opacity: 1;
        }

        /* Add a blue text color to links */
        a {
            color: dodgerblue;
        }
    </style>
</head>
<body>

    <!--header-->
    <jsp:include page="header.jsp"></jsp:include>
    <!--end class tz-header-->

    <div>
        <img src="images/avvv.jpg" style="height:50%;width: 100%"/>
    </div>

    <div id="" class="">
                    <form method="post" action="#" style="padding: 10px 150px;">
                        <h1 style="font-weight: 50px; color: #ac2925; font-size: 30px; padding-top: 20px;padding-bottom: 20px;">Thông tin giỏ hàng</h1>
                        <hr>
                        <table class="shop_table" style="width:100%;text-align: center;margin-top: 0;">
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
    
    <form action="/User">
        <div class="container3">
            <h1 style="font-weight: 50px; color: #ac2925; font-size: 30px; padding-top: 20px;padding-bottom: 20px;">Thông tin khách hàng</h1>
            <hr>
            <label for="name"><b>Full Name</b></label>
            <input type="text" placeholder="Enter Name" name="name" required>
            
            <label for="phone"><b>Phone</b></label>
            <input type="text" placeholder="Enter Phone" name="phone" required>
            
            <label for="name"><b>Address</b></label>
            <input type="text" placeholder="Enter Address" name="address" required>
            <hr>

            <button type="submit" class="registerbtn" name="btndangky">Check out</button>
        </div>
    </form>

    <!--footer-->
        <jsp:include page="footer.jsp"></jsp:include>
        <!--end class tz-footer-->
        
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
        
        <script type='text/javascript' src='rs-plugin/js/jquery.themepunch.tools.min.js'></script>
        <script type='text/javascript' src='rs-plugin/js/jquery.themepunch.revolution.min.js'></script>
</body>
</html>
