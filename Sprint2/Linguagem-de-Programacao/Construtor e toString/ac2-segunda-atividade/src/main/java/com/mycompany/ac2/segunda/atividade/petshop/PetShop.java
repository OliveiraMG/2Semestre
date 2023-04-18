/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ac2.segunda.atividade.petshop;

/**
 *
 * @author oliveira
 */
public class PetShop {
    private String nome;
    private Double faturamentoTotal;

    public PetShop(String nome) {
        this.nome = nome;
        this.faturamentoTotal = 0.0;
    }

    @Override
    public String toString() {
        return "\nPetShop{" +
                "nome='" + nome + '\'' +
                ", faturamentoTotal=" + faturamentoTotal +
                '}';
    }

    public void darBanho(Pet pet, Double valor) {
        if (valor > 0.0) {
            pet.setQtdVisitasPetShop(pet.getQtdVisitasPetShop() + 1);
            pet.setValorGasto(pet.getValorGasto() + valor);
            faturamentoTotal += valor;
            System.out.println("\nBanho tomado!");
        } else {
            System.out.println("Valor inválido!");
        }
    };

    public void darBanho(Pet pet, Double valor, Double desconto) {
        if (valor > 0.0 && desconto > 0.0) {
            Double valorDesconto = valor + (valor * 0.10);
            pet.setQtdVisitasPetShop(pet.getQtdVisitasPetShop() + 1);
            pet.setValorGasto(pet.getValorGasto() + valorDesconto);
            faturamentoTotal += valorDesconto;
            System.out.println("\nBanho tomado!");
        } else {
            System.out.println("Valor inválido!");
        }
    }
}
