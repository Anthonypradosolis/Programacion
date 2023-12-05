package com.anthony.partes;

public class Monitor {
    private float pulgadas;
    public Monitor(float pulgadas) {
        this.pulgadas = pulgadas;
    }
    @Override
    public String toString() {
        return "\nMonitor= "+pulgadas +" pulgadas";
    }
}