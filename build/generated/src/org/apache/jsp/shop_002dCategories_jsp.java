package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.client.service.SanPham;
import com.client.service.ArrayOfSanPham;
import com.client.service.Menu;
import com.client.service.ArrayOfMenu;

public final class shop_002dCategories_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <!-- Mirrored from demo.templaza.com/html/dekor/shop-Categories.jsp by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 24 Nov 2014 09:01:54 GMT -->\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Dekor - Shop Category </title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"fonts/awesome/css/font-awesome.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"http://fonts.googleapis.com/css?family=Raleway:400,700,600,500,300,100,200,800\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"css/owl.carousel.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"css/owl.theme.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" />\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            ArrayOfMenu menu = com.servlet.getMenu.getListMenu();
            String str = "";
            String category_id = "";
            if (request.getParameter("category") != null) {
                category_id = request.getParameter("category");
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"loading-page\">\n");
      out.write("            <img src=\"images/loading.gif\" alt=\"loading\">\n");
      out.write("        </div>\n");
      out.write("        <header class=\"tz-header tz-header3\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h3 class=\"tz-logo pull-left\">\n");
      out.write("                    <a href=\"home-01.jsp\">\n");
      out.write("                        <img src=\"images/logo2.png\" alt=\"dekor\">\n");
      out.write("                    </a>\n");
      out.write("                </h3>\n");
      out.write("                <button data-target=\".nav-collapse\" class=\"btn-navbar pull-right  tz_icon_menu\" type=\"button\">\n");
      out.write("                    <i class=\"fa fa-bars\"></i>\n");
      out.write("                </button>\n");
      out.write("                <button class=\"pull-right tz-search\"> <i class=\"fa fa-search\"></i></button>\n");
      out.write("                <nav class=\"pull-right\">\n");
      out.write("                    <ul class=\"nav-collapse\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">HOME</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">SHOP</a>\n");
      out.write("                            <div class=\"nav-child dropdown-menu mega-dropdown-menu\">\n");
      out.write("                                <div class=\"mega-dropdown-inner\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div data-width=\"12\" class=\"col-md-12 mega-col-nav\">\n");
      out.write("                                            <div class=\"mega-inner\">\n");
      out.write("                                                ");

                                                    for (Menu mn : menu.getMenu()) {
                                                        int id_mn = mn.getMaMenu();
                                                
      out.write("\n");
      out.write("                                                <ul class=\"mega-nav level1\">\n");
      out.write("                                                    <li>\n");
      out.write("                                                        <a href=\"shop.jsp?category=");
      out.print(mn.getMaMenu());
      out.write('"');
      out.write('>');
      out.print(mn.getTenMenu());
      out.write("</a>\n");
      out.write("                                                        <ul class=\"mega-nav level1\">\n");
      out.write("                                                            ");

                                                                ArrayOfSanPham sanpham = com.servlet.getListSPtheoMenu.getListSanPhamTheoMenu(id_mn);
                                                                for (SanPham sp : sanpham.getSanPham()) {
                                                            
      out.write("\n");
      out.write("                                                            <li>\n");
      out.write("                                                                <a href=\"#\">");
      out.print(sp.getTenSP());
      out.write("</a>\n");
      out.write("                                                            </li>\n");
      out.write("                                                            ");

                                                                }
                                                            
      out.write("\n");
      out.write("                                                        </ul>\n");
      out.write("                                                    </li>\n");
      out.write("                                                </ul>\n");
      out.write("                                                ");

                                                    }
                                                
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div><!--end class container-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"tz-form-search\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <form method=\"get\" action=\"#\">\n");
      out.write("                        <input type=\"text\" placeholder=\"Search...\" name=\"search\" id=\"tz-search-input\" class=\"tz-search-input\">\n");
      out.write("                        <input class=\"hidden\" type=\"submit\" value=\"Search\">\n");
      out.write("                        <i class=\"fa fa-times tz-form-close\"></i>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div><!--end class tz-form-search-->\n");
      out.write("        </header><!--end class tz-header-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"tzcategory-shop-wrap\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-3 col-md-3 col-sm-3 col-xs-12 tzshop-aside\">\n");
      out.write("                        <aside class=\"widget_categories widget\">\n");
      out.write("                            <h3 class=\"module-title title-widget\"><span>Category</span></h3>\n");
      out.write("                            <ul>\n");
      out.write("                                ");

                                    for (Menu mn : menu.getMenu()) {

                                
      out.write("\n");
      out.write("                                <li>\n");
      out.write("                                    <i class=\"fa fa-chevron-right\"></i>\n");
      out.write("                                    <a href=\"shop-Categories.jsp?category=");
      out.print(mn.getMaMenu());
      out.write('"');
      out.write('>');
      out.print(mn.getTenMenu());
      out.write("</a>\n");
      out.write("                                    <ul class=\"children\">\n");
      out.write("                                        ");

                                            ArrayOfSanPham sanpham = com.servlet.getListSPtheoMenu.getListSanPhamTheoMenu(mn.getMaMenu());
                                            for (SanPham sp : sanpham.getSanPham()) {
                                        
      out.write("\n");
      out.write("                                        <li>\n");
      out.write("                                            <i class=\"fa fa-chevron-circle-right\"></i>\n");
      out.write("                                            <a href=\"shop-Categories.jsp?id_sp=");
      out.print(sp.getMaSP());
      out.write('"');
      out.write('>');
      out.print(sp.getTenSP());
      out.write("</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        ");

                                            }
                                        
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </aside>\n");
      out.write("                        <aside class=\"widget_bestsellers\">\n");
      out.write("                            <h3 class=\"module-title title-widget\"><span>BESTSELLERS</span></h3>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>\n");
      out.write("                                    <div class=\"as_bestsellers_thumb\">\n");
      out.write("                                        <img src=\"images/aside_1.jpg\" alt=\"Dress With Back Bow\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"as_bestsellers_content\">\n");
      out.write("                                        <a href=\"shop-productdetails.jsp\">Dress With Back Bow</a>\n");
      out.write("                                        <span>$59.99 <em>$59.99</em></span>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <div class=\"as_bestsellers_thumb\">\n");
      out.write("                                        <img src=\"images/aside_2.jpg\" alt=\"Vintage Bikini\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"as_bestsellers_content\">\n");
      out.write("                                        <a href=\"shop-productdetails.jsp\">Vintage Bikini</a>\n");
      out.write("                                        <span>$59.99</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <div class=\"as_bestsellers_thumb\">\n");
      out.write("                                        <img src=\"images/aside_3.jpg\" alt=\"Dress With Pastel Color\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"as_bestsellers_content\">\n");
      out.write("                                        <a href=\"shop-productdetails.jsp\">Dress With Pastel Color</a>\n");
      out.write("                                        <span>$59.99</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <div class=\"as_bestsellers_thumb\">\n");
      out.write("                                        <img src=\"images/aside_4.jpg\" alt=\"Dress With Back Bow\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"as_bestsellers_content\">\n");
      out.write("                                        <a href=\"shop-productdetails.jsp\">Dress With Back Bow</a>\n");
      out.write("                                        <span>$59.99</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <div class=\"as_bestsellers_thumb\">\n");
      out.write("                                        <img src=\"images/aside_5.jpg\" alt=\"Dress With Back Bow\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"as_bestsellers_content\">\n");
      out.write("                                        <a href=\"shop-productdetails.jsp\">Dress With Back Bow</a>\n");
      out.write("                                        <span>$59.99</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </aside>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-9 col-md-9 col-sm-9 col-xs-12\">\n");
      out.write("                        <div class=\"tzshopcat-description\">\n");
      out.write("                            <h1 class=\"tz-title-bold-3\">CATEGORY_NAME</h1>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            ");

                                ArrayOfSanPham sanpham = com.servlet.getListSPtheoMenu.getListSanPhamTheoMenu(Integer.parseInt("category_id"));
                                for (SanPham sp : sanpham.getSanPham()) {
                            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12 laster-shop-item\">\n");
      out.write("\n");
      out.write("                                <div class=\"laster-thumb\">\n");
      out.write("                                    <!--                                <div class=\"shop-icon-data\">\n");
      out.write("                                                                        <img src=\"images/hosts.png\" alt=\"hosts\">\n");
      out.write("                                                                    </div>-->\n");
      out.write("                                    <a><img src=\"images/shop1.jpg\" alt=\"Linen Shirt With Mao Color\"></a>\n");
      out.write("<!--                                    <span class=\"tz-shop-meta\">\n");
      out.write("                                        <a href=\"#\" class=\"tzshopping\">\n");
      out.write("                                            <i class=\"fa fa-shopping-cart\"></i>\n");
      out.write("                                        </a>\n");
      out.write("                                    </span>-->\\<h6><a href=\"shop-productdetails.jsp\">");
      out.print(sp.getTenSP());
      out.write("</a></h6>\n");
      out.write("                                <small>$59.99 </small>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("\n");
      out.write("                            </div> \n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                            <div class=\"tzpagenavi-shop\">\n");
      out.write("                                <a class=\"active\">1</a>\n");
      out.write("                                <a href=\"#\">2</a>\n");
      out.write("                                <a href=\"#\">3</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div><!--end class tzblog-wrap-->\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <footer>\n");
      out.write("                <div class=\"tz-footer-content\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12 footer-item\">\n");
      out.write("                                <h3 class=\"module-title\">\n");
      out.write("                                    <span>\n");
      out.write("                                        ABOUT\n");
      out.write("                                    </span>\n");
      out.write("                                </h3>\n");
      out.write("                                <div class=\"textwidget\">\n");
      out.write("                                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur quis mollis tellus, et ullamcorper velit.\n");
      out.write("                                    Curabitur lobortis bibendum tincidunt. Nullam eget ultrices quam. Morbi vestibulum nec diam ac hendrerit.\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12 footer-item\">\n");
      out.write("                                <h3 class=\"module-title\">\n");
      out.write("                                    <span>\n");
      out.write("                                        CONTACT\n");
      out.write("                                    </span>\n");
      out.write("                                </h3>\n");
      out.write("                                <div class=\"tzwidget-contact\">\n");
      out.write("                                    <address>\n");
      out.write("                                        No.200 Joseph Road, Canada\n");
      out.write("                                    </address>\n");
      out.write("                                    <span>\n");
      out.write("                                        +44 (0) 800 765 4321\n");
      out.write("                                    </span>\n");
      out.write("                                    <a href=\"#\">info@templaza.com</a>\n");
      out.write("                                    <span class=\"tzwidget-social\">\n");
      out.write("                                        <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                                        <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                                        <a href=\"#\"><i class=\"fa fa-google-plus\"></i></a>\n");
      out.write("                                    </span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12 footer-item\">\n");
      out.write("                                <h3 class=\"module-title\">\n");
      out.write("                                    <span>\n");
      out.write("                                        RECENT POSTS\n");
      out.write("                                    </span>\n");
      out.write("                                </h3>\n");
      out.write("                                <ul class=\"tz-recent-post\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <img src=\"images/last-1.jpg\" alt=\"recent post\">\n");
      out.write("                                        <div class=\"tz-recent-content\">\n");
      out.write("                                            <a href=\"singlePost-image.jsp\">Lorem ipsum dolor sit amet.</a>\n");
      out.write("                                            <span>\n");
      out.write("                                                Jul 24, 2014\n");
      out.write("                                            </span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <img src=\"images/last-12.jpg\" alt=\"recent post\">\n");
      out.write("                                        <div class=\"tz-recent-content\">\n");
      out.write("                                            <a href=\"singlePost-image.jsp\">Donec quam eros, bibendum sed egestas ...</a>\n");
      out.write("                                            <span>\n");
      out.write("                                                Jul 24, 2014\n");
      out.write("                                            </span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <img src=\"images/last-3.jpg\" alt=\"recent post\">\n");
      out.write("                                        <div class=\"tz-recent-content\">\n");
      out.write("                                            <a href=\"singlePost-image.jsp\">Sit amet varius quam.</a>\n");
      out.write("                                            <span>\n");
      out.write("                                                Jul 24, 2014\n");
      out.write("                                            </span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12 footer-item\">\n");
      out.write("                                <h3 class=\"module-title\">\n");
      out.write("                                    <span>\n");
      out.write("                                        RECENT PROJECTS\n");
      out.write("                                    </span>\n");
      out.write("                                </h3>\n");
      out.write("                                <ul class=\"tz-recent-porjects\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"single-portfolio-gallery.jsp\">\n");
      out.write("                                            <img src=\"images/pro1.jpg\" alt=\"projects\">\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"single-portfolio-gallery.jsp\">\n");
      out.write("                                            <img src=\"images/pro2.jpg\" alt=\"projects 2\">\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"single-portfolio-gallery.jsp\">\n");
      out.write("                                            <img src=\"images/pro3.jpg\" alt=\"projects 3\">\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"single-portfolio-gallery.jsp\">\n");
      out.write("                                            <img src=\"images/pro4.jpg\" alt=\"projects 4\">\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"single-portfolio-gallery.jsp\">\n");
      out.write("                                            <img src=\"images/pro5.jpg\" alt=\"projects 5\">\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"single-portfolio-gallery.jsp\">\n");
      out.write("                                            <img src=\"images/pro6.jpg\" alt=\"projects 6\">\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"tz-copyright theme-white\">\n");
      out.write("                    <p>copy 2014 Dekor Design, INC. All Rights Reserved.</p>\n");
      out.write("                </div>\n");
      out.write("            </footer><!--end class tz-footer-->\n");
      out.write("\n");
      out.write("            <script src=\"js/jquery.min.js\"></script>\n");
      out.write("            <script>\n");
      out.write("                jQuery.noConflict();\n");
      out.write("            </script>\n");
      out.write("            <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("            <script src=\"js/owl.carousel.js\"></script>\n");
      out.write("            <script src=\"js/resize.js\"></script>\n");
      out.write("            <script src=\"js/off-canvas.js\"></script>\n");
      out.write("            <script src=\"js/jquery.isotope.min.js\"></script>\n");
      out.write("            <script src=\"js/custom.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    <!-- Mirrored from demo.templaza.com/html/dekor/shop-Categories.jsp by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 24 Nov 2014 09:03:05 GMT -->\n");
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
