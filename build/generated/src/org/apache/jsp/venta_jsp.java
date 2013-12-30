package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class venta_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>plantilla</title>\n");
      out.write("<link href=\"misestilos.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"Estilos/estilos.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"Estilos/estilosFormulario.css\" />\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("         function validar_formulario(){  \n");
      out.write("                alert(\"Compra realizada\");\n");
      out.write("                response.sendRedirect(\"anillos.jsp\");\n");
      out.write("                document.formularioProducto.submit();                                \n");
      out.write("         }\n");
      out.write("         \n");
      out.write("      \n");
      out.write("        </script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"fondobody\">\n");
      out.write("<table width=\"780\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("  <tr>\n");
      out.write("    <td><img src=\"Imagenes/bt.png\" alt=\"botones\" width=\"900\" height=\"30\" border=\"0\" usemap=\"#Encabezado\" /></td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("<table width=\"780\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"780\"><table width=\"900\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("        <tr>\n");
      out.write("          <td><img src=\"Imagenes/encabezadoG.jpg\" width=\"900\" height=\"169\" alt=\"Encabezado\" /></td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("    <img src=\"Imagenes/botonesEG.jpg\" alt=\"BotonesEncabezado\" width=\"900\" height=\"35\" border=\"0\" usemap=\"#Map\" /></td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("<table width=\"908\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" id=\"principal\">\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"207\" valign=\"top\" class=\"CeldaLateral\"><p>&nbsp;</p>\n");
      out.write("      <table width=\"193\" border=\"0\" cellspacing=\"10\" cellpadding=\"0\">\n");
      out.write("        <tr>\n");
      out.write("        <td><img src=\"Imagenes/anillos.jpg\" alt=\"btAnillos\" width=\"183\" height=\"26\" border=\"0\" usemap=\"#Map2\" /></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td><img src=\"Imagenes/collares.jpg\" alt=\"btCollares\" width=\"183\" height=\"26\" border=\"0\" usemap=\"#Map3\" /></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td><img src=\"Imagenes/aretes.jpg\" alt=\"btnAretes\" width=\"183\" height=\"26\" border=\"0\" usemap=\"#Map4\" /></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td><img src=\"Imagenes/pulceras.jpg\" alt=\"btnPulceras\" width=\"183\" height=\"26\" border=\"0\" usemap=\"#Map5\" /></td>\n");
      out.write("      </tr>\n");
      out.write("  </table></td>\n");
      out.write("    <td width=\"701\" valign=\"top\" class=\"CeldaPPAL\">\n");
      out.write("       \n");
      out.write("     \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <form name=\"formularioProducto\" method=\"POST\" action=\"Compra\" onsubmit=\"return validar_formulario()\" >\n");
      out.write("        \n");
      out.write("        <fieldset>\n");
      out.write("            <legend>Compra de Producto</legend>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td>Nombres: </td><td><input type=\"text\" name=\"nombre\"></td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td>Apellidos: </td><td><input type=\"text\" name=\"apellido\"></td>\n");
      out.write("            </tr>\n");
      out.write("              <tr>\n");
      out.write("                <td>Ciudad: </td><td><input type=\"text\" name=\"ciudad\"></td>\n");
      out.write("            </tr>\n");
      out.write("              <tr>\n");
      out.write("                <td>Direccion: </td><td><input type=\"text\" name=\"direccion\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Codigo postal</td><td><input type=\"text\" name=\"codigo_postal\"></td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td>e-mail: </td><td><input type=\"text\" name=\"correo\"></td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td>Celular: </td><td><input type=\"text\" name=\"celular\"></td>\n");
      out.write("            </tr> <tr>\n");
      out.write("                <td>Telefono: </td><td><input type=\"text\" name=\"telefono\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Nombre en tarjeta de credito: </td><td><input type=\"text\" name=\"nom_tarjeta\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Numero de tarjeta de credito: </td><td><input type=\"text\" name=\"num_tarjeta_credito\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Codigo CVV: </td><td><input type=\"text\" name=\"cogigo\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Expira en: </td><td><input type=\"text\" name=\"expira\" value=\"mm-aaaa\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <td></td><td><button type=\"submit\" formmethod=\"post\"  name=\"enviar\"  >Comprar</button></td>\n");
      out.write("            </tr>\n");
      out.write("            </form>\n");
      out.write("        </table>\n");
      out.write("        </fieldset>\n");
      out.write("          \n");
      out.write("    <p>&nbsp;</p></td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("  <table width=\"900\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("  <tr>\n");
      out.write("    <td><img src=\"Imagenes/bajo.jpg\" width=\"900\" height=\"35\" alt=\"aaaa\" /></td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("<map name=\"Map\" id=\"Map\">\n");
      out.write("  <area shape=\"rect\" coords=\"87,4,169,32\" href=\"index.jsp\" alt=\"Inicio\" />\n");
      out.write("  <area shape=\"rect\" coords=\"247,5,408,33\" href=\"Empresa.jsp\" alt=\"Empresa\" />\n");
      out.write("  <area shape=\"rect\" coords=\"471,5,578,34\" href=\"Servicios.jsp\" alt=\"Servicios\" />\n");
      out.write("  <area shape=\"rect\" coords=\"635,4,764,32\" href=\"Contacto.jsp\" alt=\"Contacto\" />\n");
      out.write("</map>\n");
      out.write("\n");
      out.write("<map name=\"Map2\" id=\"Map2\">\n");
      out.write("  <area shape=\"rect\" coords=\"-1,3,180,24\" href=\"Anillos.jsp\" alt=\"Anillos\" />\n");
      out.write("</map>\n");
      out.write("\n");
      out.write("<map name=\"Map3\" id=\"Map3\">\n");
      out.write("  <area shape=\"rect\" coords=\"3,1,181,25\" href=\"Collares.jsp\" alt=\"collares\" />\n");
      out.write("</map>\n");
      out.write("\n");
      out.write("<map name=\"Map4\" id=\"Map4\">\n");
      out.write("  <area shape=\"rect\" coords=\"3,1,182,29\" href=\"Aretes.jsp\" alt=\"Aretes\" />\n");
      out.write("</map>\n");
      out.write("\n");
      out.write("<map name=\"Map5\" id=\"Map5\">\n");
      out.write("  <area shape=\"rect\" coords=\"5,4,182,32\" href=\"Pulceras.jsp\" alt=\"Pulceras\" />\n");
      out.write("</map>\n");
      out.write("\n");
      out.write("<map name=\"Encabezado\" id=\"Encabezado\">\n");
      out.write("  <area shape=\"rect\" coords=\"710,7,799,30\" href=\"Registro.jsp\" />\n");
      out.write("  <area shape=\"rect\" coords=\"811,9,894,29\" href=\"Login.jsp\" alt=\"Login\" />\n");
      out.write("</map>\n");
      out.write("   \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    \n");
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
