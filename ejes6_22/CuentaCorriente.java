package ejes6_22;

import java.text.NumberFormat;
import java.util.Locale;

public class CuentaCorriente {
    private int nCuenta;
    private int saldo;
    private String movimientos;

    public CuentaCorriente(int s) {
        nCuenta = (int) (Math.random() * 1_000_000_000);
        saldo = s;
        movimientos = "";
    }

    public CuentaCorriente() {
        nCuenta = (int) (Math.random() * 1_000_000_000);
        saldo = 0;
        movimientos = "";
    }

    public int getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(int nCuenta) {
        this.nCuenta = nCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(String movimientos) {
        this.movimientos = movimientos;
    }

    //
    public void ingreso(int i) {
        this.saldo += i;
        this.movimientos += "Ingreso de " + i + " Saldo: " + this.saldo + "\n";

    }

    public void cargo(int i) {
        this.saldo -= i;
        this.movimientos += "Cargo de " + i + " Saldo: " + this.saldo + "\n";

    }

    public void transferencia(CuentaCorriente a, int d) {
        this.saldo -= d;
        a.saldo += d;
        this.movimientos += "Transf. recibida de " + d + "  de la cuenta " + a + "    Saldo " + this.saldo + "\n";
        a.movimientos += "Transf. emitida de " + d + "  de la cuenta " + this.nCuenta + "    Saldo " + a.saldo + "\n";

    }

    public String toString() {
        NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("es", "ES"));
        return "Número de cta: " + this.getnCuenta() + " Saldo: " + formato.format(this.getSaldo());
    }

    public void movimientos() {
        System.out.println("Movimientos de la cuenta " + this.nCuenta);
        System.out.println("-----------------------------------");
        System.out.println(this.movimientos);
    }
}
// mira el formato de las cosas y error en nCuenta que llama al tostring y no quieres eso  