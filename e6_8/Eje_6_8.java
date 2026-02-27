package e6_8;

import java.util.Collections;
import java.util.ArrayList;

/**
 * Realiza un programa que escoja al azar 10 cartas de la baraja española
 * (10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
 * almacenarlas y asegúrate de que no se repite ninguna.
 * 
 * @author ECD
 * @input nada
 * @output  10 cartas al azar sin repetir
 */
public class Eje_6_8 {
    public static void main(String[] args) {
        ArrayList<Carta> cartas = new ArrayList<>();
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 10, 11, 12 };
        Carta.Palos[] palos = Carta.Palos.values();
        for (int numero : numeros) {
            for (int f = 0; f < palos.length; f++) {
                cartas.add(new Carta(numero, palos[f]));
            }
        }
        Collections.shuffle(cartas);
        ArrayList<Carta> diezCartas = new ArrayList<Carta>();
        for (int i = 0; i < 10; i++) {
            diezCartas.add(cartas.get(i));
        }
        for (Carta cartasfinal : diezCartas) {
            System.out.println(cartasfinal);

        }

    }

}
