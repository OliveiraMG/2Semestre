/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.de.ex04;

/**
 *
 * @author theus
 */
public class Empregado {
    String nome;
    String cargo;
    Double salario;
    
    void reajustarSalario (Double porcentagemReajuste) {
    salario += (salario * porcentagemReajuste);
    System.out.println(String.format("O %s, do cargo %s, teve seu salário reajustado que atualmente é de: R$ %.2f", nome, cargo, salario));
    }
}
