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

        NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("es", "ES"));

        this.movimientos += String.format(
                "%1s %15s%n",
                "Ingreso de " + formato.format(i),
                "Saldo " + formato.format(this.saldo));

    }

    public void cargo(int i) {
        this.saldo -= i;

        NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("es", "ES"));

        this.movimientos += String.format("%1s %15s%n", "Cargo de " + formato.format(i),
                "Saldo " + formato.format(this.saldo));

    }

    public void transferencia(CuentaCorriente a, int d) {
        this.saldo -= d;
        a.saldo += d;

        NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("es", "ES"));

        this.movimientos += String.format(
                "%-55s %15s%n", "Transf. emitida de " + formato.format(d) +
                        " a la cuenta " + a.getnCuenta(),
                "Saldo " + formato.format(this.saldo));

        a.movimientos += String.format(
                "%-55s %15s%n",
                "Transf. recibida de " + formato.format(d) +
                        " de la cuenta " + this.getnCuenta(),
                "Saldo " + formato.format(a.saldo));

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
// comando para que salgan las €: chcp 65001