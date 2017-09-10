/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Cliente;
import java.util.List;

/**
 *
 * @author victor restrepo
 */
public interface ClienteDao {

    public Cliente getCliente(String nombre);

    public boolean saveCliente(Cliente cliente);

    public List<Cliente> getAllVenta();

    public boolean deleteCliente(String nombre);

    public boolean updateCliente(Cliente cliente);
}
