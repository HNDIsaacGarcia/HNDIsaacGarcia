package com.example.alumnos.hndisaacgarcia.beans;

import com.google.gson.Gson;

import java.io.Serializable;

/**
 * Created by ALUMNOS on 14/03/2017.
 */

public class UsuarioBean implements Serializable{

    public String toJson(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }
    public static UsuarioBean fromJson(String json){
        Gson gson = new Gson();
        UsuarioBean usuarioBean = gson.fromJson(json,UsuarioBean.class);
        return usuarioBean;
    }


}
