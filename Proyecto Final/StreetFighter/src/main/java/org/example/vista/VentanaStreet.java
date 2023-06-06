package org.example.vista;
import javax.swing.*;
import java.awt.*;

public class VentanaStreet extends JFrame {

    private JLabel lblId;
    private JLabel lblPersonaje;
    private JLabel lblPais;
    private JLabel lblVestimenta;
    private JLabel lblTecnica;
    private JLabel lblUrl;
    private JTextField txtId;
    private JTextField txtPersonaje;
    private JTextField txtPais;
    private JTextField txtVestimenta;
    private JTextField txtTecnica;
    private JTextField txtUrl;
    private JButton btnAgregar;
    private JButton btnCargar;
    private JButton btnEliminar;
    private JButton btnActualizar;
    private JTable tblStreetFighter;
    private JScrollPane scroll;
    private GridLayout layout;
    private  JPanel panel1; //
    private  JPanel panel2; //
    private  JPanel panel3;
    private  JPanel panel4;
    private JLabel imagenPersonaje;


    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblPersonaje() {
        return lblPersonaje;
    }

    public void setLblPersonaje(JLabel lblPersonaje) {
        this.lblPersonaje = lblPersonaje;
    }

    public JLabel getLblPais() {
        return lblPais;
    }

    public void setLblPais(JLabel lblPais) {
        this.lblPais = lblPais;
    }

    public JLabel getLblVestimenta() {
        return lblVestimenta;
    }

    public void setLblVestimenta(JLabel lblVestimenta) {
        this.lblVestimenta = lblVestimenta;
    }

    public JLabel getLblTecnica() {
        return lblTecnica;
    }

    public void setLblTecnica(JLabel lblTecnica) {
        this.lblTecnica = lblTecnica;
    }

    public JLabel getLblUrl() {
        return lblUrl;
    }

    public void setLblUrl(JLabel lblUrl) {
        this.lblUrl = lblUrl;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtPersonaje() {
        return txtPersonaje;
    }

    public void setTxtPersonaje(JTextField txtPersonaje) {
        this.txtPersonaje = txtPersonaje;
    }

    public JTextField getTxtPais() {
        return txtPais;
    }

    public void setTxtPais(JTextField txtPais) {
        this.txtPais = txtPais;
    }

    public JTextField getTxtVestimenta() {
        return txtVestimenta;
    }

    public void setTxtVestimenta(JTextField txtVestimenta) {
        this.txtVestimenta = txtVestimenta;
    }

    public JTextField getTxtTecnica() {
        return txtTecnica;
    }

    public void setTxtTecnica(JTextField txtTecnica) {
        this.txtTecnica = txtTecnica;
    }

    public JTextField getTxtUrl() {
        return txtUrl;
    }

    public void setTxtUrl(JTextField txtUrl) {
        this.txtUrl = txtUrl;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JTable getTblStreetFighter() {
        return tblStreetFighter;
    }

    public void setTblStreetFighter(JTable tblStreetFighter) {
        this.tblStreetFighter = tblStreetFighter;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public JLabel getImagenPersonaje() {
        return imagenPersonaje;
    }

    public void setImagenPersonaje(JLabel imagenPersonaje) {
        this.imagenPersonaje = imagenPersonaje;
    }

    public void limpiar(){
        txtPersonaje.setText("");
        txtPais.setText("");
        txtVestimenta.setText("");
        txtTecnica.setText("");
        txtUrl.setText("");
    }

    public VentanaStreet(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 800);
        layout = new GridLayout(2, 2);
        this.getContentPane().setLayout(layout);

        //panel1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(247, 255, 0, 255));
        lblId = new JLabel("Id: ");
        lblPersonaje = new JLabel("Personaje: ");
        lblPais = new JLabel("Pais: ");
        lblVestimenta = new JLabel("Vestimenta: ");
        lblTecnica = new JLabel("Tecnica: ");
        lblUrl = new JLabel("URL: ");
        txtId = new JTextField(3);
        txtId.setText("0");
        txtId.setEnabled(false);
        txtPersonaje = new JTextField(15);
        txtPais = new JTextField(15);
        txtVestimenta = new JTextField(15);
        txtTecnica = new JTextField(15);
        txtUrl = new JTextField(15);
        btnAgregar = new JButton("Agregar");
        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblPersonaje);
        panel1.add(txtPersonaje);
        panel1.add(lblPais);
        panel1.add(txtPais);
        panel1.add(lblVestimenta);
        panel1.add(txtVestimenta);
        panel1.add(lblTecnica);
        panel1.add(txtTecnica);
        panel1.add(lblUrl);
        panel1.add(txtUrl);
        panel1.add(btnAgregar);

        //panel2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(245, 191, 97));
        btnCargar = new JButton("Cargar");
        panel2.add(btnCargar);
        tblStreetFighter = new JTable();
        scroll = new JScrollPane(tblStreetFighter);
        panel2.add(scroll);

        //PANEL3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(255, 145, 0));
        imagenPersonaje = new JLabel();
        panel3.add(imagenPersonaje);

        //p4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(255, 83, 83));
        btnEliminar = new JButton("Eliminar");
        panel4.add(btnEliminar);
        btnActualizar = new JButton("Actualizar");
        panel4.add(btnActualizar);

        //Vista del panel
        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);




    }



}
