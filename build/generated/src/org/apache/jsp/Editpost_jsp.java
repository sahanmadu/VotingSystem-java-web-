package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Editpost_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("       <link rel=\"stylesheet\" href=\"CSS/index.css\"/>\n");
      out.write("       <style>\n");
      out.write("           body{\n");
      out.write("               background-image: url('Images/signup.jpg');\n");
      out.write("               background-size: cover;\n");
      out.write("           }\n");
      out.write("       </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <div class=\"bg\">\n");
      out.write("<div class=\"container\">\n");
      out.write("\t<br><br>\n");
      out.write("\t<h1 class=\"text-center text-white font-weight-bold\">UPDATE DETAILS</h1>\n");
      out.write("         ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("       \n");
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${getNewById}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("p");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t<div class=\"col-lg-8-m-auto d-block\">\n");
          out.write("            \n");
          out.write("\t\t<form class=\"bg-info text-white\" action=\"ManageEditVoter.jsp\" method=\"POST\">\n");
          out.write("                    <div class=\"form-group\">\n");
          out.write("\t\t\t\t\n");
          out.write("\t\t\t            <input type=\"hidden\" name=\"id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">  \n");
          out.write("\t\t\t\t\n");
          out.write("\t\t\t\t\n");
          out.write("\t\t\t</div>\n");
          out.write("\t\t\t<div class=\"form-group\">\n");
          out.write("\t\t\t\t<label class=\"text-white font-weight-bold\">NIC</label>\n");
          out.write("                                <input type=\"text\" name=\"hid\" id=\"nic\" class=\"form-control\" autocomplete=\"off\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.nic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("\t\t\t\t<span id=\"hid1\" class=\"text-danger font-weight-bold\"></span>\n");
          out.write("\t\t\t\t\n");
          out.write("\t\t\t</div>\n");
          out.write("\t\t\t<div class=\"form-group\">\n");
          out.write("\t\t\t\t<label class=\"text-white font-weight-bold\">FULL NAME</label>\n");
          out.write("                                <input type=\"text\" name=\"hname\" id=\"fname\" class=\"form-control\" autocomplete=\"off\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("\t\t\t\t<span id=\"hname1\" class=\"text-danger font-weight-bold\"></span>\n");
          out.write("\t\t\t\t\n");
          out.write("\t\t\t</div>\n");
          out.write("\t\t\t<div class=\"form-group\">\n");
          out.write("\t\t\t\t<label class=\"text-white font-weight-bold\">ADDRESS</label>\n");
          out.write("                                <input type=\"text\" name=\"haddress\" id=\"vaddress\" class=\"form-control\" autocomplete=\"off\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("\t\t\t\t<span id=\"haddress1\" class=\"text-danger font-weight-bold\"></span>\n");
          out.write("\t\t\t\t\n");
          out.write("\t\t\t</div>\n");
          out.write("\t\t\t\t<div class=\"form-group\">\n");
          out.write("\t\t\t\t<label class=\"text-white font-weight-bold\">EMAIL</label>\n");
          out.write("                                <input type=\"text\" name=\"hemail\" id=\"hospitalemail\" class=\"form-control\" autocomplete=\"off\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("\t\t\t\t<span id=\"hemail1\" class=\"text-danger font-weight-bold\"></span>\n");
          out.write("\t\t\t\t\n");
          out.write("\t\t\t</div>\n");
          out.write("                        <div class=\"form-group\">\n");
          out.write("\t\t\t\t<label class=\"text-white font-weight-bold\">DISTRICT</label>\n");
          out.write("                                <select class=\"mdb-select md-form\" id=\"dist\" name=\"district\">\n");
          out.write("                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.district}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.district}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </option>\n");
          out.write("                                  \n");
          out.write("                                     <option  value=\"Ampara\">Ampara</option>\n");
          out.write("                                      <option  value=\"Badulla\">Badulla</option>\n");
          out.write("                                       <option  value=\"Batticaloa\">Batticaloa</option>\n");
          out.write("                                       <option  value=\"Colombo\">Colombo</option>\n");
          out.write("                                      <option  value=\"Galle\">Galle</option>\n");
          out.write("                                       <option  value=\"Gampaha\">Gampaha</option>\n");
          out.write("                                       <option  value=\"Hambantota\">Hambantota</option>\n");
          out.write("                                      <option  value=\"Jaffna\">Jaffna</option>\n");
          out.write("                                       <option  value=\"Kaluthara\">Kaluthara</option>\n");
          out.write("                                       <option  value=\"Kandy\">Kandy</option>\n");
          out.write("                                      <option  value=\"Kagalle\">Kagalle</option>\n");
          out.write("                                       <option  value=\"Kilinochchi\">Kilinochchi</option>\n");
          out.write("                                       <option  value=\"Kurunegala\">Kurunegala</option>\n");
          out.write("                                      <option  value=\"Mannar\">Mannar</option>\n");
          out.write("                                       <option  value=\"Matale\">Matale</option>\n");
          out.write("                                        <option  value=\"Matara\">Matara</option>\n");
          out.write("                                       <option  value=\"Moneragala\">Moneragala</option>\n");
          out.write("                                       <option  value=\"Mullaitivu\">Mullaitivu</option>\n");
          out.write("                                      <option  value=\"Nuwara Eliya\">Nuwara Eliya</option>\n");
          out.write("                                       <option  value=\"Plonnaruwa\">Polonnaruwa</option>\n");
          out.write("                                        <option  value=\"Puttalam\">Puttalam</option>\n");
          out.write("                                       <option  value=\"Ratnapura\">Ratnapura</option>\n");
          out.write("                                      <option  value=\"Trincomalee\">Trincomalee</option>\n");
          out.write("                                       <option  value=\"Vavuniya\">Vavuniya</option>\n");
          out.write("                                </select>\n");
          out.write("\t\t\t\t<span id=\"hroom\" class=\"text-danger font-weight-bold\"></span>\n");
          out.write("\t\t\t\t\n");
          out.write("\t\t\t</div>\n");
          out.write("                                     \n");
          out.write("                          <div class=\"form-group\">\n");
          out.write("\t\t\t\t<label class=\"text-white font-weight-bold\">USERNAME</label>\n");
          out.write("\t\t\t\t<input type=\"text\" name=\"uname\" id=\"hospitaluname\" class=\"form-control\" autocomplete=\"off\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("\t\t\t\t<span id=\"huname\" class=\"text-danger font-weight-bold\"></span>\n");
          out.write("\t\t\t\t\n");
          out.write("\t\t\t</div>\n");
          out.write("        \n");
          out.write("                        <div class=\"form-group\">\n");
          out.write("\t\t\t\t<label class=\"text-white font-weight-bold\">PASSWORD</label>\n");
          out.write("\t\t\t\t<input type=\"password\" name=\"pwd\" id=\"hospitalpwd\" class=\"form-control\" autocomplete=\"off\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.pwd}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("\t\t\t\t<span id=\"hpwd\" class=\"text-danger font-weight-bold\"></span>\n");
          out.write("\t\t\t\t\n");
          out.write("\t\t\t</div>\n");
          out.write("                            \n");
          out.write("                         <div class=\"form-group\">\n");
          out.write("\t\t\t\t<label class=\"text-white font-weight-bold\">CONFIRM PASSWORD</label>\n");
          out.write("\t\t\t\t<input type=\"password\" name=\"cpwd\" id=\"hospitalcpwd\" class=\"form-control\" autocomplete=\"off\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.cpwd}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("\t\t\t\t<span id=\"hcpwd\" class=\"text-danger font-weight-bold\"></span>\n");
          out.write("\t\t\t\t\n");
          out.write("\t\t\t</div>            \n");
          out.write("                        <div class=\"form-group\">\n");
          out.write("\t\t\t\t<label class=\"text-white font-weight-bold\">TELEPHONE NO</label>\n");
          out.write("                                <input type=\"text\" name=\"htele\" id=\"teleno\" class=\"form-control\" autocomplete=\"off\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.tele}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("\t\t\t\t<span id=\"hno\" class=\"text-danger font-weight-bold\" ></span>\n");
          out.write("\t\t\t\t\n");
          out.write("\t\t\t</div>\n");
          out.write("\t\t\t  <input type=\"submit\" name=\"submit\"  value=\"Update\" class=\"btn btn-success\">\n");
          out.write("                          <button class=\"btn btn-success\"><a href=\"Allposts\"></a>Cancel</button>\n");
          out.write("\t\t</form>\n");
          out.write("\t\t\n");
          out.write("\t</div>\n");
          out.write("          ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
