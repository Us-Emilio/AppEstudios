package videojuegos.Datos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import videojuegos.Modelo.Empresa;

/**
 *
 * @author Esther
 */
public class EmpresaBD {

    public static void insertEmpresaBD(Connection con, Empresa empresa) {
        Statement sentencia;

        try {
            sentencia = con.createStatement();
            String sql = "INSERT INTO Empresa VALUES ('" + empresa.getId() + "','" + empresa.getNumeroTrabajadores() + "','" + empresa.getNombreEmpresa() + "')";

            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void deleteEmpresaBD(Connection con, Empresa empresa) {
        Statement sentencia;

        try {
            sentencia = con.createStatement();
            String sqlStr = "DELETE FROM Empresa WHERE id = " + empresa.getId();
            sentencia.executeUpdate(sqlStr);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void modifyEmpresaBD(Connection con, Empresa e, Empresa nueva) {
        try {
            Statement sentencia;

            sentencia = con.createStatement();
        
            String sql = "update empresa set trabajadores='" + nueva.getNumeroTrabajadores() + "', nombre_empresa='" + nueva.getNombreEmpresa() + "' where id='" + e.getId() + "';";
            sentencia.executeUpdate(sql);
          
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
