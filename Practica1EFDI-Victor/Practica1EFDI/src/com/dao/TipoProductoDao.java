package com.dao;

import com.model.TipProducto;
import java.util.List;

/**
 *
 * @author Andres Carrascal Verona
 */
public interface TipoProductoDao {

    public boolean saveTipoProducto(TipProducto tipproducto);

    public List<TipProducto> getAllTipProducto();
}
