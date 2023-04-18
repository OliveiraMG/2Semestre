/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundo.projeto.nivelamento;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author theus
 */
public class NumeroAleatorio {
    public static void main(String[] args) {
        //Também tem Math.random
        //Mas precisa criar um onjeto
        //Um jeito mais simples:
        
        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 101);
        
        System.out.println("N° " + numeroAleatorio);
        
        Double doubleAleatorio = ThreadLocalRandom.current().nextDouble(1.7,75.1);
        
        System.out.println("Aleatório real: " + doubleAleatorio);
        
        
    }
}
