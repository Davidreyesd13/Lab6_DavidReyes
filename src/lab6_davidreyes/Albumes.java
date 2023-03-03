package lab6_davidreyes;

import java.util.ArrayList;
import java.util.Date;

public class Albumes extends Lanzamientos{
    int cont;
    ArrayList<Canciones> canciones;

    public Albumes(int cont, ArrayList<Canciones> canciones, String titulo, Date fecha, int likes) {
        super(titulo, fecha, likes);
        this.cont = cont;
        this.canciones = canciones;
    }

    public Albumes() {
    super();
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public ArrayList<Canciones> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Canciones> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "Albumes{" + "cont=" + cont + ", canciones=" + canciones + '}';
    }
    
}
