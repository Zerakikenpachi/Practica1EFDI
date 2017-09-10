/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.business.ClienteNegocio;
import com.model.Cliente;
import java.util.Date;

/**
 *
 * @author victor restrepo
 */
public class ClienteControlador {

    ClienteNegocio p;
    Cliente nuevo;

    public ClienteControlador() {
        p = new ClienteNegocio();
    }

    public boolean CrearCliente(String idCliente, String direccion, Date fechaNacimiento) {
        nuevo = new Cliente(idCliente, direccion, fechaNacimiento);

        return p.GuardarCliente(nuevo);
    }
}
