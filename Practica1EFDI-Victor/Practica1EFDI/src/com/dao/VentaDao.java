/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Venta;
import java.util.List;

/**
 *
 * @author victor restrepo
 */
public interface VentaDao {

    public Venta getVenta(String nombre);

    public boolean saveVenta(Venta venta);

    public List<Venta> getAllVenta();

    public boolean deleteVenta(String nombre);

    public boolean updateVenta(Venta venta);
}
