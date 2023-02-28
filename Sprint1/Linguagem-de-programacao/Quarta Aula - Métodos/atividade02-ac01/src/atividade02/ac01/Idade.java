/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade02.ac01;

/**
 *
 * @author theus
 */
public class Idade {
    void classificaIdade(Integer idadeDigitada) {
    if(idadeDigitada<=2){
            System.out.println("Bebê");
        }else if(idadeDigitada<=11){
            System.out.println("Criança");
        }else if(idadeDigitada<=19){
            System.out.println("Adolescente");
        }else if(idadeDigitada<=30){
            System.out.println("Jovem");
        }else if(idadeDigitada<=60){
            System.out.println("Adulto");
        }else{
            System.out.println("Idoso");
        }
    }
}
