/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiro.projeto.encapsulamento;

/**
 *
 * @author oliveira
 */
public class TesteConta {
    public static void main(String[] args) {
        ContaBancaria conta01 = new ContaBancaria();
        conta01.setNomeTitular("William");
                
        ContaBancaria conta02 = new ContaBancaria();
        conta02.setNomeTitular("Xampson");
        
        conta01.depositar(100.00);
        conta02.sacar(10.0);
        conta02.depositar(20.0);
        conta02.sacar(2.0);
        
        System.out.println("C1: " + conta01.getSaldo());
        System.out.println("C2: " + conta02.getSaldo());
        
    }
}
