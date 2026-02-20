import java.util.HashMap;
import java.util.Scanner;

/**
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
 * (con su correspondiente traducción). Utiliza un objeto de la clase HashMap
 * para
 * almacenar las parejas de palabras. El programa pedirá una palabra en español
 * y dará la correspondiente traducción en inglés.
 * 
 * @author ECD
 * @input entrada por el usuario segun lo que quiera hacer con el menú
 * @output sin salida específica
 */

public class Eje_6_10 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String eleccion;
        String traduccion;
        boolean salida = false;
        HashMap<String, String> diccionario = new HashMap<String, String>();
        String[] esp = { "hola", "casa", "palo", "flor", "mesa", "coche", "luz", "nieve", "sol", "luna", "estrella",
                "paz", "guerra", "pais", "ciudad",
                "jueves", "lunes", "martes", "azul", "negro",
        };
        String[] ing = { "Hello", "House", "stick", "flower", "table", "car", "light", "snow", "sun", "moon", "star",
                "peace", "war", "country", "city",
                "Thursday", "Monday", "Tuesday", "blue", "black" };

        for (int i = 0; i < esp.length; i++) {
            diccionario.put(esp[i], ing[i]);
        }

        do {
            System.out.println("\n¿De que palabra quieres saber la traducción? (0 para salir)");
            eleccion = s.nextLine();
            if (eleccion.equals("0")) {
                salida = true;
                continue;
            }
            traduccion = diccionario.get(eleccion);
            if (traduccion != null) {
                System.out.println("--");
                System.out.print("la traduccion es : " + traduccion);
            } else {
                System.out.println("--");
                System.out.print("La palabra no está en el diccionario");
            }

        } while (!salida);
        System.out.println("--");
        System.out.println("Gracias por sus preguntas, vuelva pronto");
        s.close();
    }

}
