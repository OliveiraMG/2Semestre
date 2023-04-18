/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.poo.encapsulamento.empresa;

/**
 *
 * @author oliveira
 */
public class TesteColaborador {
    public static void main(String[] args) {
        
        Colaborador funcionario01 = new Colaborador();
        Colaborador funcionario02 = new Colaborador();
        
        RecursosHumanos rh = new RecursosHumanos();
        
        funcionario01.setNome("Marcus");
        System.out.println(funcionario01.getNome());
        
        funcionario01.setCargo("Desenvolvedor Júnior");
        System.out.println(funcionario01.getCargo());
        
        funcionario01.setSalario(4000.00);
        System.out.println(funcionario01.getSalario());
        
        funcionario02.setNome("\nMatheus");
        System.out.println(funcionario02.getNome());
        
        funcionario02.setCargo("Desenvolvedor Sênior");
        System.out.println(funcionario02.getCargo());
        
        funcionario02.setSalario(10000.00);
        System.out.println(funcionario02.getSalario());
        
        rh.promoverColaborador(funcionario01, "Desenvolvedor Pleno", 3000.00);
        rh.promoverColaborador(funcionario02, "TechLead", 15000.00);

        rh.reajustarSalario(funcionario01, 2000.00);
        
        System.out.println("---Alterações feitas---");
        
        System.out.println(funcionario01.getNome());
        
        System.out.println(funcionario01.getCargo());
        
        System.out.println(funcionario01.getSalario());
        
        
        
        System.out.println(funcionario02.getNome());
        
        System.out.println(funcionario02.getCargo());
        
        System.out.println(funcionario02.getSalario());
        
        System.out.println(rh.getTotalPromovidos());
        System.out.println(rh.getTotalSalarioReajustado());

    }
}
