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
public class EJ_7_guia3 {

    /**
     * @param args the command line arguments
     * Realizar un programa que solo permita introducir solo frases o palabras 
     * de 8 de largo.
     * Si el usuario ingresa una frase o palabra de 8 de largo 
     * se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
     * en caso contrario, 
     * se deberá imprimir “INCORRECTO”. 
     * Nota: investigar la función Lenght() en Java.
     */
    public static void main(String[] args) {
     
        String frase;
        
        Scanner strFrase = new Scanner(System.in);
        System.out.println("ingrese una frase o palabra");
        frase = strFrase.nextLine();
        
         if (frase.length() == 8) {
            System.out.println("la frase o palabra--->"+frase+" :SI tiene 8 caracteres");
            //los espacios tambien cuentan
        } else {
            System.out.println("la frase o palabra--->"+frase+" :NO tiene 8 caracteres");
        }
      
        

      
    }
    
}

        


