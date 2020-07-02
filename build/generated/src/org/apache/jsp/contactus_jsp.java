package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class contactus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write("\n");

   
   if(request.getParameter("submit")!=null)
   { 
     
     String fname= request.getParameter("firstname");
     String address= request.getParameter("address");
     String email= request.getParameter("email");
     String phone= request.getParameter("pno");
     String message= request.getParameter("message");
   
     
     Connection con;
     PreparedStatement pst;
     ResultSet rs;
     
     Class.forName("com.mysql.jdbc.Driver");
     con = DriverManager.getConnection("jdbc:mysql://localhost/votingsystem","root","");
     pst = con.prepareStatement("insert into contactus(firstname,address,email,pno,message)values(?,?,?,?,?)");
    
     pst.setString(1,fname);
     pst.setString(2,address);
     pst.setString(3,email);
     pst.setString(4,phone);
     pst.setString(5,message);
     
   
     pst.executeUpdate();
      
     
      out.write("\n");
      out.write("     <script>\n");
      out.write("         alert(\"Thank You!!\");\n");
      out.write("      </script>\n");
      out.write("      ");

          }
          
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Contact Us</title>\n");
      out.write("          <link href=\"bootstrap/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <style> \n");
      out.write("        \n");
      out.write("        body  {\n");
      out.write("  background-image: url(\"Images/Web 1920 – 1.png\");\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("\n");
      out.write("\n");
      out.write("ul {\n");
      out.write("  list-style-type: none;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  overflow: hidden;\n");
      out.write("  border: 1px solid #e7e7e7;\n");
      out.write("  background-color: #f3f3f3;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li {\n");
      out.write("  float: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a {\n");
      out.write("  display: block;\n");
      out.write("  color: #666;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover:not(.active) {\n");
      out.write("  background-color: #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a.active {\n");
      out.write("  color: white;\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("}\n");
      out.write("        \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <ul>\n");
      out.write("  \n");
      out.write("  <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("  <li><a class=\"active\" href=\"contactus.jsp\">Contact</a></li>\n");
      out.write("  <li><a href=\"Showall\">Result</a></li>\n");
      out.write("  <li><a  href=\"Aboutus.jsp\">About Us</a></li>\n");
      out.write("</ul>\n");
      out.write("        <div align=\"left\">\n");
      out.write("           \n");
      out.write("            <img src=\"imagesc/contact-uscreakidz3.jpg\" alt=\"\"/>\n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("         <div align=\"center\"  class=\"alert-dark\">\n");
      out.write("            <div  class=\"col-sm-4\">\n");
      out.write("                <form   method=\"POST\" action=\"\">\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    </br>\n");
      out.write("                    <div align=\"left\">\n");
      out.write("                        <label class=\"form-label\"><b>Tell Us Your Name*</b></label></br>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Your Name\" name=\"firstname\" id=\"firstname\" required>\n");
      out.write("                        <label class=\"form-label\"><b>Enter Your Address*</b></label></br>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Your address\" name=\"address\" id=\"address\" required>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                      <div align=\"left\">\n");
      out.write("                          <label class=\"form-label\"><b>Enter Your E-mail*</b></label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Eg.example@email.com\" name=\"email\" id=\"email\" required>\n");
      out.write("                     </div>\n");
      out.write("                    <div align=\"left\">\n");
      out.write("                          <label class=\"form-label\"><b>Enter Phone Number*</b></label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Eg.+94076986888\" name=\"pno\" id=\"pno\" required>\n");
      out.write("                     </div>\n");
      out.write("                          <div align=\"left\">\n");
      out.write("                              <label class=\"form-label\"><b>Message</b></label>\n");
      out.write("                              <textarea name=\"message\"class=\"form-control\" placeholder=\"Send Us a Message\" name=\"message\" placeholder=\"Write Us a Message\" name=\"message\" id=\"message\" required></textarea> \n");
      out.write("                      </div>\n");
      out.write("                         \n");
      out.write("                                        \n");
      out.write("                          </br>\n");
      out.write("                          <div align=\"right\">\n");
      out.write("                              <input type=\"submit\" id=\"submit\" value=\"Send Message\" name=\"submit\" class=\"btn btn-success\"> \n");
      out.write("                     \n");
      out.write("                          </div>\n");
      out.write("                          </br>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("       \n");
      out.write("        <div align=\"right\">\n");
      out.write("            <img src=\"imagesc/contact-uscreakidz3.jpg\" alt=\"\"/>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    \n");
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
