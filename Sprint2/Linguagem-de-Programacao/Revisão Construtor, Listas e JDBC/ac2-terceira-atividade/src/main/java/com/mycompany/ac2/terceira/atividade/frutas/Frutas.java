/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ac2.terceira.atividade.frutas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author oliveira
 */
public class Frutas {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        String frutaDigitada;
        Boolean frutaExiste;
        
        List<String> listaFrutas = new ArrayList();
        
        listaFrutas.add("Banana");
        listaFrutas.add("Melão");
        listaFrutas.add("Melancia");
        listaFrutas.add("Caju");

        
        System.out.println("Digite uma fruta para verificar se existe na lista:");
        frutaDigitada = leitor.next();
        
        for (int i = 0; i < listaFrutas.size(); i++) {
            if (frutaDigitada.equalsIgnoreCase(listaFrutas.get(i))) {
                frutaExiste = true;
            } else {
                frutaExiste = false;
            }
        }
        
        if (frutaExiste = true) {
            System.out.println(String.format("A fruta %s existe na lista", frutaDigitada));
        } else {
            System.out.println(String.format("Não existe a fruta %s na lista", frutaDigitada));
        }
        
    }
}
