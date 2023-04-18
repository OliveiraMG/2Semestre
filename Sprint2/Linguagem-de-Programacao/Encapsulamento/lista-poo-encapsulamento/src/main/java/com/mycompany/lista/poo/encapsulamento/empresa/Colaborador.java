/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.poo.encapsulamento.empresa;

/**
 *
 * @author oliveira
 */
public class Colaborador {
    
    private String nome;
    private String cargo;
    private Double salario = 0.0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        if(salario > 0.0) { 
        this.salario = salario;
        }
    }
    
}
