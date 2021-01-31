package videojuegos.Modelo;

import java.util.Scanner;
import videojuegos.Vista.Videojuegos;

public class Videojuego {

    private int IdVideojuego;
    private int NumNiveles;
    private String NombreJuego;
    private int IdEmpresa;
    private int IdEstudio;

    public Videojuego(int IdVideojuego, int NumNiveles, String NombreJuego, int IdEmpresa, int IdEstudio) {
        this.IdVideojuego = IdVideojuego;
        this.NumNiveles = NumNiveles;
        this.NombreJuego = NombreJuego;
        this.IdEmpresa = IdEmpresa;
        this.IdEstudio = IdEstudio;
    }

    public Videojuego() {

    }

    //<editor-fold defaultstate="collapsed" desc="Geters y seters">
    public int getIdVideojuego() {
        return IdVideojuego;
    }

    public void setIdVideojuego(int IdVideojuego) {
        this.IdVideojuego = IdVideojuego;
    }

    public int getNumNiveles() {
        return NumNiveles;
    }

    public void setNumNiveles(int NumNiveles) {
        this.NumNiveles = NumNiveles;
    }

    public String getNombreJuego() {
        return NombreJuego;
    }

    public void setNombreJuego(String NombreJuego) {
        this.NombreJuego = NombreJuego;
    }

    public int getIdEmpresa() {
        return IdEmpresa;
    }

    public void setIdEmpresa(int IdEmpresa) {
        this.IdEmpresa = IdEmpresa;
    }

    public int getIdEstudio() {
        return IdEstudio;
    }

    public void setIdEstudio(int IdEstudio) {
        this.IdEstudio = IdEstudio;
    }
    //</editor-fold>

    public void datosVideojuego() {  //Pedimos los datos Implementamos el metodo de la interfaz
        Scanner sc = new Scanner(System.in);

        this.IdVideojuego = Videojuegos.pedirEntero("Introduce el ID de la Empresa");

        this.NumNiveles = Videojuegos.pedirEntero("Número de trabajadores:");

        System.out.println("Nombre de la Empresa: ");
        this.NombreJuego = sc.nextLine();
        /*
        System.out.println("A que empresa pertenece?");
        this.NumNiveles = Videojuegos.pedirEntero("Opcion: ");
        
        System.out.println("Que estudio lo desarrolla?");
        this.IdEstudio = Videojuegos.pedirEntero("Opcion: ");
        */

    }
}
