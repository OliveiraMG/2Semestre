/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.poo.encapsulamento.empresa;

/**
 *
 * @author oliveira
 */
public class RecursosHumanos {
    private Integer totalPromovidos = 0;
    private Integer totalSalarioReajustado = 0;
    
    void reajustarSalario(Colaborador funcionario, Double valorReajuste) {
        if (valorReajuste > 0.0) {
            funcionario.setSalario(funcionario.getSalario() + valorReajuste);
            totalSalarioReajustado += 1;
        } else {
            System.out.println("Operação Inválida");
        }
    }
    
    void promoverColaborador(Colaborador funcionario, String cargo, Double salario) {
        if (salario > funcionario.getSalario()) {
            funcionario.setSalario(salario);
            funcionario.setCargo(cargo);
            totalPromovidos += 1;
        } else {
            System.out.println("Operação Inválida");
        }
        
    }

    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }

    public Integer getTotalSalarioReajustado() {
        return totalSalarioReajustado;
    }
    
}
