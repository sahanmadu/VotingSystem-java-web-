package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class parliamentView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>parliament view Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/electionView.css\">\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/header.css\">\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\" integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\" integrity=\"sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI\" crossorigin=\"anonymous\"></script>\n");
      out.write("      <style>\n");
      out.write("    \n");
      out.write("    body{\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  background: #f1f1f1;\n");
      out.write("  background-image:url(\"Images/oldElectionBack.jpg\");\n");
      out.write("}\n");
      out.write("</style>   \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("         <div class=\"wrapper\">\n");
      out.write("\t\t<div class=\"nav\">\n");
      out.write("\t\t\t<div class=\"logo\">\n");
      out.write("                            <a href=\"home.jsp\"> <img src=\"Images/logo1.png\"> </a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"menu\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("            \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    <center> <h2> Previous Parliamentary Election Results </h2></center>\n");
      out.write("       \n");
      out.write("     <br> <br> <br>\n");
      out.write("             <br> <br> <br>\n");
      out.write("             <br> <br> <br>\n");
      out.write("              <br> <br> <br>\n");
      out.write("             <br> <br> <br>\n");
      out.write("             <br> <br> <br>\n");
      out.write("       \n");
      out.write("        <div class=\"pt\">\n");
      out.write("  <div class=\"box\">\n");
      out.write(" <h2 class=\"header\" style=\"\n");
      out.write("    background: green;\n");
      out.write("\">\n");
      out.write("2015</h2>\n");
      out.write("<ul>\n");
      out.write("    <li class=\"cash\"><span> </span> <h4>All 225 seats to the Parliament of Sri Lanka\n");
      out.write("113 seats are needed for a majority\n");
      out.write("77.66% </h4></li>\n");
      out.write("<center> <img src=\"Images/ranil.jpg\" width=\"80px\" height=\"80px\" >\n");
      out.write("                <img src=\"Images/my3.jpg\" width=\"80px\" height=\"80px\" > </center>\n");
      out.write("    \n");
      out.write("    <li> <b> Party - Seats won</b></li>\n");
      out.write("<li>UNP - 106 </li>\n");
      out.write("<li>UPFA - 95</li>\n");
      out.write("\n");
      out.write("<li><a href=\"#\">See More</a></li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("<div class=\"box\">\n");
      out.write("  <h2 class=\"header\" style=\"\n");
      out.write("    background: #2196F3;\n");
      out.write("\">\n");
      out.write("2010</h2>\n");
      out.write("<ul>\n");
      out.write("<li class=\"cash\"><span>  </span>  <h4>All 225 seats to the Parliament of Sri Lanka\n");
      out.write("113 seats are needed for a majority\n");
      out.write("77.66% </h4></li>\n");
      out.write("    <center> <img src=\"Images/P10.jpeg\" width=\"80px\" height=\"80px\" > <img src=\"Images/ranil.jpg\" width=\"80px\" height=\"80px\" > </center>\n");
      out.write("    <li> <b> Party - Seats won</b></li>\n");
      out.write("\n");
      out.write("<li>UPFA - 144</li>\n");
      out.write(" <li>UNP - 60 </li>\n");
      out.write("\n");
      out.write("<li><a href=\"#\">See More</a></li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("<div class=\"box\">\n");
      out.write("  <h2 class=\"header\" style=\"\n");
      out.write("    background: #2196F3;\n");
      out.write("\">\n");
      out.write("2004</h2>\n");
      out.write("<ul>\n");
      out.write("<li class=\"cash\"><span> </span>  <h4>All 225 seats to the Parliament of Sri Lanka\n");
      out.write("113 seats are needed for a majority\n");
      out.write("77.66% </h4></li>\n");
      out.write("    <center> <img src=\"Images/chandrika.jpg\" width=\"80px\" height=\"80px\" > <img src=\"Images/ranil.jpg\" width=\"80px\" height=\"80px\" > </center>\n");
      out.write("    <li> <b> Party - Seats won</b></li>\n");
      out.write("\n");
      out.write("<li>UPFA - 105/li>\n");
      out.write(" <li>UNP - 82 </li>\n");
      out.write("\n");
      out.write("<li><a href=\"#\">See More</a></li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("              <button class=\"btn btn-secondary\"> <a href=\"electionView.jsp\">Back</a> </button>\n");
      out.write("        \n");
      out.write("    </body>\n");
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
