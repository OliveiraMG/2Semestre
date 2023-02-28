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
public class TesteDescontoProgressivo {
    public static void main(String[] args) {
        
        DescontoProgressivo desc = new DescontoProgressivo();
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Bem vindo!");
        System.out.println("Digite o valor unitario do produto: ");
        Double valor = leitor.nextDouble();
        
        System.out.println("Digite a quantidade: ");
        Double qtd = leitor.nextDouble();
        
        Double desconto = desc.calcularDesconto(qtd, valor);
        
        desc.exibirNotaFiscal(valor, qtd, desconto);
    }
}
