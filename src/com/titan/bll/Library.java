/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titan.bll;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Paul
 */
public class Library {
  List<Song> songs;
    
    public Library(){
        songs = new ArrayList<>();
    }
    /**
     *
     * @param songToAdd
     */
    public void addSong(Song songToAdd){
        songs.add(songToAdd);
    }
    
    public void removeSong(Song songToRemove){
        songs.remove(songToRemove);
    }
    
   public int songCount(){
       return songs.size();
   }

    public Object getSong(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
