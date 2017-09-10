/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.business;

import com.dao.VentaDao;
import com.dao_.imp.FileVentaDao;
import com.model.Venta;

/**
 *
 * @author victor restrepo
 */
public class VentaNegocio {

    VentaDao ventaDao;

    public VentaNegocio() {
        ventaDao = new FileVentaDao();
    }

    public boolean GuardarProducto(Venta nuevo) {
        return ventaDao.saveVenta(nuevo);
    }
}
