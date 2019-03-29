package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Cart;
import com.client.service.SanPham;
import com.client.service.ArrayOfSanPham;
import com.client.service.Menu;
import com.client.service.ArrayOfMenu;

public final class shop_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Green Decoration | Shop</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"fonts/awesome/css/font-awesome.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"http://fonts.googleapis.com/css?family=Raleway:400,700,600,500,300,100,200,800\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"css/owl.carousel.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"css/owl.theme.css\" rel=\"stylesheet\" />\n");
      out.write("        <link rel='stylesheet' href='rs-plugin/css/settings.css' />\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            ArrayOfMenu Menu = com.servlet.getMenu.getListMenu();
            String id_menu = "";
        
      out.write("\n");
      out.write("\n");
      out.write("        <header class=\"tz-header tz-header2\" style=\"background-color: black;\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h3 class=\"tz-logo pull-left\">\n");
      out.write("                    <a href=\"index.jsp\">\n");
      out.write("                        <h1><a class=\"navbar-brand\" href=\"index.jsp\"><span>Green</span> <i style=\"color: white;\">Decoration</i></a></h1>\n");
      out.write("                    </a>\n");
      out.write("                </h3>\n");
      out.write("                <button data-target=\".nav-collapse\" class=\"btn-navbar tz_icon_menu pull-right\" type=\"button\">\n");
      out.write("                    <i class=\"fa fa-bars\"></i>\n");
      out.write("                </button>\n");
      out.write("                <button class=\"pull-right tz-search\"> <i class=\"fa fa-search\" style=\"font-size: 20px;\"></i></button>\n");
      out.write("                <button class=\"pull-right tz-user\" onclick=\"document.getElementById('login01').style.display = 'block'\" style=\"opacity: 1;\"> <i class=\"fa fa-user\" style=\"font-size: 20px;\"></i></button>\n");
      out.write("                <button class=\"pull-right tz-cart\" onclick=\"document.getElementById('cart01').style.display = 'block'\" style=\"opacity: 1;\"> <i class=\"fa fa-shopping-cart\" style=\"font-size: 20px;\"><span class=\"badge\">0</span></i></button>\n");
      out.write("                \n");
      out.write("                <!-- form login -->\n");
      out.write("                <div id=\"login01\" class=\"modal\">\n");
      out.write("                    <form class=\"modal-content animate\" action=\"/action_page.php\">\n");
      out.write("                        <div class=\"imgcontainer\">\n");
      out.write("                            <span onclick=\"document.getElementById('login01').style.display = 'none'\" class=\"close\" title=\"Close Modal\">&times;</span>\n");
      out.write("                            <img src=\"images/ava.png\" alt=\"Avatar\" class=\"avatar\" style=\"border-radius: 50%;width: 20%;\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"container1\">\n");
      out.write("                            <label for=\"uname\"><b>Username</b></label>\n");
      out.write("                            <input type=\"text\" placeholder=\"Enter Username\" name=\"uname\" required style=\"\">\n");
      out.write("\n");
      out.write("                            <label for=\"psw\"><b>Password</b></label>\n");
      out.write("                            <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required>\n");
      out.write("\n");
      out.write("                            <button class=\"loginbtn\" type=\"submit\">Login</button>\n");
      out.write("                            <label>\n");
      out.write("                                <input type=\"checkbox\" checked=\"checked\" name=\"remember\"> Remember me\n");
      out.write("                            </label>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"container1\" style=\"background-color:#f1f1f1; text-align: center;\">\n");
      out.write("                            <button type=\"button\" onclick=\"document.getElementById('login01').style.display = 'none'\" class=\"cancelbtn\">Cancel</button>\n");
      out.write("                            <span class=\"psw\">Chưa có tài khoản <a href=\"dangky.jsp\">đăng ký ngay</a></span>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <!-- /end form login -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!--   shopping-cart   -->\n");
      out.write("                <div id=\"cart01\" class=\"modal modal1\">\n");
      out.write("                    <form method=\"post\" action=\"#\" class=\"modal-content animate\" style=\"width: auto; float: right;\">\n");
      out.write("                        <div class=\"imgcontainer\">\n");
      out.write("                            <span onclick=\"document.getElementById('cart01').style.display = 'none'\" class=\"close\" title=\"Close Modal\" >&times;</span>\n");
      out.write("                        </div>\n");
      out.write("                        <table class=\"shop_table\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th class=\"product-image\">Image</th>\n");
      out.write("                                    <th class=\"name\">Product Name</th>\n");
      out.write("                                    <th class=\"porduct-quantity\">Quantity</th>\n");
      out.write("                                    <th class=\"product-price\">Price </th>\n");
      out.write("                                    <th class=\"product-remove\">Action</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                            <td  colspan=\"5\"><p style=\"text-align: center;font-size: 15px;\"><code>Bạn chưa có món hàng nào trong giỏ</code></p></td>\n");
      out.write("                            </tbody>\n");
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <nav class=\"pull-right\">\n");
      out.write("                    <ul class=\"nav-collapse\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"index.jsp\">HOME</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"shop.jsp\">SHOP</a>\n");
      out.write("                            <div class=\"nav-child dropdown-menu mega-dropdown-menu\">\n");
      out.write("                                <div class=\"mega-dropdown-inner\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div data-width=\"12\" class=\"col-md-12 mega-col-nav\">\n");
      out.write("                                            <div class=\"mega-inner\">\n");
      out.write("                                                <ul class=\"mega-nav level1\">\n");
      out.write("                                                    ");
                                                        
                                                        for (Menu menu : Menu.getMenu()) {
                                                            int id = menu.getMaMenu();
                                                    
      out.write("\n");
      out.write("                                                    <li class=\"rendermenu\">\n");
      out.write("\n");
      out.write("                                                        <a href=\"shop.jsp?Menu_id=");
      out.print(menu.getMaMenu());
      out.write("\" id=\"category_id\">");
      out.print(menu.getTenMenu());
      out.write("</a>\n");
      out.write("\n");
      out.write("                                                        <ul class=\"mega-nav level1\">\n");
      out.write("                                                            ");

                                                                ArrayOfSanPham list = com.servlet.getListSPtheoMenu.getListSanPhamTheoMenu(id);
                                                                for (SanPham sp : list.getSanPham()) {
                                                            
      out.write("    \n");
      out.write("                                                            <li>\n");
      out.write("                                                                <a href=\"details.jsp?sanpham_id=");
      out.print(sp.getMaSP());
      out.write('"');
      out.write('>');
      out.print(sp.getTenSP());
      out.write("</a>\n");
      out.write("                                                            </li>\n");
      out.write("                                                            ");

                                                                }
                                                            
      out.write("\n");
      out.write("                                                        </ul>\n");
      out.write("                                                        ");

                                                            }
                                                        
      out.write("\n");
      out.write("                                                    </li>\n");
      out.write("\n");
      out.write("                                                </ul>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"dangky.jsp\">ĐĂNG KÝ</a>\n");
      out.write("\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div><!--end class container-->\n");
      out.write("\n");
      out.write("            <div class=\"tz-form-search\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <form method=\"get\" action=\"#\">\n");
      out.write("                        <input type=\"search\" placeholder=\"Click enter after typing...\" name=\"search\" id=\"tz-search-input\" class=\"tz-search-input\">\n");
      out.write("                        <input class=\"hidden\" type=\"submit\" value=\"Search\">\n");
      out.write("                        <i class=\"fa fa-times tz-form-close\"></i>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div><!--end class tz-form-search-->\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <section class=\"parallax parallax_bk7\">\n");
      out.write("            <div class=\"tz-custom-product\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h6>\n");
      out.write("                        THE ROLE OF THE TREES\n");
      out.write("                        <span>Comfortable</span>\n");
      out.write("                        <span>Living-space</span>\n");
      out.write("                        <span>Creative art</span>\n");
      out.write("                    </h6>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!--end class tzpage-default-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"tzcategory-shop-wrap\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-3 col-md-3 col-sm-3 col-xs-12 tzshop-aside\">\n");
      out.write("                        <aside class=\"widget_categories widget\">\n");
      out.write("                            <h3 class=\"module-title title-widget\"><span>Danh mục</span></h3>\n");
      out.write("                            <section class=\"tzpage-shortcode\" style=\"background-color: #FFF;padding-top: 0;padding-bottom: 0;\">\n");
      out.write("                                <div class=\"page-content container\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12\" style=\"width: 188px; height: 100%; padding-left: 0px;\">\n");
      out.write("                                            <div class=\"tzaccordion\">\n");
      out.write("                                                ");

                                                    for (Menu menu1 : Menu.getMenu()) {
                                                        int id = menu1.getMaMenu();
                                                
      out.write("\n");
      out.write("                                                <h6><i class=\"fa fa-chevron-right\"></i>");
      out.print(menu1.getTenMenu());
      out.write("</h6>\n");
      out.write("                                                <p>\n");
      out.write("                                                    ");

                                                        ArrayOfSanPham list = com.servlet.getListSPtheoMenu.getListSanPhamTheoMenu(id);
                                                        for (SanPham sp : list.getSanPham()) {
                                                    
      out.write("\n");
      out.write("                                                    <!--<i class=\"fa fa-chevron-circle-right\"></i>-->\n");
      out.write("                                                    <a href=\"details.jsp?sanpham_id=");
      out.print(sp.getMaSP());
      out.write("\" >- ");
      out.print(sp.getTenSP());
      out.write("</a><br>\n");
      out.write("                                                    ");

                                                            }
                                                        }
                                                    
      out.write("\n");
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
      out.write("                                        <span class=\"span\">> 400</span>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <input type=\"checkbox\" class=\"checked\">\n");
      out.write("                                        <span class=\"span\">400-600</span>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <input type=\"checkbox\" class=\"checked\">\n");
      out.write("                                        <span class=\"span\">> 600</span>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </aside>\n");
      out.write("                        <aside class=\"widget_bestsellers\">\n");
      out.write("                            <h3 class=\"module-title title-widget\"><span>BESTSELLERS</span></h3>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>\n");
      out.write("\n");
      out.write("                                    ");

                                        SanPham spb1 = com.servlet.getSPById.getSanPham(16);
                                        SanPham spb2 = com.servlet.getSPById.getSanPham(6);
                                        SanPham spb3 = com.servlet.getSPById.getSanPham(10);
                                        SanPham spb4 = com.servlet.getSPById.getSanPham(15);
                                    
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"as_bestsellers_thumb\">\n");
      out.write("                                        <img src=\"");
      out.print(spb1.getHinhAnh());
      out.write("\" alt=\"");
      out.print(spb1.getTenSP());
      out.write("\" style=\"width: 80px;\" href=\"details.jsp?sanpham_id=");
      out.print(spb1.getMaSP());
      out.write("\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"as_bestsellers_content\">\n");
      out.write("                                        <a href=\"details.jsp?sanpham_id=");
      out.print(spb1.getMaSP());
      out.write('"');
      out.write('>');
      out.print(spb1.getTenSP());
      out.write("</a>\n");
      out.write("                                        <span>");
      out.print(spb1.getGia());
      out.write(" vnđ</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <div class=\"as_bestsellers_thumb\">\n");
      out.write("                                        <img src=\"");
      out.print(spb2.getHinhAnh());
      out.write("\" alt=\"");
      out.print(spb2.getTenSP());
      out.write("\" style=\"width: 80px;\" href=\"details.jsp?sanpham_id=");
      out.print(spb1.getMaSP());
      out.write("\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"as_bestsellers_content\">\n");
      out.write("                                        <a href=\"details.jsp?sanpham_id=");
      out.print(spb2.getMaSP());
      out.write('"');
      out.write('>');
      out.print(spb2.getTenSP());
      out.write("</a>\n");
      out.write("                                        <span>");
      out.print(spb2.getGia());
      out.write(" vnđ</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <div class=\"as_bestsellers_thumb\">\n");
      out.write("                                        <img src=\"");
      out.print(spb3.getHinhAnh());
      out.write("\" alt=\"");
      out.print(spb3.getTenSP());
      out.write("\" style=\"width: 80px;\" href=\"details.jsp?sanpham_id=");
      out.print(spb1.getMaSP());
      out.write("\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"as_bestsellers_content\">\n");
      out.write("                                        <a href=\"details.jsp?sanpham_id=");
      out.print(spb3.getMaSP());
      out.write('"');
      out.write('>');
      out.print(spb3.getTenSP());
      out.write("</a>\n");
      out.write("                                        <span>");
      out.print(spb3.getGia());
      out.write(" vnđ</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <div class=\"as_bestsellers_thumb\">\n");
      out.write("                                        <img src=\"");
      out.print(spb4.getHinhAnh());
      out.write("\" alt=\"");
      out.print(spb4.getTenSP());
      out.write("\" style=\"width: 80px;\" href=\"details.jsp?sanpham_id=");
      out.print(spb1.getMaSP());
      out.write("\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"as_bestsellers_content\">\n");
      out.write("                                        <a href=\"details.jsp?sanpham_id=");
      out.print(spb4.getTenSP());
      out.write('"');
      out.write('>');
      out.print(spb4.getTenSP());
      out.write("</a>\n");
      out.write("                                        <span>");
      out.print(spb4.getTenSP());
      out.write(" vnđ</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </aside>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!--san pham-->\n");
      out.write("                    <div class=\"col-lg-9 col-md-9 col-sm-9 col-xs-12\">\n");
      out.write("\n");
      out.write("                        <div class=\"tzshopcat-description\">\n");
      out.write("                            <h1 class=\"tz-title-bold-3\" id=\"tieude\">Sản Phẩm</h1>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        ");

                            if (request.getParameter("Menu_id") != null) {
                                id_menu = request.getParameter("Menu_id");
                                ArrayOfSanPham listsp = com.servlet.getListSPtheoMenu.getListSanPhamTheoMenu(Integer.parseInt(id_menu));
                                for (SanPham sp : listsp.getSanPham()) {
                        
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12 laster-shop-item\" id=\"pro-");
      out.print(sp.getMaSP());
      out.write("\">\n");
      out.write("                                <div class=\"laster-thumb\">\n");
      out.write("                                    <!--<div class=\"shop-icon-data\">\n");
      out.write("                                            <img src=\"images/hosts.png\" alt=\"hosts\">\n");
      out.write("                                        </div>-->\n");
      out.write("                                    <img src=\"");
      out.print(sp.getHinhAnh());
      out.write("\" alt=\"");
      out.print(sp.getTenSP());
      out.write("\">\n");
      out.write("                                    <span class=\"tz-shop-meta\">\n");
      out.write("                                        <a productId=\"");
      out.print(sp.getMaSP());
      out.write("\" class=\"tzshopping add2cart\">\n");
      out.write("                                            <i class=\"fa fa-shopping-cart\"></i>\n");
      out.write("                                        </a>\n");
      out.write("                                        <a href=\"details.jsp?sanpham_id=");
      out.print(sp.getMaSP());
      out.write("\" class=\"tztasks\">\n");
      out.write("                                            <i class=\"fa fa-tasks\"></i>\n");
      out.write("                                        </a>\n");
      out.write("                                    </span>\n");
      out.write("                                </div>\n");
      out.write("                                <h6 id=\"productName\"><a id=\"productName\" href=\"details.jsp?sanpham_id=");
      out.print(sp.getMaSP());
      out.write('"');
      out.write('>');
      out.print(sp.getTenSP());
      out.write("</a></h6>\n");
      out.write("                                <small id=\"price\" >");
      out.print(sp.getGia());
      out.write("</small>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            ");

                                }
                            } else {
                                ArrayOfSanPham listsp = com.servlet.getListSPtheoMenu.getListSanPham();
                                for (SanPham sp : listsp.getSanPham()) {
                            
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12 laster-shop-item\" id=\"pro-");
      out.print(sp.getMaSP());
      out.write("\">\n");
      out.write("                                <div class=\"laster-thumb\">\n");
      out.write("                                    <!--<div class=\"shop-icon-data\">\n");
      out.write("                                            <img src=\"images/hosts.png\" alt=\"hosts\">\n");
      out.write("                                        </div>-->\n");
      out.write("                                    <img src=\"");
      out.print(sp.getHinhAnh());
      out.write("\" alt=\"");
      out.print(sp.getTenSP());
      out.write("\">\n");
      out.write("                                    <span class=\"tz-shop-meta\">\n");
      out.write("                                        <a productId=\"");
      out.print(sp.getMaSP());
      out.write("\" class=\"tzshopping add2cart\">\n");
      out.write("                                            <i class=\"fa fa-shopping-cart\"></i>\n");
      out.write("                                        </a>\n");
      out.write("                                        <a href=\"details.jsp?sanpham_id=");
      out.print(sp.getMaSP());
      out.write("\" class=\"tztasks\">\n");
      out.write("                                            <i class=\"fa fa-tasks\"></i>\n");
      out.write("                                        </a>\n");
      out.write("                                    </span>\n");
      out.write("                                </div>\n");
      out.write("                                <h6 id=\"productName\"><a id=\"productName\" href=\"details.jsp?sanpham_id=");
      out.print(sp.getMaSP());
      out.write('"');
      out.write('>');
      out.print(sp.getTenSP());
      out.write("</a></h6>\n");
      out.write("                                <small id=\"price\" >");
      out.print(sp.getGia());
      out.write("</small>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            ");

                                    }
                                }
                            
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"tzpagenavi-shop\">\n");
      out.write("                            <a class=\"active\">1</a>\n");
      out.write("                            <a href=\"#\">2</a>\n");
      out.write("                            <a href=\"#\">3</a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"tzshopcat-description\">\n");
      out.write("                            <img src=\"images/pic8.jpeg\" style=\"margin-top: 0px;\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div><!--end class tzblog-wrap-->   \n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--footer-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        <!--end class tz-footer-->\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("                                            jQuery.noConflict();\n");
      out.write("        </script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.parallax-1.1.3.js\"></script>\n");
      out.write("        <script src=\"js/owl.carousel.js\"></script>\n");
      out.write("        <script src=\"js/resize.js\"></script>\n");
      out.write("        <script src=\"js/off-canvas.js\"></script>\n");
      out.write("        <script src=\"js/jquery.isotope.min.js\"></script>\n");
      out.write("        <script src=\"js/custom.js\"></script>\n");
      out.write("        <script src=\"js/cart.js\"></script>\n");
      out.write("        <script src=\"js/slider.js\"></script>\n");
      out.write("        <script type='text/javascript' src='rs-plugin/js/jquery.themepunch.tools.min.js'></script>\n");
      out.write("        <script type='text/javascript' src='rs-plugin/js/jquery.themepunch.revolution.min.js'></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
