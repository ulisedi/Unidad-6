import java.util.HashMap;
import java.util.Scanner;

/**
 * Implementa el control de acceso al área restringida de un programa. Se debe
 * pedir un nombre de usuario y una contraseña. Si el usuario introduce los
 * datos correctamente, el programa dirá “Ha accedido al área restringida”. El
 * usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades
 * el programa dirá “Lo siento, no tiene acceso al área restringida”. Los
 * nombres
 * de usuario con sus correspondientes contraseñas deben estar almacenados en
 * una estructura de la clase HashMap
 * 
 * @author ECD
 * @input entrada por el usuario segun lo que quiera hacer con el menú
 * @output sin salida específica
 */

public class Eje_6_6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, String> cuenta = new HashMap<String, String>();
        cuenta.put("Usuario", "1234");
        cuenta.put("Usuario2", "12345");
        cuenta.put("Usuario3", "123456");
        int cont = 0;
        Boolean entrada = false;
        String usuario;
        String contrasena = "";
        while (!entrada) {
            System.out.print("Introduce el Usuario: ");
            usuario = s.nextLine();
            System.out.print("\nIntroduce la contraseña: ");
            contrasena = s.nextLine();
            if (cont < 3) {
                if (cuenta.containsKey(usuario) && cuenta.get(usuario).equals(contrasena)) {
                    System.out.println("--");
                    System.out.println("Ha accedido al área restringida");
                    System.out.println("--");
                    entrada = true;
                } else {
                    System.out.println("--");
                    System.out.println("Contraseña o usuario incorrecto");
                    System.out.println("--");
                }
                cont++;
            } else {
                System.out.println("--");
                System.out.println("Se han agotado los intentos");
                System.out.println("Lo siento, no tiene acceso al área restringida");
                System.out.println("--");
                break;

            }

        }
        s.close();
    }

}
