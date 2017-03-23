package com.example.alumnos.hndisaacgarcia.beans;

import com.google.gson.Gson;

import java.io.Serializable;

/**
 * Created by ALUMNOS on 14/03/2017.
 */

public class NavesBean implements Serializable {

    public String toJson(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }
    public static NavesBean fromJson(String json){
        Gson gson = new Gson();
        NavesBean navesBean = gson.fromJson(json,NavesBean.class);
        return navesBean;
    }

    String nombre, descripcion;
    int imagen;

    public NavesBean(String nombre, String descripcion, int imagen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
