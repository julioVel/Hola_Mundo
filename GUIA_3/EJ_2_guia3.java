/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.egg_encuentro3a6;

import java.util.Scanner;






/**
 *
 * @author lautaro
 */
public class EJ_2_guia3 {

    public static void main(String[] args) {
        
        System.out.println("ingresa un numero entre 0 y 10");
        Scanner num = new Scanner(System.in);
        int nota;
        
        nota = num.nextInt();
       
        while (nota<0 || nota>10) {
            System.out.println("ERROR: Tiene que estar entre 0 y 10");
             nota = num.nextInt();          
}
      System.out.println("FELICIDADES: Su nota esta dentro los parametros establecidos");
 }


}