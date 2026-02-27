package e6_12;

import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

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
 * @output las cartas que tienes y los puntos que suman
 */
public class Eje_6_12 {
    public static void main(String[] args) {
        ArrayList<Carta> cartas = new ArrayList<>();
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 10, 11, 12 };
        Carta.Palos[] palos = Carta.Palos.values();
        HashMap<Integer, Integer> valoresBrisca = new HashMap<Integer, Integer>();
        int suma = 0;
        valoresBrisca.put(1, 11);
        valoresBrisca.put(3, 10);
        valoresBrisca.put(10, 2);
        valoresBrisca.put(11, 3);
        valoresBrisca.put(12, 4);
        for (int numero : numeros) {
            for (int f = 0; f < palos.length; f++) {
                cartas.add(new Carta(numero, palos[f]));
            }
        }
        Collections.shuffle(cartas);
        ArrayList<Carta> cartas5 = new ArrayList<Carta>();
        for (int i = 0; i < 5; i++) {
            cartas5.add(cartas.get(i));
        }

        for (Carta cartasasumar : cartas5) {
            System.out.println(cartasasumar);
            suma += valoresBrisca.getOrDefault(cartasasumar.getValor(), 0);

        }
        System.out.println("Tienes " + suma + " puntos");
    }

}
