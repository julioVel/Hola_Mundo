/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.egg_encuentro3a6;

import java.util.Scanner;

/**
 *
 * @author lautaro
 */
public class EJ_8_guia3 {

    /**
     * @param args the command line arguments
     * Escriba un programa que pida una frase o palabra
     * y valide si la primera letra de esa frase es una ‘A’.
     * Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla 
     * que diga “CORRECTO”, 
     * en caso contrario, se deberá imprimir “INCORRECTO”. 
     * Nota: investigar la función Substring y equals() de Java.
     */
    public static void main(String[] args) {
        
        String frase;
        String letra = "a";
        
        Scanner strFrase = new Scanner(System.in);
        System.out.println("ingrese una frase o palabra");
        frase = strFrase.nextLine();
        
        
        
        if (frase.substring(0,1).equalsIgnoreCase(letra)) {
            System.out.println("la frase o palabra--->"+frase+" :SI empieza con una a/A"); 
        } else {
            System.out.println("la frase o palabra--->"+frase+" :NO empieza con a/A");
        }
      
        

      
    }
    
}
          
        
   
    
    
 