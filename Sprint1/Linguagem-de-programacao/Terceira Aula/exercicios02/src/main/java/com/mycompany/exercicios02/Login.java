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
public class Login {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String login = "admin";
        String senha = "#SPTech2023";
        
        System.out.println("Qual seu login?");
        String loginDigitado = leitor.next();
        
        System.out.println("Qual sua senha?");
        String senhaDigitada = leitor.next();
        
        while(!loginDigitado.equals(login) || !senhaDigitada.equals(senha)) {
            System.out.println("Login e/ou senha inválidos");
            System.out.println("Qual seu login?");
            loginDigitado = leitor.next();
        
            System.out.println("Qual sua senha?");
            senhaDigitada = leitor.next();
            
        }
        
        System.out.println("Login realizado com sucesso!");
        
    }
}
