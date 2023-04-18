/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade02.ac01;

/**
 *
 * @author theus
 */
public class ValidacaoNumerica {
    String verificarPrimo(Integer numero) {
        
    Boolean divUm = numero % 1 == 0;
    Boolean divDois = numero % 2 == 0;
    Boolean divMsm = numero % numero == 0;
    
    if (divUm.equals(true) && divDois.equals(true) && divMsm.equals(true)) {
    return "Não é primo";
    } else {
    return "É primo";
    }
    
    }
}
