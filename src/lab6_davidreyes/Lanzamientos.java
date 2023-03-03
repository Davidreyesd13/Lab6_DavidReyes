package lab6_davidreyes;

import java.util.Date;

public class Lanzamientos {

    String titulo;
    Date fecha;
    int likes;

    public Lanzamientos() {
    }

    public Lanzamientos(String titulo, Date fecha, int likes) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.likes = likes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Lanzamientos{" + "titulo=" + titulo + ", fecha=" + fecha + ", likes=" + likes + '}';
    }

}
