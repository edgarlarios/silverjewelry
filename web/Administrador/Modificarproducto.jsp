
<%@page import="DBs.ServidorMySQL"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%  
    int id = Integer.parseInt(request.getParameter("id_producto"));

    ResultSet rs;
    Statement stm;
    ServidorMySQL BD = new ServidorMySQL("joyeria");
    stm = BD.abrirBD();
    rs = stm.executeQuery("select * from productos where id_producto='"+request.getParameter("id_producto")+"'");
    rs.next();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>plantilla</title>
<link href="misestilos.css" rel="stylesheet" type="text/css" />
<link href="../Estilos/estilos.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="../Estilos/estilosFormulario.css" />

<script>
         function validar_formulario(){  
                alert("Guardando producto");
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

<body >

        <form name="formularioProducto" method="POST" action="../ModificarProducto" onsubmit="return validar_formulario()" >
        
        <fieldset>
            <legend>Nuevo Producto</legend>
        <table>
            <tr>
                <td>Nombre: </td><td><%="<input type='text' name='nombre' value='"+rs.getString("nombre")+"'>"%></td>
            </tr>
             <tr>
                <td>Foto URL: </td><td><%="<input type='file' name='imagen' value='"+rs.getString("imagen")+"'>"%></td>
            </tr>
            <tr>
                <td>Cantidad: </td><td><%="<input type='text' name='cantidad' value='"+rs.getString("cantidad")+"'>"%></td>
            </tr>
            <tr>
                <td>Precio: </td><td><%="<input type='text' name='precio' value='"+rs.getString("precio")+"'>"%></td>
            </tr>
            <tr>
                <td>T. Producto: </td><td><select  name="producto">
                <option value="Arete">Arete(s)</option>
                <option value="Anillo">Anillo(s)</option>
                <option value="Collar">Collar(es)</option>
                <option value="Pulcera">Pulcera(s)</option>
                </select></td>
            </tr>
            <tr> 
                <td>Descripcion: </td><td><textarea type="text" name="descripcion" rows="10" cols="40">Escribe aqui la descripcion del producto </textarea>
                </td>
            </tr>
            <input type="hidden" name="idproducto" value=<%= id %>> 
            <td></td><td><button type="submit" formmethod="post"  name="enviar"  >Guardar</button></td>
            </tr>
            </form>
        </table>
        </fieldset>
          
    
   
</body>
</html>
</body>
</html>
