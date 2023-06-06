package org.example.controlador;

import org.example.modelo.ModeloTablaStreet;
import org.example.modelo.Street;
import org.example.vista.VentanaStreet;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ControladorStreet extends MouseAdapter {
    private VentanaStreet view;
    private ModeloTablaStreet modelo;
    private int filaSeleccionada;
    private int columnaSeleccionada;
    public ControladorStreet(VentanaStreet view) {
        this.view = view;
        modelo = new ModeloTablaStreet();
        this.view.getTblStreetFighter().setModel(modelo);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getTblStreetFighter().addMouseListener(this);
        this.view.getBtnEliminar().addMouseListener(this);
        this.view.getBtnActualizar().addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getBtnCargar()) {
            modelo.cargarDatos();
            this.view.getTblStreetFighter().setModel(modelo);
            this.view.getTblStreetFighter().updateUI();
        }

        if (e.getSource() == this.view.getBtnEliminar()) {
            System.out.println("Se ha presionado el boton de Eliminar");
            int index = this.view.getTblStreetFighter().getSelectedRow();
            if (index >= 0 && index < modelo.getRowCount()) {
                int option = JOptionPane.showConfirmDialog(view, "esta seguro?", "Confirmar eliminacion", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    Street street = modelo.getPersonajeAtIndex(index);
                    street.setPersonaje("");
                    street.setPais("");
                    street.setVestimenta("");
                    street.setTecnica("");
                    street.setURL("");
                    if (modelo.actualizarPersonaje(street)) {
                        modelo.cargarDatos();  // Cargar los datos después de actualizar el audífono
                        this.view.getTblStreetFighter().setModel(modelo);
                        this.view.getTblStreetFighter().updateUI();
                        JOptionPane.showMessageDialog(view, "Se borro correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(view, "No se pudo borrar de la base de datos. Por favor revise su conexion", "Error al borrar", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(view, "No se ha seleccionado nada", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (e.getSource() == this.view.getBtnActualizar()) {
            if (e.getSource() == this.view.getBtnActualizar()) {
                System.out.println("Se ha presionado Actualizar");
                filaSeleccionada = this.view.getTblStreetFighter().getSelectedRow();
                columnaSeleccionada = this.view.getTblStreetFighter().getSelectedColumn();
                System.out.println(this.view.getTblStreetFighter().getSelectedRow()+ "," +this.view.getTblStreetFighter().getSelectedColumn());
                if (filaSeleccionada >= 0 && columnaSeleccionada >= 0) {
                    String nuevoValor = JOptionPane.showInputDialog(view, "Ingrese el nuevo valor:");
                    if (nuevoValor != null) {
                        modelo.setValueAt(nuevoValor, filaSeleccionada, columnaSeleccionada);
                        JOptionPane.showMessageDialog(view, "Se Actualizo correctamente", "Aviso",
                                JOptionPane.INFORMATION_MESSAGE);
                        this.view.getTblStreetFighter().updateUI();

                        // Obtener el audífono modificado
                        Street nuevopersonaje = modelo.getPersonajeAtIndex(filaSeleccionada);

                        // Actualizar en la base de datos
                        modelo.actualizarPersonaje(nuevopersonaje);
                    }
                }
            }
        }


        if (e.getSource() == this.view.getBtnAgregar()){
            System.out.println("evento sobre boton agregar");
            Street street = new Street();
            street.setId(0);
            street.setPersonaje(this.view.getTxtPersonaje().getText());
           street.setPais(this.view.getTxtPais().getText());
            street.setVestimenta(this.view.getTxtVestimenta().getText());
            street.setTecnica(this.view.getTxtTecnica().getText());
            street.setURL(this.view.getTxtUrl().getText());
            if (modelo.agregarPersonaje(street)){
                JOptionPane.showMessageDialog(view,"Se agrego correctamente","Aviso",JOptionPane.INFORMATION_MESSAGE);
                this.view.getTblStreetFighter().updateUI();
            }else{
                JOptionPane.showMessageDialog(view,
                        "No se pudo agregar a la base de datos. por favor revise su conexion",
                        "Error al insertar", JOptionPane.ERROR_MESSAGE);
            }
            this.view.limpiar();
        }

        if (e.getSource() == view.getTblStreetFighter()) {
            System.out.println("Evento sobre tabla");
            int index = this.view.getTblStreetFighter().getSelectedRow();
            Street tmp = modelo.getPersonajeAtIndex(index);
            try{
                this.view.getImagenPersonaje().setIcon(tmp.getImagen());

            }catch (MalformedURLException mfue){
                System.out.println(e.toString());

            }
        }



    }
}
