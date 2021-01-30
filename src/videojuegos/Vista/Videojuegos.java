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
import videojuegos.Datos.DriverMySql;
import videojuegos.Modelo.Empresa;

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

                    operacionAefectuar();
            }

        } while (opcion != 0);
    }

    public static void operacionAefectuar() {

        int opcion;

        System.out.println("1. Insertar");
        System.out.println("2. Modificar");
        System.out.println("3. Eliminar");
        System.out.println("4. Listar contenido");

        opcion = pedirEntero("¿Qué operacion quieres efectuar?");

        switch (opcion) {

            case 1:
                Empresa e1 = new Empresa();
                e1.datosEmpresa();
                LogicaEmpresa.insertEmpresa(e1);
                empresas.add(e1);

                break;

            case 2:

                break;

            case 4:

                mostrarEmpresas();
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

}
