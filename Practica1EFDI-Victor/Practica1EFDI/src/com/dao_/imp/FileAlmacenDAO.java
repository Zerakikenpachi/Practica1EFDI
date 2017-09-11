/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao_.imp;

import com.dao.AlmacenDAO;
import com.model.Almacen;
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

public class FileAlmacenDAO implements AlmacenDAO {

    public FileAlmacenDAO() {
        if (!Files.exists(file)) {
            try {
                Files.createFile(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private static final String REGISTRO_ELIMINADO_TEXT = "||||||||||";
    private static final String NOMBRE_ARCHIVO = "Almacen";
    private static final Path file = Paths.get(NOMBRE_ARCHIVO);
    private static final int LONGITUD_REGISTRO = 50;
    private static final int DIRECCION_LONGITUD = 15;
    private static final int NOMBRE_LONGITUD = 50;
    private static final Map<String, Almacen> CACHE_PERSONAS = new HashMap<String, Almacen>();

    @Override
    public boolean saveAlmacen(Almacen almacen) {
        String registro = parseAlmacenString(almacen);
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

    private String parseAlmacenString(Almacen almacen) {
        StringBuilder registro = new StringBuilder(LONGITUD_REGISTRO);
        registro.append(completarCampoConEspacios(almacen.getCiudad(), DIRECCION_LONGITUD));
        registro.append(completarCampoConEspacios(almacen.getDireccion(), DIRECCION_LONGITUD));
        registro.append(completarCampoConEspacios(almacen.getNombre(), NOMBRE_LONGITUD));

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
    public Almacen getAlmacen(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Almacen> getAllAlmacen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteAlmacen(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateAlmacen(Almacen Almacen) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
