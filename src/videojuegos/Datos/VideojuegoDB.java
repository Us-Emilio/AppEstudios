package videojuegos.Datos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import videojuegos.Modelo.Videojuego;

public class VideojuegoDB {
    public static void insertEmpresaBD(Connection con, Videojuego empresa) {
        Statement sentencia;

        try {
            sentencia = con.createStatement();
            String sql = "INSERT INTO Videojuego VALUES ('" + empresa.getIdVideojuego() + "','" 
                    + empresa.getNumNiveles() + "','" + empresa.getNombreJuego() + "','" 
                    + empresa.getIdEmpresa() + "','" + empresa.getIdEstudio() + "')";

            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void modificaEstudio(Connection con, Videojuego estudio, Videojuego nuevo){
        Statement sentencia;

        try {
            sentencia = con.createStatement();
        
            String sql = "UPDATE Videojuego SET numero_niveles='" + nuevo.getNumNiveles() 
                    + "', nombre='" + nuevo.getNombreJuego() + "' where id='" + estudio.getIdVideojuego() + "';";
            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void eliminaEstudio(Connection con, Videojuego estudio){
        Statement sentencia;

        try {
            sentencia = con.createStatement();
            String sql = "DELETE FROM Videojuego WHERE id = " + estudio.getIdVideojuego();
            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
