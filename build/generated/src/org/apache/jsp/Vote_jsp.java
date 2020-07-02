package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Vote_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            img{\n");
      out.write("                width: 180px;\n");
      out.write("                height: 200px;\n");
      out.write("            }\n");
      out.write("            table{\n");
      out.write("                margin-left: 420px;\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("            label{\n");
      out.write("                font-weight: bold;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            h2{\n");
      out.write("                text-align: center;\n");
      out.write("                color: lightcyan;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("             h1{\n");
      out.write("                text-align: center;\n");
      out.write("                color: yellow;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #btn1{\n");
      out.write("                margin-left: 420px;\n");
      out.write("                padding: 0px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            body{\n");
      out.write("                background-image: url('Images/back.jpg');\n");
      out.write("            }\n");
      out.write("            #btn2{\n");
      out.write("                float:right;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <button class=\"btn btn-danger\" id=\"btn2\"><a href=\"home.jsp\">Log out</a></button>\n");
      out.write("          <button class=\"btn btn-success\" id=\"btn2\"><a href=\"Chat.jsp\">Chat with others</a></button>\n");
      out.write("        <h1>Presidential Election 2020</h1>\n");
      out.write("       \n");
      out.write("        <<form action=\"Addvote.jsp\" method=\"POST\" onsubmit=\"return mynew()\" name=\"form1\">\n");
      out.write("        <h2>PARTIES</h2>\n");
      out.write("        <table border=\"0\" cellpadding=\"8\"> \n");
      out.write("            <tr>\n");
      out.write("                <td><label>Mahinda Rajapaksha</label></td>\n");
      out.write("               <td><label>Anura Kumara</label></td>\n");
      out.write("                <td><label>Ranil Wikramasinhe</label></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                  <td><img src=\"Images/mahinda.jpg\"></td>\n");
      out.write("                 <td><img src=\"Images/anura.jpg\"></td>\n");
      out.write("                  <td><img src=\"Images/ranil.jpg\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                  <td><input type=\"radio\"  name=\"candi\" value=\"mahinda\" ></td>\n");
      out.write("                  <td><input type=\"radio\"  name=\"candi\" value=\"anura\" ></td>\n");
      out.write("                  <td> <input type=\"radio\"  name=\"candi\" value=\"ranil\" ></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <br>\n");
      out.write("         <h2>CANDIDATES</h2>\n");
      out.write("           <table border=\"0\" cellpading=\"10\"> \n");
      out.write("            <tr>\n");
      out.write("                <td><label>SLTP</label></td>\n");
      out.write("               <td><label>JVP</label></td>\n");
      out.write("                <td><label>UNP</label></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                  <td><img src=\"Images/mahi.png\"></td>\n");
      out.write("                 <td><img src=\"Images/JVP1.jpg\"></td>\n");
      out.write("                  <td><img src=\"Images/unp.png\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                  <td><input type=\"radio\"  name=\"partie\" value=\"sltp\"</td>\n");
      out.write("                  <td> <input type=\"radio\"  name=\"partie\" value=\"jvp\" ></td>\n");
      out.write("                  <td> <input type=\"radio\"  name=\"partie\" value=\"unp\" ></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("         <br><br>\n");
      out.write("         <input type=\"submit\" value=\"Vote Here\" id=\"btn1\" class=\"btn btn-success\">\n");
      out.write("         <input type=\"reset\" value=\"Cancel\" id=\"btn1\" class=\"btn btn-success\">\n");
      out.write("     </form> \n");
      out.write("        \n");
      out.write("         <script src=\"js/Electionvali.js\"></script>\n");
      out.write("      \n");
      out.write("              \n");
      out.write("        \n");
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
