package e6_8;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa
 * un botón siguiendo la siguiente pauta: o bien coincide el valor con la moneda
 * anteriormente generada - 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25
 * céntimos, 50 céntimos, 1 euro o 2 euros - o bien coincide la posición – cara
 * o
 * cruz. Simula, mediante un programa, la generación de 6 monedas aleatorias
 * siguiendo la pauta correcta. Cada moneda generada debe ser una instancia de
 * la clase Moneda y la secuencia se debe ir almacenando en una lista.
 * 
 * @author ECD
 * @input entrada por el usuario segun lo que quiera hacer con el menú
 * @output un texto segun el valor introducido
 */
public class Eje_6_8 {
    public static void main(String[] args) {
        ArrayList<Carta> cartas = new ArrayList<>();
        Carta.Palos[] palos = Carta.Palos.values();

        Carta random = new Carta((int) (Math.random() * 12) + 1, palos[(int) (Math.random() * palos.length)]);
        cartas.add(random);

        for (int i = 0; i < 10; i++) {
            do {
                random = new Carta((int) (Math.random() * 12) + 1, palos[(int) (Math.random() * palos.length)]);
            } while (cartas.contains(random));
            // } while (cartas.contains(random));
            cartas.add(random);
        }

        for (Carta palos2 : cartas) {
            System.out.println(palos2);
        }
    }

}
