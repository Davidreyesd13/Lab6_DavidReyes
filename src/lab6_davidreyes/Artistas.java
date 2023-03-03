package lab6_davidreyes;

import java.util.ArrayList;

public class Artistas extends Usuarios {

    String nombreartis;
    ArrayList<Canciones> canciones;
    ArrayList<Albumes> albumes;

    public Artistas(String nombreartis, ArrayList<Canciones> canciones, ArrayList<Albumes> albumes, String pass, String user, int edad) {
        super(pass, user, 
                edad);
        this.nombreartis = nombreartis;
        this.canciones = canciones;
        this.albumes = albumes;
    }

    public Artistas() {
        super();
    }

    public String getNombreartis() {
        return nombreartis;
    }

    public void setNombreartis(String nombreartis) {
        this.nombreartis = nombreartis;
    }

    public ArrayList<Canciones> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Canciones> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<Albumes> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<Albumes> albumes) {
        this.albumes = albumes;
    }

    @Override
    public String toString() {
        return "Artistas{" + "nombreartis=" + nombreartis + ", canciones=" + canciones + ", albumes=" + albumes + '}';
    }

}
