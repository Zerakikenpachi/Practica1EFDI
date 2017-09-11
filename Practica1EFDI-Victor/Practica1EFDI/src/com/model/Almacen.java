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
public class Almacen {

    private int id;
    private String Nombre;
    private String Direccion;
    private String Ciudad;
    private Date Horario;
    private int nroCodigo;

    public Almacen(int id, String Nombre, String Direccion, String Ciudad, Date Horario, int nroCodigo) {
        this.id = id;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Ciudad = Ciudad;
        this.Horario = Horario;
        this.nroCodigo = nroCodigo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public Date getHorario() {
        return Horario;
    }

    public void setHorario(Date Horario) {
        this.Horario = Horario;
    }

    public int getNroCodigo() {
        return nroCodigo;
    }

    public void setNroCodigo(int nroCodigo) {
        this.nroCodigo = nroCodigo;
    }

}
