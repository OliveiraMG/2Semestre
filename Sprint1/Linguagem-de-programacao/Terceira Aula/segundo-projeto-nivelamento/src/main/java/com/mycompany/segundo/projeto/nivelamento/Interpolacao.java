package com.mycompany.segundo.projeto.nivelamento;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author theus
 */
public class Interpolacao {

    public static void main(String[] args) {
        String nome = "Xampson";
        Integer idade = 42;
        Double altura = 1.86;
        
        String frase = String.format("Meu nome é %s, tenho %d e %.2f de altura", nome, idade, altura);

        System.out.println(frase);
    }
}
