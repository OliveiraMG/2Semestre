/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classesocial;

import java.util.Scanner;

/**
 *
 * @author theus
 */
public class TesteClasseSocial {
    public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            
            ClasseSocial claSoc = new ClasseSocial();
            
            System.out.println("Digite sua renda: ");
            Double salDig = leitor.nextDouble();
            
            Double classe = claSoc.classe(salDig, 1045.00);
            String classificar = claSoc.DefinirClasse(classe);
            String frase = String.format("Você recebe aproximadamente %.1f salários-mínimos.", classe);
            
            System.out.println(frase);
            System.out.println(String.format("Sua classe social é %s", classificar));
    }
}
