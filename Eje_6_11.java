import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Realiza un programa que escoja al azar 5 palabras en español del
 * minidiccionario del ejercicio
 * anterior. El programa irá pidiendo que el usuario teclee
 * la traducción al inglés de cada una de las palabras y comprobará si son
 * correctas. Al final, el programa deberá mostrar cuántas respuestas son
 * válidas
 * y cuántas erróneas.
 * 
 * @author ECD
 * @input entrada por el usuario segun lo que quiera hacer con el menú
 * @output salida por pantalla de lo que se le pida al usuario segun el menú
 */

public class Eje_6_11 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, String> diccionario = new HashMap<String, String>();
        String respuesta;
        int acertadas = 0;
        ArrayList<String> esp = new ArrayList<String>();
        ArrayList<String> ing = new ArrayList<String>();
        esp.addAll(Arrays.asList("hola", "casa", "palo", "flor", "mesa", "coche", "luz", "nieve", "sol", "luna",
                "estrella",
                "paz", "guerra", "pais", "ciudad",
                "jueves", "lunes", "martes", "azul", "negro"));

        ing.addAll(Arrays.asList("hello", "house", "stick", "flower", "table", "car", "light", "snow", "sun", "moon",
                "star",
                "peace", "war", "country", "city",
                "thursday", "monday", "tuesday", "blue", "black"));

        for (int i = 0; i < esp.size(); i++) {
            diccionario.put(esp.get(i), ing.get(i));
        }
        Collections.shuffle(esp);
        for (int i = 0; i < 5; i++) {
            System.out.println("¿Cual es la traducción de la palabra? \" " + esp.get(i) + " \"");
            respuesta = s.nextLine();
            if (respuesta.equals(diccionario.get(esp.get(i)))) {
                acertadas++;
            }
        }
        int fallos = 5 - acertadas;
        System.out.println("La acertadas son un total de: " + acertadas);
        System.out.println("Los fallos son un total de : " + fallos);

        s.close();
    }

}
