/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.de.ex04;

/**
 *
 * @author theus
 */
public class App {
    public static void main(String[] args) {
        Bolo bolo01 = new Bolo();
        bolo01.qtdVendida = 0;
        bolo01.sabor = "Chocolate";
        bolo01.valor = 35.00;
        
        Bolo bolo02 = new Bolo();
        bolo02.qtdVendida = 0;
        bolo02.sabor = "Abacaxi";
        bolo02.valor = 30.00;
        
        Bolo bolo03 = new Bolo();
        bolo03.qtdVendida = 0;
        bolo03.sabor = "Morango";
        bolo03.valor = 40.00;
        
        bolo01.comprarBolo(10);
        bolo01.comprarBolo(25);
        bolo01.comprarBolo(25);
        bolo01.comprarBolo(20);
        bolo01.comprarBolo(20);
        bolo01.exibirRelatorio();
        
        bolo02.comprarBolo(15);
        bolo02.comprarBolo(21);
        bolo02.comprarBolo(30);
        bolo02.comprarBolo(5);
        bolo02.comprarBolo(12);
        bolo02.exibirRelatorio();
        
        bolo03.comprarBolo(8);
        bolo03.comprarBolo(13);
        bolo03.comprarBolo(29);
        bolo03.comprarBolo(10);
        bolo03.comprarBolo(20);
        bolo03.exibirRelatorio();
    }
}
