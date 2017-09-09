/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.business.ProductoNegocio;
import com.model.Producto;

/**
 *
 * @author Andres
 */
public class ProductoControlador {

    ProductoNegocio p;
    Producto nuevo;

    public ProductoControlador() {
        p = new ProductoNegocio();
    }

    public boolean CrearProducto(String pTipo, String pCantidad, String pPrecio) {
        nuevo = new Producto(pTipo, pCantidad, pPrecio);

        return p.GuardarProducto(nuevo);
    }

}
