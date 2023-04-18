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
public class Calculadora {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite qualquer número");
        Double n1 = leitor.nextDouble();
        
        System.out.println("Digite outro número");
        Double n2 = leitor.nextDouble();
        
        Double soma = (n1 + n2);
        Double sub = (n1 - n2);
        Double mult = (n1 * n2);
        Double div = (n1 / n2);
        
        System.out.println("Aqui está o resultado da soma: " + soma
                + "\nAqui está o resultado da subtração: " + sub
                + "\nAqui está o resultado da multiplicação: " + mult
                + "\nAqui está o resultado da divisão: " + div);
        
        
        
    }
}
