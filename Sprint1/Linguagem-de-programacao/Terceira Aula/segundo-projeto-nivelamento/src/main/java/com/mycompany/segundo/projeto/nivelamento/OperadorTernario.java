/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundo.projeto.nivelamento;

/**
 *
 * @author theus
 */
public class OperadorTernario {
    public static void main(String[] args) {
        Boolean bloqueado = true;
        String frase;
        
        frase = bloqueado ? "Usuário bloqueado" : "Usuário desbloqueado";
        
        System.out.println(frase);
        
        //Também da para usar com outros tipos
        // Se o salário for maior que 1000.0
        // O bônus é de 0.15, se for menor o bônus é de 0.10.
        
        Double bonus = 0.0;
        Double salario = 1075.50;
                
        bonus = salario >= 1000.0 ? 0.15 : 0.10;
        
        System.out.println("Bônus é:" + bonus);
    }
}
