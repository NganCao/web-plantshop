package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
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
      out.write("        <footer>\n");
      out.write("            <div class=\"tz-footer-content\" style=\"padding-bottom: 30px;\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12 footer-item\" style=\"padding-right: 20px;\">\n");
      out.write("                        <h2><a href=\"index.jsp\"><span>G</span>reen Decoraton </a></h2>\n");
      out.write("                        <div class=\"textwidget\">\n");
      out.write("                            Hi vọng cửa hàng của chúng tôi sẽ giúp bạn có thể lựa chọn cây cảnh phù hợp với sở thích và không gian mình.</div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12 footer-item\">\n");
      out.write("                        <h3 class=\"module-title\">\n");
      out.write("                                <span>\n");
      out.write("                                    CONTACT\n");
      out.write("                                </span>\n");
      out.write("                        </h3>\n");
      out.write("                        <div class=\"tzwidget-contact\">\n");
      out.write("                            <address>\n");
      out.write("                             <img src=\"images/map.png\" alt=\"Loation\" style=\"padding-right: 7px;\">Ho Chi Minh City\n");
      out.write("                            </address>\n");
      out.write("                                <span>\n");
      out.write("                                    <img src=\"images/p1.png\" alt=\"Phone\" style=\"padding-right: 7px;\">+12 3456 7890\n");
      out.write("                                </span>\n");
      out.write("                            \n");
      out.write("                            <span>\n");
      out.write("                                    <img src=\"images/p2.png\" alt=\"Mobile\" style=\"padding-right: 7px;\">+98 7654 3210\n");
      out.write("                                </span>\n");
      out.write("                            <a href=\"#\"><img src=\"images/mail.png\" alt=\"Mail\" style=\"padding-right: 7px;\">mail@example.com</a>\n");
      out.write("                                <span class=\"tzwidget-social\">\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-google-plus\"></i></a>\n");
      out.write("                                </span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12 footer-item\">\n");
      out.write("                        <h3 class=\"module-title\">\n");
      out.write("                                <span>\n");
      out.write("                                    OUR INFORMATION\n");
      out.write("                                </span>\n");
      out.write("                        </h3>\n");
      out.write("                        <div class=\"menu-footer\">\n");
      out.write("                        <ul>\n");
      out.write("                                <p><img src=\"images/home.png\" alt=\"Home\" style=\"padding-right: 7px;\"><a href=\"index.jsp\">Home</a></p>\n");
      out.write("                                <p><img src=\"images/shop.png\" alt=\"Shop\" style=\"padding-right: 7px;\"><a href=\"shop.jsp\">Shop</a></p>\n");
      out.write("                                <p><img src=\"images/bag.png\" alt=\"Bag\" style=\"padding-right: 7px;\"><a href=\"about.jsp\">Shop Checkout</a></p>\n");
      out.write("                                <p><img src=\"images/account.jpg\" alt=\"Account\" style=\"padding-right: 7px;\"><a href=\"about.jsp\">Tài Khoản</a></p>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12 footer-item\">\n");
      out.write("                        <h3 class=\"module-title\">\n");
      out.write("                                <span>\n");
      out.write("                                    <p>&hearts; &hearts;<b>  TEAMS  </b>&hearts; &hearts;</p>\n");
      out.write("                                </span>\n");
      out.write("                        </h3>\n");
      out.write("                        <ul class=\"tz-recent-post\">\n");
      out.write("                            <li>\n");
      out.write("                                <img src=\"images/ngan.jpg\" alt=\"Cao Thị Kim Ngân\">\n");
      out.write("                                <div class=\"tz-recent-content\">\n");
      out.write("                                    <a href=\"singlePost-image.jsp\">Cao Thị Kim Ngân</a>\n");
      out.write("                                        <span>\n");
      out.write("                                            Jul 24, 2014\n");
      out.write("                                        </span>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <img src=\"images/hien.jpg\" alt=\"Lương Thị Thu Hiền\">\n");
      out.write("                                <div class=\"tz-recent-content\">\n");
      out.write("                                    <a href=\"singlePost-image.jsp\">Lương Thị Thu Hiền</a>\n");
      out.write("                                        <span>\n");
      out.write("                                            Jul 24, 2014\n");
      out.write("                                        </span>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <p style=\"color: #fff; text-align: center; padding-top: 40px;\">&copy; 2019 Green Decoration.</p>\n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </footer>\n");
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
