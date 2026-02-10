package e6_7;

public class Moneda {
    int valor;
    String lado;

    public Moneda(int v, String l) {
        this.valor = v;
        this.lado = l;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getLado() {
        return lado;
    }

    public void setLado(String lado) {
        this.lado = lado;
    }

    public String toString() {

        return this.valor + " - " + this.lado;
    }
}
