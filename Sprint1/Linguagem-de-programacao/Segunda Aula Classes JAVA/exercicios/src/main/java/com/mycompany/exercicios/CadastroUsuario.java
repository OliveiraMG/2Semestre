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
public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu login: ");
        String loginDigitado = leitor.nextLine();
        
        System.out.println("Digite sua senha: ");
        String senhaDigitada = leitor.nextLine();
        
        System.out.println("Quantas vezes aceita digitar a senha antes de ser bloqueado: ");
        Integer qtdSenhaDigitada = leitor.nextInt();
        
        System.out.println("Seu login é " 
                + loginDigitado + " e sua senha é " 
                + senhaDigitada + " você tem " 
                + qtdSenhaDigitada + " tentativas antes de ser bloqueado");
        
        System.out.printf("Seu login é %s e sua senha é %s você tem "
                + "%d tentativas antes de ser bloqueado",
                loginDigitado, senhaDigitada, qtdSenhaDigitada);
    }
}
