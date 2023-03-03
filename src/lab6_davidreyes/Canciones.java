package lab6_davidreyes;

public class Canciones {

    String titulo;
    int duracion;
    String album;

    public Canciones(String titulo, int duracion, String album) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.album=album;
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

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Canciones{" + "titulo=" + titulo + ", duracion=" + duracion + ", album=" + album + '}';
    }

}
