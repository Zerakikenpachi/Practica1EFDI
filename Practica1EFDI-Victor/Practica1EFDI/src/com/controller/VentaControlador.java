/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.business.VentaNegocio;
import com.model.Venta;
import java.util.Date;

/**
 *
 * @author victor restrepo
 */
public class VentaControlador {
    VentaNegocio p;
    Venta nuevo;

    public VentaControlador() {
        p = new VentaNegocio();
    }

    public boolean CrearProducto(String idVenta, int valorProducto, int descuento, int valorNeto, Date fecha, Date hora, String medioPago, String idAlmacen, String idCajero, String idCliente) {
        nuevo = new Venta(idVenta, valorProducto, descuento, valorNeto, fecha, hora, medioPago, idAlmacen, idCajero, idCliente);

        return p.GuardarProducto(nuevo);
    }
}
