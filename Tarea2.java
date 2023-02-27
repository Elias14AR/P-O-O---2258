package org.example;

import java.util.Scanner;
public class Tarea2 {

    public static void main(String[] args) {

        boolean suces = true ;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa una sucesion: ");
        String input = teclado.nextLine();
        System.out.println("Tecleaste " + input);


        for (int i = 0; i < input.length() - 1 ; i++){
            if ( (int) input.charAt(i + 1) - (int)input.charAt( i ) != 1) {
            suces = false;
            }
        }

        System.out.println("La sucesion es : " + suces);

    }
}
