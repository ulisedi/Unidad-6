package e6_18;

public class Elemento {
    


    private String nombreP;
    private double precio;
    private int cantidad; 

    public Elemento(String np,double p, int c) {
        this.nombreP = np;
        this.precio = p;
        this.cantidad=c;
    }
    public Elemento(String np,int p, int c) {
        this.nombreP = np;
        this.precio = (double) p;
        this.cantidad=c;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
}
