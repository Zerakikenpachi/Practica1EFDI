package com.controller;

import com.business.TipoProductoNegocio;
import com.model.TipoProducto;
import java.util.List;

/**
 *
 * @author Andres Carrascal Verona
 */
public class TipoProductoControlador {

    TipoProductoNegocio p;
    TipoProducto nuevo;

    public TipoProductoControlador() {
        p = new TipoProductoNegocio();
    }

    public boolean CrearTipoProducto(String pRefer, String pNombre) {
        if (!pRefer.equals("") && !pNombre.equals("")) {
            nuevo = new TipoProducto(pRefer, pNombre);
            return p.GuardarTipoProducto(nuevo);
        } else {
            return false;
        }
    }

    public List<TipoProducto> ConsultarTipoProductos() {
        return p.ConsultarProductos();
    }

    public String ProductoEsta(String nombre) {
        String data = null;
        List<TipoProducto> tipproducto = ConsultarTipoProductos();
        for (TipoProducto q : tipproducto) {
            if (q.getNombre().trim().equals(nombre)) {
                data = q.getReferencia().trim() + " | " + q.getNombre().trim();
            }
        }
        return data;
    }
}
