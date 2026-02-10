
import java.util.ArrayList;

/**
 * Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
 * muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
 * todo el ArrayList sin usar ningún índice.
 * 
 * @author ECD
 * @input nada
 * @output sin salida especifica
 */

public class Eje_6_1 {

    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Pablo");
        nombres.add("Javier");
        nombres.add("Paul");
        nombres.add("Mikol");
        nombres.add("Luis");
        nombres.add("pablo2");

        for (String string : nombres) {
            System.out.println(string);
        }

    }

}
