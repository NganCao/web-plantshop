package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.client.service.SanPham;
import com.client.service.ArrayOfSanPham;
import com.client.service.Menu;
import com.client.service.ArrayOfMenu;

public final class shoptest_jsp extends org.apache.jasper.runtime.HttpJspBase
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


            ArrayOfMenu listSP = com.servlet.getMenu.getListMenu();
            String id_menu = "";
            if (request.getParameter("Menu_id") != null) {
                id_menu = request.getParameter("Menu_id");
            }
            String category_id = "";
            String brand_id = "";
            if (request.getParameter("category") != null) {
                category_id = request.getParameter("category");
            }
            if (request.getParameter("brand") != null) {
                brand_id = request.getParameter("brand");
            }
            String category_id_1 = "1";

        
      out.write("\n");
      out.write("\n");
      out.write("        <!--header-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            <!--end class tz-header-->\n");
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("                       \n");
      out.write("                            ");
                                
                                ArrayOfSanPham list = com.servlet.getListSPtheoMenu.getListSanPhamTheoMenu(Integer.parseInt(id_menu));
                                for (SanPham sp1 : list.getSanPham()) {
                            
      out.write("\n");
      out.write("                            <div >\n");
      out.write("                                \n");
      out.write("                                <img src=\"images/shop1.jpg\" alt=\"Linen Shirt With Mao Color\">\n");
      out.write("                                <h6><a>");
      out.print(sp1.getTenSP());
      out.write("</a></h6>\n");
      out.write("                                <a>27</a>\n");
      out.write("                            </div>\n");
      out.write("                            ");

                                
                                }
                            
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <!--footer-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        <!--end class tz-footer-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            jQuery.noConflict();\n");
      out.write("        </script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.parallax-1.1.3.js\"></script>\n");
      out.write("        <script src=\"js/owl.carousel.js\"></script>\n");
      out.write("        <script src=\"js/resize.js\"></script>\n");
      out.write("        <script src=\"js/off-canvas.js\"></script>\n");
      out.write("        <script src=\"js/jquery.isotope.min.js\"></script>\n");
      out.write("        <script src=\"js/custom-portfolio.js\"></script>\n");
      out.write("        <script src=\"js/custom.js\"></script>\n");
      out.write("        <script src=\"js/leaflet/leaflet.js\"></script>  \n");
      out.write("        <script src=\"js/main.js\"></script>\n");
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
