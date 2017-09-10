package com.controller;

import com.business.ColeccionNegocio;
import com.model.Coleccion;
import java.util.List;

/**
 *
 * @author Andres Carrascal Verona
 */
public class ColeccionControlador {

    ColeccionNegocio p;
    Coleccion nuevo;

    public ColeccionControlador() {
        p = new ColeccionNegocio();
    }

    public boolean CrearColeccion(String pTrimestre, String pId) {
        if (!pTrimestre.equals("") && !pId.equals("")) {
            nuevo = new Coleccion(pTrimestre, pId);
            return p.GuardarColeccion(nuevo);
        } else {
            return false;
        }
    }

    public List<Coleccion> ConsultarColecciones() {
        return p.ConsultarColecciones();
    }

    public String ColeccionEsta(String Id) {
        String data = null;
        List<Coleccion> coleccion = ConsultarColecciones();
        for (Coleccion q : coleccion) {
            if (q.getId().trim().equals(Id)) {
                data = q.getTrimestre().trim() + " | " + q.getId().trim();
            }
        }
        return data;
    }
}
