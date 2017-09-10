/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.business;

import com.dao.ClienteDao;
import com.dao_.imp.FileClienteDao;
import com.model.Cliente;

/**
 *
 * @author victor restrepo
 */
public class ClienteNegocio {
    ClienteDao clienteDao;

    public ClienteNegocio() {
        clienteDao = new FileClienteDao();
    }

    public boolean GuardarCliente(Cliente nuevo) {
        return clienteDao.saveCliente(nuevo);
    }
}
