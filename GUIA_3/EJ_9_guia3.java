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
public class EJ_9_guia3 {

    /**
     * @param args the command line arguments
     * Escriba un programa en el cual se ingrese un valor límite positivo
     * y a continuación solicite números al usuario
     * hasta que la suma de los números introducidos supere el límite inicial.
     */
    public static void main(String[] args) {
        
        int valorlimitePost = 0;
        int numeros;
        int suma = 0;
        
        Scanner strvalor = new Scanner(System.in);
        Scanner intNumeros = new Scanner(System.in);

        System.out.println("ingrese un valor limite positivo"); 
        valorlimitePost = strvalor.nextInt();
        
        if (valorlimitePost < 0) {
            System.out.println("solo se permiten positivos mayores o iguales a 0");
        }

        for (int i = 0; suma <= valorlimitePost ; i++) {
            System.out.print("ingrese numeros--->:");
            numeros = intNumeros.nextInt();
            suma = suma + numeros;
        }
        
        System.out.println(+suma+">"+valorlimitePost);
    }
    
}
