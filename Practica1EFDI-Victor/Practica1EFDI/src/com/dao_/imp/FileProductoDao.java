/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao_.imp;

import com.dao.ProductoDao;
import com.model.Producto;
import java.io.File;
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
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class FileProductoDao implements ProductoDao {

    private static final String REGISTRO_ELIMINADO_TEXT = "||||||||||";
    private static final String NOMBRE_ARCHIVO = "producto";
    private static final Path file = Paths.get(NOMBRE_ARCHIVO);
    private static final int LONGITUD_REGISTRO = 50;
    private static final int TIPO_LONGITUD = 15;
    private static final int CANTIDAD_LONGITUD = 10;
    private static final int PRECIO_LONGITUD = 10;

    private static final Map<String, Producto> CACHE_PERSONAS = new HashMap<String, Producto>();

    @Override
    public Producto getProducto(String nombre) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean saveProducto(Producto producto) {
        String registro = parseProductoString(producto);
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

    @Override
    public List<Producto> getAllProducto() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean deleteProducto(String nombre) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean updatePersona(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private String parseProductoString(Producto producto) {
        StringBuilder registro = new StringBuilder(LONGITUD_REGISTRO);
        registro.append(completarCampoConEspacios(producto.getTipo(), TIPO_LONGITUD));
        registro.append(completarCampoConEspacios(producto.getCantidad(), CANTIDAD_LONGITUD));
        registro.append(completarCampoConEspacios(producto.getPrecio(), PRECIO_LONGITUD));
        return registro.toString();
    }

    private String completarCampoConEspacios(String campo, int tamanio) {
        if (campo.length() > tamanio) {//Ser responsable y lanzar una excepci�n
            campo = campo.substring(0, tamanio);
            return campo;
        }
        return String.format("%1$-" + tamanio + "s", campo);
    }
}
