<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="../Estilos/estilosFormulario.css" />
<title>plantilla</title>


<script>
function validar_formulario(){            
                alert("Producto eliminado");
                document.EliminarProducto.submit();                                
            }
        </script>

</head>

<body>

     
        
        <form name="EliminarProducto" method="POST" action="../EliminarProducto" onsubmit="return validar_formulario()" >
        
        <fieldset>
            <legend>Eliminar Producto</legend>
        
            <tr> 
                <td>ID reporte: </td><td><input type="text" name="id_producto">
                </td>
            </tr>
            <td> </td> <td> <button type="submit" formmethod="post"  name="enviar"  >Eliminar</button></td>
            </tr>
            </form>
        </table>
        </fieldset>
            
            
</body>
</html>
