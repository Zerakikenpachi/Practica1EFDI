<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;

import com.controller.ProductoControlador;
import com.dao_.imp.FileProductoDao;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class Inicio {
    
    public static void main(String[] args) {
        ProductoControlador p = new ProductoControlador();
        String TipPro;
        String CantPro;
        String PrePro;
        int seguir = 5;
        while (seguir != 0) {
            TipPro = JOptionPane.showInputDialog("Ingrese el tipo de producto");
            CantPro = JOptionPane.showInputDialog("Ingrese la cantidad de producto");
            PrePro = JOptionPane.showInputDialog("Ingrese el precio del prodúcto");
            if (p.CrearProducto(TipPro, CantPro, PrePro)) {
                JOptionPane.showMessageDialog(null, "Los datos se guardaron");
            } else {
                JOptionPane.showMessageDialog(null, "Los datos no se guardaron");
            }
            seguir = Integer.parseInt(JOptionPane.showInputDialog("Desea continuar? 0 para salir"));
        }
    }   
}
=======
package com.view;

import com.controller.ColeccionControlador;
import com.controller.ProductoControlador;
import com.controller.TipoProductoControlador;
import com.model.Coleccion;
import com.model.Producto;
import com.model.TipProducto;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres Carrascal Verona
 */
public class Inicio {

    public static void main(String[] args) {
        ProductoControlador p = new ProductoControlador();
        TipoProductoControlador r = new TipoProductoControlador();
        ColeccionControlador z = new ColeccionControlador();
        String TipPro;
        String CantPro;
        String PrePro;
        String Colecc;
        String Ref;
        String Name;
        String Trimestre;
        String Id;
        String ProductoBusc;
        String ColeccionBusc;
        char selecc;
        String DatoConsultar;
        do {
            selecc = Menu();
            switch (selecc) {
                case '1':
                    TipPro = JOptionPane.showInputDialog("Ingrese el tipo de producto");
                    Colecc = JOptionPane.showInputDialog("Ingrese la colepcion");
                    CantPro = JOptionPane.showInputDialog("Ingrese la cantidad de producto");
                    PrePro = JOptionPane.showInputDialog("Ingrese el precio del prodúcto");
                    if (p.CrearProducto(TipPro, Colecc, CantPro, PrePro)) {
                        JOptionPane.showMessageDialog(null, "Los datos se guardaron");
                    } else {
                        JOptionPane.showMessageDialog(null, "Los datos no se guardaron");
                    }
                    break;
                case '2':
                    DatoConsultar = JOptionPane.showInputDialog("Ingrese 0 para ver los productos el tipo de producto");
                    if (DatoConsultar.equals("0")) {
                        List<Producto> producto = p.ConsultarProductos();
                        StringBuilder data = new StringBuilder("");
                        for (Producto q : producto) {
                            data.append(q);
                            data.append("\n");
                        }
                        JOptionPane.showMessageDialog(null, data.toString());
                    }
                    break;
                case '3':
                    Ref = JOptionPane.showInputDialog("Ingrese la referencia");
                    Name = JOptionPane.showInputDialog("Ingrese El nombre del producto");
                    if (r.CrearTipoProducto(Ref, Name)) {
                        JOptionPane.showMessageDialog(null, "Los datos se guardaron");
                    } else {
                        JOptionPane.showMessageDialog(null, "Los datos no se guardaron");
                    }
                    break;
                case '4':
                    DatoConsultar = JOptionPane.showInputDialog("Ingrese 0 para ver los productos el tipo de producto");
                    if (DatoConsultar.equals("0")) {
                        List<TipProducto> tipproducto = r.ConsultarTipoProductos();
                        StringBuilder data = new StringBuilder("");
                        for (TipProducto q : tipproducto) {
                            data.append(q);
                            data.append("\n");
                        }
                        JOptionPane.showMessageDialog(null, data.toString());
                    }
                    break;
                case '5':
                    ProductoBusc = JOptionPane.showInputDialog("Ingrese el producto a buscar");
                    ProductoBusc.trim();
                    if (r.ProductoEsta(ProductoBusc) != null) {
                        JOptionPane.showMessageDialog(null, "El producto esta y es: " + r.ProductoEsta(ProductoBusc));
                    } else {
                        JOptionPane.showMessageDialog(null, "El producto no está");
                    }
                    break;
                case '6':
                    Trimestre = JOptionPane.showInputDialog("Ingrese el trimestre");
                    Id = JOptionPane.showInputDialog("Ingrese la Id");
                    if (z.CrearColeccion(Trimestre, Id)) {
                        JOptionPane.showMessageDialog(null, "Los datos se guardaron");
                    } else {
                        JOptionPane.showMessageDialog(null, "Los datos no se guardaron");
                    }
                    break;
                case '7':
                    DatoConsultar = JOptionPane.showInputDialog("Ingrese 0 para ver los productos el tipo de producto");
                    if (DatoConsultar.equals("0")) {
                        List<Coleccion> coleccion = z.ConsultarColecciones();
                        StringBuilder data = new StringBuilder("");
                        for (Coleccion q : coleccion) {
                            data.append(q);
                            data.append("\n");
                        }
                        JOptionPane.showMessageDialog(null, data.toString());
                    }
                    break;
                case '8':
                    ColeccionBusc = JOptionPane.showInputDialog("Ingrese la ID de la coleccion a buscar");
                    ColeccionBusc.trim();
                    if (z.ColeccionEsta(ColeccionBusc) != null) {
                        JOptionPane.showMessageDialog(null, "El producto esta y es: " + z.ColeccionEsta(ColeccionBusc));
                    } else {
                        JOptionPane.showMessageDialog(null, "El producto no está");
                    }
                    break;
                default:
                    break;
            }
        } while (selecc != '9');

    }

    static char Menu() {
        char menu = ' ';
        do {
            menu = JOptionPane.showInputDialog("Base de datos para producto \n1. Guardar producto \n2. Traer todas las personas"
                    + "\n3. Guardar tipo de producto \n4. Mostrar Tipos de productos \n5. Mirar si existe el producto \n6. Guardar coleccion"
                    + "\n7.Ver las colecciones \n8.Buscar coleccion por Id \n9. Salir").charAt(0);
        } while (menu < '1' || menu > '9');
        return menu;
    }
}
>>>>>>> Andy
