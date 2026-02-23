
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
public class Eje_6_21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String tanfibio;
        HashMap<String, String> habitat = new HashMap<>();
        HashMap<String, String> alimentacion = new HashMap<>();
        String cadena = "";
        habitat.put("rana", "En los tropicos y cerca de las zonas humedas y acuaticas.");
        habitat.put("salamandra", "Ecosistemas humedos.");
        habitat.put("sapo", "En cualquier sitio salvo desiertos y la antartida.");
        habitat.put("triton", "America y africa.");
        alimentacion.put("rana", "larva e insactos.");
        alimentacion.put("salamandra", "pequeños crustaceos e insectos.");
        alimentacion.put("sapo", "insectos, lombrices y pequeños roedores. ");
        alimentacion.put("triton", "insectos.");

        System.out.print("Introduzca el tipo de anfibio: ");
        tanfibio = s.nextLine();

        if (!habitat.containsKey(tanfibio)) {
            System.out.println("Ese tipo de anfibio no existe. ");
        } else {
            cadena += "Hábitat :";
            for (Map.Entry tDeAnfibio : habitat.entrySet()) {
                if (tDeAnfibio.getKey().equals(tanfibio)) {
                    cadena += tDeAnfibio.getValue();
                }
            }
            cadena += "\nAlimentación :";
            for (Map.Entry tDeAnfibio : alimentacion.entrySet()) {
                if (tDeAnfibio.getKey().equals(tanfibio)) {
                    cadena += tDeAnfibio.getValue();
                }
            }
            System.out.println(cadena);
        }
        s.close();

    }

}
