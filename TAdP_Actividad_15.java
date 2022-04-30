
package tadp_actividad_15;

import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.SQLException
import java.sql.Statement        

import java.util.logging.Level;
import java.util.logging.Logger;
public class TAdP_Actividad_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/empleados,root,root");
            Statement sentencia = conexion.createStatement();
            ResultSet resultset = sentencia.executeQuery("select * from empleados");
            
            while(resultset.next()){
                
                System.out.println(resultset.getString("nomemp"));
                
            }
            
            resultset.close();
            sentencia.close();
            
            conexion.close();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TAdP_Actividad_15.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*
      
        */
    }
    
}
