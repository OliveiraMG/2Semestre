/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.de.ex04;

/**
 *
 * @author theus
 */
public class Termometro {

    Double tempAtual;
    Double tempMin;
    Double tempMax;

    void aumentarTemperatura(Double valor) {
        tempAtual += valor;
        if (tempAtual > tempMax) {
            tempMax = tempAtual;
        }
        System.out.println("Temperatura após aumentar: " + tempAtual);
        
    }

    void diminuirTemperatura(Double valor) {
        tempAtual -= valor;
        if (tempAtual < tempMin) {
            tempMin = tempAtual;
        }
        System.out.println("Temperatura após diminuir: " + tempAtual);
    }

    void exibirFahreinheint() {
        Double f = (1.8 * tempAtual) + 32;

        System.out.println(String.format("O valor em fahreinheint é de: %.2f", f));

    }
    

}
