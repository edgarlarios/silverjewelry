<%@page import="DBs.ServidorMySQL"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%
    HttpSession sesion = request.getSession();
    String id;
    id =(String) sesion.getAttribute("id_usuario");
    if(id != null){
        
        
    
  
    ResultSet rs;
    Statement stm;
    ServidorMySQL BD = new ServidorMySQL("joyeria");
    stm = BD.abrirBD();
    rs = stm.executeQuery("select * from productos");
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>plantilla</title>
<link href="misestilos.css" rel="stylesheet" type="text/css" />
<link href="../Estilos/estilos.css" rel="stylesheet" type="text/css" />

<script>
       function validar_formulario(){         
                alert("Los datos seran enviados");
                document.formularioProducto.submit();                                
            }
            
         function Eliminar(){
            window.open('Eliminarproducto.jsp',"ventana javascript","toolbar=no, resizable=no, width=280, height=150, scrollbar=no, status=no");
            return false;    
        }
        
        function Modificar(){
            window.open('idprodmodificar.jsp',"ventana javascript","toolbar=no, resizable=no, width=280, height=150, scrollbar=no, status=no");
            return false;    
        }
        </script>
</head>

<body class="fondobody">
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td><img src="../Imagenes/bt.png" alt="botones" width="900" height="30" border="0" usemap="#Encabezado" /></td>
  </tr>
</table>
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td width="780"><table width="900" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td><img src="../Imagenes/encabezadoG.jpg" width="900" height="169" alt="Encabezado" /></td>
        </tr>
    </table>
    <img src="../Imagenes/botonesEG.jpg" alt="BotonesEncabezado" width="900" height="35" border="0" usemap="#Map" /></td>
  </tr>
</table>
<table width="908" border="0" align="center" cellpadding="0" cellspacing="0" id="principal">
  <tr>
    <td width="207" valign="top" class="CeldaLateral"><p>&nbsp;</p>
      <table width="193" border="0" cellspacing="10" cellpadding="0">
        <tr>
        <td><img src="../Imagenes/anillos.jpg" alt="btAnillos" width="183" height="26" border="0" usemap="#Map2" /></td>
      </tr>
      <tr>
        <td><img src="../Imagenes/collares.jpg" alt="btCollares" width="183" height="26" border="0" usemap="#Map3" /></td>
      </tr>
      <tr>
        <td><img src="../Imagenes/aretes.jpg" alt="btnAretes" width="183" height="26" border="0" usemap="#Map4" /></td>
      </tr>
      <tr>
        <td><img src="../Imagenes/pulceras.jpg" alt="btnPulceras" width="183" height="26" border="0" usemap="#Map5" /></td>
      </tr>
  </table></td>
    <td width="701" valign="top" class="CeldaPPAL">
       
        <table width="634" border="0" align="center" cellpadding="0" cellspacing="10">
        <tr>
          <td width="221"><img src="../Imagenes/CrearProducto.jpg" alt="Crear" width="190" height="35" border="0" usemap="#Map6" /></td>
          <td width="221"><img src="../Imagenes/ModificarProducto.jpg" alt="Modificar" width="190" height="35" border="0" usemap="#Map7" /></td>
          <td width="187"><img src="../Imagenes/EliminarProducto.jpg" alt="Eliminar" width="190" height="35" border="0" usemap="#Map8" /></td>
       </tr>     
      </table>
        <table width="373" border="0" align="center" cellpadding="0" cellspacing="6">
        <tr>
          <td width="184"><img src="../Imagenes/productos.png" alt="productos" width="130" height="30" border="0" usemap="#Map9" /></td>
          <td width="7">&nbsp;</td>
          <td width="173"><img src="../Imagenes/Cerrarsesion.png" alt="cerrar" width="130" height="30" border="0" usemap="#Map10" /></td>
        </tr>
      </table>
        
        <table width="670" border="0" align="center" cellpadding="0" cellspacing="3" class="bordeTabla">
        <tr>
          <td width="70">ID</td>
          <td width="150">Nombre</td>
          <td>Descripcion</td>
          <td width="100">Precio</td>
        </tr>
      </table>
      
  <%
       while(rs != null && rs.next()){ 
        out.print("<table width='670' border='0' align='center' cellpadding='0' cellspacing='3' class='bordeTabla'>");
        out.print("<tr>");
          out.print("<td width='70'>"+ rs.getString("id_producto")+"</td>");
          out.print("<td width='150'>"+ rs.getString("nombre")+"</td>");
          out.print("<td>"+ rs.getString("descripcion")+"</td>");
          out.print("<td width='100'>"+ rs.getString("precio")+"</td>");
        out.print("</tr>");
      out.print("</table>");
       }
 %>
        
        
        
        
        
          
    <p>&nbsp;</p></td>
  </tr>
</table>
  <table width="900" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td><img src="../Imagenes/bajo.jpg" width="900" height="35" alt="aaaa" /></td>
  </tr>
</table>
<map name="Map" id="Map">
  <area shape="rect" coords="87,4,169,32" href="../index.jsp" alt="Inicio" />
  <area shape="rect" coords="247,5,408,33" href="../Empresa.jsp" alt="Empresa" />
  <area shape="rect" coords="471,5,578,34" href="../Servicios.jsp" alt="Servicios" />
  <area shape="rect" coords="635,4,764,32" href="../Contacto.jsp" alt="Contacto" />
</map>

<map name="Map2" id="Map2">
  <area shape="rect" coords="-1,3,180,24" href="../Anillos.jsp" alt="Anillos" />
</map>

<map name="Map3" id="Map3">
  <area shape="rect" coords="3,1,181,25" href="../Collares.jsp" alt="collares" />
</map>

<map name="Map4" id="Map4">
  <area shape="rect" coords="3,1,182,29" href="../Aretes.jsp" alt="Aretes" />
</map>

<map name="Map5" id="Map5">
  <area shape="rect" coords="5,4,182,32" href="../Pulceras.jsp" alt="Pulceras" />
</map>

<map name="Encabezado" id="Encabezado">
  <area shape="rect" coords="710,7,799,30" href="../Registro.jsp" />
  <area shape="rect" coords="811,9,894,29" href="../Login.jsp" alt="Login" />
</map>

<map name="Map6" id="Map6">
  <area shape="rect" coords="3,3,195,45" href="Crearproducto.jsp" target="_parent" />
</map>

<map name="Map7" id="Map7">
  <area shape="rect" coords="4,2,194,36" onclick="Modificar()" href="Productos.jsp" target="_parent" />
</map>

<map name="Map8" id="Map8">
  <area shape="rect" coords="4,1,196,40" onclick="Eliminar()" href="Productos.jsp" target="_parent" />
</map>
<map name="Map9" id="Map9">
  <area shape="rect" coords="3,2,133,34" href="Productos.jsp" target="_parent" />
</map>

<map name="Map10" id="Map10">
  <area shape="rect" coords="4,1,133,34" href="Productos.jsp" target="_parent" />
</map>

   
</body>
</html>

    
<%
    }
    else{
%>
    <h1>Usuario no valido</h1>
<%
  
   }
%>
</body>
</html>
