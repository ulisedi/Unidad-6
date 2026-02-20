package e6_14;

public class Compra {

    public enum Productos {
        avena, garbanzos, tomate, jengibre, quinoa, guisantes
    }
    private int valor;
    private Productos pruducto;
    private static int cantidadd;
    private int cantidad;

    public Compra(Productos p, int v) {
        cantidadd++;
        cantidad = cantidadd;
        this.pruducto = p;
        this.valor = v;
    }

    // public String toString() {

    // }

}
