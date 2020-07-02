package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class addNewElection_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write("\n");

   
   if(request.getParameter("submit")!=null)
   { 
     
     String types= request.getParameter("etype");
     String edates= request.getParameter("edate");
     String candi1= request.getParameter("c1");
     String candi2= request.getParameter("c2");
     String candi3= request.getParameter("c3");
   
     
     Connection con;
     PreparedStatement pst;
     ResultSet rs;
     
     Class.forName("com.mysql.jdbc.Driver");
     con = DriverManager.getConnection("jdbc:mysql://localhost/votingsystem","root","");
     pst = con.prepareStatement("insert into addelection(etype,edate,candidate1,candidate2,candidate3)values(?,?,?,?,?)");
    
     pst.setString(1,types);
     pst.setString(2,edates);
     pst.setString(3,candi1);
     pst.setString(4,candi2);
     pst.setString(5,candi3);
     
   
     pst.executeUpdate();
      
     
      out.write("\n");
      out.write("     <script>\n");
      out.write("         alert(\"Inserted successfully!!\");\n");
      out.write("      </script>\n");
      out.write("      ");

       
          }
          
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add New Election Page</title>\n");
      out.write("        \n");
      out.write("         <link rel=\"stylesheet\" href=\"CSS/addNewElection.css\">\n");
      out.write("         <style>\n");
      out.write("             body{\n");
      out.write(" \n");
      out.write("  font-family: sans-serif;\n");
      out.write("  background-image:url('Images/b1.jpeg');\n");
      out.write("  background-size: cover;\n");
      out.write("\n");
      out.write("}\n");
      out.write("         </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <h1 style=\"color:white; text-align: center; margin-top: 130px\">Add new election </h1>\n");
      out.write("        <div class=\"login-box\">\n");
      out.write("             <form action=\"\" method=\"POST\">\n");
      out.write(" \n");
      out.write(" \n");
      out.write("  <div class=\"textbox\">\n");
      out.write("    \n");
      out.write("      <input type=\"text\" placeholder=\"Election type\" name=\"etype\" required>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"textbox\">\n");
      out.write("    \n");
      out.write("      <input type=\"date\" placeholder=\"Election date\" name=\"edate\" required>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("   <div class=\"textbox\">\n");
      out.write("   \n");
      out.write("       <input type=\"text\" placeholder=\"Candidate 1\" name=\"c1\" required>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("   <div class=\"textbox\">\n");
      out.write("   \n");
      out.write("       <input type=\"text\" placeholder=\"Candidate 2\" name=\"c2\" required>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("   <div class=\"textbox\">\n");
      out.write("    \n");
      out.write("       <input type=\"text\" placeholder=\"Candidate 3\" name=\"c3\" required>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <input type=\"submit\" class=\"btn btn-success\" value=\"ADD\" name=\"submit\">\n");
      out.write("  \n");
      out.write("   </form> \n");
      out.write("</div>\n");
      out.write("      \n");
      out.write("​\n");
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
