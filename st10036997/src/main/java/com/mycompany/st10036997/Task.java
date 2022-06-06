package com.mycompany.st10036997;

import javax.swing.JOptionPane;

public class Task {
    public static void taskArrays() {
        int taskNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of tasks"));
        int[] taskNumArray = new int[taskNumber];
        String[] taskName = new String[taskNumber];
        String[] taskDescription = new String[taskNumber];
        int[] taskTime = new int[taskNumber];
        int[] taskStatus = new int[taskNumber];

        for(int y = 0; y < taskNumber; y++) {
            taskName[y] = JOptionPane.showInputDialog(null, "Enter the task name");
            taskNumArray[y] = taskNumber;
            taskDescription[y] = JOptionPane.showInputDialog(null, "Enter a task description that is less than 50 characters");
            taskTime[y] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the time in hours to complete the task"));
            taskName[y] = JOptionPane.showInputDialog(null, "Task status: \nEnter 1 for \"To Do\"\nEnter 2 for \"Doing\"\nEnter 3 for \"Done\"");
        }


        
    }

        
    }
    

