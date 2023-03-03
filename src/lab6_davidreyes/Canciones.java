package lab6_davidreyes;

public class Canciones {

    String titulo;
    int duracion;
    String idlanzamiento;

    public Canciones(String titulo, int duracion, String album) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.idlanzamiento=album;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getidLanzamiento() {
        return idlanzamiento;
    }

    public void setidLanzamiento(String album) {
        this.idlanzamiento = album;
    }

    @Override
    public String toString() {
        return "Canciones{" + "titulo=" + titulo + ", duracion=" + duracion + ", album=" +idlanzamiento + '}';
    }

}
