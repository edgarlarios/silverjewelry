package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DBs.ServidorMySQL;
import java.sql.ResultSet;
import java.sql.Statement;

public final class Anillos_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  String producto= "Anillo"; 
  ResultSet rs;
    Statement stm;
    ServidorMySQL BD = new ServidorMySQL("joyeria");
    stm = BD.abrirBD();
    rs = stm.executeQuery("select * from productos where producto='"+producto+"'");
    //rs.next();
     //rs = stm.executeQuery("select * from productos ");

      out.write("\n");
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
      out.write("            \n");
      out.write("            function busquedaa(){\n");
      out.write("                if(document.busqueda.busqueda.value.length == ''){\n");
      out.write("                    alert(\"Debe ingresar el nombre del articulo\");\n");
      out.write("                    document.busqueda.busqueda.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("               \n");
      out.write("                document.busqueda.submit(); \n");
      out.write("                              \n");
      out.write("            }          \n");
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
      out.write("        \n");
      out.write("    <table align=\"center\" bgcolor=\"black\">\n");
      out.write("     <form name=\"busqueda\" method=\"POST\" action=\"busqueda.jsp\" onsubmit=\"return busquedaa()\" >   \n");
      out.write("        <tr>\n");
      out.write("            <td align=\"center\"><font color=\"white\"> Articulo</font><input type=\"text\" name=\"busqueda\"></td>\n");
      out.write("            <td><button type=\"submit\" formmethod=\"POST\"  name=\"buskar\">Buscar</button></td>\n");
      out.write("        </tr>    \n");
      out.write("      </form>\n");
      out.write("    </table>      \n");
      out.write("  &nbsp;  \n");
      out.write("   \n");

   HttpSession sesion = request.getSession();
   String id;
   id =(String) sesion.getAttribute("id_usuario");
       
    while(rs != null && rs.next()){
       float valor = Float.parseFloat(rs.getString("precio"));
       if(id != null){
          valor = valor * (float)0.85;
       }
       
       out.print("<fieldset>");
       out.print("<table width='660' border='0' align='center' cellpadding='0' cellspacing='6'>");
         out.print("<tr>");
           out.print("<td>&nbsp;</td>");  
           out.print("<td>"+ rs.getString("nombre")+"</td>"); 
           out.print("<td>&nbsp;</td>"); 
         out.print("</tr>");
       out.print("</table>");
       out.print("<table width='657' border='0' align='center' cellpadding='0' cellspacing='6'>");
         out.print("<tr>");
           out.print("<td width='150' height='100'><a href='producto.jsp?id_producto="+rs.getString("id_producto")+"'><img width='150' height='100' src="+ rs.getString("imagen")+"></a></td>");
           out.print("<td width='489' height='100'>"+ rs.getString("descripcion")+"</td>");
         out.print("</tr>");
       out.print("</table>");
       out.print("<table width='655' border='0' align='center' cellpadding='0' cellspacing='6'>");
         out.print("<tr>");
           out.print("<td width='273'>Cantidad disponible:"+ rs.getString("cantidad")+"</td>");
           out.print("<td width='88'>&nbsp;</td>");
           out.print("<td width='270'>Precio:"+valor+"</td>");
         out.print("</tr>");
       out.print("</table>");
       out.print("</fieldset>");
      }
      out.print("</td>");
      out.print("</tr>");
      out.print("</table>");  

      out.write("   \n");
      out.write("      \n");
      out.write("    </td>\n");
      out.write("   </tr>\n");
      out.write("</table>\n");
      out.write("  <table width=\"900\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("      \n");
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
      out.write("</body>\n");
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
