/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.primeiro.projeto.nivelamento;

/**
 *
 * @author theus
 */
public class Tipo {

    public static void main(String[] args) {
        //Os tipos que mais usaremos em Java

        //01) Para números inteiros -> Integer
        // Declarando e inicializando
        Integer idade = 42;

        //Só declarar
        Integer idade2;

        //Inicializar depois de declarada
        idade2 = 43;

        //02) Números quebrados -> Double
        Double altura = 1.82;

        //03) Para palavras -> String
        String nome = "Xampson";

        // (\n) <- Sempre quebra a linha na hora de exibir no console
        System.out.println("Meu nome é " 
                + nome + ", tenho " 
                + idade + " anos de idade e " 
                + altura + " de altura");
        
        //Tipo primitivo vs Tipo Wrapper
        int inteiroPrimitivo;
        Integer inteiroWrapper;
        
        //Tipo Wrapper são classes, logo
        //possuem métodos e variáveis que vão ajudar :)
        //Tipos primitivos não :(
        //inteiroPrimitivo.
        //inteiroWrapper.
        
        //Outra diferença:
        //Tipo primitivo sempre terá um valor inicial mesmo sem declarar
        //Wrapper é null
        boolean boleanoPrimitivo;
        Boolean boleanoWrapper;
        
        
    }
}
