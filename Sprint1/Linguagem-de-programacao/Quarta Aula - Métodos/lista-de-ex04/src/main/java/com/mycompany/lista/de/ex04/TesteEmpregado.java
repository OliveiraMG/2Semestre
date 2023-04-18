/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.de.ex04;

/**
 *
 * @author theus
 */
public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado01 = new Empregado();
        empregado01.nome = "João";
        empregado01.cargo = "Analista de Sistemas";
        empregado01.salario = 5400.00;
        
        empregado01.reajustarSalario(0.15);
        
    }
}
