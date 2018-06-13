package com.example.movil.proyectomoviles;

import java.util.ArrayList;

public class Usuarios {

    int id;
    String nombre,edad,correo,password,confPassword;
    ArrayList<Usuarios> listaUsuarios=new ArrayList<>();

    public Usuarios() {
    }

    public Usuarios(int id, String nombre, String edad, String correo, String password, String confPassword) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.password = password;
        this.confPassword = confPassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfPassword() {
        return confPassword;
    }

    public void setConfPassword(String confPassword) {
        this.confPassword = confPassword;
    }
    public ArrayList<Usuarios> getListaUsuarios() {
        return listaUsuarios;
    }
    public void addListaUsuario(int id, String nombre, String edad, String correo, String pass, String confpass){
        listaUsuarios.add(new Usuarios(id,nombre,edad,correo,pass,confpass));

    }


}
