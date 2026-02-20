package e6_18;

import java.util.ArrayList;

public class Carrito {

    private ArrayList<Elemento> carro = new ArrayList<Elemento>();

    public Carrito(Elemento e) {
        this.carro.add(e);

    }

    public Carrito() {

    }

    public ArrayList<Elemento> getCarro() {
        return carro;
    }

    public void setCarro(ArrayList<Elemento> carro) {
        this.carro = carro;
    }

    public void agrega(Elemento ele) {
        for (Elemento e : carro) {
            if (e.getNombreP().equals(ele.getNombreP())) {
                e.setCantidad(e.getCantidad()+ele.getCantidad());
                return;
            }
        }
        carro.add(ele);
    }

    public int numeroDeElementos() {
        // int total = 0;
        // for (Elemento e : carro) {
        //     total += e.getCantidad();
        // }
        // return total;
        return carro.size();
    }

    public double importeTotal() {
        double total = 0;
        for (Elemento elemento : carro) {
            total += elemento.getPrecio() * elemento.getCantidad();
        }
        return total;
    }

    public String toString() {
        String cadena = "";
        cadena += "Contenido del carrito\n";
        cadena += "=================================\n";
        for (Elemento elemento : carro) {
            cadena += elemento.getNombreP() + " PVP: " + elemento.getPrecio() + " Unidades: " + elemento.getCantidad()
                    + String.format(" Subtotal: %.2f", (elemento.getPrecio() * elemento.getCantidad())) + "\n";
        }
        return cadena;
    }

}
