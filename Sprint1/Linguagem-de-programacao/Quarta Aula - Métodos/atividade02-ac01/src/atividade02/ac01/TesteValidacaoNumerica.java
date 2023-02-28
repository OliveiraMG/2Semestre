/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade02.ac01;

import java.util.Scanner;

/**
 *
 * @author theus
 */
public class TesteValidacaoNumerica {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        ValidacaoNumerica val = new ValidacaoNumerica();
        
        Integer numero;
        
        do {
            System.out.println("Digite um número: ");
            numero = leitor.nextInt();
            
            String result = val.verificarPrimo(numero);
            
            if (numero > 0) {
            System.out.println(result);
            }
            
        } while(numero > 0); {
        System.out.println("Programa encerrado");
    }
        
        
        
        
    }
}
