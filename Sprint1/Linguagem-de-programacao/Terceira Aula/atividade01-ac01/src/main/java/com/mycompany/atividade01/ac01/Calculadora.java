/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade01.ac01;

import java.util.Scanner;

/**
 *
 * @author theus
 */
public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer escolha;
        String msg = "Digite um número inteiro:";
        
        do {
        System.out.println("Digite o número correspondente a operação desejada: \n"
                + "1 - Soma\n"
                + "2 - Multiplicação\n"
                + "3 - Divisão\n"
                + "4 - Subtração\n"
                + "5 - Potência\n"
                + "6 - Resto\n"
                + "0 - Sair");
        
        escolha = leitor.nextInt();
        
        switch (escolha) {
        case 0: msg = "Até logo!";
        break;
        
        default:
            if(escolha > 6 || escolha < 1) {
            msg = "Opção inválida, tente novamente";
            }
            break;
        }
        
        System.out.println(msg);
        
        
        Double numeroEscolhido;
        Double valorAtual;
        String result;
        
        switch (escolha) {
            case 1:
                numeroEscolhido = leitor.nextDouble();
                for(int i = 1; i <= 10; i++) {
                result = String.format("%.2f + %d ="
                + (numeroEscolhido + i), numeroEscolhido, i);
                
                    System.out.println(result);
                }
                break;
                
            case 2:
                numeroEscolhido = leitor.nextDouble();
                for(int i = 1; i <= 10; i++) {
                result = String.format("%.2f * %d ="
                + (numeroEscolhido * i), numeroEscolhido, i);
                
                    System.out.println(result);
                }
                break;
                
            case 3:
                numeroEscolhido = leitor.nextDouble();
                for(int i = 1; i <= 10; i++) {
                valorAtual = numeroEscolhido / i;
                result = String.format("%.2f + %d = %.2f"
                ,numeroEscolhido, i, valorAtual);
                
                    System.out.println(result);
                }
                break;
                
            case 4:
                numeroEscolhido = leitor.nextDouble();
                for(int i = 1; i <= 10; i++) {
                result = String.format("%.2f - %d ="
                + (numeroEscolhido - i), numeroEscolhido, i);
                
                    System.out.println(result);
                }
                break;
                
            case 5:
                numeroEscolhido = leitor.nextDouble();
                for(int i = 1; i <= 10; i++) {
                    
                    Double valor = numeroEscolhido;

                    for(int p = 1; p < i; p++) {

                        valor = valor * numeroEscolhido;

                    }

                    result = String.format("%.2f ** %d = %.2f"
                     ,numeroEscolhido, i, valor);

                        System.out.println(result);
                
                }
                break;
                
            case 6:
                numeroEscolhido = leitor.nextDouble();
                String operadorResto = "%";
                for(int i = 1; i <= 10; i++) {
                result = String.format("%.2f %s %d ="
                + (numeroEscolhido % i), numeroEscolhido, operadorResto, i);
                
                    System.out.println(result);
                }
                break;
        }
        
        // NÃO CONSEGUI FAZER A 3 DOA LIÇÃO
        // ENVIAREI DESSA FORMA PARA NÃO TER LIÇÃO COMO NÃO FEITA MAS TENTAREI TERMINAR :)
        
        //ADICIONANDO A ATUALIZAÇÃO QUE CONSEGUI TERMINAR ATÉ O DESAFIO, ESPERON ESTAR CERTO ;)
        
        } while (escolha != 0);
    }
}


