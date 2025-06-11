package Ventana;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MiVentana extends JFrame {
    public MiVentana() {
        setTitle("Ventana");
        setSize(1000, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JButton boton1 = new JButton("HOLAAAA");
        JButton boton2 = new JButton("Prueba2");
        JButton boton3 = new JButton("Prueba3");

        boton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.BLACK);
                JOptionPane.showMessageDialog(MiVentana.this, "POR LA MAÑANA CAFE");
            }
        });

        boton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(new Color(92, 51, 23));
                JOptionPane.showMessageDialog(MiVentana.this, "POR LA TARDE RON");
            }
        });

        boton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.CYAN);
                JOptionPane.showMessageDialog(MiVentana.this, "YA ESTAMO EN LA CALLE");
            }
        });

        boton1.setBackground(Color.BLACK);
        boton2.setBackground(new Color(92, 51, 23));
        boton3.setBackground(Color.CYAN);

        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);

        add(panel);
        setVisible(true);
    }
}