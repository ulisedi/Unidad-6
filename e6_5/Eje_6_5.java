package e6_5;

import java.util.Scanner;

/**
 * Escribe un programa que genere una secuencia de 5 cartas de la baraja
 * española y que sume los puntos según el juego de la brisca. El valor de las
 * cartas se debe guardar en una estructura HashMap que debe contener parejas
 * (figura, valor), por ejemplo (“caballo”, 3). La secuencia de cartas debe ser
 * una
 * estructura de la clase ArrayList que contiene objetos de la clase Carta. El
 * valor
 * de las cartas es el siguiente: as → 11, tres → 10, sota → 2, caballo → 3, rey
 * → 4;
 * el resto de cartas no vale nada.
 * 
 * @author ECD
 * @input nada
 * @output
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

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;

                default:
                    break;
            }
        } while (!(respuesta == 10));

        s.close();
    }

}
