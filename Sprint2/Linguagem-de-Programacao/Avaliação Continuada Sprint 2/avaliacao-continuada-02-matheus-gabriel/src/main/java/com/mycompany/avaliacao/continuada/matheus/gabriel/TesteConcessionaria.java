/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao.continuada.matheus.gabriel;

/**
 *
 * @author oliveira
 */
public class TesteConcessionaria {
    public static void main(String[] args) {
        
        Veiculo veiculo01 = new Veiculo(01, "Corsa");
        Veiculo veiculo02 = new Veiculo(02, "Celta");
        Veiculo veiculo03 = new Veiculo(03, "Gol");
        Concessionaria conc = new Concessionaria("Top Cars");
        
        veiculo01.setValorTabela(20000.00);
        veiculo02.setValorTabela(25000.00);
        veiculo03.setValorTabela(15000.00);


        
        conc.aumentarEstoque(veiculo01, 10);
        conc.aumentarEstoque(veiculo02, 20);
        conc.aumentarEstoque(veiculo03, 15);
                
        conc.realizarVenda(veiculo01);
        conc.realizarVenda(veiculo02, 0.10);
        conc.realizarVenda(veiculo03, 0.20);

        conc.getPercentualVendasComDesconto();
        
        System.out.println(veiculo01.toString());        
        System.out.println(veiculo02.toString());        
        System.out.println(veiculo03.toString());

        System.out.println(conc.toString());


        
    }
}
