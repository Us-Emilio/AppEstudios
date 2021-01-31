package videojuegos.Controlador;

import videojuegos.Datos.DriverMySql;
import videojuegos.Datos.EstudioDB;
import videojuegos.Modelo.Estudio;

public class LogicaEstudio {
    
    private static DriverMySql conn;
    
    public static void insertaEstudio(Estudio e) {
        conn = DriverMySql.getInstance();
        EstudioDB.insertEmpresaBD(conn.getConnection(), e);
        conn.closeConnection();
    }
    public static void modEstudio(Estudio e, Estudio n) {
        EstudioDB.modificaEstudio(conn.getConnection(), e, n);
        conn.closeConnection();
    } 
    
    public static void delEstudio(Estudio e) {
        EstudioDB.eliminaEstudio(conn.getConnection(), e);
        conn.closeConnection();
    }
}
