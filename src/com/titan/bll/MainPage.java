package com.titan.bll;


/**
 *
 * @author Paul
 */
import javax.swing.*;

public class MainPage {
    
    public static void main(String[] args){
        //Create a JFrame
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        
        //Create a MenuBar
         JMenuBar mb = new JMenuBar();
         
         //Create MenuBar Items
         JMenu file = new JMenu("File");
         mb.add(file);
        JMenu library = new JMenu("Library"); 
        mb.add(library);
           
        JMenu playlist = new JMenu("Playlist"); 
        mb.add(playlist);
        
        //Create Submenus
         JMenuItem  addSong = new JMenuItem("AddSong");
        library.add(addSong);
                        
       JMenuItem addPlaylist = new JMenuItem("AddPlaylist");
        playlist.add(addPlaylist);
        
         f.setJMenuBar(mb);
    }
  }
