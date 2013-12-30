<%@page import="DBs.ServidorMySQL"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
   
  ResultSet rs;
    Statement stm;
    ServidorMySQL BD = new ServidorMySQL("joyeria");
    stm = BD.abrirBD();
    rs = stm.executeQuery("select * from productos where nombre='"+request.getParameter("busqueda")+"' or precio='"+request.getParameter("busqueda")+"'");
   
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>plantilla</title>
<link href="misestilos.css" rel="stylesheet" type="text/css" />
<link href="Estilos/estilos.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="Estilos/estilosFormulario.css" />

<script>
            
            function busquedaa(){
                if(document.busqueda.busqueda.value.length == ''){
                    alert("Debe ingresar el nombre del articulo");
                    document.busqueda.busqueda.focus();
                    return false;
                }
               
                document.busqueda.submit(); 
                              
            }          
        </script>
</head>

<body class="fondobody">
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td><img src="Imagenes/bt.png" alt="botones" width="900" height="30" border="0" usemap="#Encabezado" /></td>
  </tr>
</table>
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td width="780"><table width="900" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td><img src="Imagenes/encabezadoG.jpg" width="900" height="169" alt="Encabezado" /></td>
        </tr>
    </table>
    <img src="Imagenes/botonesEG.jpg" alt="BotonesEncabezado" width="900" height="35" border="0" usemap="#Map" /></td>
  </tr>
</table>
<table width="908" border="0" align="center" cellpadding="0" cellspacing="0" id="principal">
  <tr>
    <td width="207" valign="top" class="CeldaLateral"><p>&nbsp;</p>
      <table width="193" border="0" cellspacing="10" cellpadding="0">
        <tr>
        <td><img src="Imagenes/anillos.jpg" alt="btAnillos" width="183" height="26" border="0" usemap="#Map2" /></td>
      </tr>
      <tr>
        <td><img src="Imagenes/collares.jpg" alt="btCollares" width="183" height="26" border="0" usemap="#Map3" /></td>
      </tr>
      <tr>
        <td><img src="Imagenes/aretes.jpg" alt="btnAretes" width="183" height="26" border="0" usemap="#Map4" /></td>
      </tr>
      <tr>
        <td><img src="Imagenes/pulceras.jpg" alt="btnPulceras" width="183" height="26" border="0" usemap="#Map5" /></td>
      </tr>
  </table></td>
    <td width="701" valign="top" class="CeldaPPAL">
        
    <table align="center" bgcolor="black">
     <form name="busqueda" method="POST" action="busqueda.jsp" onsubmit="return busquedaa()" >   
        <tr>
            <td align="center"><font color="white"> Articulo</font><input type="text" name="busqueda"></td>
            <td><button type="submit" formmethod="POST"  name="buskar">Buscar</button></td>
        </tr>    
      </form>
    </table>      
  &nbsp;  
   
<%
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
%>   
      
    </td>
   </tr>
</table>
  <table width="900" border="0" align="center" cellpadding="0" cellspacing="0">
      
  <tr>
    <td><img src="Imagenes/bajo.jpg" width="900" height="35" alt="aaaa" /></td>
  </tr>
</table>
<map name="Map" id="Map">
  <area shape="rect" coords="87,4,169,32" href="index.jsp" alt="Inicio" />
  <area shape="rect" coords="247,5,408,33" href="Empresa.jsp" alt="Empresa" />
  <area shape="rect" coords="471,5,578,34" href="Servicios.jsp" alt="Servicios" />
  <area shape="rect" coords="635,4,764,32" href="Contacto.jsp" alt="Contacto" />
</map>

<map name="Map2" id="Map2">
  <area shape="rect" coords="-1,3,180,24" href="Anillos.jsp" alt="Anillos" />
</map>

<map name="Map3" id="Map3">
  <area shape="rect" coords="3,1,181,25" href="Collares.jsp" alt="collares" />
</map>

<map name="Map4" id="Map4">
  <area shape="rect" coords="3,1,182,29" href="Aretes.jsp" alt="Aretes" />
</map>

<map name="Map5" id="Map5">
  <area shape="rect" coords="5,4,182,32" href="Pulceras.jsp" alt="Pulceras" />
</map>

<map name="Encabezado" id="Encabezado">
  <area shape="rect" coords="710,7,799,30" href="Registro.jsp" />
  <area shape="rect" coords="811,9,894,29" href="Login.jsp" alt="Login" />
</map>
</body>
</html>
<%
    
%>