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

      public class UsernameValidator {
            private Pattern pattern;
            private Matcher matcher;
            
            private static final String USERNAME_PATTERN = "^[a-z0-9_][3,15]$";
            
            public UsernameValidator(){
                pattern = Pattern.compile(USERNAME_PATTERN);
            }
            
            public boolean validate(final String username){
             matcher = pattern.matcher(username);
             return matcher.matches();
            }
        }
     

