/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios;

import java.util.Scanner;

/**
 *
 * @author theus
 */
public class CalculoTroco {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual o valor da unidade do produto?");
        Double valorPdt = leitor.nextDouble();
        
        System.out.println("Qual a quantidade vendida?");
        Integer qtdVendida = leitor.nextInt();
        
        System.out.println("Qual o valor pago pelo cliente?");
        Integer valorPg = leitor.nextInt();
        
        Double total = (valorPdt * qtdVendida);
        Double trocoClt = (valorPg - total);
        
        System.out.println("Seu troco será de R$" + trocoClt);
        
        
        
        
        
    }
}
