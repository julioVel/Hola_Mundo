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
public class EJ_6_guia3 {

    /**
     * @param args the command line arguments
     * Crear un programa que pida una frase 
     * y si esa frase es igual a “eureka”
     * el programa pondrá un mensaje de Correcto,
     * sino mostrará un mensaje de Incorrecto. 
     * Nota: investigar la función equals() en Java.
     */
    public static void main(String[] args) {
        
        String frase;
        String palabra = "eureka";
        
        Scanner strFrase = new Scanner(System.in);
        System.out.println("ingrese una frase");
        frase = strFrase.nextLine();
        
        if (frase.toLowerCase().equals(palabra.toLowerCase())) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
      
    }
    
}
