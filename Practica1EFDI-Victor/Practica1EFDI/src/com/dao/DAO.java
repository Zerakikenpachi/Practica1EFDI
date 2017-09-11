/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import java.util.List;

/**
 *
 * @author Duvan Otero
 * @param <T>
 * @param <K>
 */
public interface DAO<T,K> {
    void insertar (T cajero);
    void modificar (T cajero);
    void eliminar (K id);
    List<T> obtenerTodos();
    T obtener (K id);
}
