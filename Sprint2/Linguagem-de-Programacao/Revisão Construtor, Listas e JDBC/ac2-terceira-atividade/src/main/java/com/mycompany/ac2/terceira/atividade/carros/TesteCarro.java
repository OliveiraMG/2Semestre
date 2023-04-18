/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ac2.terceira.atividade.carros;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oliveira
 */
public class TesteCarro {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList();
        
        listaCarros.add(new Carro("Corsa", 18000.00, 2015, "Chevrolet"));
        listaCarros.add(new Carro("Uno", 30000.00, 2017, "Fiat"));
        listaCarros.add(new Carro("Gol", 40000.00, 2021, "Volkswagen"));
        listaCarros.add(new Carro("HB20", 65000.00, 2022, "Hyundai"));
        listaCarros.add(new Carro("Corolla", 70000.00, 2019, "Toyota"));

        
        System.out.println("\n-----Carros com o ano maior que 2018:-----");
        for (int i = 0; i < listaCarros.size(); i++) {
            Carro carroAtual = listaCarros.get(i);
            if (listaCarros.get(i).getAno() > 2018) {
                System.out.println(carroAtual.toString());
            }
        }
        
        System.out.println("\n-----Carros com o valor menor que 60.000:-----");
        for (int i = 0; i < listaCarros.size(); i++) {
            Carro carroAtual = listaCarros.get(i);
            if (listaCarros.get(i).getValor() < 60000.00) {
                System.out.println(carroAtual.toString());
            }
        }
        
        System.out.println("\n-----Carros somente da toyota:-----");
        for (int i = 0; i < listaCarros.size(); i++) {
            Carro carroAtual = listaCarros.get(i);
            
            if (listaCarros.get(i).getMarca().equalsIgnoreCase("Toyota")) {
                System.out.println(carroAtual.toString());
            }

        }

        
    }
}
