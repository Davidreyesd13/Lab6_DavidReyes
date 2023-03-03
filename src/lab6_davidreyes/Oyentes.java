package lab6_davidreyes;

import java.util.ArrayList;

public class Oyentes extends Usuarios {

    String name;
    ArrayList<Canciones> canciones;
    ArrayList<playlist> list;
    ArrayList<playlist> listfav;

    public Oyentes(String name, ArrayList<Canciones> canciones, ArrayList<playlist> list, ArrayList<playlist> listfav, String pass, String user, int edad) {
        super(pass, user, edad);
        this.name = name;
        this.canciones = canciones;
        this.list = list;
        this.listfav = listfav;
    }

    public Oyentes() {
        super();
    }

    public ArrayList<playlist> getListfav() {
        return listfav;
    }

    public void setListfav(ArrayList<playlist> listfav) {
        this.listfav = listfav;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Canciones> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Canciones> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<playlist> getList() {
        return list;
    }

    public void setList(ArrayList<playlist> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Oyentes{" + "name=" + name + ", canciones=" + canciones + ", list=" + list + '}';
    }

}
