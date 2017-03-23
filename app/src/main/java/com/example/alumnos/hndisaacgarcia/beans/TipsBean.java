package com.example.alumnos.hndisaacgarcia.beans;

import java.io.Serializable;
import com.google.gson.Gson;

/**
 * Created by ALUMNOS on 14/03/2017.
 */

public class TipsBean implements Serializable {


    public  String toJson(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }
    public static TipsBean fromJson(String json){
        Gson gson = new Gson();
        TipsBean tipsBean = gson.fromJson(json,TipsBean.class);
        return tipsBean;
    }
}

