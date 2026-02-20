package e6_18;


/**
 * Escribe un programa que genere una secuencia de 5 cartas de la baraja
 * española y que sume los puntos según el juego de la brisca. El valor de las
 * cartas se debe guardar en una estructura HashMap que debe contener parejas
 * (figura, valor), por ejemplo (“caballo”, 3). La secuencia de cartas debe ser
 * una
 * estructura de la clase ArrayList que contiene objetos de la clase Carta. El
 * valor
 * de las cartas es el siguiente: as → 11, tres → 10, sota → 2, caballo → 3, rey
 * → 4;
 * el resto de cartas no vale nada.
 * 
 * @author ECD
 * @input nada
 * @output
 */
public class Eje_6_18 {
    public static void main(String[] args) {
        Carrito miCarrito = new Carrito();
        miCarrito.agrega(new Elemento("Tarjeta SD 64Gb", 19.95, 2));
        miCarrito.agrega(new Elemento("Canon EOS 2000D", 449, 1));
        System.out.println(miCarrito);
        System.out.print("Hay " + miCarrito.numeroDeElementos());
        System.out.println(" productos en la cesta.");
        System.out.println("El total asciende a " + String.format("%.2f", miCarrito.importeTotal()) + " euros");

        
        System.out.println("\nContinúa la compra...");
        miCarrito.agrega(new Elemento("Samsung Galaxy Tab", 199, 3));
        miCarrito.agrega(new Elemento("Tarjeta SD 64Gb", 19.95, 1));
        System.out.println(miCarrito);
        System.out.print("Ahora hay " + miCarrito.numeroDeElementos());
        System.out.println(" productos en la cesta.");
        System.out.println("El total asciende a " + String.format("%.2f", miCarrito.importeTotal()) + " euros");
    }

}
