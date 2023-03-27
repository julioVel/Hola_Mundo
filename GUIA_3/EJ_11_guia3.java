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
public class EJ_11_guia3 {

    /**
     * @param args the command line arguments
     * Realizar un programa que simule el funcionamiento de un dispositivo RS232,
     * este tipo de dispositivo lee cadenas enviadas por el usuario.
     * Las cadenas deben llegar con un formato fijo:
     * tienen que ser de un máximo de 5 caracteres de largo,
     * el primer carácter tiene que ser X y el último tiene que ser una O.
     * Las secuencias leídas que respeten el formato se consideran correctas,
     * la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE),
     * y toda secuencia distinta de FDE,
     * que no respete el formato se considera incorrecta.
     * Al finalizar el proceso,
     * se imprime un informe indicando la cantidad de lecturas correctas e incorrectas
     * recibidas. 
     * Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
     * de Java Substring(), Length(), equals().
     */
    public static void main(String[] args) {

        String cadenas;

        int lecturasCorrectas = 0;
        int lecturasIncorrectas = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese una cadena");
        

        while (true) {
            cadenas = sc.nextLine();

            if (cadenas.equals("&&&&&")) {
                System.out.println("finaliza");
                break;
            }
            if (cadenas.length()==5 && cadenas.charAt(0) == 'X' && cadenas.charAt(4) == 'O') {
                lecturasCorrectas++;
            } else {
               lecturasIncorrectas++; 
            }
        }
        System.out.println("lecturas correctas"+lecturasCorrectas);
        System.out.println("lecturas incorrectas"+lecturasIncorrectas);
    }

}
