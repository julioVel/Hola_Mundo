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
public class EJ_4_guia3 {

    /**
     * @param args the command line arguments
     * Realizar un programa que lea 4 números (comprendidos entre 1 y 20)
     * e imprima el número ingresado seguido de tantos asteriscos como indique su valor.
     * Por ejemplo:
     * 5 *****
     */
    public static void main(String[] args) {
        
        int num;
                
        Scanner intnumeros = new Scanner(System.in);
        
        for (int i = 0; i < 4; i++) {
            System.out.println("ingrese numeros");
            num = intnumeros.nextInt();
            if (num<1 || num>20) {
                System.out.println("error: tienen que ser del 1 al 20");
                break;
            }
            
        else  {
             System.out.print(num+":"); 
             
                for (int j = 0; j < num ;j++) {
                    System.out.print("*");
                }
                    
                }



             
                } 
    }
    
}
