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
public class EJ_5_guia3 {

    /**
     * @param args the command line arguments
     * Crear un programa que dado un número 
     * determine si es par o impar.
     */
    public static void main(String[] args) {
        
        int num;
        
        Scanner intNum = new Scanner(System.in);
        System.out.println("ingrese un numero");
        num = intNum.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("es par");
            
        } else {
            System.out.println("es impar");
        }
        
       
    }
    
}
