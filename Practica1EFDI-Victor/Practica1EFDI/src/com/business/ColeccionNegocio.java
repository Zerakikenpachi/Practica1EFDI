/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.business;

import com.dao.ColeccionDao;
import com.dao_.imp.FileColeccionDao;
import com.model.Coleccion;

/**
 *
 * @author victor restrepo
 */
public class ColeccionNegocio {

    ColeccionDao coleccionDao;

    public ColeccionNegocio() {
        coleccionDao = new FileColeccionDao();
    }

    public boolean GuardarColeccion(Coleccion nuevo) {
        return coleccionDao.saveColeccion(nuevo);
    }
}
