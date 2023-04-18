/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avaliacao.continuada1.matheus.oliveira;

import java.util.Scanner;

/**
 *
 * @author theus
 */
public class MatheusOliveira {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer opcaoEscolhida;
        Double valorDepositado;
        Double valorRetirado;
        Double porcentagemInvestimentos = 0.0;
        Double saldoConta = 0.0;
        
        
        do{
            System.out.println("Escolha uma das opções abaixo:\n"
                    + "1 - Depositar\n"
                    + "2 - Sacar\n"
                    + "3 - Simular Rendimentos\n"
                    + "0 - Sair");
            
            opcaoEscolhida = leitor.nextInt();
            
            switch (opcaoEscolhida) {
                case 0:
                    System.out.println("Até logo!");
                    break;

                default:
                    if (opcaoEscolhida > 3 || opcaoEscolhida < 1) {
                        System.out.println("Opção inválida!");
                    }
                    break;

            }
            
            
            
            switch(opcaoEscolhida) {
                case 1: 
                    System.out.println("Qual o valor a ser depositado?");
                    valorDepositado = leitor.nextDouble();
                    if(valorDepositado >= 1) {
                        saldoConta = valorDepositado + saldoConta;
                        System.out.println(String.format("Depósito realizado, saldo atual: %.2f", saldoConta));
                    } else {
                        System.out.println("Valor inválido");
                    } break;
                    
                case 2:
                    System.out.println("Qual o valor a ser retirado?");
                    valorRetirado = leitor.nextDouble();
                    if(valorRetirado >= 1) {
                        if(saldoConta > valorRetirado) {
                        saldoConta = saldoConta - valorRetirado;
                        System.out.println(String.format("Saque realizado, saldo atual: %.2f", saldoConta));
                        } else {
                            System.out.println("Saque maior que saldo em conta");
                        }
                        
                    } else {
                        System.out.println("Valor inválido");
                    } break;
                    
                case 3:
                    if (saldoConta >= 1) {
                        
                        for (int i = 1; i <= 12; i++) {
                            
                            
                            porcentagemInvestimentos = (saldoConta * 0.1) + saldoConta;
                            saldoConta = porcentagemInvestimentos;
                            
                            
                            System.out.println(String.format("Mês %d | Saldo: %.2f", i, porcentagemInvestimentos));
                        }
                    
                    } else {
                        System.out.println("Saldo zerado, opção inválida");
                    }
                    
                    
                    
            }
            
            
            
            
        } while (opcaoEscolhida != 0);
        
        
        
        
    }
}
