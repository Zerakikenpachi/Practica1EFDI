/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Cajero;
import java.util.List;

/**
 *
 * @author Duvan Otero
 */
public interface CajeroDAO {

    public Cajero getCajero(String nombre);

    public boolean saveCajero(Cajero Cajero);

    public List<Cajero> getAllCajero();

    public boolean deleteCajero(String nombre);

    public boolean updateCajero(Cajero Cajero);
}
