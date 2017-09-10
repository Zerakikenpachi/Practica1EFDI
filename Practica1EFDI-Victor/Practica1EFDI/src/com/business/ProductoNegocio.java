/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.business;

import com.dao.ProductoDao;
import com.dao_.imp.FileProductoDao;
import com.model.Producto;
import java.util.List;

/**
 *
 * @author Andres
 */
public class ProductoNegocio {
    ProductoDao productoDao;

    public ProductoNegocio() {
        productoDao = new FileProductoDao();
    }
    
    public boolean GuardarProducto(Producto nuevo){
       return productoDao.saveProducto(nuevo);
    }
    
    public List<Producto> ConsultarProductos(){
        return productoDao.getAllProducto();
    }
}
