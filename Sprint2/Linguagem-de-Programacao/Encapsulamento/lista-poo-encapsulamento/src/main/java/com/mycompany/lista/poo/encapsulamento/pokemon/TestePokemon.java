/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.poo.encapsulamento.pokemon;

/**
 *
 * @author oliveira
 */
public class TestePokemon {
    public static void main(String[] args) {
        Pokemon p01 = new Pokemon();
        Pokemon p02 = new Pokemon();
        
        p01.setNome("Bulbassauro");
        p01.setTipo("Planta");
        p01.setForca(60.0);
        
        p02.setNome("Pikachu");
        p02.setTipo("Raio");
        p02.setForca(100.0);
                
        TreinadorPokemon treinador01 = new TreinadorPokemon();
        treinador01.setNome("Matheus");
        treinador01.setNivel(1);
        
        for (int i = 0; i < 5; i++) {
            treinador01.treinarPokemon(p01);
        }
        
        System.out.println(String.format("Nome: %s\n"
                + "Tipo: %s\n"
                + "Força: %.2f\n"
                + "Doces: %d\n", p01.getNome(), p01.getTipo(), p01.getForca(), p01.getDoces()));
        
        treinador01.evoluirPokemon(p01, "Ivysaur");
        
        System.out.println(String.format("\n--------Evolução--------\n"
                + "Nome: %s\n"
                + "Tipo: %s\n"
                + "Força: %.2f\n"
                + "Doces: %d\n", p01.getNome(), p01.getTipo(), p01.getForca(), p01.getDoces()));
        
        System.out.println("\n\n-----PRÓXIMO POKEMON-----\n\n");
        
        for (int i = 0; i < 2; i++) {
            treinador01.treinarPokemon(p02);
        }
        
        System.out.println(String.format("Nome: %s\n"
                + "Tipo: %s\n"
                + "Força: %.2f\n"
                + "Doces: %d\n", p02.getNome(), p02.getTipo(), p02.getForca(), p02.getDoces()));
        
        treinador01.evoluirPokemon(p02, "Raichu");
        
        System.out.println("\n\n-----STATUS TREINADOR-----\n\n");
        
        System.out.println(String.format("Nome: %s\n"
                + "Nivel: %d\n", treinador01.getNome(), treinador01.getNivel()));
        
    }
}
