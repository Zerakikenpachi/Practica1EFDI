package com.controller;

import com.business.ProductoNegocio;
import com.model.Producto;
import java.util.List;

/**
 *
 * @author Andres Carrascal Verona
 */
public class ProductoControlador {

    ProductoNegocio p;
    Producto nuevo;

    public ProductoControlador() {
        p = new ProductoNegocio();
    }

    public boolean CrearProducto(String pTipo, String pColecc, String pCantidad, String pPrecio) {
        if (!pTipo.equals("") && !pColecc.equals("") && !pCantidad.equals("") && !pPrecio.equals("")) {
            nuevo = new Producto(pTipo, pColecc, pCantidad, pPrecio);
            return p.GuardarProducto(nuevo);
        } else {
            return false;
        }
    }

    public List<Producto> ConsultarProductos() {
        return p.ConsultarProductos();
    }

}
