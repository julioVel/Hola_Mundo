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
public class EJ_3_guia3 {

    /**
     * @param args the command line arguments
     * Escriba un programa que lea 20 números.
     * Si el número leído es igual a cero
     * se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".
     * El programa deberá calcular y mostrar el resultado de la suma de los números leídos,
     * pero si el número es negativo no debe sumarse.
     * Nota: recordar el uso de la sentencia break.
     */
    public static void main(String[] args) {
        
        int num;
        int cantidad=5;
        int contador = 1;
        int suma = 0;
       Scanner intNumeros = new Scanner(System.in);
       
        
        do {
            System.out.println("ingrese el numero: "+contador);
            num = intNumeros.nextInt();
            contador++;
            if (num == 0) {
                System.out.println("se capturo al cero");
                break;
            } else if (num < 0) {
                        System.out.println("numero negativo encontrado: no se sumara al total");
                        break;
                        }
             else {
                suma = suma + num;
            }  

        } while (contador<=cantidad);
        
        System.out.println("se realizara la suma solicitada");
        System.out.println("el resultado es de: "+suma);
    }
   
}
  




    
