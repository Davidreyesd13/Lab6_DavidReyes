package lab6_davidreyes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Adm_Usuarios {

    private ArrayList<Usuarios> listausers = new ArrayList();
    private File archivo = null;

    public Adm_Usuarios(String path) {
    archivo = new File(path);
    }
    
    public ArrayList<Usuarios> getListausers() {
        return listausers;
    }

    public void setListausers(ArrayList<Usuarios> listausers) {
        this.listausers = listausers;
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
            for (Usuarios t : listausers) {
                bw.write(t.getUser() + "-");
                bw.write(t.getPass() + "-");
                bw.write(t.getEdad() + "-");
                bw.write(t.getTipo()+"-");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listausers = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("-");
                while (sc.hasNext()) {
                    listausers.add(new Usuarios(sc.nextLine(), sc.nextLine(),sc.nextInt(), sc.nextLine()));
                    
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }
}
