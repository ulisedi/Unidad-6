import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Escribe un programa que ordene 10 números enteros introducidos por teclado
 * y almacenados en un objeto de la clase ArrayList.
 * 
 * @author ECD
 * @input 10 int
 * @output sin salida especifica
 */

public class Eje_6_3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Nº " + (i + 1) + " = ");
            try {
                numeros.add(s.nextInt());
            } catch (Exception e) {
                System.out.println("--");
                System.out.println("Error en el valor introduciodo");
                System.out.println("--");
                i--;
                s.nextLine();
            }
        }
        Collections.sort(numeros);
        for (Integer integer : numeros) {
            System.out.print(" "+integer);
        }
        s.close();
    }

}
