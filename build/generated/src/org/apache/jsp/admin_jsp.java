package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("        <title> Admin Panel</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/admin.css\">\n");
      out.write("\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("\t<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Baloo+Chettan+2&display=swap\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <a href=\"admin.jsp\"></a>\n");
      out.write("        \n");
      out.write("        <div id=\"left\">\n");
      out.write("\t\t<div id=\"logo\">\n");
      out.write("\t\t\t<img src=\"Images/logo1.png\">\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<br> <br> <br> <br> \n");
      out.write("\t\t\n");
      out.write("\t\t<button type=\"button\" class=\"btn btn-outline-secondary btn-sm btn-block\"><a href=\"home.jsp\">Log Out</a></button> <br> </center>\n");
      out.write("\t\n");
      out.write("  <br> <br> <br>\n");
      out.write("    <br> <br> <br>\n");
      out.write("      <br> <br> <br>\n");
      out.write("        <br> <br> <br>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<div id=\"container\">\n");
      out.write("\t\t<div id=\"header\">\n");
      out.write("                    <h2 style=\"margin-left: 350px; margin-top: 60px\">ADMIN PANEL</h2>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"wrapper\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("                            \n");
      out.write("  \n");
      out.write("                              \n");
      out.write("  <div class=\"col-sm-6\">\n");
      out.write("    <div class=\"card\">\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("        <h5 class=\"card-title\">Edit Voter Details</h5>\n");
      out.write("        <p class=\"card-text\">\n");
      out.write("            Only admin can edit this details!!            \n");
      out.write("        </p>\n");
      out.write("        <a href=\"Allposts\" class=\"btn btn-primary\">EDIT</a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>                          \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("  <div class=\"col-sm-6\">\n");
      out.write("    <div class=\"card\">\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("        <h5 class=\"card-title\">Select Election Type</h5>\n");
      out.write("        <p class=\"card-text\">\n");
      out.write("            <input type=\"radio\" id=\"e1\" name=\"e1\" value=\"Presidential Election\" onclick=\"electionView.jsp\">\n");
      out.write("            Presidential Election\n");
      out.write("            <br>\n");
      out.write("            <input type=\"radio\" id=\"e2\" name=\"e2\" value=\"Parliamentary Election\">\n");
      out.write("            Parliament Election\n");
      out.write("            \n");
      out.write("        </p>\n");
      out.write("        <a href=\"electionView.jsp\" class=\"btn btn-primary\">Info</a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col-sm-6\">\n");
      out.write("    <div class=\"card\">\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("        <h5 class=\"card-title\">Add/Edit/Delete Election</h5>\n");
      out.write("        <p class=\"card-text\">\n");
      out.write("             <input type=\"radio\" id=\"e1\" name=\"e1\" value=\"Presidential Election\" onclick=\"electionView.jsp\">\n");
      out.write("            Presidential Election\n");
      out.write("            <br>\n");
      out.write("            <input type=\"radio\" id=\"e2\" name=\"e2\" value=\"Parliamentary Election\">\n");
      out.write("            Parliament Election\n");
      out.write("        </p>\n");
      out.write("        <a href=\"addNewElection.jsp\" class=\"btn btn-primary\">Add</a>\n");
      out.write("        <a href=\"EditElection.jsp\" class=\"btn btn-secondary\">Edit</a>\n");
      out.write("        <a href=\"deleteElection.jsp\" class=\"btn btn-danger\">Delete</a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col-sm-6\">\n");
      out.write("    <div class=\"card\">\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("        <h5 class=\"card-title\">Edit Candidate Details</h5>\n");
      out.write("        <p class=\"card-text\">\n");
      out.write("            Only admin can edit this details!!            \n");
      out.write("        </p>\n");
      out.write("        <a href=\"index.jsp\" class=\"btn btn-primary\">EDIT</a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div> \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("    <div class=\"col-sm-6\">\n");
      out.write("    <div class=\"card\">\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("        <h5 class=\"card-title\">Edit Contact Details</h5>\n");
      out.write("        <p class=\"card-text\">\n");
      out.write("            Only admin can edit this details!!            \n");
      out.write("        </p>\n");
      out.write("        <a href=\"contactshow.jsp\" class=\"btn btn-primary\">EDIT</a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div> \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("    <div class=\"col-sm-6\">\n");
      out.write("    <div class=\"card\">\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("        <h5 class=\"card-title\">Chat with voters</h5>\n");
      out.write("        <p class=\"card-text\">\n");
      out.write("            Only admin can use this feature!!            \n");
      out.write("        </p>\n");
      out.write("        <a href=\"Chat.jsp\" class=\"btn btn-primary\">CHAT</a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div> \n");
      out.write(" \n");
      out.write("</div>\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("<br> <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
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
