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
public class Caloria {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        
        System.out.println("Quantos minutos aqueceu: ");
        Integer minutosAquecendo = leitor.nextInt();
        Integer caloriaAquecendo = (minutosAquecendo * 12);
        
        System.out.println("Quantos minutos fez aeróbico: ");
        Integer minutosAerobico = leitor.nextInt();
        Integer caloriaAerobico = (minutosAerobico * 20);
        
        System.out.println("Quantos minutos fez musculação: ");
        Integer minutosMusculacao = leitor.nextInt();
        Integer caloriaMusculacao = (minutosMusculacao * 25);
        
        Integer minutosTotais = (minutosAquecendo + minutosAerobico + minutosMusculacao);
        Integer caloriasTotais = (caloriaAquecendo + caloriaAerobico + caloriaMusculacao);
        
        
        System.out.printf("Olá, Jorge. Você fez um total de "
                + "%d minutos de exercícios e perdeu cerca de %d calorias",
                minutosTotais,caloriasTotais);
        
        
        
        
    }
}
