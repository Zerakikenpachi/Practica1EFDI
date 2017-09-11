package com.model;

import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Duvan Otero
 */
public class Cajero {

    private String idCajero;
    private Date fechaIngreso;
    private String contraseña;
    private String estado;

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

}
