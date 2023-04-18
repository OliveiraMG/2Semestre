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
public class Idade {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu nome");
        String nome = leitor.next();
        
        System.out.println("Olá " + nome + "! Qual o ano do seu nascimento?");
        Integer ano = leitor.nextInt();
        
        Integer idadeF = (2030 - ano);
        
        System.out.printf("Em 2030 você terá %d", idadeF);
        
        
        
        
    }
}
