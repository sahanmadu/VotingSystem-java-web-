package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Home Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/home.css\">\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        \n");
      out.write("body{\n");
      out.write("\twidth: 100%;\n");
      out.write("\theight: 100vh;\n");
      out.write("\tbackground-image:url('Images/homeBack.jpeg');\n");
      out.write("\tbackground-repeat: no-repeat;\n");
      out.write("\tbackground-size: cover;\n");
      out.write("\tdisplay: table;\n");
      out.write("    font-family: Montserrat;\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("img{\n");
      out.write("    height: 90px;\n");
      out.write("    width:120px;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("\t\t<div class=\"nav\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t<img src=\"Images/logo1.png\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"menu\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li><a href=\"electionView.jsp\"> Previous Elections </a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li><a href=\"Voters.html\">Register</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"privacyPolicy.jsp\">Privacy Policy</a></li>\n");
      out.write("                                         <li><a href=\"contactus.jsp\">Contact Us</a></li>\n");
      out.write("                                        <li><a href=\"sendEmail.jsp\">Email</a></li>\n");
      out.write("                                          <li><a href=\"Showall\">Results</a></li>\n");
      out.write("                                           <li><a href=\"map.jsp\">Location</a></li>\n");
      out.write("                                            <li><a href=\"Aboutus.jsp\">About Us</a></li>\n");
      out.write("                                             <li><a href=\"Service.jsp\">Services</a></li>\n");
      out.write("                                       \n");
      out.write("                                        \n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"header\">\n");
      out.write("\t\t\t<h1> Easy VoteZ</h1>\n");
      out.write("\t\t\t<p>\n");
      out.write("\t\t\t\tSecure Online Voting Platform \n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t\t<a href=\"login.jsp\"><button type=\"button\"> Click here to Login</button> </a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("       \n");
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
