package e6_9;

public class Carta {
    public enum Palos {
        BASTOS, COPAS, OROS, ESPADAS
    }

    int valor;
    Palos palo;

    public Carta(int v, Palos p) {
        this.valor = v;
        this.palo = p;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Palos getPalo() {
        return palo;
    }

    public void setPalo(Palos palo) {
        this.palo = palo;
    }

    public String toString() {
        switch (this.valor) {
            case 1:
                return "As" + " de " + this.palo;
            case 10:
                return "Sota" + " de " + this.palo;
            case 11:
                return "Caballo" + " de " + this.palo;
            case 12:
                return "Rey" + " de " + this.palo;

            default:
                return this.valor + " de " + this.palo;
        }

    }

}
