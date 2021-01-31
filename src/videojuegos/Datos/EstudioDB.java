package videojuegos.Datos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import videojuegos.Modelo.Estudio;

public class EstudioDB {
    public static void insertEmpresaBD(Connection con, Estudio empresa) {
        Statement sentencia;

        try {
            sentencia = con.createStatement();
            String sql = "INSERT INTO Estudio VALUES ('" + empresa.getId_Estudio() + "','" 
                    + empresa.getEquiposDesarrollo() + "','" + empresa.getNombre()+ "','" + empresa.getEmpresa().getId() + "')";

            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void modificaEstudio(Connection con, Estudio estudio, Estudio nuevo){
        Statement sentencia;

        try {
            sentencia = con.createStatement();
        
            String sql = "UPDATE Estudio SET equipo_desarrollo='" + nuevo.getEquiposDesarrollo() 
                    + "', nombre_estudio='" + nuevo.getNombre() + "' where id='" + estudio.getId_Estudio() + "';";
            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void eliminaEstudio(Connection con, Estudio estudio){
        Statement sentencia;

        try {
            sentencia = con.createStatement();
            String sql = "DELETE FROM Estudio WHERE id = " + estudio.getId_Estudio();
            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
