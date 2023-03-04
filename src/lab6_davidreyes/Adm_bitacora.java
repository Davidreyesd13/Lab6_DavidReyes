package lab6_davidreyes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Adm_bitacora {
private ArrayList listausersb = new ArrayList();
    private File archivo = null; 

    public Adm_bitacora(String path) {
    archivo = new File(path);
    }

    public ArrayList getListausersb() {
        return listausersb;
    }

    public void setListausersb(ArrayList listausersb) {
        this.listausersb = listausersb;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (Object t : listausersb) {
                bw.write(((Usuarios)t).getUser() + "*");
                bw.write(((Usuarios)t).getTipo()+"*");
                bw.write(new Date().toString());
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listausersb = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("*");
                while (sc.hasNext()) {
                    listausersb.add(new Usuarios(sc.nextLine(), sc.nextLine(),sc.nextInt(), sc.nextLine()));
                    
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }
}
