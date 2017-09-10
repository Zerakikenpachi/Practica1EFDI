package com.model;

/**
 *
 * @author Andres Carrascal Verona
 */
public class Coleccion {

    private String trimestre;
    private String Id;

    public Coleccion(String trimestre, String Id) {
        this.trimestre = trimestre;
        this.Id = Id;
    }

    public String getTrimestre() {
        return trimestre;
    }

    public void setTrimestre(String trimestre) {
        this.trimestre = trimestre;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    @Override
    public String toString() {
        return trimestre + " | " + Id;
    }
}
