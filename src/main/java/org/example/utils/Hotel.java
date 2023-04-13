package org.example.utils;

public class Hotel {
    private String nombre;
    private String calificacion;
    private String codigoPostal;
    private String calle;
    private String noExterior;
    private String noInterior;

    public Hotel(String nombre, String calificacion, String codigoPostal, String calle, String noExterior, String noInterior) {
        this.nombre = nombre;
        this.calificacion = calificacion;
        this.codigoPostal = codigoPostal;
        this.calle = calle;
        this.noExterior = noExterior;
        this.noInterior = noInterior;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNoExterior() {
        return noExterior;
    }

    public void setNoExterior(String noExterior) {
        this.noExterior = noExterior;
    }

    public String getNoInterior() {
        return noInterior;
    }

    public void setNoInterior(String noInterior) {
        this.noInterior = noInterior;
    }
}
