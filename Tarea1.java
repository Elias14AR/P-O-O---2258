package org.example;

import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe tu nombre, profesion y pais de origen: ");
        String entrada = teclado.nextLine();
        System.out.println("entrada: " + entrada.toUpperCase());

        System.out.println("---------------------------------------------");

        String mayusculas = entrada.toUpperCase();
        String[] salida = mayusculas.split(" ");

        System.out.println("Nombre: " + salida[0]);
        System.out.println("Profesion: " + salida[1]);
        System.out.println("País: " + salida[2]);

    }
}
