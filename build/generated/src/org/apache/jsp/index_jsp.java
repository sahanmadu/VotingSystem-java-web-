package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
     String eid= request.getParameter("id");
     String name= request.getParameter("cname");
     String party= request.getParameter("party");
     String age= request.getParameter("age");
     String nic= request.getParameter("nic");
     String email= request.getParameter("email");
     String electiontype = request.getParameter("electiontype");
     
     Connection con;
     PreparedStatement pst;
     ResultSet rs;
     
     Class.forName("com.mysql.jdbc.Driver");
     con = DriverManager.getConnection("jdbc:mysql://localhost/votingsystem","root","");
     pst = con.prepareStatement("insert into records(id,cname,party,age,nic,email,electiontype)values(?,?,?,?,?,?,?)");
     pst.setString(1,eid);
     pst.setString(2,name);
     pst.setString(3,party);
     pst.setString(4,age);
     pst.setString(5,nic);
     pst.setString(6,email); 
     pst.setString(7,electiontype);
     
     pst.executeUpdate();
      
     
      out.write("\n");
      out.write("     <script>\n");
      out.write("         alert(\"Record Added Successfully!!\");\n");
      out.write("      </script>\n");
      out.write("      ");

          }
          
      out.write("\n");
      out.write("    \n");
      out.write("   \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Candidate Update</title>\n");
      out.write("        \n");
      out.write("        <link href=\"bootstrap/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("         <div align=\"center\">\n");
      out.write("             <h2><b>Candidate Update</b></h2>\n");
      out.write("        </div>\n");
      out.write("    <div align=\"center\"> \n");
      out.write("        <img src=\"Images/CANDI1.png\" alt=\"\"/>\n");
      out.write("    </div>\n");
      out.write("    </br>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("     \n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div  class=\"col-sm-4\">\n");
      out.write("                <form  method=\"POST\" action=\"\">\n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                    <div align=\"left\">\n");
      out.write("                        <label class=\"form-label\"><b>Candidate Full Name</b></label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter candidate full name\" name=\"cname\" id=\"cname\" required>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                      <div align=\"left\">\n");
      out.write("                          <label class=\"form-label\"><b>Party</b></label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter candidate party\" name=\"party\" id=\"patty\" required>\n");
      out.write("                     </div>\n");
      out.write("                          <div align=\"left\">\n");
      out.write("                              <label class=\"form-label\"><b>Age</b></label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter candidate age\" name=\"age\" id=\"age\" required>\n");
      out.write("                      </div>\n");
      out.write("                     <div align=\"left\">\n");
      out.write("                              <label class=\"form-label\"><b>NIC Number</b></label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter candidate NIC number\" name=\"nic\" id=\"nic\" required>\n");
      out.write("                      </div>\n");
      out.write("                    <div align=\"left\">\n");
      out.write("                        <label class=\"form-label\"><b>E-mail</b></label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter candidate e-mail\" name=\"email\" id=\"email\" required>\n");
      out.write("                      </div>\n");
      out.write("                    <div align=\"left\">\n");
      out.write("                        <label class=\"form-label\"><b>Election Type</b> </label></br>\n");
      out.write("                        <select name=\"electiontype\" class=\"form-control\">\n");
      out.write("                            <option>Presidential Election</option>\n");
      out.write("                             <option>Parliament Election</option>\n");
      out.write("                             <option>Provincial Council Election</option>\n");
      out.write("                             <option>Local Government Election</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                          </br>\n");
      out.write("                          <div align=\"right\">\n");
      out.write("                              <input type=\"submit\" id=\"submit\" value=\"Submit\" name=\"submit\" class=\"btn btn-primary\"> \n");
      out.write("                              <input type=\"reset\" id=\"reset\" value=\"reset\" name=\"reset\" class=\"btn btn-warning\"> \n");
      out.write("                          </div>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("        </div>\n");
      out.write("            </br>\n");
      out.write("            <div class=\"col-sm-8\">\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("           \n");
      out.write("                    \n");
      out.write("                    <table id=\"tbl-student\" class=\"table alert-success\" cellpadding =\"\" width=\"100%\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>E-ID</th>\n");
      out.write("                                <th>Candidate Name</th>\n");
      out.write("                                 <th>Party</th>\n");
      out.write("                                  <th>Age</th>\n");
      out.write("                                  <th>C-NIC</th>\n");
      out.write("                                   <th>E-mail</th>\n");
      out.write("                                   <th>E-Type</th>\n");
      out.write("                                   <th>Edit</th>\n");
      out.write("                                    <th>Delete</th>\n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                               \n");
      out.write("                               ");

                            
                            
                              Connection con;
                              PreparedStatement pst;
                              ResultSet rs;
     
                              Class.forName("com.mysql.jdbc.Driver");
                              con = DriverManager.getConnection("jdbc:mysql://localhost/votingsystem","root","");
                             
                              String query = "select *from records";
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
      out.print(rs.getString("cname"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getString("party"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getString("age"));
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(rs.getString("nic"));
      out.write("</td>\n");
      out.write("                                 <td>");
      out.print(rs.getString("email"));
      out.write("</td>\n");
      out.write("                               <td>");
      out.print(rs.getString("electiontype"));
      out.write("</td>\n");
      out.write("                                <td><a href=\"update.jsp?id=");
      out.print(id);
      out.write("\"><input type=\"submit\" id=\"submit\" value=\"Edit\" name=\"submit\" class=\"btn btn-success\"> </a></td>\n");
      out.write("                                <td><a href=\"delete.jsp?id=");
      out.print(id);
      out.write("\"><input type=\"submit\" id=\"submit\" value=\"Delete\" name=\"submit\" class=\"btn btn-danger\"> </a></td>\n");
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
      out.write("                               \n");
      out.write("                                <div>\n");
      out.write("                                <img src=\"Images/miscellaneous.png\" alt=\"\"/>\n");
      out.write("                                <img src=\"Images/miscellaneous.png\" alt=\"\"/>\n");
      out.write("                                <img src=\"Images/miscellaneous.png\" alt=\"\"/>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("         \n");
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
