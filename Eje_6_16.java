
import java.util.Scanner;
import java.util.HashMap;

/**
 * Realiza un programa que sepa decir la capital de un país (en caso de conocer
 * la respuesta) y que, además, sea capaz de aprender nuevas capitales. En
 * principio, el programa solo conoce las capitales de España, Portugal y
 * Francia.
 * Estos datos deberán estar almacenados en un diccionario. Los datos sobre
 * capitales que vaya aprendiendo el programa se deben almacenar en el mismo
 * diccionario. El usuario sale del programa escribiendo la palabra “salir”.
 * 
 * @author ECD
 * @input capitales
 * @output Escribe el nombre de un país y responderle con la capital
 */
public class Eje_6_16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        HashMap<String, String> capitales = new HashMap<String, String>();
        String pais;
        String capital;
        capitales.put("Espana", "Madrid");
        capitales.put("Portugal", "Lisboa");
        capitales.put("Francia", "Paris");

        do {
            System.out.print("Escribe el nombre de un país y te diré su capital: ");
            pais = s.nextLine();
            if (pais.trim().equalsIgnoreCase("salir")) {
                break;
            }
            if (!capitales.containsKey(pais)) {
                System.out.print("No conozco la respuesta ¿cuál es la capital de "+ pais+"?: ");
                capital = s.nextLine();
                capitales.put(pais, capital);
                System.out.println("Gracias por enseñarme nuevas capitales");
                continue;
            }
            System.out.println("La capital de "+ pais +" es "+capitales.get(pais));
        } while (!pais.equals("salir"));

        s.close();

    }

}
