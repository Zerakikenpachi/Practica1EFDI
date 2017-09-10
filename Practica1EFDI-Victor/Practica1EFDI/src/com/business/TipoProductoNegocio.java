/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.business;

import com.dao.TipoProductoDao;
import com.dao_.imp.FileTipoProductoDao;
import com.model.TipoProducto;
import java.util.List;

/**
 *
 * @author Andres
 */
public class TipoProductoNegocio {
    TipoProductoDao TiPro;
    public TipoProductoNegocio(){
        TiPro = new FileTipoProductoDao();
    }
    public boolean GuardarTipoProducto(TipoProducto tipPro){
        return TiPro.saveTipoProducto(tipPro);
    }
    
    public List<TipoProducto> ConsultarProductos(){
        return TiPro.getAllTipProducto();
    }
}
