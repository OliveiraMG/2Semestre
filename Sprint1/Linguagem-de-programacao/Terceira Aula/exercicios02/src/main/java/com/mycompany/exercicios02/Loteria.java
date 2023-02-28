/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios02;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author theus
 */
public class Loteria {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Integer contador = 0;

        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 10);

        System.out.println("Digite um número de 0 - 10: ");
        Integer numeroDigitado = leitor.nextInt();

        if (numeroDigitado >= 0 && numeroDigitado <= 10) {

            while (numeroDigitado != numeroAleatorio) {
                numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 10);
                System.out.println(numeroAleatorio);
                contador++;
            }

            if (contador <= 3) {

                System.out.println("Você é MUITO sortudo");

            } else if (contador >= 4 && contador <= 10) {

                System.out.println("Você é sortudo");

            } else {

                System.out.println("É melhor largar as apostas e ir trabalhar");

            }
            System.out.println("Tentativas: " + contador);

        } else {
            System.out.println("Você não colocou um número entre 0 e 10");
        }

    }
}
