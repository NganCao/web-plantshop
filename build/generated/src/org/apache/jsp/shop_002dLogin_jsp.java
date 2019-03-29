package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class shop_002dLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!-- Mirrored from demo.templaza.com/html/dekor/shop-Login.html by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 24 Nov 2014 09:04:16 GMT -->\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Dekor - Shop Login</title>\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"fonts/awesome/css/font-awesome.min.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Raleway:400,700,600,500,300,100,200,800\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"css/owl.carousel.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"css/owl.theme.css\" rel=\"stylesheet\" />\n");
      out.write("    <!-- Support for HTML5 -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("    <script src=\"//html5shim.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("    <!-- Enable media queries on older bgeneral_rowsers -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("    <script src=\"js/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("    <link href=\"style.css\" rel=\"stylesheet\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <!--header-->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("    <!--end class tz-header-->\n");
      out.write("\n");
      out.write("    <section class=\"tzlogin-wrap\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-6 col-md-6 col-sm-12 col-xs-12\">\n");
      out.write("                    <h3 class=\"tz-title-bold-5\">LOG IN</h3>\n");
      out.write("                    <form id=\"tzlogin\" class=\"shopform\">\n");
      out.write("                        <p>I am a returning customer</p>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                                <label>Username:</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-8 col-md-8 col-sm-8 col-xs-12\">\n");
      out.write("                                <input type=\"text\" name=\"name\" value=\"\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                                <label>Password</label>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-lg-8 col-md-8 col-sm-8 col-xs-12\">\n");
      out.write("                                <input type=\"password\" name=\"password\" value=\"\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"submit-form\">\n");
      out.write("                            <button type=\"submit\"><span>Log in</span></button>\n");
      out.write("                        </div>\n");
      out.write("                        <span class=\"tzform-meta\">\n");
      out.write("                            <a href=\"#\">Forgot Your Password?</a>\n");
      out.write("                            <a href=\"#\">Forgot Your Username?</a>\n");
      out.write("                            <a href=\"#\">Donât Have Any Account?</a>\n");
      out.write("                        </span>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-6 col-md-6 col-sm-12 col-xs-12\">\n");
      out.write("                    <h3 class=\"tz-title-bold-5\">REGISTER</h3>\n");
      out.write("                    <form id=\"tzrgister\" class=\"shopform\">\n");
      out.write("                        <p>I am a returning customer</p>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                                <label>Name:</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-8 col-md-8 col-sm-8 col-xs-12\">\n");
      out.write("                                <input type=\"text\" name=\"name\" value=\"\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                                <label>Username</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-8 col-md-8 col-sm-8 col-xs-12\">\n");
      out.write("                                <input type=\"text\" name=\"username\" value=\"\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                                <label>Password:</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-8 col-md-8 col-sm-8 col-xs-12\">\n");
      out.write("                                <input type=\"password\" name=\"password\" value=\"\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                                <label>Confirm Password:</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-8 col-md-8 col-sm-8 col-xs-12\">\n");
      out.write("                                <input type=\"password\" name=\"password2\" value=\"\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                                <label>Email Address:</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-8 col-md-8 col-sm-8 col-xs-12\">\n");
      out.write("                                <input type=\"email\" name=\"email\" value=\"\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                                <label>Confirm Email Address:</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-8 col-md-8 col-sm-8 col-xs-12\">\n");
      out.write("                                <input type=\"email\" name=\"email2\" value=\"\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                                <label>Password</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-8 col-md-8 col-sm-8 col-xs-12\">\n");
      out.write("                                <input type=\"password\" name=\"password\" value=\"\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"submit-form\">\n");
      out.write("                            <button type=\"submit\"><span>REGISTER</span></button>\n");
      out.write("                            <a href=\"#\" class=\"tzcanel\"><span>CANCEL</span></a>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div><!--end class container-->\n");
      out.write("    </section><!--end class tzblog-wrap-->\n");
      out.write("\n");
      out.write("    <!--header-->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    <!--end class tz-header-->\n");
      out.write("\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        jQuery.noConflict();\n");
      out.write("    </script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/owl.carousel.js\"></script>\n");
      out.write("    <script src=\"js/resize.js\"></script>\n");
      out.write("    <script src=\"js/off-canvas.js\"></script>\n");
      out.write("    <script src=\"js/jquery.isotope.min.js\"></script>\n");
      out.write("    <script src=\"js/custom.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<!-- Mirrored from demo.templaza.com/html/dekor/shop-Login.html by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 24 Nov 2014 09:04:16 GMT -->\n");
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
