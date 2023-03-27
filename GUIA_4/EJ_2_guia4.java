/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.subprogramas_funcionesej_1;

import java.util.Scanner;

/**
 *
 * @author lautaro
 * 
 * Crea un procedimiento EsMultiplo 
 * que reciba los dos números pasados por el usuario
 * , validando que el primer número múltiplo del segundo
 * e imprima si el primer número es múltiplo del segundo, 
 * sino informe que no lo son.
 */
public class EJ_2_guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int num1,num2;
       
       Scanner strnum1 = new Scanner(System.in);
       System.out.println("ingresa el primer numero");
       num1 = strnum1.nextInt();
       
       Scanner strnum2 = new Scanner(System.in);
       System.out.println("ingrese el segundo numero");
       num2 = strnum2.nextInt();
       
       int retorno = EsMultiplo(num1,num2);
       
        
        
       
    }
    
    public static int EsMultiplo(int num1,int num2) {
        int multiplo;
        
        if (num1%num2==0) {
            
            System.out.println("el primer numero:"+num1+" SI es multiplo de:"+num2);
            } else {
           System.out.println("el primer numero:"+num1+" NO es multiplo de:"+num2); 
        }
        
     return 0;
        
    }
    
    
}
