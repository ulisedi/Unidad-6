import java.util.ArrayList;

/**
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de
 * esos
 * números. El tamaño de la lista también será aleatorio y podrá oscilar entre
 * 10
 * y 20 elementos ambos inclusive.
 * 
 * @author ECD
 * @input nada
 * @output sin salida especifica
 */
public class Eje_6_2 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int suma = 0;
        int tamaño = (int) (Math.random() * 11 + 10);
        int max = 0;
        int min = 100;
        for (int i = 0; i < tamaño; i++) {
            numeros.add((int) (Math.random() * 101));
        }
        for (Integer integer : numeros) {
            suma += integer;
            if (max < integer) {
                max = integer;
            }
            if (min > integer) {
                min = integer;

            }
        }
        System.out.println("Suma: " + suma);
        System.out.printf("Media: %.2f \n",  (suma /  (double) tamaño));
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        for (Integer integer : numeros) {
            System.out.print(integer + " ");
        }
    }

}
