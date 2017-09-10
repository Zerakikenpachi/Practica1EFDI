/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao_.imp;

import com.dao.VentaDao;
import com.model.Venta;
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
public class FileVentaDao implements VentaDao {

    public FileVentaDao() {
        if (!Files.exists(file)) {
            try {
                Files.createFile(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private static final String REGISTRO_ELIMINADO_TEXT = "||||||||||";
    private static final String NOMBRE_ARCHIVO = "Venta";
    private static final Path file = Paths.get(NOMBRE_ARCHIVO);
    private static final int LONGITUD_REGISTRO = 50;
    private static final int ID_LONGITUD = 15;
    private static final int MEDIO_LONGITUD = 30;

    private static final Map<String, Venta> CACHE_PERSONAS = new HashMap<String, Venta>();

    @Override
    public boolean saveVenta(Venta venta) {
        String registro = parseVentaString(venta);
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

    private String parseVentaString(Venta venta) {
        StringBuilder registro = new StringBuilder(LONGITUD_REGISTRO);
        registro.append(completarCampoConEspacios(venta.getIdAlmacen(), ID_LONGITUD));
        registro.append(completarCampoConEspacios(venta.getIdCajero(), ID_LONGITUD));
        registro.append(completarCampoConEspacios(venta.getIdCliente(), ID_LONGITUD));
        registro.append(completarCampoConEspacios(venta.getIdVenta(), ID_LONGITUD));
        registro.append(completarCampoConEspacios(venta.getMedioPago(), MEDIO_LONGITUD));
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
    public Venta getVenta(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Venta> getAllVenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateVenta(Venta venta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteVenta(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
