/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.business.AlmacenNegocio;
import com.model.Almacen;
import java.sql.Date;

/**
 *
 * @author Duvan Otero
 */
public class AlmacenControlador {

    AlmacenNegocio p;
    Almacen nuevo;

    public AlmacenControlador() {
        p = new AlmacenNegocio();
    }

    public boolean CrearAlmacen(int id, String Nombre, String Direccion, String Ciudad, Date Horario, int nroCodigo) {
        nuevo = new Almacen(id, Nombre, Direccion, Ciudad, Horario, nroCodigo);
        return p.GuardarAlmacen(nuevo);
    }

}
