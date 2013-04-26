/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titan.bll;
import java.util.*;
/**
 *
 * @author Paul
 */
public class SongSort {
    ArrayList<Song> songList = new ArrayList<Song>();
    
    public void main(String[] args){
        new SongSort().go();
    }

    private void getSongs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    class ArtistCompare implements Comparator<Song>{
        @Override
        public int compare(Song one, Song two){
            return one.getRating().compareTo(two.getRating());
        }
    }
    
    public void go(){
        getSongs();
        System.out.println(songList);
        
        ArtistCompare artistCompare = new ArtistCompare();
        Collections.sort(songList, artistCompare);
        System.out.println(songList);
    }
    
}
