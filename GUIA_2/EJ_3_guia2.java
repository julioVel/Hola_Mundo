/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.egg_guia2;

/**
 *
 * @author lautaro
 */
public class EJ_3_guia2 {

    /**
     * @param args the command line arguments
     * Escribir un programa que pida una frase 
     * y la muestre toda en mayúsculas 
     * y después toda en minúsculas.
     * investigar la función toUpperCase() 
     * y toLowerCase() en Java.
     */
    
    public static void main(String[] args) {
       String frase;
      
      Scanner strFrase = new Scanner(System.in);
      
      System.out.println("ingrese una frase");
      frase = strFrase.nextLine();
      
      System.out.println("frase a mayusculas--->"+frase.toUpperCase());
      System.out.println("frase a minusculas--->"+frase.toLowerCase());
    }
    
}
