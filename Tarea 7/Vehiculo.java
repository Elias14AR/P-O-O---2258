package ICO2258FES.POO;

public interface Vehiculo {
    //asi se declara de manera constante
    public static final int VELOCIDAD_MAXIMA= 160;
    public static final String CLASIFICACION_EFICIENCIA = "A";

    public boolean encender();
    public boolean apagar();
    public void avanzar();
    public void frenar();

}