/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Almacen;
import java.util.List;

/**
 *
 * @author Duvan Otero
 */
public interface AlmacenDAO {

    public Almacen getAlmacen(String nombre);

    public boolean saveAlmacen(Almacen Almacen);

    public List<Almacen> getAllAlmacen();

    public boolean deleteAlmacen(String nombre);

    public boolean updateAlmacen(Almacen Almacen);

}
