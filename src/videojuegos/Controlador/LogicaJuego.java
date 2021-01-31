package videojuegos.Controlador;

import videojuegos.Datos.DriverMySql;
import videojuegos.Modelo.Videojuego;

public class LogicaJuego {
    
    private static DriverMySql conn;
    
    public LogicaJuego(){
        conn = DriverMySql.getInstance();
    }
    
    public static void insertJuego(Videojuego e){
        
    }
    public static void modificaJuego(Videojuego e){
        
    }
    
    public static void eliminaJuego(Videojuego e){
        
    }
}
