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
