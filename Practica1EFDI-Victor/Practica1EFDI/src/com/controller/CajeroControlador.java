/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.business.CajeroNegocio;
import com.model.Cajero;
import java.sql.Date;

/**
 *
 * @author Duvan Otero
 */
public class CajeroControlador {

    CajeroNegocio p;
    Cajero nuevo;

    public CajeroControlador() {
        p = new CajeroNegocio();
    }

    public boolean CrearCajero(String idCajero, Date fechaIngreso, String contraseña, String estado) {
        nuevo = new Cajero(idCajero, fechaIngreso, contraseña, estado);
        return p.GuardarCajero(nuevo);
    }

}
