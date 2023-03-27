/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.subprogramas_funcionesej_1;

import java.util.Scanner;

/**
 *
 * @author lautaro
 */
public class EJ_5_guia4 {

    /**
     * @param args the command line arguments
     * Crea una aplicación que a través de una función
     * nos convierta una cantidad de euros introducida por teclado a otra moneda,
     * estas pueden ser a dólares, yenes o libras. 
     * La función tendrá como parámetros, 
     * la cantidad de euros y la moneda a convertir que será una cadena,
     * este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
     */
    public static void main(String[] args) {
        int retornoEuros=cambioMoneda(euros);
        int euros;
        String moneda;
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese una cantidad de euros");
        euros = sc.nextInt();
    }  
}

public static void cambioMoneda(int euros,String moneda) {

}