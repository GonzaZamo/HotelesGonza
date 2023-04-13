package org.example.utils;

public class Cliente {
    private String nombre;
    private String no_documento;
    private String telefono;
    private String edad;
    private String codigoPostal;
    private String calle;
    private String noExterior;
    private String noInterior;
    public Cliente(String nombre, String no_documento, String telefono, String edad, String codigoPostal, String calle, String noExterior, String noInterior) {
        this.nombre = nombre;
        this.no_documento = no_documento;
        this.telefono = telefono;
        this.edad = edad;
        this.codigoPostal = codigoPostal;
        this.calle = calle;
        this.noExterior = noExterior;
        this.noInterior = noInterior;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(){
        this.codigoPostal = codigoPostal;
    }

    public String getNo_documento(){
        return no_documento;
    }

    public void setNo_documento(){
        this.no_documento = no_documento;
    }

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono(){
        this.telefono = telefono;
    }

    public String getEdad(){
        return edad;
    }

    public void setEdad(){
        this.edad = edad;
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
