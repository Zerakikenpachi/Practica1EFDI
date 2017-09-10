/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.util.Date;

/**
 *
 * @author Duvan Otero
 */
public class Cajero {

    private static final long serialVersionUID = 1L;
    private String idCajero;
    private Date fechaIngreso;
    private String contraseña;
    private String estado;

    public Cajero() {
    }

    public Cajero(String idCajero) {
        this.idCajero = idCajero;
    }

    public Cajero(String idCajero, Date fechaIngreso, String contraseña, String estado) {
        this.idCajero = idCajero;
        this.fechaIngreso = fechaIngreso;
        this.contraseña = contraseña;
        this.estado = estado;
    }

    public String getIdCajero() {
        return idCajero;
    }

    public void setIdCajero(String idCajero) {
        this.idCajero = idCajero;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCajero != null ? idCajero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cajero)) {
            return false;
        }
        Cajero other = (Cajero) object;
        if ((this.idCajero == null && other.idCajero != null) || (this.idCajero != null && !this.idCajero.equals(other.idCajero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Cajero[ idCajero=" + idCajero + " ]";
    }

}
