/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.egg_guia2;

/**
 *
 * @author lautaro
 */
public class EJ_4_guia2 {

    /**
     * @param args the command line arguments
     * Dada una cantidad de grados centígrados
     * se debe mostrar su equivalente en grados Fahrenheit.
     * La fórmula correspondiente es:
     * F = 32 + (9 * C / 5).
     * (13 °C × 9/5) + 32 =
     */
    public static void main(String[] args) {
        
       double gCentigrados;
       double Fahrenheit;
       
       Scanner strCentigrados = new Scanner(System.in);
       
       System.out.println("ingrese grados centigrados:");
       gCentigrados = strCentigrados.nextInt();
       
       Fahrenheit = (gCentigrados * 9/5) + 32;
       
       System.out.print("su equivalente en grados Fahrenheit es:"+Fahrenheit);
    }
    
}
