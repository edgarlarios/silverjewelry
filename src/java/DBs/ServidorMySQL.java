/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
* <b>DESSA</b> - www.dessa.com<br>
* Descripcion: clase que representa el servidor Mysql
* @author <br>Gabriel Cisneros<br>
*/

public class ServidorMySQL{
    public String maquina="localhost";
    private  String puerto= "3306";
    public   String usuario="root";
    public   String password="";
    public  String bd="joyeria";
    public  Connection conexion=null;
    public  Statement stmt=null;

    /**
     * Establece la Bade de datos a ser conectado
     * @param bd a conectar
     * @throws conectrException
     */
    public ServidorMySQL(String bd) throws conectException
    {
        if(bd != null && (bd == null ? "" != null : !bd.equals("")))
            this.bd = bd;
        else
            throw new conectException("ServidorMysql - parametro");
    }

    /**
     * Abre conexion a la Base de datos
     * @throws conectrException
     */
    public Statement abrirBD() throws conectException
    {
        if(maquina != null && usuario != null && password != null && bd != null)
        {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conexion = DriverManager.getConnection("jdbc:mysql://" + maquina + ":" + puerto + "/" + bd , usuario, password);
                stmt = conexion.createStatement();
            } catch (SQLException ex) {
                throw new conectException("ServidorMysql - abrirDB - maquina,usuario,password,bd");
            } catch (ClassNotFoundException ex) {
                throw new conectException("ServidorMysql - abrirDB - maquina,usuario,password,bd");
            }
            return stmt;
        }else{
            throw new conectException("ServidorMysql - abrirDB");
        }
    }
    /**
     * Cierra conexion a la Base de datos
     * @throws conectrException
     */
    public  void cerrarBD() throws conectException
    {
        try {
            if (conexion != null) {
                conexion.close();              
            }
            conexion = null;
        } catch (SQLException ex) {
            throw new conectException("ServidorMysql - cerrarDB");
        }
    }
}
