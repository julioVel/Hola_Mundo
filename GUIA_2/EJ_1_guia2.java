/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.egg_guia2;

/**
 *
 * @author lautar
 */
public class EGG_Guia2 {

    public static void main(String[] args) {
        int num1;
        int num2;
        int suma = 0;
       
       Scanner numeros= new Scanner(System.in);
       
       System.out.println("ingrese el primer numero");
       num1 = numeros.nextInt();
       
       System.out.println("ingrese el segundo numero");
       num2 = numeros.nextInt();
       
       suma = num1 + num2;
       
       System.out.println("la suma de: "+num1+"+"+num2+"="+suma);
    }
}
