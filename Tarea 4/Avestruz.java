package ICO.FES.POO2258;

import java.awt.*;
import java.util.Scanner;

public class Avestruz {

    private String raza;
    private float altura;
    private Color color;
    private byte edad;
    private String nombre;

    public Avestruz() {
    }

    public Avestruz(String raza, float altura, Color color, byte edad, String nombre) {
        this.raza = raza;
        this.altura = altura;
        this.color = color;
        this.edad = edad;
        this.nombre = nombre;
    }

    public Avestruz(String raza, String nombre) {
        this.raza = raza;
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Avestruz{" +
                "raza='" + raza + '\'' +
                ", altura=" + altura +
                ", color=" + color +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    Scanner lector = new Scanner(System.in);


    public boolean aletear(){
        System.out.println(nombre + " esta aleteando, alejate lentamente!");
        boolean alet = Math.random() > 0.20;
        return alet ;
    }


    public int hundirse(){
        System.out.println("  El avestruz sabe cubrirse en la tierra y descubirse");
        System.out.println(" Presiona 1 para hacer que se cubra o 2 para que este descubierto");
        int esconderse = lector.nextInt();

        if (esconderse == 1) {
            System.out.println(nombre + " se escondio!");
        }
        else{
                System.out.println(nombre + " esta al descubierto!");
            }
    return esconderse;
    }


    public boolean correr(){
        System.out.println(nombre + " se ha echado a correr!");
        boolean res = Math.random() > 0.51;
        return res;
    }
}
