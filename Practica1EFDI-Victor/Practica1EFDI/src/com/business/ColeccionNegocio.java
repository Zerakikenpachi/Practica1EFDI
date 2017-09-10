/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.business;

import com.dao.ColeccionDao;
import com.dao_.imp.FileColeccionDao;
import com.model.Coleccion;
import java.util.List;

/**
 *
 * @author Andres
 */
public class ColeccionNegocio {

    ColeccionDao coleccion;

    public ColeccionNegocio() {
        coleccion = new FileColeccionDao();
    }

    public boolean GuardarColeccion(Coleccion colec) {
        return coleccion.saveColeccion(colec);
    }

    public List<Coleccion> ConsultarColecciones() {
        return coleccion.getAllColeccion();
    }

}
