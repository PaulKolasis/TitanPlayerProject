/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.titan.bll.Library;
import com.titan.bll.Song;
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
public class LibraryTests {
    private String PlayListName;
    private int index;
   
    
    public LibraryTests() {
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
   
    
    @Test
    public void emptyLibraryTest(){
        Library emptyLibrary = new Library();
        assertEquals(0, emptyLibrary.songCount());
    }
    
       
    @Test
    public void addSongTest(){
        Library myLibrary = new Library();
        assertEquals(0, myLibrary.songCount());
        myLibrary.addSong(new Song("Wheel in The Sky", "Journey"));
        myLibrary.addSong(new Song("Stairway To Heavens", "Led Zeppelin"));
        assertEquals(2, myLibrary.songCount());
    }
    
    /**
     *
     */
    @Test
    public void removeSongTest(){
        Library myLibrary = new Library();
        myLibrary.removeSong(new Song("Wheel in The Sky", "Journey"));
        myLibrary.addSong(new Song("Stairway To Heavens", "Led Zeppelin"));
        assertEquals(1, myLibrary.songCount());
    }
   
}   

    

