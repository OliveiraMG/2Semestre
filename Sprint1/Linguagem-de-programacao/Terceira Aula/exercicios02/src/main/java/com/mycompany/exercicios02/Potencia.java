/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios02;

import java.util.Scanner;

/**
 *
 * @author theus
 */
public class Potencia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Integer potencia = 1;
        
        System.out.println("Digite aqui a base que você deseja:\n");
        Integer baseDigitada = leitor.nextInt();
        System.out.println("Digite aqui o expoente desejado:\n");
        Integer expoenteDigitado = leitor.nextInt();
        
        for (int i = 0; i < expoenteDigitado; i++) {
            
            System.out.println("");
            potencia *= baseDigitada;
        }
        
        System.out.println("O valor " 
                + baseDigitada + " elevado a " 
                + expoenteDigitado + " é igual a: " 
                + potencia);
    }
}
