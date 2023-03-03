package lab6_davidreyes;

import java.util.Date;

public class Singles extends Lanzamientos {

    Canciones cacion;

    public Singles() {
    }

    public Singles(Canciones cacion, String titulo, Date fecha, int likes) {
        super(titulo, fecha, likes);
        this.cacion = cacion;
    }

    public Canciones getCacion() {
        return cacion;
    }

    public void setCacion(Canciones cacion) {
        this.cacion = cacion;
    }

    @Override
    public String toString() {
        return "Singles{" + "cacion=" + cacion + '}';
    }

}
