package videojuegos.Controlador;

import videojuegos.Datos.DriverMySql;
import videojuegos.Datos.VideojuegoDB;
import videojuegos.Modelo.Videojuego;

public class LogicaJuego {
    
    private static DriverMySql conn;
    
    public LogicaJuego(){
        conn = DriverMySql.getInstance();
    }
    
    public static void insertJuego(Videojuego e){
        VideojuegoDB.insertVideojuego(conn.getConnection(), e);
        conn.closeConnection();
    }
    public static void modificaJuego(Videojuego e, Videojuego j){
        VideojuegoDB.modificaVideojuego(conn.getConnection(), e, j);
        conn.closeConnection();
    }
    
    public static void eliminaVideojuego(Videojuego e){
        VideojuegoDB.insertVideojuego(conn.getConnection(), e);
        conn.closeConnection();
    }
}
