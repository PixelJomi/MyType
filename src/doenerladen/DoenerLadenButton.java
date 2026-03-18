/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doenerladen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author WernerJon26
 */
public class DoenerLadenButton extends JButton implements ActionListener {
    
    private final JLabel label;
    
    public DoenerLadenButton(String text, Color color, JLabel label) {
        setPreferredSize(new Dimension(80,80));
        setText(text);
        setBackground(color);
        addActionListener(this);
        setPreferredSize(new Dimension(30,30));
        this.label = label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("REQUEST FOR "+this.getText());
        if (label.getText().equals("DÖNER MACHT SCHÖNER!")) {
            label.setText("WE LOVE DÖNER");
        } else {
            label.setText("DÖNER MACHT SCHÖNER!");
        }
        
    }
    
    
    
    
    
}
