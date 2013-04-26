/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titan.bll;

/**
 *
 * @author Paul
 */
public class Song {
    private static Song index;
    
    private String title;
    private String artist;
    private String rating;
    private String bpm;
    
    
    public static Song get(int index) {
        
    return Song.index;
}

  public  static int size() {
        return size();
        
    }

    public static int Artist(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void stop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static int index() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
     
    public Song(String t, String a, String r, String b) {
        title = t;
        artist = a;
        rating = r;
        bpm = b;
    }

    public Song(String wheel_in_The_Sky, String journey) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public String getTitle(){
        return title;
    }
    public String getArist(){
        return artist;
    }
    public String getRating(){
        return rating;
    }
    public String getBpm(){
        return bpm;
    }
    @Override
    public String toString(){
        return ("Title : "+ title + "," + "Artist : " + artist +
                "Rating : " + rating);
    }
    

    double getPlayTime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getSongName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    public Object getArtist() {
      return getArist();
    }
}
