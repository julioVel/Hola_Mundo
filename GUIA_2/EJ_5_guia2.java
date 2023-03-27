/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.egg_guia2;

/**
 *
 * @author lautaro
 */
public class EJ_5_guia2 {

    /**
     * @param args the command line arguments
     *  Escribir un programa que lea un número entero por teclado
     * y muestre por pantalla el doble,
     * el triple 
     * y la raíz cuadrada de ese número.
     */
    public static void main(String[] args) {
       int numero;
        
        Scanner strNum = new Scanner(System.in);
        
        System.out.println("ingrese un numero:");
        numero = strNum.nextInt();
        
        System.out.println("El doble de "+numero+" es:"+numero*2);
        System.out.println("El triple de "+numero+" es:"+numero*3);
        System.out.println("La raiz de "+numero+" es:"+Math.sqrt(numero));
    }
    
}
