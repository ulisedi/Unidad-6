import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Realiza un programa equivalente al anterior pero en esta ocasión, el programa
debe ordenar palabras en lugar de números.
 * 
 * @author ECD
 * @input 10 String
 * @output sin salida especifica
 */

public class Eje_6_4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> palabras = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Pº " + (i + 1) + " = ");
            palabras.add(s.nextLine());
        }
        Collections.sort(palabras);
        for (String integer : palabras) {
            System.out.print(" " + integer);
        }
        s.close();
    }

}
