
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/**
 * Amplía el programa anterior de tal forma que sea capaz de aprender palabras y
 * sinónimos. Cuando una palabra no tiene sinónimos, es decir, cuando aparece la
 * palabra en español con su traducción y esa traducción no la tiene ninguna
 * otra
 * palabra española, se le preguntará al usuario si quiere añadir uno (un
 * sinónimo)
 * y, en caso afirmativo, se pedirá la palabra y se añadirá al diccionario. Se
 * puede
 * dar la circunstancia de que el usuario introduzca una palabra en español que
 * no está en el diccionario; en tal caso, se mostrará el consiguiente mensaje y
 * se dará la posibilidad al usuario de añadir la entrada correspondiente en el
 * diccionario pidiendo, claro está, la palabra en inglés.
 * 
 * @author ECD
 * @input nada
 * @output
 */
public class Eje_6_20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ingles;
        HashMap<String, String> diccionario = new HashMap<>();
        String espanol;
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
                System.out.print("No conozco esa palabra  ¿quiere añadirla al diccionario? (s/n): ");
                espanol = s.nextLine();
                if (espanol.equals("s")) {
                    System.out.print("Introduzca la traducción de " + ingles + " en inglés:");
                    espanol = s.nextLine();
                    diccionario.put(ingles, espanol);
                }
                continue;
            }
            int aparece = 0;
            String palabras = "Sinónimos de ";
            palabras += ingles + " : ";
            for (Map.Entry sinonimos : diccionario.entrySet()) {
                if (sinonimos.getValue().equals(diccionario.get(ingles))) {
                    aparece++;
                    if (!sinonimos.getKey().equals(ingles)) {

                        palabras += sinonimos.getKey() + " ";
                    }
                }

            }
            if (aparece > 1) {
                System.out.println(palabras);
            } else {
                System.out.print("No conozco sinónimos de esa palabra  ¿quiere añadir alguno? (s/n):");
                espanol = s.nextLine();
                if (espanol.equals("s")) {
                    System.out.print("Introduzca un sinónimo de " + ingles+ " :");
                    espanol = s.nextLine();
                    diccionario.put(espanol, diccionario.get(ingles));
                    System.out.println("Gracias por enseñarme nuevos sinónimos.");
                }
            }
        } while (true);

        s.close();

    }

}
