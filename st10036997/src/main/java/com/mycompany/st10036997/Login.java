/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10036997;

import javax.swing.JOptionPane;

/**
 *
 * @author Jordan
 */
public class Login {
    public static boolean checkUserName(String checkUsername) {
        return checkUsername.length() <= 5 && checkUsername.contains("_");
            }
    
    public static boolean checkPasswordComplexity(String checkPassword) {
        int capitalCount = 0;
        int digitCount = 0;
        int specialChar = 0;
    
        int passwordLength = checkPassword.length();
    
        if (passwordLength >= 8) {
        for (int h = 0; h < passwordLength; h++) {
            
            char pChar = checkPassword.charAt(h);
            
            if (Character.isUpperCase(pChar)) capitalCount ++;
            else if (Character.isDigit(pChar)) digitCount ++;
            else if (!Character.isLetter(pChar) && !Character.isWhitespace(pChar)) specialChar ++;
    }
        
}
    return (capitalCount >= 1 && digitCount >=1 && specialChar >= 1);
     

}
    
    public static String registerUser(String regUsername, String regPassword) {
        if (!checkUserName(regUsername)) {
            return("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length .");
        
        }
        else if (!checkPasswordComplexity(regPassword)) {
            return("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
        }
        
        else {
            return ("Successful registration");
        }

    }
    
    public static boolean loginUser(String username, String password) {
    String logUsername = JOptionPane.showInputDialog(null,"Please login with your username");
    String logPassword = JOptionPane.showInputDialog(null,"Please login with your password");
            
        return (logUsername.equals(username) && logPassword.equals(password));
        
    }

    public static String returnLoginStatus(String username, String password) {
        if (loginUser(username, password)) {
            return ("A successful login");
        }
        else {
            return ("A failed login");
        }
    }
}