package e6_5;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorDiscos {

    private ArrayList<Discos> listaDiscos;
    private Scanner sc = new Scanner(System.in);
    public GestorDiscos() {
        this.listaDiscos = new ArrayList<>();
    }

    public void anadirDisco() {
        String titulo;
        String genero;
        System.out.println("Dime el titulo");
        titulo = sc.nextLine();
        System.out.println("Dime el genero");
        genero = sc.nextLine();
        listaDiscos.add(new Discos(titulo, genero));

    }

    public void anadirDiscoFull() {
        String titulo;
        String genero;
        String autor;
        int duracion = 0;
        System.out.println("Dime el titulo");
        titulo = sc.nextLine();
        System.out.println("Dime el genero");
        genero = sc.nextLine();
        System.out.println("Dime el autor");
        autor = sc.nextLine();
        do {
            System.out.println("Dime la duracion");
            try {
                duracion = sc.nextInt();
            } catch (Exception e) {
                System.out.println("--");
                System.out.println("Error: el valor tiene que ser Int ");
                System.out.println("--");
                continue;
            }
            break;
        } while (true);
        System.out.println("Dime la duracion");
        listaDiscos.add(new Discos(titulo, genero, autor, duracion));

    }

    public void eliminardisco() {
        int indice = 0;

        do {
            System.out.println("dime el indice del disco que quieres eliminar");
            try {
                indice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("--");
                System.out.println("Error: el valor tiene que ser Int ");
                System.out.println("--");
                continue;
            }
            if ( indice < 1 ||  indice > listaDiscos.size()) {
                System.out.println("--");
                System.out.println("El indice dado no esta en la lista de discos");
                System.out.println("la cantidad de indices es: " + listaDiscos.size());
                System.out.println("--");

                continue;
            }

            System.out.println("--");
            System.out.println("Disco borrado");
            break;
        } while (true);
        listaDiscos.remove(indice - 1);
    }

    public void mostrarDisco() {
        int indice;
        if (listaDiscos.isEmpty()) {
            System.out.println("--");
            System.out.println("No hay discos para mostrar.");
            return;
        }
        do {
            System.out.println("Dime el indice del disco que quieres ver");
            try {
                indice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("--");
                System.out.println("Error: el valor tiene que ser Int ");
                System.out.println("--");
                continue;
            }
            if (indice < 1 ||  indice > listaDiscos.size()) {
                System.out.println("--");
                System.out.println("El indice dado no esta en la lista de discos");
                System.out.println("la cantidad de indices es: " + listaDiscos.size());
                System.out.println("--");

                continue;
            }
            break;
        } while (true);
        System.out.println("--");
        System.out.println(listaDiscos.get(indice - 1));

    }

    public void mostrarTodos() {
        if (listaDiscos.isEmpty()) {
            System.out.println("--");
            System.out.println("No hay discos para mostrar.");
            return;
        }
        for (int i = 0; i < listaDiscos.size(); i++) {
            System.out.println((i + 1) + " " + listaDiscos.get(i));
        }
    }
}
