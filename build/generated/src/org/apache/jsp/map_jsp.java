package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class map_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("         <style>\n");
      out.write("     \n");
      out.write("      #map {\n");
      out.write("        height: 600px;  \n");
      out.write("        width: 700px;\n");
      out.write("        margin-left: 370px;\n");
      out.write("       }\n");
      out.write("       img{\n");
      out.write("           width:200px;\n");
      out.write("           height: 100px;\n");
      out.write("       }\n");
      out.write("       h1{\n");
      out.write("          color: blacks;\n");
      out.write("          margin-left: 480px;\n");
      out.write("       }\n");
      out.write("       body{\n");
      out.write("           background-image: url(\"Images/maps.jpg\")\n");
      out.write("       }\n");
      out.write("       \n");
      out.write("       ul {\n");
      out.write("  list-style-type: none;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  overflow: hidden;\n");
      out.write("  border: 1px solid #e7e7e7;\n");
      out.write("  background-color: #f3f3f3;\n");
      out.write("  opacity: .8;\n");
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
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <ul>\n");
      out.write("  \n");
      out.write("  <li><a href=\"#news\">Home</a></li>\n");
      out.write("  <li><a href=\"#contact\">Contact</a></li>\n");
      out.write("  <li><a href=\"Showall\">Result</a></li>\n");
      out.write("  <li><a href=\"Aboutus.jsp\">About Us</a></li>\n");
      out.write("   <li><a class=\"active\"  href=\"#\">Location</a></li>\n");
      out.write("  <li><a href=\"Service.jsp\">Service</a></li>\n");
      out.write("</ul>\n");
      out.write("        <h1>Election Commission of Sri Lanka</h1><br>\n");
      out.write("         <div id=\"map\"></div>\n");
      out.write("    <script>\n");
      out.write("\n");
      out.write("function initMap() {\n");
      out.write("  \n");
      out.write("  var options = {\n");
      out.write("      zoom:9,\n");
      out.write("      center:{lat:6.9271,lng:79.8612}\n");
      out.write("      \n");
      out.write("  }\n");
      out.write("\n");
      out.write("  var map = new google.maps.Map(\n");
      out.write("      document.getElementById('map'), options);\n");
      out.write("\n");
      out.write("  var marker = new google.maps.Marker({\n");
      out.write("      position:{lat:6.9271,lng:79.8612},\n");
      out.write("      map:map\n");
      out.write("        });\n");
      out.write("        \n");
      out.write("infowindow = new google.maps.InfoWindow({\n");
      out.write("    content:\"<img src='Images/smt_1.jpg'><br/><b>Election Commission,</b><br/>Sarana Rd,<br/>Sri Jayawardenepura Kotte 10107,</br>Sri Lanka\" });\n");
      out.write("    google.maps.event.addListener(marker, \"click\", function(){infowindow.open(map,marker);});infowindow.open(map,marker);\n");
      out.write("}\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("   \n");
      out.write("    <script async defer\n");
      out.write("    src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBKglFvtw9R39jMMckshWL25O7oRc9S7-0&callback=initMap\">\n");
      out.write("    </script>\n");
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
