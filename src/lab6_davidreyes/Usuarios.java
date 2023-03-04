package lab6_davidreyes;

import java.util.Date;

public class Usuarios {

    private String pass, user;
    private int edad;
    private String tipo;

    public Usuarios(String pass, String user, int edad, String tipo) {
        this.pass = pass;
        this.user = user;
        this.edad = edad;
        this.tipo = tipo;
    }

    public Usuarios() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "pass=" + pass + ", user=" + user + ", edad=" + edad + '}';
    }

}
