package com.model;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Duvan Otero
 */
public class claseQueHaceLasConsultas {

    /**
     * El DataSource
     */
    private static DataSource dataSource = null;

    /**
     * Recibe y guarda el DataSource
     * @param dataSource
     */
    public static void setDataSource(DataSource dataSource) {
        claseQueHaceLasConsultas.dataSource = dataSource;
    }

    /**
     * Pide la Connection al DataSource, hace la consulta y cierra la conexión
     */
    public void hazConsulta() {

        Connection conexion = null;
        try {
            conexion = dataSource.getConnection();
            // realización de la consulta
        } catch (Exception e) {
            // tratamiento de error
        } finally {
            if (conexion!=null) {
                try {
                    conexion.close();
                } catch (SQLException ex) {
                    Logger.getLogger(claseQueHaceLasConsultas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
