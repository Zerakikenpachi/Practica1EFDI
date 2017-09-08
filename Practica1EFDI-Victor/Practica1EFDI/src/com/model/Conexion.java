package com.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.sql.DataSource; // Este es propio de java
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author Duvan Otero
 */
public class Conexion {

    public Conexion() {
        BasicDataSource basicDataSource = new BasicDataSource();
// Ejemplo con base de datos MySQL
        basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/nombre_bd");
        basicDataSource.setUsername("usuario");
        basicDataSource.setPassword("password");
// Pasamos el DataSource a las clases que lo necesiten.
        claseQueHaceLasConsultas.setDataSource(basicDataSource);
    }

}
