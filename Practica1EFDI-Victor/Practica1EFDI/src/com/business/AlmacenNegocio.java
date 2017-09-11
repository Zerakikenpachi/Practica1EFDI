/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.business;

import com.dao.AlmacenDAO;
import com.dao_.imp.FileAlmacenDAO;
import com.model.Almacen;

/**
 *
 * @author Duvan Otero
 */
public class AlmacenNegocio {

    AlmacenDAO AlmacenDAO;

    public AlmacenNegocio() {
        AlmacenDAO = new FileAlmacenDAO();
    }

    public boolean GuardarAlmacen(Almacen nuevo) {
        return AlmacenDAO.saveAlmacen(nuevo);
    }

}
