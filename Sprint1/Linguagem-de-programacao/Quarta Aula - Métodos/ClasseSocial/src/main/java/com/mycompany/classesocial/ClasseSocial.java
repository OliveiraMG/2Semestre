/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classesocial;

/**
 *
 * @author theus
 */
public class ClasseSocial {
    Double classe(Double salarioDigitado, Double salarioMin) {
    return salarioDigitado / salarioMin;
    }
    
    String DefinirClasse(Double classe) {
    if (classe < 2) {
            return "Classe E";
        } else if (classe >= 2 && classe < 4) {
            return "Classe D";
        } else if (classe >= 4 && classe < 10) {
            return "Classe C";
        } else if (classe >= 10 && classe <= 20) {
            return "Classe B";
        }else{
            return "Classe A";
        }
    }
}
