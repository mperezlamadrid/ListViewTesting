package com.example.manuelperez.listviewtesting;

import java.util.ArrayList;

/**
 * Created by manuelperez on 9/30/17.
 */

public class Datos {
    private static ArrayList<Celular> celulares = new ArrayList();

    public static void guardarCelulares(Celular c){
        celulares.add(c);
    }

    public static ArrayList<Celular> obtenerCelulares(){
        return celulares;
    }
}
