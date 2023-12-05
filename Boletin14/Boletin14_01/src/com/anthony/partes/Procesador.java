package com.anthony.partes;
public class Procesador {
    private float velocidadcpu;
    public Procesador(float velocidadcpu) {
        this.velocidadcpu = velocidadcpu;
    }
    @Override
    public String toString() {
        return "\nVelocidad del Procesador= "+ velocidadcpu;
    }
}