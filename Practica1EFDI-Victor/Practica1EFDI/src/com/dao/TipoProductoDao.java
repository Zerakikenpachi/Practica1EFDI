package com.dao;

import com.model.TipoProducto;
import java.util.List;

/**
 *
 * @author Andres Carrascal Verona
 */
public interface TipoProductoDao {

    public boolean saveTipoProducto(TipoProducto tipproducto);

    public List<TipoProducto> getAllTipProducto();
}
