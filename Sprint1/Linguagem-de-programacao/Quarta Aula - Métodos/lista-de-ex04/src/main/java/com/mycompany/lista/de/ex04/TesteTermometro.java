/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.de.ex04;

/**
 *
 * @author theus
 */
public class TesteTermometro {
    public static void main(String[] args) {
        Termometro termometro01 = new Termometro();
        termometro01.tempAtual = 20.0;
        termometro01.tempMax = 25.0;
        termometro01.tempMin = 18.0;
        
        termometro01.aumentarTemperatura(4.0);
        termometro01.diminuirTemperatura(3.0);
        termometro01.exibirFahreinheint();
    }
}
