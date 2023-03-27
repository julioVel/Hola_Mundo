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
public class EJ_1_guia3 {

    /**
     * @param args the command line arguments
     * Implementar un programa que le pida dos números enteros al usuario 
     * y determineS si ambos o alguno de ellos es mayor a 25.
     */
    
    public static void main(String[] args) {
        
        int num1,num2;
        
        Scanner strNumeros = new Scanner(System.in);
        
        System.out.println("ingrese el primer numero");
        num1 = strNumeros.nextInt();
        
        System.out.println("ingrese el segundo numero");
        num2 = strNumeros.nextInt();
        
        if (num1>25 && num2>25) {
            System.out.println("Ambos numeros son mayor a 25");    
        } else if (num1<=25 && num2<=25 ) {
            System.out.println("ambos son menores a 25");
        } else {
            System.out.println("uno de ellos es mayor a 25");
        }
    }
    
}
