package com.model;

/**
 *
 * @author Andres Carrascal Verona
 */
public class Producto {

    private String tipo;
    private String coleccion;
    private String cantidad;
    private String precio;

    public Producto(String tipo, String coleccion, String cantidad, String precio) {
        this.tipo = tipo;
        this.coleccion = coleccion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return tipo + " | " + coleccion + " | " + cantidad + " | " + precio;
    }

}
