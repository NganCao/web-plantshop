package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class shop_002dproductdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Green Decoration | Shop | Shop Product Details </title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"fonts/awesome/css/font-awesome.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"http://fonts.googleapis.com/css?family=Raleway:400,700,600,500,300,100,200,800\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"css/owl.carousel.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"css/owl.theme.css\" rel=\"stylesheet\" />\n");
      out.write("        <link rel='stylesheet' href='rs-plugin/css/settings.css' />\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Support for HTML5 -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"//html5shim.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("        <!-- Enable media queries on older bgeneral_rowsers -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"js/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!--header-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <!--end class tz-header-->\n");
      out.write("        \n");
      out.write("        <section class=\"parallax parallax_bk7\">\n");
      out.write("                <div class=\"tz-custom-product\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <h6>\n");
      out.write("                            THE ROLE OF THE TREES\n");
      out.write("                            <span>Comfortable</span>\n");
      out.write("                            <span>Living-space</span>\n");
      out.write("                            <span>Creative art</span>\n");
      out.write("                        </h6>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <!--end class tzpage-default-->\n");
      out.write("\n");
      out.write("        <div class=\"tzcategory-shop-wrap\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-3 col-md-3 col-sm-3 col-xs-12 tzshop-aside\">\n");
      out.write("                        <aside class=\"widget_categories widget\">\n");
      out.write("                            <h3 class=\"module-title title-widget\"><span>Danh mục</span></h3>\n");
      out.write("                            <section class=\"tzpage-shortcode\">\n");
      out.write("                                <div class=\"page-content container\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12\" style=\"width: 188px; height: 100%; padding-left: 0px;\">\n");
      out.write("                                            <div class=\"tzaccordion\">\n");
      out.write("                                                <h6><i class=\"fa fa-chevron-right\"></i>Cây ...</h6>\n");
      out.write("                                                <p>\n");
      out.write("                                                    <i class=\"fa fa-chevron-circle-right\"></i>\n");
      out.write("                                                    <a href=\"shop-Categories.jsp\" >Wardrobes</a><br>\n");
      out.write("\n");
      out.write("                                                    <i class=\"fa fa-chevron-circle-right\"></i>\n");
      out.write("                                                    <a href=\"shop-Categories.jsp\">Wardrobes</a><br>\n");
      out.write("\n");
      out.write("                                                    <i class=\"fa fa-chevron-circle-right\"></i>\n");
      out.write("                                                    <a href=\"shop-Categories.jsp\">Wardrobes</a><br>\n");
      out.write("                                                </p>\n");
      out.write("\n");
      out.write("                                                <h6><i class=\"fa fa-chevron-right\"></i>Cây....</h6>\n");
      out.write("                                                <p>\n");
      out.write("                                                    <i class=\"fa fa-chevron-circle-right\"></i>\n");
      out.write("                                                    <a href=\"shop-Categories.jsp\">Wardrobes</a><br>\n");
      out.write("\n");
      out.write("                                                    <i class=\"fa fa-chevron-circle-right\"></i>\n");
      out.write("                                                    <a href=\"shop-Categories.jsp\">Wardrobes</a><br>\n");
      out.write("\n");
      out.write("                                                    <i class=\"fa fa-chevron-circle-right\"></i>\n");
      out.write("                                                    <a href=\"shop-Categories.jsp\">Wardrobes</a><br>\n");
      out.write("                                                </p>\n");
      out.write("                                                <h6><i class=\"fa fa-chevron-right\"></i>Cây..</h6>\n");
      out.write("                                                <p>\n");
      out.write("                                                    <i class=\"fa fa-chevron-circle-right\"></i>\n");
      out.write("                                                    <a href=\"shop-Categories.jsp\">Wardrobes</a><br>\n");
      out.write("\n");
      out.write("                                                    <i class=\"fa fa-chevron-circle-right\"></i>\n");
      out.write("                                                    <a href=\"shop-Categories.jsp\">Wardrobes</a><br>\n");
      out.write("\n");
      out.write("                                                    <i class=\"fa fa-chevron-circle-right\"></i>\n");
      out.write("                                                    <a href=\"shop-Categories.jsp\">Wardrobes</a><br>\n");
      out.write("                                                </p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div><!--end class container-->\n");
      out.write("                            </section>\n");
      out.write("\n");
      out.write("                        </aside>\n");
      out.write("                        <aside class=\"shop_inner_inf\">\n");
      out.write("                            <div class=\"left-side\">\n");
      out.write("                                <h3 class=\"agileits-sear-head\">Phạm vi giá</h3>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>\n");
      out.write("                                        <input type=\"checkbox\" class=\"checked\">\n");
      out.write("                                        <span class=\"span\">giá-giá</span>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <input type=\"checkbox\" class=\"checked\">\n");
      out.write("                                        <span class=\"span\">giá-giá</span>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"left-side\">\n");
      out.write("                                <h3 class=\"agileits-sear-head\">Giảm giá</h3>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>\n");
      out.write("                                        <input type=\"checkbox\" class=\"checked\">\n");
      out.write("                                        <span class=\"span\">5% or More</span>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <input type=\"checkbox\" class=\"checked\">\n");
      out.write("                                        <span class=\"span\">10% or More</span>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <input type=\"checkbox\" class=\"checked\">\n");
      out.write("                                        <span class=\"span\">20% or More</span>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <input type=\"checkbox\" class=\"checked\">\n");
      out.write("                                        <span class=\"span\">30% or More</span>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <input type=\"checkbox\" class=\"checked\">\n");
      out.write("                                        <span class=\"span\">50% or More</span>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <input type=\"checkbox\" class=\"checked\">\n");
      out.write("                                        <span class=\"span\">60% or More</span>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </aside>\n");
      out.write("                        <aside class=\"widget_bestsellers\">\n");
      out.write("                            <h3 class=\"module-title title-widget\"><span>BESTSELLERS</span></h3>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>\n");
      out.write("                                    <div class=\"as_bestsellers_thumb\">\n");
      out.write("                                        <img src=\"images/conhat.jpg\" alt=\"Cây mọng nước\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"as_bestsellers_content\">\n");
      out.write("                                        <a href=\"shop-productdetails.jsp\">Cây cọ Nhật</a>\n");
      out.write("                                        <span>??? vnđ<em>??? vnđ</em></span>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <div class=\"as_bestsellers_thumb\">\n");
      out.write("                                        <img src=\"images/doquyen.jpg\" alt=\"Chậu đỗ quyên\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"as_bestsellers_content\">\n");
      out.write("                                        <a href=\"shop-productdetails.jsp\">Chậu đỗ quyên</a>\n");
      out.write("                                        <span>??? vnđ</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <div class=\"as_bestsellers_thumb\">\n");
      out.write("                                        <img src=\"images/traubaxanh.jpg\" alt=\"Dress With Pastel Color\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"as_bestsellers_content\">\n");
      out.write("                                        <a href=\"shop-productdetails.jsp\">Cây trầu bà xanh</a>\n");
      out.write("                                        <span>??? vnđ</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <div class=\"as_bestsellers_thumb\">\n");
      out.write("                                        <img src=\"images/cayluoiho.jpg\" alt=\"Dress With Back Bow\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"as_bestsellers_content\">\n");
      out.write("                                        <a href=\"shop-productdetails.jsp\">Cây lưỡi hổ</a>\n");
      out.write("                                        <span>??? vnđ</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <div class=\"as_bestsellers_thumb\">\n");
      out.write("                                        <img src=\"images/bupdo.jpg\" alt=\"Dress With Back Bow\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"as_bestsellers_content\">\n");
      out.write("                                        <a href=\"shop-productdetails.jsp\">Cây đá búp đỏ</a>\n");
      out.write("                                        <span>??? vnđ</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </aside>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"tz-wp-content\" class=\"col-lg-9 col-md-9 col-sm-9 col-xs-12\">\n");
      out.write("                        <h3 class=\"tz-title-bold-3\">CHI TIẾT SẢN PHẨM</h3>\n");
      out.write("                        <div id=\"tz-shop-content\" class=\"row\">\n");
      out.write("                            <div class=\"col-lg-5 col-md-5 col-sm-12 col-xs-12\">\n");
      out.write("                                <div id=\"slider\" class=\"flexslider\">\n");
      out.write("                                    <ul class=\"slides\">\n");
      out.write("                                        <li>\n");
      out.write("                                            <img src=\"images/shop-detail3.jpg\" alt=\"Roses Deco Accent Chair\"/>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <img src=\"images/shop-detail12.jpg\" alt=\"Roses Deco Accent Chair\"/>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <img src=\"images/shop-detail1.jpg\" alt=\"Roses Deco Accent Chair\" />\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <div id=\"carousel\">\n");
      out.write("                                    <ul class=\"slides\">\n");
      out.write("                                        <li>\n");
      out.write("                                            <img src=\"images/shop-thum1.jpg\" alt=\"Roses Deco Accent Chair\" />\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <img src=\"images/shop-thum2.jpg\" alt=\"Roses Deco Accent Chair\" />\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <img src=\"images/shop-thum3.jpg\" alt=\"Roses Deco Accent Chair\" />\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-6 col-md-6 col-sm-12 col-xs-12\">\n");
      out.write("                                <div class=\"tzshop-summary\">\n");
      out.write("                                    <h3>tên sản phẩm</h3>\n");
      out.write("                                    <span class=\"tzproduct-single-price\">\n");
      out.write("                                        ??? vnđ <small>??? vnđ</small> <a href=\"#\">Reviews (2)</a>\n");
      out.write("                                    </span>\n");
      out.write("                                    <h6 class=\"tz-title-details\">Chi tiết sản phẩm</h6>\n");
      out.write("                                    <ul class=\"tzshop-status\">\n");
      out.write("                                        <li>\n");
      out.write("                                            <span>Availability:</span> In Stock\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <span>Product Code:</span> Product 7\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <span>Reward Points: </span> 0\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <span>Brand: </span> Product Canon\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                    <p>\n");
      out.write("                                        OS X comes in a single version that includes a collection of Apple-designed applications. Not only do they let you surf the web, make FaceTime video calls, send messages, manage your contacts, and accomplish other day-to-day tasks, they also work together to make you more productive â and let you have more fun.\n");
      out.write("                                    </p>\n");
      out.write("                                    <div class=\"tzqty\">\n");
      out.write("                                        Q.ty: <strong>1</strong>\n");
      out.write("                                    </div>\n");
      out.write("                                    <span class=\"tz-shop-detail-meta\">\n");
      out.write("                                        <a class=\"tzshopping\" href=\"#\">\n");
      out.write("                                            <i class=\"fa fa-shopping-cart\"></i>\n");
      out.write("                                        </a>\n");
      out.write("                                        <a class=\"tzheart\" href=\"#\">\n");
      out.write("                                            <i class=\"fa fa-heart\"></i>\n");
      out.write("                                        </a>\n");
      out.write("                                        <a class=\"tztasks\" href=\"#\">\n");
      out.write("                                            <i class=\"fa fa-tasks\"></i>\n");
      out.write("                                        </a>\n");
      out.write("                                    </span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <!--   này sửa theo loại nha,nhóm sp lại hoặc bỏ đi thay bằng hình cũng đc    -->\n");
      out.write("                        <div class=\"tzrelated-shop\">\n");
      out.write("                            <h3 class=\"tz-title-bold-3\">Sản phẩm cùng loại</h3>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12 laster-shop-item\">\n");
      out.write("                                    <div class=\"laster-thumb\">\n");
      out.write("                                        <div class=\"shop-icon-data\">\n");
      out.write("                                            <img src=\"images/hosts.png\" alt=\"hosts\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <img src=\"images/shop1.jpg\" alt=\"Linen Shirt With Mao Color\">\n");
      out.write("                                        <span class=\"tz-shop-meta\">\n");
      out.write("                                            <a href=\"#\" class=\"tzshopping\">\n");
      out.write("                                                <i class=\"fa fa-shopping-cart\"></i>\n");
      out.write("                                            </a>\n");
      out.write("                                            <a href=\"#\" class=\"tzheart\">\n");
      out.write("                                                <i class=\"fa fa-heart\"></i>\n");
      out.write("                                            </a>\n");
      out.write("                                            <a href=\"#\" class=\"tztasks\">\n");
      out.write("                                                <i class=\"fa fa-tasks\"></i>\n");
      out.write("                                            </a>\n");
      out.write("                                        </span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <h6><a href=\"shop-productdetails.jsp\">Linen Shirt With Mao Color</a></h6>\n");
      out.write("                                    <small>$59.99 </small>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12 laster-shop-item\">\n");
      out.write("                                    <div class=\"laster-thumb\">\n");
      out.write("                                        <img src=\"images/shop2.jpg\" alt=\"Superdry Shirt With Wash\">\n");
      out.write("                                        <span class=\"tz-shop-meta\">\n");
      out.write("                                            <a href=\"#\" class=\"tzshopping\">\n");
      out.write("                                                <i class=\"fa fa-shopping-cart\"></i>\n");
      out.write("                                            </a>\n");
      out.write("                                            <a href=\"#\" class=\"tzheart\">\n");
      out.write("                                                <i class=\"fa fa-heart\"></i>\n");
      out.write("                                            </a>\n");
      out.write("                                            <a href=\"#\" class=\"tztasks\">\n");
      out.write("                                                <i class=\"fa fa-tasks\"></i>\n");
      out.write("                                            </a>\n");
      out.write("                                        </span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <h6><a href=\"shop-productdetails.jsp\">Superdry Shirt With Wash</a></h6>\n");
      out.write("                                    <small>$59.99 </small>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12 laster-shop-item\">\n");
      out.write("                                    <div class=\"laster-thumb\">\n");
      out.write("                                        <img src=\"images/shop3.jpg\" alt=\"Arvust Shirt In Washed Blue\">\n");
      out.write("                                        <span class=\"tz-shop-meta\">\n");
      out.write("                                            <a href=\"#\" class=\"tzshopping\">\n");
      out.write("                                                <i class=\"fa fa-shopping-cart\"></i>\n");
      out.write("                                            </a>\n");
      out.write("                                            <a href=\"#\" class=\"tzheart\">\n");
      out.write("                                                <i class=\"fa fa-heart\"></i>\n");
      out.write("                                            </a>\n");
      out.write("                                            <a href=\"#\" class=\"tztasks\">\n");
      out.write("                                                <i class=\"fa fa-tasks\"></i>\n");
      out.write("                                            </a>\n");
      out.write("                                        </span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <h6><a href=\"shop-productdetails.jsp\">Arvust Shirt In Washed Blue</a></h6>\n");
      out.write("                                    <small><em>$59.99</em>$59.99 </small>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div><!--end class container-->\n");
      out.write("        </div><!--end class tzblog-wrap-->\n");
      out.write("         <!--footer-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        <!--end class tz-footer-->\n");
      out.write("        \n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            jQuery.noConflict();\n");
      out.write("        </script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/owl.carousel.js\"></script>\n");
      out.write("        <script src=\"js/resize.js\"></script>\n");
      out.write("        <script src=\"js/off-canvas.js\"></script>\n");
      out.write("        <script src=\"js/jquery.isotope.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.flexslider.js\"></script>\n");
      out.write("        <script src=\"js/custom.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            // jQuery for flexslider------------------\n");
      out.write("            jQuery(window).load(function () {\n");
      out.write("                // The slider being synced must be initialized first\n");
      out.write("                jQuery('#carousel').flexslider({\n");
      out.write("                    animation: \"slide\",\n");
      out.write("                    controlNav: false,\n");
      out.write("                    animationLoop: false,\n");
      out.write("                    slideshow: false,\n");
      out.write("                    directionNav: false,\n");
      out.write("                    autoHeight: true,\n");
      out.write("                    itemWidth: 80,\n");
      out.write("                    itemMargin: 80,\n");
      out.write("                    asNavFor: '#slider'\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                jQuery('#slider').flexslider({\n");
      out.write("                    animation: \"slide\",\n");
      out.write("                    controlNav: false,\n");
      out.write("                    animationLoop: false,\n");
      out.write("                    directionNav: false,\n");
      out.write("                    autoHeight: true,\n");
      out.write("                    slideshow: false,\n");
      out.write("                    sync: \"#carousel\"\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    <!-- Mirrored from demo.templaza.com/html/dekor/shop-productdetails.jsp by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 24 Nov 2014 09:03:51 GMT -->\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
