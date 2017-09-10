package com.dao;

import com.model.Producto;
import java.util.List;

/**
 *
 * @author Andres Carrascal Verona
 */
public interface ProductoDao {

    public Producto getProducto(String nombre);

    public boolean saveProducto(Producto producto);

    public List<Producto> getAllProducto();

    public boolean deleteProducto(String nombre);

    public boolean updatePersona(Producto producto);
}
