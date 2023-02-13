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
public class SalarioLiquido {
    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual o seu salário bruto?");
        Double salarioBt = leitor.nextDouble();
        
        System.out.println("Quanto custa a ida diária de casa ao trabalho?");
        Double idaDiaria = leitor.nextDouble();
        
        Double vt = (idaDiaria * 2 * 22);
        
        Double inss = (salarioBt * 0.1);
        Double ir = (salarioBt * 0.2);
        
        Double totalDc = (inss + ir + vt);
        Double salarioLq = (salarioBt - totalDc);
        
        System.out.println("Seu salário bruto é R$" + salarioBt 
                + ", tem um total de R$" + totalDc 
                + "em descontos e receberá um líquido de R$" + salarioLq);
        
        
        
        
        
    }
}
