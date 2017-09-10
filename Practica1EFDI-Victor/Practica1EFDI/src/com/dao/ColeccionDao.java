package com.dao;

import com.model.Coleccion;
import java.util.List;

/**
 *
 * @author Andres Carrascal Verona
 */
public interface ColeccionDao {

    public boolean saveColeccion(Coleccion coleccion);

    public List<Coleccion> getAllColeccion();
}
