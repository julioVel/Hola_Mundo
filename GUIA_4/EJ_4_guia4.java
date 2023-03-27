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
public class EJ_4_guia4 {

    /**
     * @param args the command line arguments
     * Diseñe una función que pida el nombre y la edad de N personas 
     * e imprima los datos de las personas ingresadas por teclado 
     * e indiDiseñe una función que pida el nombre y la edad de N personasque si son mayores o menores de edad. 
     * Después de cada persona, el programa debe preguntarle al usuario si quiere 
     * seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”
     */
    public static void main(String[] args) {
        Scanner strCantidad = new Scanner(System.in);
        int cantidadPersonas;
        String nombre;
        int edad;
        do {
            
            System.out.println("ingrese la cantidad de personas");
            cantidadPersonas=strCantidad.nextInt();
            
            if (cantidadPersonas<0) {
                System.out.println("Error: deber ser mayor a cero"); 
            }   
        } while (cantidadPersonas <= 0); 
    }
    
    public static void edadNombre(int edad,String nombre) {
        Scanner strnombre = new Scanner(System.in);
        Scanner stredad = new Scanner(System.in);
        Scanner strespuesta = new Scanner(System.in);
        int cantidadPersonas = 0;
        String respuesta;
        
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("ingrese el nombre de la persona:"+(i+1)+":");
            nombre = strnombre.next();
            System.out.println("ingrese la edad de la persona:"+(i+1)+":");
            edad = stredad.nextInt();
            System.out.println("la persona de nombre:"+nombre+"tiene"+edad+"años.");
            if (edad>=18) {
                System.out.println("la persona:"+nombre+"es mayor de edad");
               } else {
                System.out.println("la persona:"+nombre+"no es mayor de edad");
            }
            System.out.println("Desea continuar Si/No");
            respuesta = strespuesta.next();
            
            if (respuesta.equalsIgnoreCase("No")) {
               break;
                
            }
                    
            
        }
        
    }
        
        
}
    
    
    

