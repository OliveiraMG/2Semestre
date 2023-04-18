package com.br.wmn.modelo.banco.jdbc.servico;

import com.br.wmn.modelo.banco.jdbc.Filme;
import com.br.wmn.modelo.banco.jdbc.Conexao;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author consultor
 */
public class FilmeServiceBanco {
    public void salvarFilme(Filme novoFilme) {
        Conexao conexao = new Conexao();

        JdbcTemplate con = conexao.getConexaoDoBanco();
        
        con.update("insert into filme values (?,?,?)", novoFilme.getId(), novoFilme.getNome(), novoFilme.getAnoLancamento());
    }
    
    public void editarNomePeloId(String nome, Integer id) {
        Conexao conexao = new Conexao();

        JdbcTemplate con = conexao.getConexaoDoBanco();
        
        con.update("update filme set nome = ? where id = ?", nome, id);
    }
    
    public List<Filme> buscarListPeloNome(String nome) {
        Conexao conexao = new Conexao();

        JdbcTemplate con = conexao.getConexaoDoBanco();
        
        return con.query("select * from filme where nome = ?;", new BeanPropertyRowMapper(Filme.class), nome);
    }
    
    public List<Filme> buscarTodos() {
        Conexao conexao = new Conexao();

        JdbcTemplate con = conexao.getConexaoDoBanco();
        
        return con.query("select * from filme;",
                new BeanPropertyRowMapper(Filme.class));
    }
    
    public Filme buscarPeloId(Integer id) {
        Conexao conexao = new Conexao();

        JdbcTemplate con = conexao.getConexaoDoBanco();
        
        return con.queryForObject("select * from filme where id = ?",
                new BeanPropertyRowMapper<Filme>(Filme.class), id);
    }
}
