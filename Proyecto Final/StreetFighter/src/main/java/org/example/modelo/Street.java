package org.example.modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class  Street {
    private int id;
    private  String personaje;
    private String pais;
    private  String vestimenta;
    private String tecnica;
    private String URL;

    public Street() {
    }

    public Street(int id, String personaje, String pais, String vestimenta, String tecnica, String URL) {
        this.id = id;
        this.personaje = personaje;
        this.pais = pais;
        this.vestimenta = vestimenta ;
        this.tecnica = tecnica;
        this.URL = URL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getVestimenta() {
        return vestimenta;
    }

    public void setVestimenta(String vestimenta) {
        this.vestimenta = vestimenta;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    @Override
    public String toString() {
        return "Street{" +
                "id=" + id +
                ", personaje='" + personaje + '\'' +
                ", pais='" + pais + '\'' +
                ", vestimenta='" + vestimenta + '\'' +
                ", tecnica='" + tecnica + '\'' +
                ", URL='" + URL + '\'' +
                '}';
    }

    public ImageIcon getImagen() throws MalformedURLException {
        URL urlimagen = new URL(this.URL);
        return  new ImageIcon(urlimagen);
    }
}