package com.example.alumnos.hndisaacgarcia.test;

import com.example.alumnos.hndisaacgarcia.R;
import com.example.alumnos.hndisaacgarcia.beans.NavesBean;
import com.example.alumnos.hndisaacgarcia.beans.ObjetosBean;
import com.example.alumnos.hndisaacgarcia.beans.TipsBean;

import java.util.ArrayList;

/**
 * Created by ALUMNOS on 14/03/2017.
 */

public class Modelo {

        public ArrayList<NavesBean>getNaves(){
            ArrayList<NavesBean> naves = new ArrayList<>();
            naves.add(new NavesBean("Enemigo","Enemigo estandar que cuya función es impedir que llegues a la meta, se les consigue matar con un unico disparo",R.drawable.Enemigo));
            naves.add(new NavesBean("Jefe","Jefe final cuya aparación es al final del juego, y muere cuando le golpean 10 disparos o 3 disparos especiales.",R.drawable.Jefe));
            naves.add(new NavesBean("Protagonista","Protagonista ",R.drawable.Protagonista));
            return naves;
        }


        public ArrayList<ObjetosBean>getObjetos(){
            ArrayList<ObjetosBean> objetos = new ArrayList<>();
            objetos.add(new ObjetosBean(""));
            return objetos;

        }
        public ArrayList<TipsBean>getTips(){
            ArrayList<TipsBean> tips = new ArrayList<>();
            return tips;

        }

}
