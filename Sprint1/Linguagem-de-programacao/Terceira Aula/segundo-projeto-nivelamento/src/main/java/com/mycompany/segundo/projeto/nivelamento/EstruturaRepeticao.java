/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundo.projeto.nivelamento;

import java.util.Scanner;

/**
 *
 * @author theus
 */
public class EstruturaRepeticao {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        
        System.out.println("\nfor de 0 a 10");
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        
        System.out.println("\nfor de 10 a 0");
        for(int i = 10; i >= 0; i--){
            System.out.println(i);
        }
        
        System.out.println("\nWhile de 0 a 10");
        
        int i = 0;
        while(i <= 10) {
            System.out.println(i);
            i++;
        }
        
        System.out.println("\nwhile - Adivinhe o número");
        //Vai ser 42!!!
        System.out.println("Digite um número: ");
        
        Integer numeroDigitado = leitor.nextInt();
        
        while(numeroDigitado != 42) {
            System.out.println("Adivinhe o número: ");
            numeroDigitado = leitor.nextInt();
        }
        
        System.out.println("Acertou!");
        
        System.out.println("\ndo while"); {
        System.out.println("do while - adivinhe o número");
        
        System.out.println("Digite um número: ");
        numeroDigitado = leitor.nextInt();
        
        do {
            System.out.println("Adivinhe o número: ");
            numeroDigitado = leitor.nextInt();
        } while (numeroDigitado != 42);
        
    }
        
        
    }
}
