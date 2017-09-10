/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Coleccion;
import java.util.List;

/**
 *
 * @author victor restrepo
 */
public interface ColeccionDao {

    public Coleccion getColeccion(String nombre);

    public boolean saveColeccion(Coleccion coleccion);

    public List<Coleccion> getAllVenta();

    public boolean deleteColeccion(String nombre);

    public boolean updateColeccion(Coleccion coleccion);
}
