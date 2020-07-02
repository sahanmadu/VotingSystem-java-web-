package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class contactshow_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Contact Details</title>\n");
      out.write("        \n");
      out.write("          <link href=\"bootstrap/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body><div align=\"center\">\n");
      out.write("            <h2> <b>Client Feedback!</b> </h2>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("          \n");
      out.write("            <div align=\"center\">\n");
      out.write("            <img src=\"imagesc/pic.jpg\" alt=\"\"/>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("         </div>\n");
      out.write("            </br>\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("           \n");
      out.write("                    \n");
      out.write("                    <table  id=\"tbl-student\" class=\"table table-dark\" cellpadding =\"\" width=\"100%\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>C-ID</th>\n");
      out.write("                                <th>Client Name</th>\n");
      out.write("                                 <th> Address</th>\n");
      out.write("                                  <th>E-mail</th>\n");
      out.write("                                  <th>Phone Number</th>\n");
      out.write("                                   <th>Message</th>\n");
      out.write("                                 \n");
      out.write("                                    <th>Delete</th>\n");
      out.write("                                  \n");
      out.write("                             \n");
      out.write("     \n");
      out.write("                            </tr>\n");
      out.write("                       \n");
      out.write("                               ");

                            
                            
                              Connection con;
                              PreparedStatement pst;
                              ResultSet rs;
     
                              Class.forName("com.mysql.jdbc.Driver");
                              con = DriverManager.getConnection("jdbc:mysql://localhost/votingsystem","root","");
                             
                              String query = "select *from contactus";
                              Statement st = con.createStatement();
                              
                              rs = st.executeQuery(query);
                              
                             while(rs.next())
                             {
                             String id =rs.getString("id");
                             
                            
                            
      out.write(" \n");
      out.write("           \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            <tr>\n");
      out.write("                                 <td>");
      out.print(rs.getString("id"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getString("firstname"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getString("address"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getString("email"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getString("pno"));
      out.write("</td>\n");
      out.write("                                 <td>");
      out.print(rs.getString("message"));
      out.write("</td>\n");
      out.write("                                 \n");
      out.write("                                <td><a href=\"deletec.jsp?id=");
      out.print(id);
      out.write("\"><input type=\"submit\" id=\"submit\" value=\"Delete\" name=\"submit\" class=\"btn btn-danger\"> </a></td>\n");
      out.write("                             \n");
      out.write("                             \n");
      out.write("                               \n");
      out.write("                             \n");
      out.write("                                \n");
      out.write("                            </tr>\n");
      out.write("                            ");

                                }
                                
      out.write("\n");
      out.write("                       \n");
      out.write("                    </table>\n");
      out.write("                            </br>\n");
      out.write("                             </br>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
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
