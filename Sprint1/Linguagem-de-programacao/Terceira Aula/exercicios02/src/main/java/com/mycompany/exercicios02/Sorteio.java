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
public class Sorteio {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer posicao = 0;
        Integer numerosPares = 0;
        Integer numerosImpares = 0;

        System.out.println("Digite aqui um número de 1 - 100:");
        Integer numeroDigitado = leitor.nextInt();

        if (numeroDigitado >= 1 || numeroDigitado <= 100) {

            for (int i = 0; i < 200; i++) {
                Integer numeroSorteio = ThreadLocalRandom.current().nextInt(1, 100);
                if (i % 2 == 0) {
                    numerosPares++;
                } else {
                    numerosImpares++;
                }

                if (numeroSorteio == numeroDigitado) {
                    posicao = i;
                    break;
                }

            }

            System.out.println("Sorteado pela primeira vez na " + posicao + "° posição.");
            System.out.println("Números pares sorteados: " + numerosPares);
            System.out.println("Números pares sorteados: " + numerosImpares);

        } else {
            System.out.println("Você digitou um número inválido");
        }

    }
}
