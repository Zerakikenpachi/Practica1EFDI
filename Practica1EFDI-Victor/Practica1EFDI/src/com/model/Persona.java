/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author victor restrepo
 */
public class Persona {

    private static final long serialVersionUID = 1L;
    private String idPersona;
    private String nombre;
    private String apellido;
    private String correo;
    private int nroCelular;
    private String genero;
    private String idCajero;
    private String idCliente;

    public Persona() {
    }

    public Persona(String idPersona) {
        this.idPersona = idPersona;
    }

    public Persona(String idPersona, String nombre, String apellido, String correo, int nroCelular, String genero, String idCajero, String idCliente) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.nroCelular = nroCelular;
        this.genero = genero;
        this.idCajero = idCajero;
        this.idCliente = idCliente;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNroCelular() {
        return nroCelular;
    }

    public void setNroCelular(int nroCelular) {
        this.nroCelular = nroCelular;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdCajero() {
        return idCajero;
    }

    public void setIdCajero(String idCajero) {
        this.idCajero = idCajero;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPersona != null ? idPersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.idPersona == null && other.idPersona != null) || (this.idPersona != null && !this.idPersona.equals(other.idPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Persona[ idPersona=" + idPersona + " ]";
    }

}
