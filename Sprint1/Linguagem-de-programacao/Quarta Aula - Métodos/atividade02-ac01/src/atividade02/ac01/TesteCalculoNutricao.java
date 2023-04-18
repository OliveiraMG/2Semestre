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
public class TesteCalculoNutricao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        CalculoNutricao calc = new CalculoNutricao();
        
        System.out.println("Digite seu peso:");
        Double peso = leitor.nextDouble();
        
        System.out.println("Digite sua altura:");
        Double altura = leitor.nextDouble();
        
        
        Double imc = calc.calculaIMC(peso, altura);
        
        System.out.println(String.format("Seu IMC é de: %.2f", imc));
        
        
    }
}
