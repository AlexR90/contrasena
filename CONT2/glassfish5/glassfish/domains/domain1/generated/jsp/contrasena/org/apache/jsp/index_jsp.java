package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      response.setHeader("X-Powered-By", "JSP/2.3");
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
      out.write("<html lang=\"es\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("                 \n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js\"></script>\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Roboto:400,300,100' rel='stylesheet' type='text/css'>\n");
      out.write("    <link href=\"css/index.css\" rel=\"stylesheet\">\n");
      out.write("    \n");
      out.write(" \n");
      out.write("  <title>Acceso</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"form\">\n");
      out.write("      \n");
      out.write("      <ul class=\"tab-group\">\n");
      out.write("        <li class=\"tab active\"><a href=\"#signup\">Registrarse</a></li>\n");
      out.write("        <li class=\"tab\"><a href=\"#login\">Accesar</a></li>\n");
      out.write("      </ul>\n");
      out.write("      \n");
      out.write("      <div class=\"tab-content\">\n");
      out.write("        <div id=\"signup\">   \n");
      out.write("          <h3>Registrarse para generar contraseñas</h3>\n");
      out.write("          \n");
      out.write("          <form action=\"/\" method=\"post\">\n");
      out.write("          <p class=\"tab\"><a href=\"#login\">Ya estoy registrado</a></p>\n");
      out.write("          <div class=\"top-row\">\n");
      out.write("            <div class=\"field-wrap\">\n");
      out.write("              <label>\n");
      out.write("                Usuario:<span class=\"req\">*</span>\n");
      out.write("              </label>\n");
      out.write("              <input type=\"text\" required autocomplete=\"off\" />\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("            <div class=\"field-wrap\">\n");
      out.write("              <label>\n");
      out.write("                Proveedor:<span class=\"req\">*</span>\n");
      out.write("              </label>\n");
      out.write("              <input type=\"text\"required autocomplete=\"off\"/>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"field-wrap\">\n");
      out.write("            <label>\n");
      out.write("              Correo:<span class=\"req\">*</span>\n");
      out.write("            </label>\n");
      out.write("            <input type=\"email\"required autocomplete=\"off\"/>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("          <div class=\"field-wrap\">\n");
      out.write("            <label>\n");
      out.write("              Password:<span class=\"req\">*</span>\n");
      out.write("            </label>\n");
      out.write("            <input type=\"password\"required autocomplete=\"off\"/>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("          <button type=\"submit\" class=\"button button-block\"/>Registrarse</button>\n");
      out.write("          \n");
      out.write("          </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"login\">   \n");
      out.write("          <h1>Bienvenido!</h1>\n");
      out.write("          \n");
      out.write("          <form action=\"/\" method=\"post\">\n");
      out.write("          \n");
      out.write("            <div class=\"field-wrap\">\n");
      out.write("            <label>\n");
      out.write("              Correo:<span class=\"req\">*</span>\n");
      out.write("            </label>\n");
      out.write("            <input type=\"email\"required autocomplete=\"off\"/>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("          <div class=\"field-wrap\">\n");
      out.write("            <label>\n");
      out.write("              Password:<span class=\"req\">*</span>\n");
      out.write("            </label>\n");
      out.write("            <input type=\"password\"required autocomplete=\"off\"/>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("          <p class=\"forgot\"><a href=\"#\">Olvido password?</a></p>\n");
      out.write("          \n");
      out.write("          <button class=\"button button-block\"/>Acceder</button>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div><!-- tab-content -->\n");
      out.write("      \n");
      out.write("</div> <!-- /form -->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("  <script src=\"js/index.js\"></script>\n");
      out.write("</html>    ");
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
