package com.br.wmn.modelo.banco.jdbc.servico;

import com.br.wmn.modelo.banco.jdbc.Filme;

/**
 *
 * @author consultor
 */
public class TesteFilme {
    public static void main(String[] args) {
        FilmeServiceBanco filmeDao = new FilmeServiceBanco();
        
        System.out.println(filmeDao.buscarListPeloNome("Shrek 5"));
        
        filmeDao.editarNomePeloId("Shrek 7", 1);
        
        filmeDao.salvarFilme(new Filme(null, "Shrek 8", 2077));
    }
}
