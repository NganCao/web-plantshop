<!DOCTYPE html>
<html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="css/bootstrap.min.css" rel="stylesheet" />
    <link href="fonts/awesome/css/font-awesome.min.css" rel="stylesheet" />
    <link href="http://fonts.googleapis.com/css?family=Raleway:400,700,600,500,300,100,200,800" rel="stylesheet" />
    <link href="css/owl.carousel.css" rel="stylesheet" />
    <link href="css/owl.theme.css" rel="stylesheet" />
    <link href="style.css" rel="stylesheet" />
</head>
<body>
    <!--header-->
        <jsp:include page="header.jsp"></jsp:include>
            <!--end class tz-header-->

    <section class="tzpage-default">
        <h3 class="tz-title-bold-3">USER PAGES</h3>
        <div class="container">
            <nav class="joom-controller joom-controller-style2">
                <ul>
                    <li><a href="page-login.jsp">LOG IN</a></li>
                    <li><a href="page-register.jsp">REGISTER</a></li>
                    <li><a href="page-remindUser.jsp">REMIND USERNAME</a></li>
                    <li><a href="#">RESET PASS</a></li>
                    <li class="active"><a href="page-EditUserProfile.jsp">EDIT USER PROFILE</a></li>
                </ul>
            </nav>
            <div class="joom-registration">
                <form class="form-horizontal">
                    <div class="row">
                            <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
                                <h4 class="joom-title">YOUR PERSONAL DETAILS</h4>
                                <div class="row">
                                    <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
                                        <label>First Name: *</label>
                                    </div>
                                    <div class="col-lg-9 col-md-9 col-sm-8 col-xs-12">
                                        <input type="text" value="" name="first">
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
                                        <label>Last Name: *</label>
                                    </div>
                                    <div class="col-lg-9 col-md-9 col-sm-12 col-xs-12">
                                        <input type="text" value="" name="last">
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
                                        <label>E-Mail: *</label>
                                    </div>
                                    <div class="col-lg-9 col-md-9 col-sm-8 col-xs-12">
                                        <input type="email" value="" name="email">
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
                                        <label>Telephone: *</label>
                                    </div>
                                    <div class="col-lg-9 col-md-9 col-sm-12 col-xs-12">
                                        <input type="text" value="" name="telephone">
                                    </div>
                                </div>
                            </div><!--end class 6-->
                            <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
                                <h4 class="joom-title">YOUR ADDRESS</h4>
                                <div class="row">
                                    <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
                                        <label>Upload Avatar</label>
                                    </div>
                                    <div class="col-lg-8 col-md-8 col-sm-8 col-xs-12">
                                        <input type="file" name="upload">
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
                                        <label>URL Avatar:</label>
                                    </div>
                                    <div class="col-lg-8 col-md-8 col-sm-12 col-xs-12">
                                        <input type="text" value="" name="ulavatar">
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
                                        <label>Description:</label>
                                    </div>
                                    <div class="col-lg-8 col-md-8 col-sm-12 col-xs-12">
                                        <input type="text" value="" name="description">
                                    </div>
                                </div>
                            </div><!--end class 6-->
                    </div><!--end class row-->
                </form>
                <div class="checknbutton" style="margin-top: 25px;">
                            <input type="checkbox" id="myCheck"  onclick="checkdieukhoan()"> Tôi đồng ý với các điều khoản được đặt ra
                            <div class="controls">
                                <button class="btn btn-primary" type="submit" style="margin-top: 30px; text-align: center; "> REGISTER</button>
                            </div>
                        </div>
            </div><!--end class joom-->
        </div><!--end class container-->
    </section><!--end class page default-->

    <!--header-->
        <jsp:include page="footer.jsp"></jsp:include>
            <!--end class tz-header-->

    <script src="js/jquery.min.js"></script>
    <script>
        jQuery.noConflict();
    </script>
    
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.parallax-1.1.3.js"></script>
    <script src="js/owl.carousel.js"></script>
    <script src="js/off-canvas.js"></script>
    <script src="js/resize.js"></script>
    <script src="js/jquery.isotope.min.js"></script>
    <script src="js/jquery.easypiechart.min.js"></script>
    <script src="js/custom.js"></script>
</body>

</html>