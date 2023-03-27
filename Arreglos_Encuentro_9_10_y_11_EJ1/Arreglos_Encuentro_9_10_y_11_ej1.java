/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglos_encuentro_9_10_y_11_ej1;

import java.util.Scanner;

/**
 *
 * @author lautaro
 * Crea un vector llamado ‘Equipo’ 
 * cuya dimensión sea la cantidad de compañeros de equipo 
 * y define su tipo de dato 
 * de tal manera que te permita alojar sus nombres más adelante.
 */
public class Arreglos_Encuentro_9_10_y_11_ej1 {

    public static void main(String[] args) {
        
     
       
      String equipo [] = new String [2]; //le damos el tamanio al vector
   
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese los nombres del equipo del dia"+equipo.length+":");
        
        for (int i = 0; i < 2; i++) {
            
            System.out.print("V["+i+"]="); 
            equipo[i]=leer.nextLine();  
        }
        
                
        }
    }

