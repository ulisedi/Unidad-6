
import java.util.Scanner;
import java.util.HashMap;

/**
 * Un supermercado de productos ecológicos nos ha pedido hacer un programa
 * para vender su mercancía. En esta primera versión del programa se tendrán
 * en cuenta los productos que se indican en la tabla junto con su precio. Los
 * productos se venden en bote, brick, etc. Cuando se realiza la compra, hay que
 * indicar el producto y el número de unidades que se compran, por ejemplo
 * “guisantes” si se quiere comprar un bote de guisantes y la cantidad, por
 * ejemplo “3” si se quieren comprar 3 botes. La compra se termina con la
 * palabra
 * “fin. Suponemos que el usuario no va a intentar comprar un producto que
 * no existe. Utiliza un diccionario para almacenar los nombres y precios de los
 * productos y una o varias listas para almacenar la compra que realiza el
 * usuario.
 * A continuación se muestra una tabla con los productos disponibles y sus
 * respectivos precios:
 * avena garbanzos tomate jengibre quinoa guisantes
 * 2,21 2,39 1,59 3,13 4,50 1,60
 * 
 * @author ECD
 * @input los productos y cantidades a comprar
 * @output la tabla con el producto, precio, cantidad y total de cada producto comprado y el total
 */
public class Eje_6_14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        HashMap<String, Double> precios = new HashMap<String, Double>();
        precios.put("avena", 2.21);
        precios.put("garbanzos", 2.39);
        precios.put("tomate", 1.59);
        precios.put("jengibre", 3.13);
        precios.put("quinoa", 4.5);
        precios.put("guisantes", 1.6);
        HashMap<String, Integer> compra = new HashMap<String, Integer>();
        String producto;
        int cantidad = 0;
        do {
            System.out.print("Producto: ");
            producto = s.nextLine();
            if (producto.trim().equalsIgnoreCase("fin")) {
                break;
            }
            if (!precios.containsKey(producto)) {
                System.out.println("--");
                System.out.println("El producto no existe.");
                System.out.println("--");
                continue;
            }
            System.out.print("Cantidad: ");
            try {
                cantidad = s.nextInt();
            } catch (Exception e) {
                System.out.println("--");
                System.out.println("Error en el valor introducido tiene que se Int");
                System.out.println("--");
            }

            if (compra.containsKey(producto)) {
                compra.put(producto, compra.get(producto) + cantidad);
            } else {
                compra.put(producto, cantidad);
            }
            s.nextLine();
        } while (!producto.equals("fin"));

        double total = 0;
        System.out.println("|---------------------------------------------|");
        System.out.printf("| %-12s | %-8s | %-6s | %-8s |\n", "Producto", "Precio", "Cant", "Total");
        System.out.println("|---------------------------------------------|");

        for (String prod : compra.keySet()) {
            int cantidades = compra.get(prod);
            double precio = precios.get(prod);
            double subtotal = precio * cantidades;
            System.out.printf("| %-12s | %-8.2f | %-6d | %-8.2f |\n", prod, precio, cantidades, subtotal);
            total += subtotal;
        }
        System.out.println("|---------------------------------------------|");
        System.out.printf(" %4s %.2f\n", "TOTAL:", total);

        s.close();
    }

}
