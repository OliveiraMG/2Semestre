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
public class CalculoRenda {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quantos filhos de 0 a 3 possui: ");
        Integer filhoBebe = leitor.nextInt();
        Double auxilioBebe = filhoBebe * 25.12;
        
        System.out.println("Quantos filhos de 4 a 16 possui: ");
        Integer filhoCrianca = leitor.nextInt();
        Double auxilioCrianca = filhoCrianca * 15.88;
        
        System.out.println("Quantos filhos de 17 a 18 possui: ");
        Integer filhoAdulto = leitor.nextInt();
        Double auxilioAdulto = filhoAdulto * 12.44;
        
        Integer filhoTotais = (filhoBebe + filhoCrianca + filhoAdulto);
        Double auxilioTotal = (auxilioBebe + auxilioCrianca + auxilioAdulto);
        
        //ESTOU UTILIZANDO DAS DUAS FORMAS PARA FINS DE ESTUDO, PROF :)
        
        System.out.println("Você tem um total de " 
                + (filhoBebe + filhoCrianca + filhoAdulto) 
                + " filhos e vai receber R$"
                + (auxilioBebe + auxilioCrianca + auxilioAdulto) + " de bolsa");
        
        System.out.printf("Você tem um total de %d filhos e vai receber "
                + "R$%.2f de bolsa", filhoTotais, auxilioTotal);
    }
}
