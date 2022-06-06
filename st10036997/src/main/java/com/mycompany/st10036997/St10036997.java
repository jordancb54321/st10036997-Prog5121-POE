/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.st10036997;

import javax.swing.JOptionPane;

/**
 *
 * @author Jordan
 */
public class St10036997 {

    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog(null,"Please enter your username");
        String password = JOptionPane.showInputDialog(null,"Please enter your password");
        String name = JOptionPane.showInputDialog(null,"Enter your first name");
        String surname = JOptionPane.showInputDialog(null,"Enter your surname");

        if (Login.registerUser(username, password).equals("Successful registration")) {
            JOptionPane.showMessageDialog(null, "Successful registration");
            if (Login.loginUser(username, password)){
                JOptionPane.showMessageDialog(null, "Welcome " +name + " " +surname + " it is great to see you again. ");
                JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
                Integer choice = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter 1 or 2 or 3"));
                switch (choice) {
                    case 1: System.out.println("testing 1");break;
                    case 2: System.out.println("testing 2");break;
                    case 3: System.out.println("testing 3");break;
                    default: System.out.println("incorrect number");break;
                        
                }
                }
            

        }
        else {
            JOptionPane.showMessageDialog(null, Login.registerUser(username, password));
        }
    }
}
