/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doenerladen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author WernerJon26
 */
public class DoenerLadenGUI extends JFrame {
    
    public DoenerLadenGUI(String name) {
        setTitle("Willkommen bei "+name);
        
        JPanel panel = new JPanel();
        JLabel msg = new JLabel("DÖNER MACHT SCHÖNER!",SwingConstants.CENTER);
        DoenerLadenButton doenerButton = new DoenerLadenButton("Food",Color.GREEN,msg);
        
        DoenerLadenButton drinkButton = new DoenerLadenButton("Drink",Color.CYAN,msg);
        
        
        panel.setLayout(new GridLayout(3,1));
        
        panel.add(msg);
        panel.add(doenerButton);
        panel.add(drinkButton);
        
        add(panel);
        
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        
        
        
        
    }
    
}
