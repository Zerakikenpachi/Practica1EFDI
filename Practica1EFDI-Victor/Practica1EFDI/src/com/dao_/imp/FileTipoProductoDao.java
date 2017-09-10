package com.dao_.imp;

import com.dao.TipoProductoDao;
import com.model.TipProducto;
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
public class FileTipoProductoDao implements TipoProductoDao {

    public FileTipoProductoDao() {
        if (!Files.exists(file)) {
            try {
                Files.createFile(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static final String NOMBRE_ARCHIVO = "TipoProducto";
    private static final Path file = Paths.get(NOMBRE_ARCHIVO);
    private static final int LONGITUD_REGISTRO = 20;
    private static final int REFERENCIA_REGISTRO = 10;
    private static final int NOMBRE_LONGITUD = 10;

    @Override
    public boolean saveTipoProducto(TipProducto tipproducto) {
        String registro = parseTipoProductoString(tipproducto);
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
    public List<TipProducto> getAllTipProducto() {
        List<TipProducto> TipProductos = new ArrayList<TipProducto>();
        try (SeekableByteChannel sbc = Files.newByteChannel(file)) {
            ByteBuffer buf = ByteBuffer.allocate(LONGITUD_REGISTRO);
            String encoding = System.getProperty("file.encoding");
            while (sbc.read(buf) > 0) {
                buf.rewind();
                TipProducto TipoProducto = parseTipoProducto(Charset.forName(encoding).decode(buf));
                buf.flip();
                TipProductos.add(TipoProducto);
            }
        } catch (IOException x) {
            System.out.println("caught exception: " + x);
        }
        return TipProductos;
    }

    private String parseTipoProductoString(TipProducto tipproducto) {
        StringBuilder registro = new StringBuilder(LONGITUD_REGISTRO);
        registro.append(completarCampoConEspacios(tipproducto.getReferencia(), REFERENCIA_REGISTRO));
        registro.append(completarCampoConEspacios(tipproducto.getNombre(), NOMBRE_LONGITUD));
        return registro.toString();
    }

    private String completarCampoConEspacios(String campo, int tamanio) {
        if (campo.length() > tamanio) {
            campo = campo.substring(0, tamanio);
            return campo;
        }
        return String.format("%1$-" + tamanio + "s", campo);
    }

    private TipProducto parseTipoProducto(CharBuffer registro) {

        String referencia = registro.subSequence(0, REFERENCIA_REGISTRO).toString();
        registro.position(REFERENCIA_REGISTRO);
        registro = registro.slice();

        String nombre = registro.subSequence(0, NOMBRE_LONGITUD).toString();
        registro.position(NOMBRE_LONGITUD);
        registro = registro.slice();

        TipProducto p = new TipProducto(referencia, nombre);
        return p;
    }

}
