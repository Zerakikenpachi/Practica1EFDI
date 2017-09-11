package com.dao_.imp;

import com.dao.ColeccionDao;
import com.model.Coleccion;
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
public class FileColeccionDao implements ColeccionDao {

    public FileColeccionDao() {
        if (!Files.exists(file)) {
            try {
                Files.createFile(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static final String NOMBRE_ARCHIVO = "Coleccion";
    private static final Path file = Paths.get(NOMBRE_ARCHIVO);
    private static final int LONGITUD_REGISTRO = 30;
    private static final int TRIMESTRE_REGISTRO = 15;
    private static final int ID_LONGITUD = 15;

    @Override
    public boolean saveColeccion(Coleccion coleccion) {
        String registro = parseColeccionString(coleccion);
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
    public List<Coleccion> getAllColeccion() {
        List<Coleccion> Colecciones = new ArrayList<Coleccion>();
        try (SeekableByteChannel sbc = Files.newByteChannel(file)) {
            ByteBuffer buf = ByteBuffer.allocate(LONGITUD_REGISTRO);
            String encoding = System.getProperty("file.encoding");
            while (sbc.read(buf) > 0) {
                buf.rewind();
                Coleccion coleccion = parseTipoColeccion(Charset.forName(encoding).decode(buf));
                buf.flip();
                Colecciones.add(coleccion);
            }
        } catch (IOException x) {
            System.out.println("caught exception: " + x);
        }
        return Colecciones;
    }

    private String parseColeccionString(Coleccion coleccion) {
        StringBuilder registro = new StringBuilder(LONGITUD_REGISTRO);
        registro.append(completarCampoConEspacios(coleccion.getTrimestre(), TRIMESTRE_REGISTRO));
        registro.append(completarCampoConEspacios(coleccion.getId(), ID_LONGITUD));
        return registro.toString();
    }

    private String completarCampoConEspacios(String campo, int tamanio) {
        if (campo.length() > tamanio) {
            campo = campo.substring(0, tamanio);
            return campo;
        }
        return String.format("%1$-" + tamanio + "s", campo);
    }

    private Coleccion parseTipoColeccion(CharBuffer registro) {

        String trimestre = registro.subSequence(0, TRIMESTRE_REGISTRO).toString();
        registro.position(TRIMESTRE_REGISTRO);
        registro = registro.slice();

        String id = registro.subSequence(0, ID_LONGITUD).toString();
        registro.position(ID_LONGITUD);
        registro = registro.slice();

        Coleccion p = new Coleccion(trimestre, id);
        return p;
    }

}
