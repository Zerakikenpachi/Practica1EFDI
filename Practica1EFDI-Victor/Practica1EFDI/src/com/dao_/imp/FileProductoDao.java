package com.dao_.imp;

import com.dao.ProductoDao;
import com.model.Producto;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.APPEND;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andres Carrascal Verona
 */
public class FileProductoDao implements ProductoDao {

    public FileProductoDao() {
        if (!Files.exists(file)) {
            try {
                Files.createFile(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private static final String NOMBRE_ARCHIVO = "Producto";
    private static final Path file = Paths.get(NOMBRE_ARCHIVO);
    private static final int LONGITUD_REGISTRO = 60;
    private static final int TIPO_LONGITUD = 15;
    private static final int COLECCION_LONGITUD = 15;
    private static final int CANTIDAD_LONGITUD = 15;
    private static final int PRECIO_LONGITUD = 15;

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
        List<Producto> productos = new ArrayList<Producto>();
        try (SeekableByteChannel sbc = Files.newByteChannel(file)) {
            ByteBuffer buf = ByteBuffer.allocate(LONGITUD_REGISTRO);
            String encoding = System.getProperty("file.encoding");
            while (sbc.read(buf) > 0) {
                buf.rewind();
                Producto producto = parseProducto(Charset.forName(encoding).decode(buf));
                buf.flip();
                productos.add(producto);
            }
        } catch (IOException x) {
            System.out.println("caught exception: " + x);
        }
        return productos;
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
        registro.append(completarCampoConEspacios(producto.getColeccion(), COLECCION_LONGITUD));
        registro.append(completarCampoConEspacios(producto.getCantidad(), CANTIDAD_LONGITUD));
        registro.append(completarCampoConEspacios(producto.getPrecio(), PRECIO_LONGITUD));
        return registro.toString();
    }

    private String completarCampoConEspacios(String campo, int tamanio) {
        if (campo.length() > tamanio) {
            campo = campo.substring(0, tamanio);
            return campo;
        }
        return String.format("%1$-" + tamanio + "s", campo);
    }

    private Producto parseProducto(CharBuffer registro) {

        String tipo = registro.subSequence(0, TIPO_LONGITUD).toString();
        registro.position(TIPO_LONGITUD);
        registro = registro.slice();

        String coleccion = registro.subSequence(0, COLECCION_LONGITUD).toString();
        registro.position(COLECCION_LONGITUD);
        registro = registro.slice();

        String cantidad = registro.subSequence(0, CANTIDAD_LONGITUD).toString();
        registro.position(CANTIDAD_LONGITUD);
        registro = registro.slice();

        String precio = registro.subSequence(0, PRECIO_LONGITUD).toString();
        registro.position(PRECIO_LONGITUD);
        registro = registro.slice();

        Producto p = new Producto(tipo, coleccion, cantidad, precio);
        return p;
    }
}
