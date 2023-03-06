package ICO.FES.POO2258;

public class PerroDrive {
    public static void main(String[] args) {

        Perro dog = new Perro( " Chihuahueño " , "Loki" );

        System.out.println(dog.comer());
        System.out.println(dog.dormir());
        System.out.println(dog.pasear());

        System.out.println(dog);

    }

}
