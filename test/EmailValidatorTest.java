/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
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
public class EmailValidatorTest {
    
    public EmailValidatorTest() {
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
    @Test
    public void ValidEmailTest(String[] Email){
        
        for (String temp : Email){
            boolean valid = emailValidator.validate(temp);
            System.out.println("Email is valid : " + temp + "," + valid);
            Assert.assertEquals(valid, true);
        }
    }
    
    @Test
    public void InValidEmailTest(String[] Email){
        
        for (String temp : Email){
            boolean valid = emailValidator.validate(temp);
            System.out.println("Email is valid : " + temp + "," + valid);
            Assert.assertEquals(valid, false);
        }
    }

    private static class emailValidator {

        private static boolean validate(String temp) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public emailValidator() {
        }
    }
}