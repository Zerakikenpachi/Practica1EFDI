package com.controller;

import com.business.TipoProductoNegocio;
import com.model.TipProducto;
import java.util.List;

/**
 *
 * @author Andres Carrascal Verona
 */
public class TipoProductoControlador {

    TipoProductoNegocio p;
    TipProducto nuevo;

    public TipoProductoControlador() {
        p = new TipoProductoNegocio();
    }

    public boolean CrearTipoProducto(String pRefer, String pNombre) {
        if (!pRefer.equals("") && !pNombre.equals("")) {
            nuevo = new TipProducto(pRefer, pNombre);
            return p.GuardarTipoProducto(nuevo);
        } else {
            return false;
        }
    }

    public List<TipProducto> ConsultarTipoProductos() {
        return p.ConsultarProductos();
    }

    public String ProductoEsta(String nombre) {
        String data = null;
        List<TipProducto> tipproducto = ConsultarTipoProductos();
        for (TipProducto q : tipproducto) {
            if (q.getNombre().trim().equals(nombre)) {
                data = q.getReferencia().trim() + " | " + q.getNombre().trim();
            }
        }
        return data;
    }
}
