/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;

import de.javasoft.plaf.synthetica.SyntheticaBlueMoonLookAndFeel;
import javax.swing.UIManager;

/**
 *
 * @author Andres
 */
public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new SyntheticaBlueMoonLookAndFeel());
        } catch (Exception e) {
            e.printStackTrace();
        }
        View nuevo = new View();
        nuevo.setVisible(true);
    }

}
