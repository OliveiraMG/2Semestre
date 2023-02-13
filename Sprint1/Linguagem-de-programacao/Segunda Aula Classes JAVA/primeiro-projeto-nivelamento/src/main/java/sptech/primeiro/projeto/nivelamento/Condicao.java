/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.primeiro.projeto.nivelamento;

/**
 *
 * @author theus
 */
public class Condicao {

    public static void main(String[] args) {
        Integer numero01 = 10;
        Integer numero02 = 42;

        if (numero01 > numero02) {
            System.out.println("É maior! ");
        } else if (numero01 < numero02) {
            System.out.println("É menor! ");
        } else if (numero01 == numero02) {
            System.out.println("É igual");
        }
        
        

        Boolean bloqueado = false; //imagine

        if (bloqueado) {
            System.out.println("Ta bloq.");
        } else {
            System.out.println("Ta desbloq.");
        }
        
        

        String nome01 = "Xampson";
        String nome02 = "Xampson"; // Veio do banco ou do scanner
        
        //Sensitive case
        if(nome01.equals(nome02)){
            System.out.println("Nome igual ");
        }else {
            System.out.println("Nome diferente!");
        }
    
        //INsensitive case
        if(nome01.equalsIgnoreCase(nome02)){
            System.out.println("Nome igual ");
        }else {
            System.out.println("Nome diferente!");
        }
    
    }

}
        
        
