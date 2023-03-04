package lab6_davidreyes;

import java.io.File;
import java.util.ArrayList;

public class Adm_Lanzamientos {
 private ArrayList<Lanzamientos> listausersc = new ArrayList();
    private File archivo = null; 

    public Adm_Lanzamientos(String path) {
    archivo = new File(path);
    }

    public ArrayList<Lanzamientos> getListausersc() {
        return listausersc;
    }

    public void setListausersc(ArrayList<Lanzamientos> listausersc) {
        this.listausersc = listausersc;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
}
