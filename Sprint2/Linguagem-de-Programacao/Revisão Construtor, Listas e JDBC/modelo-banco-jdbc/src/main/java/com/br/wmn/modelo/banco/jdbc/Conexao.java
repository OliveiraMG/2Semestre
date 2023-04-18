package com.br.wmn.modelo.banco.jdbc;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author consultor
 */
public class Conexao {

    private JdbcTemplate conexaoDoBanco;

    public Conexao() {
        BasicDataSource dataSource = new BasicDataSource();

        dataSource​.setDriverClassName("org.h2.Driver");

        dataSource​.setUrl("jdbc:h2:file:./banco_teste");

        dataSource​.setUsername("sa");

        dataSource​.setPassword("");
        
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        
//        dataSource.setUrl("jdbc:mysql://localhost:3306/tecflix"); // trocar o localhost:3306 pelo endereço do banco e o tecflix pelo nome do banco
//        
//        dataSource.setUsername("root"); //Usuario do banco
//        
//        dataSource.setPassword("1234"); //Senha do banco

        this.conexaoDoBanco = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getConexaoDoBanco() {
        return conexaoDoBanco;
    }

}
