package com.openbootcamp;

public class SmartWatch extends SmartDevice{
    String pulgadas;
    String tamanioPulsera;

    public SmartWatch() {
    }

    public SmartWatch(String marca, String modelo, String anioFabricacion, String pulgadas, String tamanioPulsera) {
        super(marca, modelo, anioFabricacion);
        this.pulgadas = pulgadas;
        this.tamanioPulsera = tamanioPulsera;
    }

    public String getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(String pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getTamanioPulsera() {
        return tamanioPulsera;
    }

    public void setTamanioPulsera(String tamanioPulsera) {
        this.tamanioPulsera = tamanioPulsera;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "pulgadas='" + pulgadas + '\'' +
                ", tamanioPulsera='" + tamanioPulsera + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anioFabricacion='" + anioFabricacion + '\'' +
                '}';
    }
}
