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
public class Elevador {
    public static void main(String[] args) {
        
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual o limite de peso do elevador");
        Double lmtPeso = leitor.nextDouble();
        
        System.out.println("Qual o limite de pessoas no elevador");
        Integer lmtPess = leitor.nextInt();
        
        System.out.println("Qual o peso da 1° pessoa");
        Double p1 = leitor.nextDouble();
        
        System.out.println("Qual o peso da 2° pessoa");
        Double p2 = leitor.nextDouble();
        
        System.out.println("Qual o peso da 3° pessoa");
        Double p3 = leitor.nextDouble();
        
        Double pesoT = (p1 + p2 + p3);
        
        System.out.printf("Entraram 3 pessoas no elevador, no qual cabem %d pessoas. "
                + "O peso total no elevador é de %.2f, sendo que ele suporta %.2f"
                , lmtPess, pesoT, lmtPeso);
        
        
        
        
        
        
        
        
    }
}
