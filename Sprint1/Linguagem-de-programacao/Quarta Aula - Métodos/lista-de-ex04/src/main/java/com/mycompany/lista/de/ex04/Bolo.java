/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.de.ex04;

/**
 *
 * @author theus
 */
public class Bolo {

    String sabor;
    Double valor;
    Integer qtdVendida;

    void comprarBolo(Integer qtdDesejada) {
        if (qtdDesejada < 0) {
            System.out.println("Quantidade inválida");
        } else {
            if ((qtdDesejada + qtdVendida) > 100) {
                System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo");
            } else {
                qtdVendida += qtdDesejada;
            }
        }
    }

    void exibirRelatorio() {
        System.out.println(String.format("O bolo sabor %s, foi comprado %d vezes hoje, totalizando R$ %.2f", sabor, qtdVendida, (valor * qtdVendida)));
    }

}
