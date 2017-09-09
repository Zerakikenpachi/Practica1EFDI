/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author Duvan Otero
 */
public class Almacen {
    
    
    private static final long serialVersionUID = 1L;
    private String idAlmacen;
    private int nroCodigo;
    private String ciudad;
    private String direccion;
    private String horario;

    public Almacen() {
    }

    public Almacen(String idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public Almacen(String idAlmacen, int nroCodigo, String ciudad, String direccion, String horario) {
        this.idAlmacen = idAlmacen;
        this.nroCodigo = nroCodigo;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.horario = horario;
    }

    public String getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(String idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public int getNroCodigo() {
        return nroCodigo;
    }

    public void setNroCodigo(int nroCodigo) {
        this.nroCodigo = nroCodigo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAlmacen != null ? idAlmacen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Almacen)) {
            return false;
        }
        Almacen other = (Almacen) object;
        if ((this.idAlmacen == null && other.idAlmacen != null) || (this.idAlmacen != null && !this.idAlmacen.equals(other.idAlmacen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Almacen[ idAlmacen=" + idAlmacen + " ]";
    }
    
}
    

