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

/**
 *
 * @author ragde
 */
@WebServlet(name = "ModificarProducto", urlPatterns = {"/ModificarProducto"})
public class ModificarProducto extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           
             ResultSet rs;
             Statement stm;
             ServidorMySQL BD = new ServidorMySQL("joyeria");
             stm = BD.abrirBD();
             out.print("update productos set  nombre='"+request.getParameter("nombre")+"', imagen='ImagenesF/"+request.getParameter("imagen")+"', cantidad='"+request.getParameter("cantidad")+"', precio='"+request.getParameter("precio")+"', producto='"+request.getParameter("producto")+"', descripcion='"+request.getParameter("descripcion")+"' where id_producto='"+request.getParameter("idproducto")+"';");
             stm.executeUpdate("update productos set  nombre='"+request.getParameter("nombre")+"', imagen='ImagenesF/"+request.getParameter("imagen")+"', cantidad='"+request.getParameter("cantidad")+"', precio='"+request.getParameter("precio")+"', producto='"+request.getParameter("producto")+"', descripcion='"+request.getParameter("descripcion")+"' where id_producto='"+request.getParameter("idproducto")+"';");
            
              BD.cerrarBD();     
            
     response.sendRedirect("Administrador/Crearproducto.jsp");
        } catch (SQLException ex) {
            Logger.getLogger(ModificarProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (conectException ex) {
            Logger.getLogger(ModificarProducto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {            
            out.close();
        }
    }

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
