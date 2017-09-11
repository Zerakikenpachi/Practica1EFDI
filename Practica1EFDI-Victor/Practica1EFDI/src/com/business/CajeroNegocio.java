/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.business;

import com.dao.CajeroDAO;
import com.dao_.imp.FileCajeroDAO;
import com.model.Cajero;

/**
 *
 * @author Duvan Otero
 */
public class CajeroNegocio {

    CajeroDAO CajeroDAO;

    public CajeroNegocio() {
        CajeroDAO = new FileCajeroDAO();
    }

    public boolean GuardarCajero(Cajero nuevo) {
        return CajeroDAO.saveCajero(nuevo);
    }

}
