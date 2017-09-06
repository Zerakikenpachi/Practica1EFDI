/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;
import com.model.Producto;
/**
 *
 * @author Andres
 */

public class ProductoControlador {

    Producto nuevo;

    public boolean CrearProducti(String pTipo, int pCantidad, double pPrecio) {
        if (pTipo != "" && pCantidad != 0 && pPrecio != 0.0) {
            nuevo = new Producto(pTipo, pCantidad, pPrecio);
            return true;
        } else {
            return false;
        }
    }
}
