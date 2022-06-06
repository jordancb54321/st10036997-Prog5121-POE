package com.mycompany.st10036997;

import javax.swing.JOptionPane;

public class Task {
    public static void taskArrays() {
        String taskDescriptionCheck;
        int taskNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of tasks"));
        int[] taskNumArray = new int[taskNumber];
        String[] taskName = new String[taskNumber];
        String[] taskDescription = new String[taskNumber];
        int[] taskTime = new int[taskNumber];
        String[] taskStatus = new String[taskNumber];
        String[] taskDeveloper = new String[taskNumber];

        for(int y = 0; y < taskNumber; y++) {
            taskName[y] = JOptionPane.showInputDialog(null, "Enter the task name");
            taskNumArray[y] = taskNumber;

            do{
                taskDescriptionCheck = JOptionPane.showInputDialog(null, "Enter a task description that is less than 50 characters");
            }while(!checkTaskDescription(taskDescriptionCheck)); 
            taskTime[y] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the time in hours to complete the task"));
            taskStatus[y] = JOptionPane.showInputDialog(null, "Task status: \nEnter \"To Do\"\nEnter \"Doing\"\nEnter \"Done\"");
            taskDeveloper[y] = JOptionPane.showInputDialog(null, "Enter the task name");
        }


        
    }
    public static boolean checkTaskDescription(String description) {
        if (description.length() > 50){
            JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
            return false;
        }
        else{
            JOptionPane.showMessageDialog(null, "Task successfully captured");
            return true;
        }
        
    }

        
    }
    

