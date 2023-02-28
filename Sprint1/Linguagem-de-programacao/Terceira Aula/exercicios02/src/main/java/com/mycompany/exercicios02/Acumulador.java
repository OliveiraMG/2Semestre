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
public class Acumulador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite qualquer número inteiro: ");
        Integer numeroDigitado = leitor.nextInt();
        Integer somaNumeros = 0;
        
        do {
            somaNumeros+= numeroDigitado;
            System.out.println("Digite novamente outro número");
            numeroDigitado = leitor.nextInt();
        } while (numeroDigitado != 0);
        System.out.println("Acertou! A soma dos números é " + somaNumeros);
        
        
    }
}
