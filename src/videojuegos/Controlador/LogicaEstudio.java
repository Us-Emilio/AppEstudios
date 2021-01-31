package videojuegos.Controlador;

import java.util.ArrayList;
import videojuegos.Datos.DriverMySql;
import videojuegos.Datos.EmpresaBD;
import videojuegos.Datos.EstudioDB;
import videojuegos.Modelo.Empresa;
import videojuegos.Modelo.Estudio;

public class LogicaEstudio {

    private static DriverMySql conn = DriverMySql.getInstance();

    public static ArrayList<Estudio> getEstudios() {
        ArrayList<Estudio> ret = null;

        conn = DriverMySql.getInstance();
        ret = EstudioDB.listaEstudios(conn.getConnection());
        conn.closeConnection();

        return ret;
    }

    public static void insertaEstudio(Estudio e) {
        EstudioDB.insertEmpresaBD(conn.getConnection(), e);
        conn.closeConnection();
    }

    public static void modEstudio(Estudio e) {
        EstudioDB.modificaEstudio(conn.getConnection(), e);
        conn.closeConnection();
    }

    public static void delEstudio(Estudio e) {
        EstudioDB.eliminaEstudio(conn.getConnection(), e);
        conn.closeConnection();
    }
}
