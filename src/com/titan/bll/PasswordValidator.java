/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titan.bll;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Paul
 */
public class PasswordValidator {
    
    private Pattern pattern;
    private Matcher matcher;
    
    private static final String PASSWORD_PATTERN =
            "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).(6,20))";
    
    public PasswordValidator(){
        pattern = Pattern.compile(PASSWORD_PATTERN);
    }
        //Validate password with regular expression
        //return true for valid password, return false for invalid password
        public boolean validate(final String password){
            matcher = pattern.matcher(password);
           
            if( matcher.matches() == true)
            System.out.println("Valid password");
            else
            System.out.println("Invalid Password. Please try again");
             return matcher.matches();
        }
    }

