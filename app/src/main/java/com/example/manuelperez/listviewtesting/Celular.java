package com.example.manuelperez.listviewtesting;

/**
 * Created by manuelperez on 9/30/17.
 */

public class Celular {
    private int marca;
    private int color;
    private double capacidadRAM;
    private double precio;

    public Celular(int marca, int color, double capacidadRAM, double precio) {
        this.marca = marca;
        this.color = color;
        this.capacidadRAM = capacidadRAM;
        this.precio = precio;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public double getCapacidadRAM() {
        return capacidadRAM;
    }

    public void setCapacidadRAM(double capacidadRAM) {
        this.capacidadRAM = capacidadRAM;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void guardar(){
        Datos.guardarCelulares(this);
    }
}
