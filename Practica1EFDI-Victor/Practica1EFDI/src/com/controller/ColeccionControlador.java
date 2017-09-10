/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.business.ColeccionNegocio;
import com.model.Coleccion;

/**
 *
 * @author victor restrepo
 */
public class ColeccionControlador {
    ColeccionNegocio p;
    Coleccion nuevo;

    public ColeccionControlador() {
        p = new ColeccionNegocio();
    }

    public boolean CrearColecciom(String trimestre, String Id) {
        nuevo = new Coleccion(trimestre,Id);

        return p.GuardarColeccion(nuevo);
    }
}
