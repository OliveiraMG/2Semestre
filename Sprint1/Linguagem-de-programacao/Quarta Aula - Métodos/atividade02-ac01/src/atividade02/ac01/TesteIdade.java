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
public class TesteIdade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Idade idade = new Idade();
        
        System.out.println("Digite sua idade: ");
        Integer idadeDigitada = leitor.nextInt();
        
        idade.classificaIdade(idadeDigitada);
    }
}
