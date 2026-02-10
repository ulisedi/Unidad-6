package e6_8;

public class Carta {
    public enum Palos {
        COPAS, BASTOS, ESPADAS, OROS
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

        return this.valor + " - " + this.palo;
    }



    //añadir métodos equals y hashCode a Carta.java para que cartas.contains(random)
    //detecte correctamente duplicados (resultado: ya no se añadirán cartas con mismo
    // valor y palo).  esto no es mio
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Carta other = (Carta) obj;
        if (valor != other.valor)
            return false;
        if (palo != other.palo)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + valor;
        result = prime * result + ((palo == null) ? 0 : palo.hashCode());
        return result;
    }
}
