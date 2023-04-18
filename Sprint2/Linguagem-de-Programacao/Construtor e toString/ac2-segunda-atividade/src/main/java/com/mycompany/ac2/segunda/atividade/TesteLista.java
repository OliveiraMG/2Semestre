/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ac2.segunda.atividade;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oliveira
 */
public class TesteLista {
    public static void main(String[] args) {
        // PARA CRIAR UMA LISTA USAREMOS UM ONJETO DO TIPO ARRAY LIST
        // ESSA CLASSE TEM VÁRIOS MÉTODOS QUE AJUDAM
        
        // MÉTODOS MAIS USADOS:
        // ADD
        //Get: Busca objeto pelo indíce
        //Size: Retorna o tamanho da lista
        //remove: remove por indíce ou objeto
        
        List listaEstranha = new ArrayList();
        
        //ESTRRANHA POIS ACEITA QUALQUER VALOR
        listaEstranha.add("Xampson");
        listaEstranha.add(42);
        listaEstranha.add(42.0);
        listaEstranha.add(false);
        
        System.out.println(listaEstranha);
        
        //CRIANDO LISTA COM TIPO!
        List<String> nomes = new ArrayList();
        
        nomes.add("Bob");
        nomes.add("Maria");
        nomes.add("Xampson");
        nomes.add("William");
        nomes.add("Giuliana");
        

        String terceiroNome = nomes.get(2);
        System.out.println("Terceiro nome: " + terceiroNome);
        
        for (int i = 0; i < nomes.size(); i++) {
            
            System.out.println(String.format("%d nome: %s", i, nomes.get(i)));
            
        }
        
        //Removendo o William
        nomes.remove("WIlliam");
        nomes.remove(3);
        
        //Lista de objetos com nossas 
        List<ControleEstimativa> atividades = new ArrayList();
        
        ControleEstimativa atividade01 = new ControleEstimativa("Criar tela de cadastro", "Marcus", 4, 0);
        ControleEstimativa atividade02 = new ControleEstimativa("Realizar o JAR", "Nilton", 3, 0);
        ControleEstimativa atividade03 = new ControleEstimativa("Arrumar responsividade", "Giovanna", 1, 0);
        
        atividades.add(atividade01);
        atividades.add(atividade02);
        atividades.add(atividade03);

        
        //Exiba somente as atividades com menos de 4 dias
        System.out.println("-----COM O FOR TRADICIONAL-----");
        for (int i = 0; i < atividades.size(); i++) {
            ControleEstimativa atividadeDaVez = atividades.get(i);
            if(atividadeDaVez.getDiasEstimados() < 4) {
                System.out.println(atividadeDaVez);
            }
        }

        System.out.println("--------------------------------");
        
        //Enhanced for
        System.out.println("-----COM O ENHANCED FOR:-----");
        //ESSE PERCORRE A LISTA INTEIRA, MAS SEM O "I"
        for (ControleEstimativa atividadeDaVez : atividades) {
            if(atividadeDaVez.getDiasEstimados() < 4) {
                System.out.println(atividadeDaVez);
            }
        }

    }
}
