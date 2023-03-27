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
public class EJ_10_guia3 {

    /**
     * @param args the command line arguments
     * 
     * Realizar un programa que pida dos números enteros positivos por teclado
     * y muestre por pantalla el siguiente menú:
     * El usuario deberá elegir una opción 
     * y el programa deberá mostrar el resultado por pantalla 
     * y luego volver al menú.
     * El programa deberá ejecutarse hasta que se elija la opción 5.
     * Tener en cuenta que, si el usuario selecciona la opción 5, 
     * en vez de salir del programa directamente, se debe mostrar el siguiente mensaje
     * de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
     * Si el usuario selecciona el carácter ‘S’ se sale del programa, 
     * caso contrario se vuelve a mostrar el menú.
     * 
     */
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 1;
        int resultado = 0;
        int op;
        char salir = 'N';

        Scanner scanner = new Scanner(System.in);
        Scanner intNumeros = new Scanner(System.in);
        Scanner intOpcion = new Scanner(System.in);

        while (num1 > 0 && num2 > 0) {
            System.out.println("ingrese el primer numero");
            num1 = intNumeros.nextInt();

            System.out.println("ingrese el segundo numero");
            num2 = intNumeros.nextInt();
            break;
        }
        
        do {

        System.out.println("---INGRESE UNA OPCION---");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");

        op = intOpcion.nextInt();

        switch (op) {
            case 1:
                resultado = num1 + num2;
                System.out.println("la suma entre: " + num1 + "+" + num2 + "=" + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("la resta entre: " + num1 + "-" + num2 + "=" + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("la multlipicacion entre: " + num1 + "*" + num2 + "=" + resultado);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("no se puede dividir por cero");
                } else {
                    resultado = num1 / num2;
                    System.out.println("la division entre:" + num1 + "/" + num2 + "=" + resultado);
                }
                break;
            case 5:
                System.out.println("esta seguro que desea salir del programa S/N?");
                salir = scanner.next().charAt(0);
                if (salir == 'S' || salir == 's') {
                        System.out.println("Hasta luego!");
                        System.exit(0);
                    }
                    break;
            default:
                System.out.println("Opción inválida");
                 break;
        }

    } while (op != 5 || salir != 'S' || salir != 's');

}
}