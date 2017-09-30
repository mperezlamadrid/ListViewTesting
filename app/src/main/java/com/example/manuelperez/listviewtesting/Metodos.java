package com.example.manuelperez.listviewtesting;

import java.util.ArrayList;

/**
 * Created by manuelperez on 9/30/17.
 */

public class Metodos {
    // Reporte No. 2
    public static ArrayList<Celular> marca_samsung_2_a_4_ram(ArrayList<Celular> celulares){
        ArrayList<Celular> cels = new ArrayList();

        for (int i = 0; i < celulares.size() ; i++) {
            Celular celular = celulares.get(i);

            if (celular.getMarca() == 0 && (celular.getCapacidadRAM() >= 2 && celular.getCapacidadRAM() <= 4)) {
                cels.add(celular);
            }
        }

        return cels;
    }

    /*public static ArrayList<Celular> marca_apple_negros(ArrayList<Celular> celulares){
        ArrayList<Celular> negros = new ArrayList();

        for (int i = 0; i < celulares.size() ; i++) {
            Celular celular = celulares.get(i);

            if (celular.getMarca() == 2 && celular.getColor() == 0) {
                negros.add(celular);
            }
        }

        return negros;
    }*/

    // Reporte No. 4
    public static int cuantos_apples_negros(ArrayList<Celular> celulares){
        int count = 0;

        for (int i = 0; i < celulares.size() ; i++) {
            if (celulares.get(i).getMarca() == 2 && celulares.get(i).getColor() == 0)count++;
        }

        return count;
    }

    // Reporte No. 5
    public static double precio_promedio_nokias(ArrayList<Celular> celulares){
        double promedio;
        double sum = 0, count = 0;

        if(celulares.isEmpty()){
            promedio = 0;
        }else {
            for (int i = 0; i < celulares.size() ; i++) {
                Celular celular = celulares.get(i);

                if (celular.getMarca() == 1){
                    sum += celular.getPrecio();
                    count++;
                }
            }

            promedio = sum / count;
        }

        return promedio;
    }

}
