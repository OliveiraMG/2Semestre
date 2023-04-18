/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiro.projeto.encapsulamento;

/**
 *
 * @author oliveira
 */
public class ContaBancaria {
    
    //Atributos = Características
    private Double saldo = 0.0;
    private String nomeTitular;
    
    //Métodos = Comportamentos
    void depositar(Double valorDeposito) {
        
        if (valorDeposito > 0.0) {
            saldo += valorDeposito;
            System.out.println("Depósito realizado!");
        } else {
            System.out.println("Valor inválido!");
        }
    }
    
    void sacar(Double valorSaque) {
        if(valorSaque <= saldo && valorSaque > 0.0) {
            saldo -= valorSaque;
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Valor inválido!");
        }
    }
    
    //Usamos o this para referenciar qual é o atributo
    // Útil quando temos uma variável com o mesmo nome que o atributo
    
    //Atalho para criar o Getter e Setter é Alt + Insert

    public Double getSaldo() {
        return saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    
    
    
    
}
