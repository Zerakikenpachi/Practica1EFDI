/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao_.imp;

import com.dao.CajeroDAO;
import com.model.Cajero;
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
 * @author Duvan Otero
 */
public class FileCajeroDAO implements CajeroDAO {

    public FileCajeroDAO() {
        if (!Files.exists(file)) {
            try {
                Files.createFile(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private static final String REGISTRO_ELIMINADO_TEXT = "||||||||||";
    private static final String NOMBRE_ARCHIVO = "Cajero";
    private static final Path file = Paths.get(NOMBRE_ARCHIVO);
    private static final int LONGITUD_REGISTRO = 50;
    private static final int DIRECCION_LONGITUD = 15;
    private static final Map<String, Cajero> CACHE_PERSONAS = new HashMap<String, Cajero>();

    @Override
    public boolean saveCajero(Cajero cajero) {
        String registro = parseCajeroString(cajero);
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

    private String parseCajeroString(Cajero cajero) {
        StringBuilder registro = new StringBuilder(LONGITUD_REGISTRO);
        registro.append(completarCampoConEspacios(cajero.getContraseña(), DIRECCION_LONGITUD));
        registro.append(completarCampoConEspacios(cajero.getEstado(), DIRECCION_LONGITUD));
        registro.append(completarCampoConEspacios(cajero.getIdCajero(), DIRECCION_LONGITUD));
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
    public Cajero getCajero(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cajero> getAllCajero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteCajero(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateCajero(Cajero Cajero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
