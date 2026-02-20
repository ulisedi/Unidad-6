package e6_12;

public class Carta {
    public enum Palos {
        bastos, copas, oros, espadas
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
                return "as" + " de " + this.palo;
             case 2:
                return "dos" + " de " + this.palo;
             case 3:
                return "tres" + " de " + this.palo;
             case 4:
                return "cuatro" + " de " + this.palo;
             case 5:
                return "cinco" + " de " + this.palo;
             case 6:
                return "seis" + " de " + this.palo;
             case 7:
                return "siete" + " de " + this.palo;
             case 8:
                return "ocho" + " de " + this.palo;
             case 9:
                return "nueve" + " de " + this.palo;
            case 10:
                return "sota" + " de " + this.palo;
            case 11:
                return "caballo" + " de " + this.palo;
            case 12:
                return "rey" + " de " + this.palo;

            default:
                return this.valor + " de " + this.palo;
        }

    }

}
