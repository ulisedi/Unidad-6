package e6_5;

public class Discos {
    private String autor;
    private String titulo;
    private String genero;
    private int duracion;

    public Discos(String t, String g) {
        this.titulo = t;
        this.genero = g;
        this.autor = null;
        this.duracion = 0;
    }

    public Discos(String a, String t, String g, int d) {
        this.titulo = t;
        this.genero = g;
        this.autor = a;
        this.duracion = d;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String toString() {
        return "Autor: " + this.autor + "\n" + "Titulo: " + this.titulo + "\n" + "Genero: " + this.genero + "\n"
                + "Duracion: " + this.duracion + "\n";
    }
}
