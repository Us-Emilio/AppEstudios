/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuegos.Vista;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import videojuegos.Controlador.LogicaEmpresa;
import videojuegos.Controlador.LogicaEstudio;
import videojuegos.Controlador.LogicaJuego;
import videojuegos.Datos.DriverMySql;
import videojuegos.Modelo.Empresa;
import videojuegos.Modelo.Estudio;
import videojuegos.Modelo.Videojuego;

/**
 *
 * @author Kurin
 */
public class Videojuegos {

    /**
     * @param args the command line arguments
     */
    static Scanner in = new Scanner(System.in);
    static ArrayList<Empresa> empresas = new ArrayList<>();

    public static void main(String[] args) {

        menu();

    }

    public static void menu() {

        int opcion = 0;
        do {

            System.out.println("Sobre que tabla quiere incidir");
            System.out.println("1. Empresa");
            System.out.println("2. Videojuego");
            System.out.println("3. Estudio");
            System.out.println("0. Salir");

            opcion = pedirEntero("Introduce una opcion del menu");

            switch (opcion) {
                case 1:
                    operacionAefectuar(opcion);
                case 2:
                    operacionAefectuar(opcion);
                case 3:
                    operacionAefectuar(opcion);
            }

        } while (opcion != 0);
    }

    public static void operacionAefectuar(int clase) {

        int opcion;

        System.out.println("1. Insertar");
        System.out.println("2. Modificar");
        System.out.println("3. Eliminar");
        System.out.println("4. Listar contenido");

        opcion = pedirEntero("¿Qué operacion quieres efectuar?");

        try {
            switch (clase) {

                case 1:
                    switch (opcion) {
                        case 1:
                            Empresa e1 = new Empresa();
                            e1.datosEmpresa();
                            LogicaEmpresa.insertEmpresa(e1);
                            empresas.add(e1);
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            mostrarEmpresas();
                            break;
                    }
                    break;

                case 2:
                    switch (opcion) {
                        case 1:
                            //aun no va
                            Videojuego vi = new Videojuego();
                            LogicaJuego.insertJuego(vi);
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 3:
                    switch (opcion) {
                        case 1:
                            Estudio es = generaEstudio();
                            LogicaEstudio.insertaEstudio(es);
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                    }
                    break;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void mostrarEmpresas() {
        for (Empresa e : empresas) {
            if (e != null) {
                System.out.println(e);
            }
        }
    }

    public static int pedirEntero(String pregunta) {
        boolean estado = true;
        int num = 0;
        String noInt;
        do {

            try {
                System.out.println(pregunta);
                num = in.nextInt();
                estado = false;

            } catch (InputMismatchException e) {
                noInt = in.nextLine();
                System.out.println(noInt + " No es entero!!!");

            }
        } while (estado);
        return num;
    }

    private static Estudio generaEstudio() throws Exception {
        String nombre;
        int equipo, id, cont = 0, opcion;
        Empresa propietario;

        id = pedirEntero("Deme su identificador numerico: ");
        System.out.println("Dame el nombre");
        in.nextLine();
        nombre = in.nextLine();
        equipo = pedirEntero("Numero de equipos: ");

        for (Empresa e : empresas) {
            if (e != null) {
                cont++;
                System.out.println(cont + ". " + e);
            }
        }
        if (cont > 0) {
            System.out.println("Elija una opción: ");
            opcion = in.nextInt();
            if (opcion < 0 || opcion > empresas.size()) {
                System.out.println("Opcion no valida");
            } else {
                propietario = empresas.get(opcion - 1);
                Estudio es = new Estudio(id, equipo, nombre, propietario);
                return es;
            }
        } else {
            throw new Exception("No hay empresas, no puede continuar");
        }
        return null;
    }

}
