package com.model;

/**
 *
 * @author Andres Carrascal Verona
 */
public class TipProducto {

    private String Referencia;
    private String Nombre;

    public TipProducto(String Referencia, String Nombre) {
        this.Referencia = Referencia;
        this.Nombre = Nombre;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return Referencia + " | " + Nombre;
    }
}
