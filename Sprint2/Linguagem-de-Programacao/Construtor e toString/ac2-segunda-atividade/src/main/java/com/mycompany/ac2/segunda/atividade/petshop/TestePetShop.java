/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ac2.segunda.atividade.petshop;

/**
 *
 * @author oliveira
 */
public class TestePetShop {
        public static void main(String[] args) {
        Pet pet01 = new Pet("Rex", "PitBull");
        Pet pet02 = new Pet("Haze", "Akita");
        Pet pet03 = new Pet("Marshall", "Labrador");
        PetShop petShop01 = new PetShop("Pet clean");

        petShop01.darBanho(pet03, 45.80);
        petShop01.darBanho(pet02, 90.45, 0.20);
        petShop01.darBanho(pet02, 70.0);
        petShop01.darBanho(pet01, -25.0, 0.10);
        petShop01.darBanho(pet01, 50.0, 0.10);

        System.out.println(pet01.toString());
        System.out.println(pet02.toString());
        System.out.println(pet03.toString());

        System.out.println(petShop01.toString());
    }
}
