
package modelos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class consultas extends conexion {
    
    public int validacion(String correo, String pass){
        int nivel=0;
        PreparedStatement pst = null;
        ResultSet result = null;
        
        try{
            
            String consulta = "select * from proveedor where correo = ? and pass = ?";
            pst = getConnection().prepareStatement(consulta);
            pst.setString(1, correo);
            pst.setString(2, pass);
            result = pst.executeQuery();
            
            if(result.absolute(1)){
               nivel = result.getInt("nivel");
                
                return nivel;
            }
        }catch(Exception e){
            System.err.print("Error "+e);
        }
        finally{
            try{
                if (getConnection() != null) getConnection().close();
                if (pst != null) pst.close();
                if (result != null) result.close();
                
            }catch(Exception e){
                System.err.print("Error "+ e);
            }
        }
        
        
        return 0;
    }
    
    public int registrar( String proveedor, int telefono, String correo, String pass){
        int nivel = 3;
        String estado = "alta";
        
        PreparedStatement pst = null;
        
        try{
            String consulta = "insert into proveedor (proveedor, telefono, correo, pass, estado, nivel) values(?,?,?,?,?,?)";
            pst = getConnection().prepareStatement(consulta);
     
            pst.setString(1, proveedor);
            pst.setInt(2, telefono);
            pst.setString(3, correo);
            pst.setString(4, pass);
            pst.setString(5, estado);
            pst.setInt(6, nivel);
            
            
            if (pst.executeUpdate() == 1 ){
                int usuario=0;
                      ResultSet result = null;
        
        try{
            
            String consulta2 = "select * from proveedor where correo = ?";
            pst = getConnection().prepareStatement(consulta2);
            pst.setString(1, correo);
         
            result = pst.executeQuery();
            
            if(result.absolute(1)){
               usuario = result.getInt("usuario");
                
                return usuario;
            }
        }catch(Exception e){
            System.err.print("Error "+e);
        }
        finally{
            try{
                if (getConnection() != null) getConnection().close();
                if (pst != null) pst.close();
                if (result != null) result.close();
                
            }catch(Exception e){
                System.err.print("Error "+ e);
            }
        }
                
                return 0;
                
            }
            
        }catch(Exception e){
            System.err.print("Error "+e);
        }finally{
            try{
                if(getConnection() != null ) getConnection().close();
                if(pst != null )pst.close();
                
            }catch(Exception e){
                System.err.print("Error "+ e);
            }
        }
        
        return 0;
    }
    
     public String recuperarpass(int nit){
        String correo = null;
        PreparedStatement pst = null;
        ResultSet result = null;
        
        try{
            
            String consulta = "select * from proveedor where nit = ? ";
            pst = getConnection().prepareStatement(consulta);
            pst.setInt(1, nit);
            result = pst.executeQuery();
            
            if(result.absolute(1)){
                correo = result.getString("correo");
                
                return correo;
            }
        }catch(Exception e){
            System.err.print("Error "+e);
        }
        finally{
            try{
                if (getConnection() != null) getConnection().close();
                if (pst != null) pst.close();
                if (result != null) result.close();
                
            }catch(Exception e){
                System.err.print("Error "+ e);
            }
        }
        
        
        return null;
    }
 public boolean insertcodigo(int nit, String codigo){
     
         PreparedStatement pst = null;
        
        try{
            String consulta = "insert into codigo (nit, codigo) values(?,?)";
            pst = getConnection().prepareStatement(consulta);
     
           
            pst.setInt(1, nit);
            pst.setString(2, codigo);
            
            
            
            if (pst.executeUpdate() == 1 ){
               
        
        
                return true;
                
            }
            
        }catch(Exception e){
            System.err.print("Error "+e);
        }finally{
            try{
                if(getConnection() != null ) getConnection().close();
                if(pst != null )pst.close();
                
            }catch(Exception e){
                System.err.print("Error "+ e);
            }
        }
        
       
     return false;
 }
    
 
}
