/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.titan.bll.PlayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul
 */
public class PlayListTest {
    private String playlistName;
    
    public PlayListTest() {
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
    
    /**
     *
     */
    @Test
    public void emptyPlayListTest(){
        PlayList emptyplaylist = new PlayList();
         assertEquals(0, emptyplaylist.playlistCount());
           }
    /**
     *
     */
    @Test
   public void PlayListTest(){
       PlayList myPlaylist = new PlayList();
  myPlaylist.addPlayListSong(new PlayListSong("Wheel In The Sky", "Journey"));
  myPlaylist.addPlayListSong(new PlayListSong("Hotel California", "Eagles"));
  assertEquals(2, myPlaylist.playlistCount());
   }
}