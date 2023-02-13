/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.primeiro.projeto.nivelamento;

import java.util.Scanner;

/**
 *
 * @author theus
 */
public class LeituraEscrita {
    public static void main(String[] args) {
        //Precisamos criar um leitor
        //Para isso usaremos a classe Scanner
        //Mas não vai uma variável e sim um OBJETO
        
        //Deve ser importada com ctrl + space
        //Criamos uma instância usando o new
        //Que serve para transformar leitor em um OBJETO
        //e não ser somente uma simples variável
        Scanner leitor = new Scanner(System.in);
        
        //Pedindo ao usuário para digitar seu nome
        //Abaixo o método que seria 
        //equivalente a Input => Scanner
        
        
        System.out.println("Digite seu nome: ");
        String nomeDigitado = leitor.nextLine();
        //(nextLine (guarda + de 1 palavra))
        
        System.out.println("O nome digitado foi: " + nomeDigitado + " :o");
        
        System.out.println("Digite sua idade: ");
        Integer idadeDigitada = leitor.nextInt();
        
        System.out.println("Digite sua altura: ");
        Double alturaDigitada = leitor.nextDouble();
        
        System.out.println("Idade digitada: " + idadeDigitada);
        System.out.println("Altura digitada: " + alturaDigitada);
        
    }
}
