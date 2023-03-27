/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.arreglos_encuentro_9_10_y_11_ej1;

import java.util.Scanner;

/**
 *
 * @author lautaro
 */
public class Arreglos_Encuentro_9_10_y_11_ej2 {

    /**
     * @param args the command line arguments
     * 
     * Realizar un algoritmo que llene un vector con los 100 primeros números enteros
     * y los muestre por pantalla
     * en orden descendente.
     */
    public static void main(String[] args) {
        
       int tamanio = 100;
                
        int [] vectorNum = new int[tamanio];
        
        System.out.println("forma descendente");
        for (int i = tamanio-1; i >= 0 ; i--) {
            
           
            vectorNum[i]=tamanio-i;
            System.out.println("["+vectorNum[i]+"]");
        }
        
    }
}
    

    

