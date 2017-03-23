package com.example.alumnos.hndisaacgarcia.beans;

import java.io.Serializable;

import com.google.gson.Gson;

/**
 * Created by ALUMNOS on 14/03/2017.
 */

public class ObjetosBean  implements Serializable {

    public  String toJson(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }
    public static ObjetosBean fromJson(String json){
        Gson gson = new Gson();
        ObjetosBean objetosBean = gson.fromJson(json,ObjetosBean.class);
        return objetosBean;
    }

}
