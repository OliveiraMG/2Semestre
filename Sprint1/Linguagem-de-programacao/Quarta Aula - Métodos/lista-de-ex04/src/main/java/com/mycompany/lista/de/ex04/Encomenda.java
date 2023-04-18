/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.de.ex04;

/**
 *
 * @author theus
 */
public class Encomenda {

    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorEncomenda;

    Double calcularFrete() {
        Double freteSize = 0.0;
        Double freteKm = 0.0;
        Double freteT;

        switch (tamanho) {
            case "P":
                freteSize = valorEncomenda * 0.01;
            break;
        case "M":
                freteSize = valorEncomenda * 0.03;
            break;
        case "G":
                freteSize = valorEncomenda * 0.05;
            break;
    } 
        
        if (distancia <= 50) {
            freteKm += 3;
            } else if (distancia <= 200 && distancia >= 51) {
            freteKm += 5;
            } else {
            freteKm += 7;
            }

        return freteT = freteSize + freteKm;
    }
    
    void emitirEtiqueta(Double freteT) {
        System.out.println(String.format("*****ETIQUETA PARA ENVIO*****\n"
                + "Endereço do remetente: %s\n"
                + "Endereço do destinatário: %s\n"
                + "Tamanho: %s\n"
                + "---------------------------------------------\n"
                + "Valor encomenda: R$ %.2f\n"
                + "Valor frete: R$ %.2f\n"
                + "---------------------------------------------\n"
                + "Valor total: R$ %.2f", enderecoRemetente, enderecoDestinatario, tamanho, valorEncomenda, freteT, (freteT + valorEncomenda)));
    }

}
