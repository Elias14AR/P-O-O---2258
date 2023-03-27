package ICO.FES.POO2258;

import java.util.Scanner;

public class Maquina {

    private int agua;
    private int vasos;
    private int crema;
    private int cafe;

    public Maquina() {
        this.agua = 5000;
        this.vasos = 50;
        this.crema = 1500;
        this.cafe = 1000;

    }

    public void americano() {

        if (this.agua >= 180 && this.cafe >= 15 && this.vasos > 0) {
            this.agua -= 180;
            this.cafe -= 15;
            this.vasos--;

            System.out.println("Cafe servido!");
            System.out.println("Tipo americano");

        } else {

            System.out.println("El café americano no se ha servido!");
            System.out.println("Faltan insumos");

        }

    }

    public void expreso() {
        if (this.agua >= 120 && this.cafe >= 20 && this.vasos > 0) {
            this.agua -= 120;
            this.cafe -= 20;
            this.vasos--;

            System.out.println("Café servido ");
            System.out.println("Tipo expreso");

        } else {

            System.out.println("El café expreso no se ha servido");
            System.out.println("Faltan insumos");

        }
    }

    public void capuccino() {
        if (this.agua >= 100 && this.cafe >= 14 && this.crema >= 70 && this.vasos > 0) {
            this.agua -= 100;
            this.cafe -= 14;
            this.crema -= 70;
            this.vasos--;

            System.out.println("Café servido ");
            System.out.println("Tipo capuccino");

        } else {

            System.out.println("El café capuccino no se ha servido");
            System.out.println("Faltan insumos");

        }

    }

    public void recursos() {

        System.out.println("Cantidad de vasos restantes " + this.vasos);

        System.out.println("Cantidad de agua restante " + this.agua);

        System.out.println("Cantidad de crema restante " + this.crema);

        System.out.println("Cantidad de café restante " + this.cafe);

    }

    public boolean Cof() {

        return this.vasos > 0 && this.agua >= 100 && this.crema >= 70 && this.cafe >= 14;

    }

}



