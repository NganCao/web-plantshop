package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dangky_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"fonts/awesome/css/font-awesome.min.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Raleway:400,700,600,500,300,100,200,800\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"css/owl.carousel.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"css/owl.theme.css\" rel=\"stylesheet\" />\n");
      out.write("    <link rel='stylesheet' href='rs-plugin/css/settings.css' />\n");
      out.write("    <link href=\"style.css\" rel=\"stylesheet\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, Helvetica, sans-serif;\n");
      out.write("            background-color: black;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        * {\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Add padding to containers */\n");
      out.write("        .container2 {\n");
      out.write("            padding: 16px;\n");
      out.write("            background-color: white;\n");
      out.write("            padding-left: 150px;\n");
      out.write("            padding-right: 150px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Full-width input fields */\n");
      out.write("        input[type=text], input[type=password] {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 15px;\n");
      out.write("            margin: 5px 0 22px 0;\n");
      out.write("            display: inline-block;\n");
      out.write("            border: none;\n");
      out.write("            background: #f1f1f1;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=text]:focus, input[type=password]:focus {\n");
      out.write("            background-color: #ddd;\n");
      out.write("            outline: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Overwrite default styles of hr */\n");
      out.write("        hr {\n");
      out.write("            border: 1px solid #f1f1f1;\n");
      out.write("            margin-bottom: 25px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Set a style for the submit button */\n");
      out.write("        .registerbtn {\n");
      out.write("            background-color: #4CAF50;\n");
      out.write("            color: white;\n");
      out.write("            padding: 16px 20px;\n");
      out.write("            margin: 8px 0;\n");
      out.write("            border: none;\n");
      out.write("            cursor: pointer;\n");
      out.write("            width: 100%;\n");
      out.write("            opacity: 0.9;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .registerbtn:hover {\n");
      out.write("            opacity: 1;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Add a blue text color to links */\n");
      out.write("        a {\n");
      out.write("            color: dodgerblue;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <!--header-->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("    <!--end class tz-header-->\n");
      out.write("\n");
      out.write("    <div>\n");
      out.write("        <img src=\"images/avvv.jpg\" style=\"height:50%;\"/>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <form action=\"/action_page.php\">\n");
      out.write("        <div class=\"container2\">\n");
      out.write("            <h1 style=\"font-weight: 50px; color: #ac2925; font-size: 70px; padding-top: 20px;padding-bottom: 20px;\">Register</h1>\n");
      out.write("            <p>Please fill in this form to create an account.</p>\n");
      out.write("            <hr>\n");
      out.write("            <label for=\"name\"><b>Name</b></label>\n");
      out.write("            <input type=\"text\" placeholder=\"Enter Name\" name=\"name\" required>\n");
      out.write("\n");
      out.write("            <label for=\"email\"><b>Email/Phone</b></label>\n");
      out.write("            <input type=\"text\" placeholder=\"Enter Email\" name=\"email\" required>\n");
      out.write("\n");
      out.write("            <label for=\"name\"><b>Address</b></label>\n");
      out.write("            <input type=\"text\" placeholder=\"Enter Address\" name=\"address\" required>\n");
      out.write("            \n");
      out.write("            <label for=\"psw\"><b>Password</b></label>\n");
      out.write("            <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required>\n");
      out.write("\n");
      out.write("            <label for=\"psw-repeat\"><b>Repeat Password</b></label>\n");
      out.write("            <input type=\"password\" placeholder=\"Repeat Password\" name=\"psw-repeat\" required>\n");
      out.write("            <hr>\n");
      out.write("            <input type=\"checkbox\" id=\"myCheck\"  onclick=\"checkdieukhoan()\"> Tôi đồng ý với các điều khoản được đặt ra\n");
      out.write("            <p>By creating an account you agree to our <a href=\"#\">Terms & Privacy</a>.</p>\n");
      out.write("\n");
      out.write("            <button type=\"submit\" class=\"registerbtn\">Register</button>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    <!--footer-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        <!--end class tz-footer-->\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
