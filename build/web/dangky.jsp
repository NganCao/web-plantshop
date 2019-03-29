<%-- 
    Document   : dangky
    Created on : Mar 6, 2019, 9:53:58 AM
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
        <img src="images/avvv.jpg" style="height:50%;"/>
    </div>

    <form action="/User" method="post">
        <div class="container3">
            <h1 style="font-weight: 50px; color: #ac2925; font-size: 70px; padding-top: 20px;padding-bottom: 20px;">Register</h1>
            <p>Please fill in this form to create an account.</p>
            <hr>
            <label for="name"><b>Full Name</b></label>
            <input type="text" placeholder="Enter Name" name="name" required>
            
            <label for="phone"><b>Phone</b></label>
            <input type="text" placeholder="Enter Phone" name="phone" required>

            <label for="email"><b>Email</b></label>
            <input type="text" placeholder="Enter Email" name="email" required>
            
            <label for="name"><b>Address</b></label>
            <input type="text" placeholder="Enter Address" name="address" required>
            
            <label for="username"><b>Username</b></label>
            <input type="text" placeholder="Enter User Name" name="username" required>
            
            <label for="psw"><b>Password</b></label>
            <input type="password" placeholder="Enter Password" name="psw" required>

            <label for="psw-repeat"><b>Repeat Password</b></label>
            <input type="password" placeholder="Repeat Password" name="psw-repeat" required>
            <hr>
            <input type="checkbox" id="myCheck"  onclick="checkdieukhoan()"> Tôi đồng ý với các điều khoản được đặt ra
            <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>

            <button type="submit" class="registerbtn" name="btndangky">Register</button>
        </div>
    </form>

    <!--footer-->
        <jsp:include page="footer.jsp"></jsp:include>
        <!--end class tz-footer-->
</body>
</html>

