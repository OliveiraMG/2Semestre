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
public class TesteCalculoAluno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        CalculoAluno calc = new CalculoAluno();
        
        System.out.println("Digite sua primeira nota: ");
        Double nota1 = leitor.nextDouble();
        
        System.out.println("Digite sua segunda nota: ");
        Double nota2 = leitor.nextDouble();
        
        Double result = calc.calcularMedia(nota1, nota2);
        
        System.out.println(String.format("Sua nota final é %s", result));
    }
}
