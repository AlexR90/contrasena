
package modelos;

import java.sql.Connection;
import java.sql.DriverManager;




public class conexion {
    Connection con;
    
    public Connection getConnection(){
        
        try{
           
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contrasena?useSSL=false","root", "234567ar");
        }catch(Exception e){
            System.out.println("Error de conexion "+ e);
        }
        return con;
    }

    

    
}
