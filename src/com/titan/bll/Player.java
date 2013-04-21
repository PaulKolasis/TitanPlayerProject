/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titan.bll;
import java.util.*;

import java.util.Map;

/**
 *
 * @author Paul
 */

public class Player {
    Map<String, List<Song>> playlist;
     private int index = 0;
    private String playlistName;
     /**
     *
     * @param Song
     */
    public void play(Song song){
         
     }
    
    public void play(String playlistName){
        //play a playlist
        for (Song  song : playlist.get(playlistName)){
            play(song);
        }
    }
    
     
    /**
     *
     */
    public void stop(){
        //stop playing
    }
    
    public void pause(){
        //pause, resume playing the last song when hit play again
    }
    
    public List<Song> skipSong(){
        if (index < playlist.size() - 1)
            index++;
        else
            index = 0;
        return playlist.get(index);
    }
    
    //Goes to the previous song in the playlist
    //and returns the new song object
    public List<Song> previousSong(){
        if(index > 0)
            index--;
         else
            index = playlist.size() - 1;
        return playlist.get(index);
    }
   
    
    public void songByArtist(String name){
       for (int i = 0; i < Song.size(); i++)
           if (Song.get(i).getArtist().equals(name))
               System.out.println(Song.get(i).getArtist());
   }
    
}
