package Ventana;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.*;
import javax.swing.*;

public class Boton {
	public JButton crearBoton(JFrame ventana,Panel panel,String NombreBoton,String Mensaje, int col1,int col2,int col3) {
        JButton boton = new JButton(NombreBoton);
		boton.setBackground(new Color(col1,col2,col3));

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	CambiarColor(e,panel);
                JOptionPane.showMessageDialog(ventana, Mensaje);
            }
        });

        return boton;
    }
	public void CambiarColor(ActionEvent e, Panel panel) {
		JButton boton= (JButton)e.getSource();
		panel.setBackground(boton.getBackground());
	}

}
