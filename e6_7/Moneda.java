package e6_7;

public class Moneda {
    public enum lado {
        CARA, CRUZ
    }

    int valor;
    lado lado;

    //
    public Moneda(int v, lado l) {
        this.valor = v;
        this.lado = l;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public lado getLado() {
        return lado;
    }

    public void setLado(lado lado) {
        this.lado = lado;
    }

    //
    public String toString() {

        return this.valor + " - " + this.lado;
    }

}
