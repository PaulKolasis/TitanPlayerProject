/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.titan.bll.Song;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Paul
 */
public class PlayerTest {
    private int index;
    
    public  int size() {
       return size();
    }
    /**
     *
     */
    public void stop(){
        //stop playing
    }
    //private Object playlistSong;
    private Object playlistSong;
   // private Object playlist;
    private Object playlist;
    
    /**
     *
     */
    public PlayerTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    /**
     *
     */
    @Test
    public void skipSongTest(){
        for (int i= 0; i < index; i++)
        if (Song.get(i).equals(playlistSong))
                System.out.println(Song.get(index + 1));    
       
    }
    
    /**
     *
     */
    @Test
    public void previousSongTest(){
       for (int i= 0; i < index; i++)
        if (Song.get(i).equals(playlistSong))
                System.out.println(Song.get(index - 1));    
    }
    
    @Test
    public void pauseTest(){
      if (playlistSong != null){
            PlayListSong.pause();
        }  
    }
    
    /**
     *
     */
    @Test
    public void stopTest(){
        if (playlistSong != null){
            PlayListSong.stop();
        } 
       
    }
    
    /**
     *
     */
    @Test
    public void songByArtistTest(){
        for (int i= 0; i < index; i++)
            if (Song.get(i).getArtist().equals(playlistSong))
                System.out.println(Song.get(i).getArtist());
    }
 }
