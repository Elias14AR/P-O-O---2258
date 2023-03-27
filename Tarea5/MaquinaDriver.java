package ICO.FES.POO2258;

import java.util.Scanner;

public class MaquinaDriver {
    public static void main(String[] args) {

        Maquina cafess = new Maquina();


            Maquina cafe = new Maquina();
            Scanner lector = new Scanner(System.in);


            System.out.println("Recursos restantes:");
            cafe.recursos();


            while (cafe.Cof()) {

                System.out.println("¿Qué café desea?");
                System.out.println("1. Café americano");
                System.out.println("2. Café expreso");
                System.out.println("3.-Café capucchino");
                int tipos = lector.nextInt();
                switch (tipos) {

                    case 1:
                        cafe.americano();
                        break;
                    case 2:
                        cafe.expreso();
                        break;
                    case 3:
                        cafe.capuccino();

                    default:
                        System.out.println("ingrese una opcion valida");
                }

                cafe.recursos();
                System.out.println();

            }
            System.out.println("La máquina se quedo sin suministros");
            cafe.recursos();
        }
    }





