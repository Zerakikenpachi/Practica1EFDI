/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Producto;
import java.util.List;

/**
 *
 * @author Andres
 */
public interface ProductoDao {
    	public Producto getProducto(String nombre);
	public boolean saveProducto(Producto producto);
	public List<Producto> getAllProducto();
	public boolean deleteProducto(String nombre);
	public boolean updatePersona(Producto producto);
}
