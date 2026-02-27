package e6_5;

import java.util.Scanner;

/**
 * Realiza de nuevo el ejercicio de la colección de discos pero utilizando esta
 * vez
 * una lista para almacenar la información sobre los discos en lugar de un array
 * convencional. Comprobarás que el código se simplifica notablemente ¿Cuánto
 * ocupa el programa original hecho con un array? ¿Cuánto ocupa este nuevo
 * programa hecho con una lista?
 * 
 * 
 * @author ECD
 * @input valores pedidos en el programa
 * @output salida dependiente de las acciones acometidas por el usuario
 */
public class Eje_6_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        GestorDiscos coleccion = new GestorDiscos();
        int respuesta;
        do {
            System.out.println();
            System.out.println("DISCOS");
            System.out.println("=========");
            System.out.println("1.Añadir un disco");
            System.out.println("2.Añadir un disco con todos los datos");
            System.out.println("3.Mostrar un disco");
            System.out.println("4.Mostrar todos los discos");
            System.out.println("5.Eliminar un disco");
            System.out.println("6.Cambiar autor de un disco");
            System.out.println("7.Cambiar título de un disco");
            System.out.println("8.Cambiar género de un disco");
            System.out.println("9.Cambiar duración de un disco");
            System.out.println("10.Salir");
            System.out.println("Elige una opción (1-10): ");
            try {
                respuesta = s.nextInt();
            } catch (Exception e) {
                System.out.println("--");
                System.out.println("El valor tiene que ser in Int");
                System.out.println("--");
                break;
            }

            if (respuesta < 1 || respuesta > 10) {
                System.out.println("Tiene que ser un valor entre 1-10");
                break;
            }
            switch (respuesta) {
                case 1:
                    coleccion.anadirDisco();
                    break;
                case 2:
                    coleccion.anadirDiscoFull();
                    break;
                case 3:
                    coleccion.mostrarDisco();
                    break;
                case 4:
                    coleccion.mostrarTodos();
                    break;
                case 5:
                    coleccion.eliminardisco();
                    break;
                case 6:
                    coleccion.cambiarAutor();
                    break;
                case 7:
                    coleccion.cambiarTitulo();
                    break;
                case 8:
                    coleccion.cambiarGenero();
                    break;
                case 9:
                    coleccion.cambiarDuracion();
                    break;

                default:
                    break;
            }
        } while (!(respuesta == 10));

        s.close();
    }

}
