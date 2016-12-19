package es.adrigala.naves.view;

import es.adrigala.naves.controller.HiloNave;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Adri on 19/12/2016.
 */
public class JFPantalla {
    private JButton btnInicio;
    private JPanel panelMain;
    private JButton btnParar;
    private JComboBox comboBox1;
    private JButton btnSubir;
    private JButton btnBajar;
    private JLabel lblCentro;
    private JButton b1 = new JButton();
    private JButton b2 = new JButton();
    private JButton b3 = new JButton();
    private JButton b4 = new JButton();
    private JButton b5 = new JButton();
    Thread t1;
    Thread t2;
    Thread t3;
    Thread t4;
    Thread t5;

    public JFPantalla(){

        lblCentro.setIcon(new ImageIcon("wallpaper.jpg"));

        btnInicio.addActionListener(e -> {
            if (t1 == null){
                t1 = new HiloNave(b1, 1);
                t2 = new HiloNave(b2, 2);
                t3 = new HiloNave(b3, 3);
                t4 = new HiloNave(b4, 4);
                t5 = new HiloNave(b5,5);

                b1.setVisible(true);
                t1.start();
            }


        });
    }

    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight() - 40;
        JFrame frame = new JFrame("Circulo mortal");
        frame.setContentPane(new JFPantalla().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(0,0, (int) width,(int) height);

    }
}
