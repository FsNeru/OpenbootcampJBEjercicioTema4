package com.openbootcamp;

public class SmartDevice {
    String marca;
    String modelo;
    String anioFabricacion;


    public SmartDevice() {
    }

    public SmartDevice(String marca, String modelo, String anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(String anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anioFabricacion='" + anioFabricacion + '\'' +
                '}';
    }
}
