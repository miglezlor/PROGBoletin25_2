package boletin25_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Metodos implements ActionListener{
    JFrame marco;
    JPanel panel;
    JButton botonp;
    JButton botonb;
    
    public void crearVentana(){
        marco = new JFrame();
        panel = new JPanel();
        botonp = new JButton("Programacion");
        botonb = new JButton("Bases de datos");
        
        marco.setSize(300, 200);
        marco.setTitle("CURSO DAM");
        
        botonp.addActionListener(this);
        botonb.addActionListener(this);
        panel.add(botonp);
        panel.add(botonb);
        marco.add(panel);
        
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==(botonp)){
            marco.setTitle("PROGRAMACION");
        }
        else{
            marco.setTitle("BASES DE DATOS");
        }
    }
}
