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
public class EJ_3_guia4 {

    /**
     * @param args the command line arguments
     * Crea una aplicación que le pida dos números al usuario
     * y este pueda elegir entre sumar, restar, multiplicar y dividir.
     * La aplicación debe tener una función para cada operación matemática
     * y deben devolver sus resultados para imprimirlos en el main. 
     */
    public static void main(String[] args) {
        
        int num1,num2;
        int opMatematicas = 0;
        
        Scanner strnum1 = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        num1 = strnum1.nextInt();
        
        Scanner strnum2 = new Scanner(System.in);
        System.out.println("ingrese el segundo numero");
        num2 = strnum2.nextInt();
        
        Scanner stropciones = new Scanner(System.in);
        System.out.println("elija una operacion matematica a realizar");
        opMatematicas = stropciones.nextInt();
        
        int retornoSuma = sumar(num1,num2);
        int retornoResta =restar(num1,num2);
        int retornoMultiplicacion =multiplicar(num1,num2);
        int retornoDivision =dividir(num1,num2);
        switch (opMatematicas) {
            
            case 1:
                System.out.println("LA SUMA ES DE:"+retornoSuma);
                break;
            case 2:
                System.out.println("LA RESTA ES DE:"+retornoResta);
                break;
            case 3:
                System.out.println("LA MULTIPLICACION ES DE:"+retornoMultiplicacion);
                break;
            case 4:
                System.out.println("LA DIVISION ES DE:"+retornoDivision);
                break;
            default:
                System.out.println("ERROR: operacion no disponible");
        }
    }
    
    public static int sumar(int num1,int num2) {
        int suma;
        suma = num1 + num2;
        return suma; 
    }
    
    public static int restar(int num1,int num2) {
        int resta;
        resta = num1 - num2;
        return resta;
    }
    
    public static int multiplicar(int num1,int num2) {
        int multi;
        multi = num1 * num2;
        return multi;
    }
    
    public static int dividir(int num1,int num2) {
        int div;
        div = num1 / num2;
        return div;
    }
    
    
}
