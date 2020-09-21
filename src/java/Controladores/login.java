
package Controladores;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.consultas;


public class login extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String correo = request.getParameter("correo");
        String pass = request.getParameter("pass");
        
        consultas cons = new consultas();
        
        if (cons.validacion(correo, pass) == 3){
            
            response.sendRedirect("principal.jsp");
            
        }else{
            //JOptionPane.showMessageDialog(null, "Error de ACCESO");
            response.sendRedirect("index.jsp");
        }
                
      
        
    }

  
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

  
  
}
