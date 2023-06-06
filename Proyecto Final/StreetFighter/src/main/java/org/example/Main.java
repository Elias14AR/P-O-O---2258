package org.example;

import org.example.controlador.ControladorStreet;
import org.example.vista.VentanaStreet;


    public class Main {
        public static void main(String[] args) {
            VentanaStreet view  = new VentanaStreet("Street Fighter");
            ControladorStreet controller  = new ControladorStreet(view);
        }
    }