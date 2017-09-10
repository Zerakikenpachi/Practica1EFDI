/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao_.imp;

import com.dao.ClienteDao;
import com.model.Cliente;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.APPEND;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author victor restrepo
 */
public class FileClienteDao implements ClienteDao {

    public FileClienteDao() {
        if (!Files.exists(file)) {
            try {
                Files.createFile(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private static final String REGISTRO_ELIMINADO_TEXT = "||||||||||";
    private static final String NOMBRE_ARCHIVO = "Cliente";
    private static final Path file = Paths.get(NOMBRE_ARCHIVO);
    private static final int LONGITUD_REGISTRO = 50;
    private static final int DIRECCION_LONGITUD = 15;
    private static final int ID_LONGITUD = 15;

    private static final Map<String, Cliente> CACHE_PERSONAS = new HashMap<String, Cliente>();

    @Override
    public boolean saveCliente(Cliente cliente) {
        String registro = parseClienteString(cliente);
        byte data[] = registro.getBytes();
        ByteBuffer out = ByteBuffer.wrap(data);
        try (FileChannel fc = (FileChannel.open(file, APPEND))) {
            fc.write(out);
            return true;
        } catch (IOException x) {
            System.out.println("I/O Exception: " + x);
        }
        return false;
    }

    private String parseClienteString(Cliente cliente) {
        StringBuilder registro = new StringBuilder(LONGITUD_REGISTRO);
        registro.append(completarCampoConEspacios(cliente.getDireccion(), DIRECCION_LONGITUD));
        registro.append(completarCampoConEspacios(cliente.getIdCliente(), ID_LONGITUD));
        return registro.toString();
    }

    private String completarCampoConEspacios(String campo, int tamanio) {
        if (campo.length() > tamanio) {//Ser responsable y lanzar una excepci�n
            campo = campo.substring(0, tamanio);
            return campo;
        }
        return String.format("%1$-" + tamanio + "s", campo);
    }

    @Override
    public Cliente getCliente(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> getAllVenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteCliente(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
