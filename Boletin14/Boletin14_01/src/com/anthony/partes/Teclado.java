package com.anthony.partes;
public class Teclado {
    private String marca;
    public Teclado(String marca) {
        this.marca = marca;
    }
    @Override
    public String toString() {
        return " \nMarca del Teclado= "+ marca;
    }
}
