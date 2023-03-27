/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.subprogramas_funcionesej_1;

import java.util.Scanner;

/**
 *
 * @author lautaro
 * Escribir un programa que procese una secuencia de caracteres ingresada por teclado
 * y terminada en punto,
 * y luego codifique la palabra o frase ingresada de la siguiente manera:
 * cada vocal se reemplaza por el carácter que se indica en la tabla
 * y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen
 * sin cambios.
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class EJ_1_guia4 {

    public static void main(String[] args) {
        
        String texto;
        Scanner strTexto = new Scanner(System.in);
        System.out.println("ingrese una frase o texto");
        texto=strTexto.nextLine();
        
        
        switch (texto) {
            
            case "a":
                System.out.println("-....-"+texto.concat(texto,"@"));
            
        }
        
        mostrarTexto(texto);
        
    }
    
    public static String mostrarTexto(String texto) {
        
        System.out.println("frase o palabra codificada "+texto);
      return null;  
    }
    
    
}
