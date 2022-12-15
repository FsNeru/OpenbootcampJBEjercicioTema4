package com.openbootcamp;

public class SmartPhone extends SmartDevice{

    String sistemaOperativo;
    String mermoriaRam;

    public SmartPhone() {
    }

    public SmartPhone(String marca, String modelo, String anioFabricacion, String sistemaOperativo, String mermoriaRam) {
        super(marca, modelo, anioFabricacion);
        this.sistemaOperativo = sistemaOperativo;
        this.mermoriaRam = mermoriaRam;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getMermoriaRam() {
        return mermoriaRam;
    }

    public void setMermoriaRam(String mermoriaRam) {
        this.mermoriaRam = mermoriaRam;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "sistemaOperativo='" + sistemaOperativo + '\'' +
                ", mermoriaRam='" + mermoriaRam + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anioFabricacion='" + anioFabricacion + '\'' +
                '}';
    }
}
