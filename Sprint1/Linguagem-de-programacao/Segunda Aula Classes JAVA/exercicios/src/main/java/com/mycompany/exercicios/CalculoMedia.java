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
public class CalculoMedia {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual seu nome?");
        String nome = leitor.next();
        
        System.out.println("Qual sua 1° nota?");
        Double n1 = leitor.nextDouble();
        
        System.out.println("Qual sua 2° nota?");
        Double n2 = leitor.nextDouble();
        
        Double media = ((n1 + n2) / 2);
        
        System.out.printf("Olá, %s. Sua média foi de %.2f", nome, media);
        
        
        
        
    }
}
