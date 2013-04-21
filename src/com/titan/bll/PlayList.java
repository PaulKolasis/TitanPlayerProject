/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titan.bll;
import java.util.ArrayList;
import java.util.*;


  
 //Methods
   //This method Returns the playList name
/**
 *
 * @author Paul
 */
public class PlayList {
   
   List<PlayList> playlist; 
   private PlayList songPlayList;
   private String playlistName;
   
   public PlayList(){
      playlist= new ArrayList<PlayList>(); // ArrayList to hold Song type
   }
    /**
     *
     * @param playlistSong
     */
    public void addPlayListSong(PlayListSong playlistSong){
        playlist.add(songPlayList);
   }
   
    /**
     *
     * @return
     */
    public int playlistCount(){
       return playlist.size();
   }
  
   public String playlistName(){
       return playlistName;
   }
  
   //return List<PlayList>
   public int getList(){
       System.out.print(playlistName + ":");
       for (int i = 0; i < playlist.size(); i++)
           System.out.print(playlist.get(i));
       return playlist.size();
   }
   
      
    public double PlayListTime(){
       double sum = 0;
       for (int j = 0; j < playlist.size(); j++)
      sum = sum + playlist.get(j).getPlayTime();
       return sum;
   }
   public boolean isSongInPlayList(String name){
       boolean x = false;
       
       for (int i = 0; i <playlist.size(); i++)
           if(playlist.get(i).get(playlistName).equals(name))
               x = true;
       return x;
   }
      
   
   public int totalSongs() {
    return playlist.size();
}
   @Override
   public String toString() {
       return playlistName;
   }

   
    private double getPlayTime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object get(String playlistName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class PlayListSong {

        public PlayListSong() {
        }
    }
   
} //End of class PlayList
 