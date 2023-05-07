package EjemploLayouts;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

public class VentanaD extends JFrame {
    private JPanel panel1;
    private JButton botonPanel1;
    private JLabel etiquetaPanel1;

    private JPanel panel2;
    private JLabel etiquetaPanel2;


    private JPanel panel3;
    private JComboBox<String> comboBoxPanel3;
    private JPanel panel4;
    private GridLayout layout;

    public VentanaD(String title) throws HeadlessException {
        super(title);
        this.setSize(800,600);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //panel 1
        panel1 = new JPanel();
        panel1.setBackground(new Color(221,237,250));
        botonPanel1 = new JButton("Presioname");
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.getContentPane().add(panel1,0);
        panel1.add(botonPanel1);
        etiquetaPanel1 = new JLabel("...");
        panel1.add(etiquetaPanel1);
        botonPanel1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                etiquetaPanel1.setText("Hola, presionaste el boton del panel 1");
            }
        });

        //panel 2
        String urlImagen = "https://i.pinimg.com/474x/69/a0/4b/69a04b25232b41622ab0fba1ce09b945.jpg";

        panel2 = new JPanel();
        panel2.setBackground(new Color(250,224,221));
        panel2.setLayout(new FlowLayout());
        // cargar imagen de internet
        try {
            URL url = new URL(urlImagen);
            Image image = ImageIO.read(url);
            ImageIcon imageIcon = new ImageIcon(image);
            etiquetaPanel2 = new JLabel(imageIcon);
            panel2.add(etiquetaPanel2);
            this.getContentPane().add(panel2,1);
        }catch (MalformedURLException me){
            System.out.println("URL no valida");
        }catch (Exception e){
            System.out.println("Error al cargar la imagen");
        }




        //panel 3
        panel3 = new JPanel();
        panel3.setBackground(new Color(231,221,250));

        panel3.setLayout(new FlowLayout(FlowLayout.RIGHT));
        String[] elemntos = {"Opción 1","Opción 2","Opción 3","Opción 4" };
        comboBoxPanel3 = new JComboBox<>(elemntos);
        comboBoxPanel3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getSource().toString() );
                System.out.println(comboBoxPanel3.getSelectedIndex());

            }
        });
        panel3.add(comboBoxPanel3);
        this.getContentPane().add(panel3,2);

        //panel 4
        panel4 = new JPanel();
        panel4.setBackground(new Color(222,245,204));
        this.getContentPane().add(panel4,3);


        this.setVisible(true);


    }
}
