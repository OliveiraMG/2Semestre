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
public class Votacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Integer votoMuss = 0;
        Integer votoCal = 0;
        Integer votoQuaQue = 0;
        Integer votos;

        
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "° aluno, vote no seu sabor favorito:\n");
            
            System.out.println("Vote 5 para mussarela\n"
                    + "Vote 25 para calabresa\n"
                    + "Vote 50 para quatro queijos");
            
            votos = leitor.nextInt();
            
            switch (votos) {
                case 5:
                    votoMuss++;
                    break;
                    
                case 25:
                    votoCal++;
                    break;
                    
                case 50:
                    votoQuaQue++;
                    break;
                    
                default:
                
                    System.out.println("Inválido, escolha uma opção válida");
                    
            }
        }
        
        System.out.println("Total por sabor:\n"
                + "Mussarela: " + votoMuss 
                + "\nCalabresa: " + votoCal 
                + "\nQuatro-queijos: " + votoQuaQue);
        
        String pizzaFav;
        if (votoMuss > votoCal && votoMuss > votoQuaQue) {
        pizzaFav = "Mussarela";
        } else if (votoCal > votoMuss && votoCal > votoQuaQue) {
        pizzaFav = "Calabresa";
        } else {
        pizzaFav = "Quatro queijos";
        }
        
        System.out.println(String.format("O sabor favorito é: %s", pizzaFav));
        
    }
}
