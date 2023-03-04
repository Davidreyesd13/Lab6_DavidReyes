package lab6_davidreyes;

import java.io.File;
import java.util.ArrayList;

public class Adm_Canciones {
    private ArrayList<Canciones> listausersc = new ArrayList();
    private File archivo = null; 

    public Adm_Canciones(String path) {
    archivo = new File(path);
    
    }

    public ArrayList<Canciones> getListausersc() {
        return listausersc;
    }

    public void setListausersc(ArrayList<Canciones> listausersc) {
        this.listausersc = listausersc;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
}
