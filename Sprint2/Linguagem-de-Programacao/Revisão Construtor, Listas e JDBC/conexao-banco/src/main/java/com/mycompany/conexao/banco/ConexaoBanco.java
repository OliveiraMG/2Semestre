/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.conexao.banco;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author oliveira
 */
public class ConexaoBanco {

    private JdbcTemplate connection;

    public ConexaoBanco() {

        BasicDataSource dataSource = new BasicDataSource();

        dataSource​.setDriverClassName("org.h2.Driver");

        dataSource​.setUrl("jdbc:h2:file:./banco_teste");

        dataSource​.setUsername("sa");

        dataSource​.setPassword("");

        this.connection = new JdbcTemplate(dataSource);

    }

    public JdbcTemplate getConnection() {

        return connection;

    }
    
    
    
};
