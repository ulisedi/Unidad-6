package e6_9;

import java.util.Collections;
import java.util.ArrayList;

/**
 * Modifica el programa anterior de tal forma que las cartas se muestren
 * ordenadas. Primero se
 * ordenarán por palo: bastos, copas, espadas, oros. Cuando
 * coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota,
 * caballo, rey.
 * 
 * @author ECD
 * @input nada
 * @output 10 cartas ordenadas por palo y número
 */
public class Eje_6_9 {
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
        Collections.sort(diezCartas, (c1, c2) -> {
            int compararPalo = c1.getPalo().ordinal() - c2.getPalo().ordinal();
            if (compararPalo != 0) {
                return compararPalo;
            }
            return c1.getValor() - c2.getValor();
        });
        
        for (Carta c : diezCartas) {
            System.out.println(c);
        }

    }

}
