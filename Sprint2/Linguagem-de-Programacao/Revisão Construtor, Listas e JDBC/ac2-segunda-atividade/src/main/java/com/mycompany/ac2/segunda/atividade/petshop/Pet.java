/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ac2.segunda.atividade.petshop;

/**
 *
 * @author oliveira
 */
public class Pet {
    private String nome;
    private String raca;
    private Integer qtdVisitasPetShop;
    private Double valorGasto;

    public Pet(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
        this.qtdVisitasPetShop = 0;
        this.valorGasto = 0.0;
    }

    @Override
    public String toString() {
        return "\nPet{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", qtdVisitasAoPetShop=" + qtdVisitasPetShop +
                ", valorGastoEmPetShop=" + valorGasto +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Integer getQtdVisitasPetShop() {
        return qtdVisitasPetShop;
    }

    public void setQtdVisitasPetShop(Integer qtdVisitasPetShop) {
        this.qtdVisitasPetShop = qtdVisitasPetShop;
    }

    public Double getValorGasto() {
        return valorGasto;
    }

    public void setValorGasto(Double valorGasto) {
        this.valorGasto = valorGasto;
    }
}
