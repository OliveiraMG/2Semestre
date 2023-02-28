/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade02.ac01;

/**
 *
 * @author theus
 */
public class DescontoProgressivo {
    Double calcularDesconto(Double qtd, Double valor) {
     if (qtd == 1) {
     return (valor * qtd) * 0.9;
     } else if (qtd == 2) {
     return (valor * qtd) * 0.8;
     } else {
     return (valor * qtd) * 0.7;
     }
    }
     
    void exibirNotaFiscal(Double valor, Double qtd, Double desconto){
        System.out.println("-------------------");
        System.out.println("valor do produto: R$" + valor);
        System.out.println("Quantidade do produto: " + qtd);
        System.out.println("-------------------");
        System.out.println("Valor com : " + desconto);
    }
     
}
