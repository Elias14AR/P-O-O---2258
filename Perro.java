package ICO.FES.POO2258;

import java.awt.*;
import java.util.Scanner;

public class Perro {

    private String raza;
    private float altura;


    private Color color;

    private byte edad;

    private String nombre;

    public Perro() {
    }

    public Perro(String raza, float altura, Color color, byte edad, String nombre) {
        this.raza = raza;
        this.altura = altura;
        this.color = color;
        this.edad = edad;
        this.nombre = nombre;
    }

    public Perro(String raza, String nombre) {
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
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", altura=" + altura +
                ", color=" + color +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    Scanner lector = new Scanner(System.in);

    public boolean dormir(){

        boolean com = Math.random() > 0.51;
        if (com){
            System.out.println(nombre + " se ha quedado dormido");
        } else{
            System.out.println(nombre + " Esta despierto");
        }
        return com;
    }

    public int comer(){
        System.out.println("Para darle de comer a " + nombre + " presiona 1 o de lo contrario presiona 2");
        int com = lector.nextInt();

        if (com == 1){
            System.out.println(" Le diste de comer a " + nombre);
        } else {
            System.out.println(" No serviste comida aún " + nombre + " se acosto ");
        }

        return com;

    }

    public int pasear(){

        System.out.println("Para salir a pasear con " + nombre + " presiona 1, si no quieres hacerlo" +
                " presiona 2");
        int pas = lector.nextInt();

        if (pas == 1){
            System.out.println(" Saliste a pasear con " + nombre);
        } else {
            System.out.println(nombre + " y tu no fueron de paseo ");
        }

        return pas;

    }


}
