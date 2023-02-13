/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.primeiro.projeto.nivelamento;

/**
 *
 * @author theus
 */
public class Operador {
    public static void main(String[] args) {
        Integer numero01 = 10;
        Integer numero02 = 10;
        
        // Igual JS
        // ++ Soma 1
        // -- Subtrai 1
        // +=
        // *=
        // -=
        
        //01 Soma
        Integer soma = numero01 + numero02;
        System.out.println("Soma com variável: " + soma);
        System.out.println("Somando direto: " + (numero01 + numero02));
        
        //02 Subtração (-)
        System.out.println("Subtração: " + (numero01 - numero02));
        
        //03 Multiplicação (*)
        System.out.println("Multiplicação: " + (numero01 * numero02));
        
        //04 Divisão (-)
        System.out.println("Divisão: " + (numero01 / numero02));
        
        //05 Resto (%)
        System.out.println("Resto: " + (numero01 % numero02));
        
        //06 Potência
        Double potencia = Math.pow(2, 5);
        System.out.println("Potência: " + potencia);
        //System.out.println("Potência: " + Math.pow(2, 5));
        
        //Além de métodos essa classe tem variáveis que ajudam
        System.out.println("Valor de PI: " + Math.PI);
        
    }
}
