/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titan.bll;
 

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

/**
 *
 * @author Paul
 */
public class SongFrame {
    
   
    private static void createAndShowGUI(){
        //create and set up the window.
        JFrame frame = new JFrame("SongFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel emptyLabel = new JLabel("");
        emptyLabel.setPreferredSize(new Dimension(175, 100));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run(){
            createAndShowGUI();
        }
    
    });
    }

    static void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
