package lab6_davidreyes;

import java.util.ArrayList;

public class playlist {
   String nombre;
   int contl;
   ArrayList<Canciones> canciones;

    public playlist(String nombre, int contl, ArrayList<Canciones> canciones) {
        this.nombre = nombre;
        this.contl = contl;
        this.canciones = canciones;
    }

    public playlist() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getContl() {
        return contl;
    }

    public void setContl(int contl) {
        this.contl = contl;
    }

    public ArrayList<Canciones> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Canciones> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "playlist{" + "nombre=" + nombre + ", contl=" + contl + ", canciones=" + canciones + '}';
    }
   
}
