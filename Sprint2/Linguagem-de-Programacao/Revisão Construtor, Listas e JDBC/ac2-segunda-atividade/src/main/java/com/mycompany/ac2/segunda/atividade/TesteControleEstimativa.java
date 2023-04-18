/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ac2.segunda.atividade;

/**
 *
 * @author oliveira
 */
public class TesteControleEstimativa {
    public static void main(String[] args) {
        ControleEstimativa atividade01 = new ControleEstimativa("Criar tela de cadastro", "Marcus", 3, 0);
        ControleEstimativa atividade02 = new ControleEstimativa("Realizar o JAR", "Nilton", 3, 0);
        ControleEstimativa atividade03 = new ControleEstimativa("Arrumar responsividade", "Giovanna", 1, 0);

        atividade01.terminarAtividade(1);
        atividade02.terminarAtividade(5);
        atividade03.terminarAtividade(3);

        atividade01.exibirRelatorio();
        atividade02.exibirRelatorio();
        atividade03.exibirRelatorio();

        System.out.println("\n" + atividade01.toString());
        System.out.println("\n" + atividade02.toString());
        System.out.println("\n" + atividade03.toString());
    }
}
