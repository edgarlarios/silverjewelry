<%-- 
    Document   : index
    Created on : 27/11/2012, 11:21:51 PM
    Author     : ragde
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>plantilla</title>
<link href="misestilos.css" rel="stylesheet" type="text/css" />
<link href="Estilos/estilos.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="Estilos/estilosFormulario.css" />

<script>
            function validar_formulario(){
                
                if((document.formularioUsuario.nombre.value.length>30)||(document.formularioUsuario.nombre.value.length=='')){
                    alert("debe ingresar su nombre");
                    document.formularioUsuario.nombre.focus();
                    return false; 
                    }
                                    
                if(document.formularioUsuario.apellido_paterno.value.length==0){
                    alert("debe ingresar su apellido paterno");
                    document.formularioUsuario.apellido_paterno.focus();
                    return false;
                }
                
                if(document.formularioUsuario.apellido_materno.value.length==0){
                    alert("debe ingresar su apellido materno");
                    document.formularioUsuario.apellido_materno.focus();
                    return false;
                }
                
                if(document.formularioUsuario.correo.value.length==0){
                    alert("debe ingresar un correo");
                    document.formularioUsuario.correo.focus();
                    return false;
                }
                
                if(document.formularioUsuario.password1.value.length==0){
                    alert("debe ingresar la confirmacion de contraseña");
                    document.formularioUsuario.password1.focus();
                    return false;
                }
                
                alert("Los datos seran enviados");
                document.formularioUsuario.submit();                                
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
    <td width="207" valign="top" class="CeldaLateral"><p>&nbsp;&nbsp;</p>
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
    <td width="701" valign="top" class="CeldaPPAL">&nbsp;
    
     <form name="formularioUsuario" method="POST" action="nuevoUsuario" onsubmit="return validar_formulario()" >
        
        <fieldset>
            <legend>Registro usuario</legend>
        <table>
            <tr>
                <td>Nombre: </td><td><input type="text" name="nombre"></td>
            </tr>
            <tr>
                <td>Apellido paterno: </td><td><input type="text" name="apellido_paterno"></td>
            </tr>
            <tr>
                <td>Apellido materno: </td><td><input type="text" name="apellido_materno"></td>
            </tr>
            <tr>
                <td>Correo: </td><td><input type="text" name="correo"></td>
            </tr>
            <tr>
                <td>Contraseña: </td><td><input type="password" name="password1"></td>
            </tr>
            <tr>
                <td>Tipo usuario: </td> <td><select name="tipo_usuario">
                        <option value="Administrador"> Administrador(a)</option>
                        <option value="Cliente"> Cliente(a)</option>
                    </select></td>
            </tr>
           
            <tr>
            <br>
            <td></td><td><button type="submit" formmethod="post"  name="enviar"  >Registrar</button></td>
            </tr>
            </form>
        </table>
        </fieldset>    
    
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
