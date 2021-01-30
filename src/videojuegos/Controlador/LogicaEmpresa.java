package videojuegos.Controlador;

import videojuegos.Datos.DriverMySql;
import videojuegos.Datos.EmpresaBD;
import videojuegos.Modelo.Empresa;

/**
 *
 * @author Esther
 */
public class LogicaEmpresa {

    public static void insertEmpresa(Empresa e) {
        DriverMySql conn = null;

        conn = DriverMySql.getInstance();

        EmpresaBD.insertEmpresaBD(conn.getInstance().getConnection(), e);
        conn.closeConnection();

    }
    
    
    public static void deleteEmpresa(Empresa e) 
    {
        DriverMySql conn = null;
        
      
            conn = DriverMySql.getInstance();
            EmpresaBD.deleteEmpresaBD(conn.getInstance().getConnection(), e);
            conn.closeConnection();
       
    } 
    
    
    
    public static void modifyEmpresaBD(Empresa e, Empresa nueva) 
    {
        DriverMySql conn = null;
        
      
         
            
            conn = DriverMySql.getInstance();
            EmpresaBD.modifyEmpresaBD(conn.getInstance().getConnection(), e, nueva);
            conn.closeConnection();
       
    //}
    }  

}
