/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBs;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet(name = "validarSesionCl", urlPatterns = {"/validarSesionCl"})
public class validarSesionCl extends HttpServlet {
    
    


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {

          ResultSet rs;
          Statement stm;
          ServidorMySQL BD = new ServidorMySQL("joyeria");
          stm = BD.abrirBD();
          rs = stm.executeQuery("select * from usuario where correo = '"+request.getParameter("correo1")+"' && password = '"+request.getParameter("password1")+"';");
          rs.next();
      
            String control = rs.getString("correo");
            String pass = rs.getString("password");
            
                
            if(control.equalsIgnoreCase(request.getParameter("correo1")) && pass.equalsIgnoreCase(request.getParameter("password1"))){
            
                HttpSession sesion = request.getSession();
                sesion.setAttribute("noControl",control);
                response.sendRedirect("Administrador/Crearproducto.jsp");
            }else{
              
                response.sendRedirect("index.jsp");
            }
           } catch (SQLException ex) {
            Logger.getLogger(validarSesion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (conectException ex) {
            Logger.getLogger(validarSesion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {            
            out.close();
        }
    } 
          
           /* String control = request.getParameter("ID_usuario1");
            String pass = request.getParameter("password1");
                     
            if(control.equalsIgnoreCase("123") && pass.equalsIgnoreCase("123")){
            
                HttpSession sesion = request.getSession();
                sesion.setAttribute("noControl",control);
                response.sendRedirect("Usuarios/CantPreguntas.jsp");
            }
        } finally {            
            out.close();
        }
    }  */

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
