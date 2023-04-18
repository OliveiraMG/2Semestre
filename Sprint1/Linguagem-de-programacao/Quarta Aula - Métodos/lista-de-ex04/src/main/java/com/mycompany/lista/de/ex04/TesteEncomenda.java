/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.de.ex04;

/**
 *
 * @author theus
 */
public class TesteEncomenda {
    public static void main(String[] args) {
        Encomenda encomenda01 = new Encomenda();
        encomenda01.tamanho = "M";
        encomenda01.enderecoRemetente = "Rua das graças, 209";
        encomenda01.enderecoDestinatario = "Rua da alegria, 403";
        encomenda01.distancia = 52.00;
        encomenda01.valorEncomenda = 50.00;
        
        Double frete = encomenda01.calcularFrete();
        encomenda01.emitirEtiqueta(frete);
        
        Encomenda encomenda02 = new Encomenda();
        encomenda02.tamanho = "G";
        encomenda02.enderecoRemetente = "Rua do amor, 19";
        encomenda02.enderecoDestinatario = "Rua da tristeza, 35";
        encomenda02.distancia = 240.00;
        encomenda02.valorEncomenda = 900.00;
        
        frete = encomenda02.calcularFrete();
        encomenda02.emitirEtiqueta(frete);
    }
}
