/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.poo.encapsulamento.pokemon;

/**
 *
 * @author oliveira
 */
public class TreinadorPokemon {
    
    private String nome;
    private Integer nivel = 0;
    
    void treinarPokemon(Pokemon poke) {
        poke.setForca(poke.getForca() * 1.10);
        poke.setDoces(poke.getDoces() + 10);
        nivel += 2;
    }
    
    void evoluirPokemon(Pokemon poke, String nomeEvolucao) {
        if (poke.getDoces() >= 50) {
            String nomeAntigo = poke.getNome();
            poke.setNome(nomeEvolucao);
            poke.setDoces(poke.getDoces() - 50);
            nivel += 10;
            System.out.println(String.format("Pokémon %s evoluiu para -> %s", nomeAntigo, nomeEvolucao));
        } else {
            System.out.println("Não foi possível realizar a operação");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
}
