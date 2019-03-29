<%-- 
    Document   : index
    Created on : Feb 26, 2019, 8:19:20 AM
    Author     : Administrator
--%>

<%@page import="com.client.service.SanPham"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Green Decoration</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" />
        <link href="fonts/awesome/css/font-awesome.min.css" rel="stylesheet" />
        <link href="http://fonts.googleapis.com/css?family=Raleway:400,700,600,500,300,100,200,800" rel="stylesheet" />
        <link href="css/owl.carousel.css" rel="stylesheet" />
        <link href="css/owl.theme.css" rel="stylesheet" />
        <link rel='stylesheet' href='rs-plugin/css/settings.css' />
        <link href="style.css" rel="stylesheet" />
    </head>
    <body>
        <!--header-->
        <jsp:include page="header.jsp"></jsp:include>
            <!--end class tz-header-->

            <div class="tzslider">
                <div id="rev_slider_2_1_wrapper" class="rev_slider_wrapper fullscreen-container">
                    <div id="rev_slider_2_1" class="rev_slider fullscreenbanner">
                        <ul>
                            <li data-transition="fade" data-slotamount="7" data-masterspeed="300"  data-fstransition="fade" data-fsmasterspeed="300" data-fsslotamount="7" data-saveperformance="off" >
                                <img src="images/banner1.jpg"  alt="thumb-slider"  data-bgposition="center top" data-bgfit="100% 100%" data-bgrepeat="no-repeat">

                                <div class="tp-caption large_bold_white randomrotate randomrotateout tp-resizeme  title-slider-big"
                                     data-x="center" data-hoffset="0"
                                     data-y="center" data-voffset="80"
                                     data-speed="900"
                                     data-start="1000"
                                     data-easing="Quad.easeOut"
                                     data-splitin="none"
                                     data-splitout="none"
                                     data-elementdelay="0.1"
                                     data-endelementdelay="0.1"
                                     data-endspeed="300"
                                     data-endeasing="Quad.easeOut">Trees
                                </div>

                                <!-- LAYER NR. 4 -->
                                <div class="tp-caption medium_light_white sfb stb tp-resizeme  tz-content-lager"
                                     data-x="center" data-hoffset="0"
                                     data-y="center" data-voffset="190"
                                     data-speed="900"
                                     data-start="1500"
                                     data-easing="Quad.easeOut"
                                     data-splitin="none"
                                     data-splitout="none"
                                     data-elementdelay="0.1"
                                     data-endelementdelay="0.1"
                                     data-endspeed="300"
                                     data-endeasing="Quad.easeOut" style="margin-top: -150px;;">Are the earth's endless effort to speak to the listening heaven.
                                </div>

                                <div class="tp-caption small_light_white sft stt tp-resizeme  tz-title-small"
                                     data-x="center" data-hoffset="0"
                                     data-y="center" data-voffset="210"
                                     data-speed="900"
                                     data-start="2000"
                                     data-easing="Quad.easeInOut"
                                     data-splitin="none"
                                     data-splitout="none"
                                     data-elementdelay="0.1"
                                     data-endelementdelay="0.1"
                                     data-endspeed="300"
                                     data-endeasing="Quad.easeOut">Rabindranath Tagore
                                </div>
                            </li>
                            <!-- SLIDE  -->
                            <li data-transition="fade" data-slotamount="7" data-masterspeed="300"  data-saveperformance="off" >
                                <!-- MAIN IMAGE -->
                                <img src="images/banner2.jpg"  alt="slider"  data-bgposition="center top" data-bgfit="cover" data-bgrepeat="no-repeat">
                                <!-- LAYERS -->

                                <!-- LAYER NR. 1 -->
                                <div class="tp-caption large_bold_white sft stt tp-resizeme  title-slider"
                                     data-x="center" data-hoffset="0"
                                     data-y="center" data-voffset="-70"
                                     data-speed="900"
                                     data-start="500"
                                     data-easing="Quad.easeIn"
                                     data-splitin="none"
                                     data-splitout="none"
                                     data-elementdelay="0.1"
                                     data-endelementdelay="0.1"
                                     data-endspeed="300"
                                     data-endeasing="Quad.easeIn">Weeds
                                </div>

                                <!-- LAYER NR. 2 -->
                                <div class="tp-caption small_light_white sfl stl tp-resizeme  content-slider"
                                     data-x="center" data-hoffset="0"
                                     data-y="center" data-voffset="30"
                                     data-speed="900"
                                     data-start="700"
                                     data-easing="Power4.easeOut"
                                     data-splitin="words"
                                     data-splitout="none"
                                     data-elementdelay="0.1"
                                     data-endelementdelay="0.1"
                                     data-endspeed="300"
                                     data-endeasing="Cubic.easeIn">Are flowers too, once you get to know them.
                                </div>

                                <!-- LAYER NR. 3 -->
                                <div class="tp-caption small_light_white sfb stb tp-resizeme"
                                     data-x="center" data-hoffset="0"
                                     data-y="center" data-voffset="100"
                                     data-speed="900"
                                     data-start="500"
                                     data-easing="Quad.easeIn"
                                     data-splitin="none"
                                     data-splitout="none"
                                     data-elementdelay="0.1"
                                     data-endelementdelay="0.1"
                                     data-endspeed="300"
                                     data-endeasing="Power4.easeInOut"><a  href="shop.jsp" class="learn-more-styl2"><span>SHOP NOW</span></a>
                                </div>
                            </li>
                            <!-- SLIDE  -->
                            <li data-transition="fade" data-slotamount="7" data-masterspeed="300"  data-saveperformance="off" >
                                <!-- MAIN IMAGE -->
                                <img src="images/banner3.jpg"  alt="slider4"  data-bgposition="center top" data-bgfit="cover" data-bgrepeat="no-repeat">
                                <!-- LAYERS -->

                                <!-- LAYER NR. 1 -->
                                <div class="tp-caption small_light_white sft tp-resizeme  slider-attach"
                                     data-x="center" data-hoffset="0"
                                     data-y="center" data-voffset="-100"
                                     data-speed="1100"
                                     data-start="500"
                                     data-easing="Power3.easeInOut"
                                     data-splitin="none"
                                     data-splitout="none"
                                     data-elementdelay="0.1"
                                     data-endelementdelay="0.1"
                                     data-endspeed="300">GREEN DECORATION
                                </div>

                                <!-- LAYER NR. 2 -->
                                <div class="tp-caption large_bold_white sfb tp-resizeme  title-slider-blod"
                                     data-x="center" data-hoffset="0"
                                     data-y="center" data-voffset="-40"
                                     data-speed="900"
                                     data-start="500"
                                     data-easing="Power0.easeOut"
                                     data-splitin="none"
                                     data-splitout="none"
                                     data-elementdelay="0.1"
                                     data-endelementdelay="0.1"
                                     data-endspeed="300">Sometimes
                                </div>

                                <!-- LAYER NR. 3 -->
                                <div class="tp-caption skewfromright"
                                     data-x="center" data-hoffset="0"
                                     data-y="center" data-voffset="10"
                                     data-speed="1000"
                                     data-start="500"
                                     data-easing="Power3.easeInOut"
                                     data-elementdelay="0.1"
                                     data-endelementdelay="0.1"
                                     data-endspeed="300"><img src="images/Line_slider.jpg" alt="">
                                </div>

                                <!-- LAYER NR. 4 -->
                                <div class="tp-caption small_light_white randomrotate tp-resizeme  slider-ds"
                                     data-x="center" data-hoffset="0"
                                     data-y="center" data-voffset="60"
                                     data-speed="1100"
                                     data-start="500"
                                     data-easing="Power3.easeInOut"
                                     data-splitin="none"
                                     data-splitout="none"
                                     data-elementdelay="0.1"
                                     data-endelementdelay="0.1"
                                     data-endspeed="300">When I'm stuck on a question, I spend some time in nature and always find my answer.
                                </div>

                                <!-- LAYER NR. 5 -->
                                <div class="tp-caption black sfb tp-resizeme"
                                     data-x="center" data-hoffset="0"
                                     data-y="center" data-voffset="125"
                                     data-speed="1100"
                                     data-start="500"
                                     data-easing="Power3.easeInOut"
                                     data-splitin="none"
                                     data-splitout="none"
                                     data-elementdelay="0.1"
                                     data-endelementdelay="0.1"
                                     data-endspeed="300"><a class="slider-button2"  href="shop.jsp"><span>SHOP NOW</span></a>
                                </div>
                            </li>
                            <!-- SLIDE  -->
                            <li data-transition="fade" data-slotamount="7" data-masterspeed="300"  data-saveperformance="off" >
                                <!-- MAIN IMAGE -->
                                <img src="images/banner4.jpg"  alt="slider3"  data-bgposition="center top" data-bgfit="cover" data-bgrepeat="no-repeat">
                                <!-- LAYERS -->

                                <!-- LAYER NR. 1 -->
                                <div class="tp-caption large_bold_white sft stt tp-resizeme  title-slider"
                                     data-x="center" data-hoffset="0"
                                     data-y="center" data-voffset="-70"
                                     data-speed="900"
                                     data-start="500"
                                     data-easing="Quad.easeIn"
                                     data-splitin="none"
                                     data-splitout="none"
                                     data-elementdelay="0.1"
                                     data-endelementdelay="0.1"
                                     data-endspeed="300"
                                     data-endeasing="Quad.easeIn">Who has seen the wind?
                                </div>

                                <!-- LAYER NR. 2 -->
                                <div class="tp-caption small_light_white sfl stl tp-resizeme  content-slider"
                                     data-x="center" data-hoffset="0"
                                     data-y="center" data-voffset="30"
                                     data-speed="900"
                                     data-start="700"
                                     data-easing="Power4.easeOut"
                                     data-splitin="words"
                                     data-splitout="none"
                                     data-elementdelay="0.1"
                                     data-endelementdelay="0.1"
                                     data-endspeed="300"
                                     data-endeasing="Cubic.easeIn">Neither you nor I: But when the trees bow down their head, The wind is passing by.
                                </div>

                                <!-- LAYER NR. 3 -->
                                <div class="tp-caption small_light_white sfb stb tp-resizeme"
                                     data-x="center" data-hoffset="0"
                                     data-y="center" data-voffset="100"
                                     data-speed="900"
                                     data-start="500"
                                     data-easing="Quad.easeIn"
                                     data-splitin="none"
                                     data-splitout="none"
                                     data-elementdelay="0.1"
                                     data-endelementdelay="0.1"
                                     data-endspeed="300"
                                     data-endeasing="Power4.easeInOut"><a  href="shop.jsp" class="learn-more-styl2"><span>SHOP NOW</span></a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div><!--end class tzslider-->

            <section class="tz-lastest-shop theme-white">
                <h3 class="tz-title-3">
                    SẢN PHẨM MỚI NHẤT
                </h3>
                <div class="container">
                    <div class="row">

                    <%
                        SanPham spb1 = com.servlet.getSPById.getSanPham(16);
                        SanPham spb2 = com.servlet.getSPById.getSanPham(6);
                        SanPham spb3 = com.servlet.getSPById.getSanPham(10);
                        SanPham spb4 = com.servlet.getSPById.getSanPham(2);
                    %>

                    <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12 laster-shop-item" id="pro-<%=spb1.getMaSP()%>">
                        <div class="laster-thumb">
                            <div class="shop-icon-data">
                                <img src="images/new.png" alt="new">
                            </div>
                            <img src="<%=spb1.getHinhAnh()%>.jpg" alt="<%=spb1.getTenSP()%>">
                            <span class="tz-shop-meta">
                                <a productId="<%=spb1.getMaSP()%>" class="tzshopping add2cart">
                                            <i class="fa fa-shopping-cart"></i>
                                        </a>
                                <a href="details.jsp?sanpham_id=<%=spb1.getMaSP()%>" class="tztasks">
                                    <i class="fa fa-tasks"></i>
                                </a>
                            </span>
                        </div>
                        <h6 id="productName"><a href="details.jsp?sanpham_id=<%=spb1.getMaSP()%>"><%=spb1.getTenSP()%></a></h6>
                        <small id="price"><%=spb1.getGia()%> vnđ</small>
                    </div>
                    <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12 laster-shop-item" id="pro-<%=spb2.getMaSP()%>">
                        <div class="laster-thumb">
<!--                            <div class="shop-icon-data">
                                <img src="images/new.png" alt="new">
                                <img src="images/hosts.png" alt="hot">
                            </div>-->
                            <img src="<%=spb2.getHinhAnh()%>" alt="<%=spb2.getTenSP()%>">
                            <span class="tz-shop-meta">
                                <a productId="<%=spb2.getMaSP()%>" class="tzshopping add2cart">
                                            <i class="fa fa-shopping-cart"></i>
                                </a>
                                <a href="details.jsp?sanpham_id=<%=spb2.getMaSP()%>" class="tztasks">
                                    <i class="fa fa-tasks"></i>
                                </a>
                            </span>
                        </div>
                        <h6 id="productName"><a href="details.jsp?sanpham_id=<%=spb2.getMaSP()%>"><%=spb2.getTenSP()%></a></h6>
                        <small id="price"><%=spb2.getGia()%> vnđ</small>
                    </div>
                    <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12 laster-shop-item" id="pro-<%=spb3.getMaSP()%>">
                        <div class="laster-thumb">
<!--                            <div class="shop-icon-data">
                                <img src="images/new.png" alt="new">
                                <img src="images/hosts.png" alt="hot">
                            </div>-->
                            <img src="<%=spb3.getHinhAnh()%>" alt="<%=spb3.getTenSP()%>">
                            <span class="tz-shop-meta">
                                <a productId="<%=spb3.getMaSP()%>" class="tzshopping add2cart">
                                    <i class="fa fa-shopping-cart"></i>
                                </a>
                                <a href="details.jsp?sanpham_id=<%=spb3.getMaSP()%>" class="tztasks">
                                    <i class="fa fa-tasks"></i>
                                </a>
                            </span>
                        </div>
                        <h6 id="productName"><a href="details.jsp?sanpham_id=<%=spb3.getMaSP()%>"><%=spb3.getTenSP()%></a></h6>
                        <small id="price"><%=spb3.getGia()%></small>
                    </div>
                    <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12 laster-shop-item" id="pro-<%=spb4.getMaSP()%>">
                        <div class="laster-thumb">
<!--                            <div class="shop-icon-data">
                                <img src="images/new.png" alt="new">
                                <img src="images/hosts.png" alt="hot">
                            </div>-->
                            <img src="<%=spb4.getHinhAnh()%>" alt="<%=spb4.getTenSP()%>">
                            <span class="tz-shop-meta">
                                <a productId="<%=spb4.getMaSP()%>" class="tzshopping add2cart">
                                    <i class="fa fa-shopping-cart "></i>
                                </a>
                                <a href="details.jsp?sanpham_id=<%=spb4.getMaSP()%>" class="tztasks">
                                    <i class="fa fa-tasks"></i>
                                </a>
                            </span>
                        </div>
                        <h6 id="productName"><a href="details.jsp?sanpham_id=<%=spb4.getMaSP()%>"><%=spb4.getTenSP()%></a></h6>
                        <small id="price"><%=spb4.getGia()%></small>
                    </div>

                </div>
                <a href="shop.jsp" class="tz-view-more2 tz-view-style2">
                    <span>XEM THÊM</span>
                </a>
            </div><!--end class container-->
        </section><!--end class tz-lastest-shop-->


        <!-- /girds_bottom-->
        <div class="grids_bottom">
            <div class="style-grids">
                <div class="col-md-6 style-grid style-grid-1">
                    <img src="images/b1.jpg" alt="image">
                </div>
            </div>
            <div class="col-md-6 style-grid style-grid-2">
                <div class="style-image-1_info">
                    <div class="style-grid-2-text_info">
                        <h3>Robert Creeley</h3>
                        <p>It is hard going to the door,  
                            cut so small in the wall where,  
                            the vision which echoes loneliness,  
                            brings a scent of wild flowers in the wood.</p>
                        <div class="shop-button">
                            <a href="shop.jsp">Shop Now</a>
                        </div>
                    </div>
                </div>
                <div class="style-image-2">
                    <img src="images/b2.jpg" alt="image">
                    <div class="style-grid-2-text">
                        <h3>Plant</h3>
                    </div>
                </div>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
    <!-- //grids_bottom-->


    <section class="tz-about tz-about3 theme-gray shop-padding">
        <div class="container">
            <div class="row">
                <div class="col-lg-4 colg-md-4 col-sm-4 col-xs-12">
                    <div class="tz-about-item tz-background1">
                        <img class="about-icon" src="images/flask2.png" alt="professional">
                        <img class="thumb-bk" src="images/tz-bg1.jpg" alt="professional">
                        <span class="line-border"></span>
                        <span class="line-left"></span>
                        <span class="line-right"></span>
                        <div class="tz-about-ds">
                            <h6>Chất lượng</h6>
                            <p style="height: 86px;">Với chúng tôi, chất lượng cây cảnh là cách tốt nhất để phát triển cửa hàng. </p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 colg-md-4 col-sm-4 col-xs-12">
                    <div class="tz-about-item tz-background3">
                        <img class="about-icon" src="images/thumnbup.png" alt="passionate">
                        <img class="thumb-bk" src="images/tz-bg2.jpg" alt="passionate">
                        <span class="line-border"></span>
                        <span class="line-left"></span>
                        <span class="line-right"></span>
                        <div class="tz-about-ds">
                            <h6>Tận tâm</h6>
                            <p style="height: 86px;">Đội ngũ nhân viên kinh nghiệm sẽ tư vấn cho bạn cách chăm sóc cây trồng một cách tốt nhất. </p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 colg-md-4 col-sm-4 col-xs-12">
                    <div class="tz-about-item tz-background2">
                        <img class="about-icon" src="images/thumb.png" alt="friendly">
                        <img class="thumb-bk" src="images/tz-bg3.jpg" alt="friendly">
                        <span class="line-border"></span>
                        <span class="line-left"></span>
                        <span class="line-right"></span>
                        <div class="tz-about-ds">
                            <h6>Đa dạng</h6>
                            <p style="height: 86px;">Để đáp ứng nhu cầu trang trí nội thất và ngoại thất, GD luôn thu thập nhiều loại cây khác nhau về màu, mẫu, loại cây. </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section><!--end class tz-about-->

    <section class="tz-award parallax">
        <button class="award_prev"><i class="fa fa-angle-left"></i></button>
        <button class="award_next"><i class="fa fa-angle-right "></i></button>
        <div class="container">
            <ul class="tz-award-slider">
                <li>
                    <h6>- Green Decoration - Green Life - </h6>
                    <!--<span>Album of our shop &heartsuit;</span>-->
                    <img src="images/g1.jpg" alt="Image" style="max-width:100%;">
                    <img src="images/g2.png" alt="Image" style="max-width:100%;">
                </li>
                <li>
                    <img src="images/g3.jpg" alt="Image" style="max-width:100%;">
                    <img src="images/g4.jpg" alt="Image" style="max-width:100%;">
                </li>
                <li>
                    <img src="images/g5.jpg" alt="Image" style="max-width:100%;">
                    <img src="images/g6.jpg" alt="Image" style="max-width:100%;">
                </li>
                <li>
                    <img src="images/g7.jpg" alt="Image" style="max-width:100%;">
                    <img src="images/g8.jpg" alt="Image" style="max-width:100%;">
                </li>
            </ul>
        </div><!--end class container-->
    </section><!--end class tz-award-->


    <!--      ////////////             EDIT ////////////////////////        -->

    <section class="tz-portfolio">
        <!--<h3 class="tz-title-4">
            <span>OUR RECENT WORKS</span>
        </h3>-->
        <div class="tz-portfolio-content">
            <figure class="element tz-landscape">
                <img src="images/pic1.jpg" alt="NT">
                <figcaption>
                    <h6><a href="single-portfolio-full-width-slider.jsp">Nghệ Thuật</a></h6>
                    <a class="tz-cat" href="single-portfolio-full-width-slider.jsp">Cây Văn Phòng</a>
                </figcaption>
            </figure>
            <figure class="element">
                <img src="images/pic2.jpg" alt="Sen đá">
                <figcaption>
                    <h6><a href="single-portfolio-full-width-slider.jsp">Thiết Mộc Lan</a></h6>
                    <a class="tz-cat" href="single-portfolio-full-width-slider.jsp">Cây Văn Phòng</a>
                </figcaption>
            </figure>
            <figure class="element tz-portrait">
                <img src="images/pic3.jpeg" alt="Thiết Mộc Lan">
                <figcaption>
                    <h6><a href="single-portfolio-full-width-slider.jsp">Nghệ thuật đến từ thiên nhiên</a></h6>
                    <a class="tz-cat" href="single-portfolio-full-width-slider.jsp">Cây Văn Phòng</a>
                </figcaption>
            </figure>
            <figure class="element tz-portrait">
                <img src="images/pic4.jpg" alt="Fibonacci lamp">
                <figcaption>
                    <h6><a href="single-portfolio-full-width-slider.jsp">Trang trí</a></h6>
                    <a class="tz-cat" href="single-portfolio-full-width-slider.jsp">Cây trang trí</a>
                </figcaption>
            </figure>
            <figure class="element">
                <img src="images/pic5.jpeg" alt="Sanford Metal Bed">
                <figcaption>
                    <h6><a href="single-portfolio-full-width-slider.jsp">Cây cảnh đa dạng</a></h6>
                    <a class="tz-cat" href="single-portfolio-full-width-slider.jsp">Shop</a>
                </figcaption>
            </figure>
            <figure class="element">
                <img src="images/pic6.jpeg" alt="Ulani Adirondack">
                <figcaption>
                    <h6><a href="single-portfolio-full-width-slider.jsp">Phù hợp với mọi tông màu</a></h6>
                    <a class="tz-cat" href="single-portfolio-full-width-slider.jsp">Cây trang trí</a>
                </figcaption>
            </figure>
            <figure class="element">
                <img src="images/pic7.jpg" alt="Matinee Parsons">
                <figcaption>
                    <h6><a href="single-portfolio-full-width-slider.jsp">Con người và Thiên nhiên</a></h6>
                    <a class="tz-cat" href="single-portfolio-full-width-slider.jsp">Cây trang trí</a>
                </figcaption>
            </figure>
            <figure class="element">
                <img src="images/pic8.jpeg" alt="Wall Leaning">
                <figcaption>
                    <h6><a href="single-portfolio-full-width-slider.jsp">Cây Lô hội và cây Mộng nước</a></h6>
                    <a class="tz-cat" href="single-portfolio-full-width-slider.jsp">Cây trang trí</a>
                </figcaption>
            </figure>
            <figure class="element">
                <img src="images/pic9.jpg" alt="Dorado Office Chair ">
                <figcaption>
                    <h6><a href="single-portfolio-full-width-slider.jsp">Cây Đỗ Quyên</a></h6>
                    <a class="tz-cat" href="single-portfolio-full-width-slider.jsp">Cây Trang Trí</a>
                </figcaption>
            </figure>
        </div><!--end class tz-portfolio-content-->
    </section><!--end class tz-portfolio-->

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
    <script src="js/cart.js"></script>
    <script type='text/javascript' src='rs-plugin/js/jquery.themepunch.tools.min.js'></script>
    <script type='text/javascript' src='rs-plugin/js/jquery.themepunch.revolution.min.js'></script>
    <script type="text/javascript">
        jQuery(document).ready(function () {
            jQuery('#rev_slider_2_1').show().revolution(
                    {
                        dottedOverlay: "none",
                        delay: 6000,
                        startwidth: 960,
                        startheight: 350,
                        hideThumbs: 200,

                        thumbWidth: 100,
                        thumbHeight: 50,
                        thumbAmount: 4,

                        navigationType: "none",
                        navigationArrows: "solo",
                        navigationStyle: "round",

                        touchenabled: "on",
                        onHoverStop: "on",

                        swipe_velocity: 0.7,
                        swipe_min_touches: 1,
                        swipe_max_touches: 1,
                        drag_block_vertical: false,

                        keyboardNavigation: "off",

                        navigationHAlign: "center",
                        navigationVAlign: "bottom",
                        navigationHOffset: 0,
                        navigationVOffset: 20,

                        soloArrowLeftHalign: "left",
                        soloArrowLeftValign: "center",
                        soloArrowLeftHOffset: 20,
                        soloArrowLeftVOffset: 0,

                        soloArrowRightHalign: "right",
                        soloArrowRightValign: "center",
                        soloArrowRightHOffset: 20,
                        soloArrowRightVOffset: 0,

                        shadow: 0,
                        fullWidth: "off",
                        fullScreen: "on",

                        spinner: "spinner0",

                        stopLoop: "off",
                        stopAfterLoops: -1,
                        stopAtSlide: -1,

                        shuffle: "off",

                        forceFullWidth: "off",
                        fullScreenAlignForce: "off",
                        minFullScreenHeight: "",
                        hideTimerBar: "on",
                        hideThumbsOnMobile: "off",
                        hideNavDelayOnMobile: 1500,
                        hideBulletsOnMobile: "off",
                        hideArrowsOnMobile: "off",
                        hideThumbsUnderResolution: 0,

                        fullScreenOffsetContainer: "",
                        fullScreenOffset: "",
                        hideSliderAtLimit: 0,
                        hideCaptionAtLimit: 0,
                        hideAllCaptionAtLilmit: 0,
                        startWithSlide: 0
                    });
        });	/*ready*/


        var Desktop = 4,
                tabletportrait = 2,
                mobilelandscape = 2,
                mobileportrait = 1,
                resizeTimer = null;

        jQuery(window).load(function () {
            jQuery('div.slotholder').prepend('<div class="bk-responsive-slide"></div>');
        });
    </script>
</body>
</html>