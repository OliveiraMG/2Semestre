/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ac2.terceira.atividade.inteiros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author oliveira
 */
public class Inteiros {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Integer opcaoEscolhida;
        Integer numeroDigitado;
        
        List<Integer> listaInteiros = new ArrayList();
        
        do{
            System.out.println("Escolha uma opção desejada:\n"
                    + "1 - Adicionar novo número\n"
                    + "0 - Sair");
            
            opcaoEscolhida = leitor.nextInt();
            
            switch (opcaoEscolhida) {
                case 0:
                    System.out.println("Até logo!");
                    break;
                    
                case 1:
                    System.out.println("Digite aqui seu número:");
                    numeroDigitado = leitor.nextInt();
                    
                    listaInteiros.add(numeroDigitado);

                default:
                    if (opcaoEscolhida > 1 || opcaoEscolhida < 0) {
                        System.out.println("Opção inválida!");
                    }
                    break;
                }
            
        } while(opcaoEscolhida != 0);
        
        
        System.out.println("\nNúmeros pares:");
        for (int i = 0; i < listaInteiros.size(); i++) {
            if (listaInteiros.get(i) % 2 == 0) {
                System.out.println(listaInteiros.get(i));
            }
        }
            
        System.out.println("\nNúmeros ímpares:");
        for (int i = 0; i < listaInteiros.size(); i++) {
            if (listaInteiros.get(i) % 2 == 1) {
                System.out.println(listaInteiros.get(i));
            }    
        }
        
        System.out.println("\nSoma de toda a lista:");
        Integer soma = 0;
        for (int i = 0; i < listaInteiros.size(); i++) {
            soma += listaInteiros.get(i);
        }
        System.out.println(soma);
            
        
        System.out.println("\nO menor número da lista:");
        Integer menorNumero = 1000000000;
        for (int i = 0; i < listaInteiros.size(); i++) {
            if (listaInteiros.get(i) < menorNumero) {
                menorNumero = listaInteiros.get(i);
            }
        }
        System.out.println(menorNumero);
        
        System.out.println("\nO maior número da lista:");
        Integer maiorNumero = 0;
        for (int i = 0; i < listaInteiros.size(); i++) {
            if (listaInteiros.get(i) > maiorNumero) {
                maiorNumero = listaInteiros.get(i);
            }
        }
        System.out.println(maiorNumero);
        
        
    }
}
