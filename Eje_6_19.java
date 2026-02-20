
import java.util.Scanner;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;

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
 * @input nada
 * @output
 */
public class Eje_6_19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ingles;
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("caliente", "hot");
        diccionario.put("ardiente", "hot");
        diccionario.put("candente", "hot");
        diccionario.put("abrasador", "hot");
        diccionario.put("frio", "cold");
        diccionario.put("helado", "cold");
        diccionario.put("gélido", "cold");
        diccionario.put("calor", "heat");
        diccionario.put("fuego", "fire");
        diccionario.put("rojo", "red");
        diccionario.put("grande", "big");

        do {
            System.out.print("Introduzca una palabra y le daré los sinónimos: ");
            ingles = s.nextLine();
            if (ingles.trim().equalsIgnoreCase("salir")) {
                break;
            }
            if (!diccionario.containsKey(ingles)) {
                System.out.println("No conozco sinónimos de esa palabra");
                continue;
            }
            //si pone fuego no sale nada, haces que cada vez que aparezca el sinonimo lo añada a una cadena y si solo aparece una vez
            //ponga que no sabe sinonimos
            System.out.print("Sinónimos de " + ingles + " : ");
            for (Map.Entry sinonimos : diccionario.entrySet()) {
                if (sinonimos.getValue().equals(diccionario.get(ingles)) && !sinonimos.getKey().equals(ingles)) {
                    System.out.print(sinonimos.getKey());
                    System.out.print(",");
                }

            }
            System.out.println("");
        } while (!ingles.equals("salir"));

        s.close();

    }

}
