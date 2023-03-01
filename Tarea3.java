package ICO.FES.POO2258;

import java.util.Scanner;

public class Tarea3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        System.out.println("Juego del gato");
        System.out.println("Introduce una cadena valida (no mayor a 9 caracteres)" );
        String input = teclado.nextLine();

        System.out.println("Cadena introducida: " + input);

        System.out.println("------------------------------------------------------");

        System.out.println("_____");
        System.out.println("|" + input.charAt(0) + input.charAt(1) + input.charAt(2) + "|");
        System.out.println("|" + input.charAt(3) + input.charAt(4) + input.charAt(5) + "|");
        System.out.println("|" + input.charAt(6) + input.charAt(7) + input.charAt(8) + "|");
        System.out.println("-----");




    }

}
