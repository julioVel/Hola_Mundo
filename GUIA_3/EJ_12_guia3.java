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
public class EJ_12_guia3 {

    /**
     * @param args the command line arguments
     * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
     * Por ejemplo, si el cuadrado tiene 4 elementos por lado
     * se deberá dibujar lo siguiente:
     */
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la cantidad de elementos");
        n = sc.nextInt();

       for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
