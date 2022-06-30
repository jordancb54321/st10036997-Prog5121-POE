package com.mycompany.st10036997;

import javax.swing.JOptionPane;

import scala.collection.mutable.StringBuilder;

import java.util.stream.*;

public class Task {
    public static void taskArrays() {
        int hours=0;
        String taskDescriptionCheck;
        int taskNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of tasks"));
        int[] taskNumArray = new int[taskNumber];
        StringBuilder[] taskName = new String[taskNumber];
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
            taskDescription[y] = taskDescriptionCheck;
            taskTime[y] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the time in hours to complete the task"));
            taskStatus[y] = JOptionPane.showInputDialog(null, "Task status: \nEnter \"To Do\"\nEnter \"Doing\"\nEnter \"Done\"");
            taskDeveloper[y] = JOptionPane.showInputDialog(null, "Enter the task name");
            printTaskDetails(taskNumArray[y], taskName[y], taskDescription[y], taskTime[y], taskStatus[y], taskDeveloper[y]);
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
    public static String TaskId(String taskName, Integer taskNumber, String taskDeveloper) {
        return taskName.substring(0,2) + ":" + taskNumber + ":" + taskDeveloper.substring(taskDeveloper.length() - 3);
        
    }
    public static String printTaskDetails(int number, String name, String taskDescription, int taskTime, String taskStatus, String taskDeveloper) {
        return "Task number is:" + number + "\nTask name is:" + name + "\nTask description is:" + taskDescription + "\nTask time is:" + taskTime + "\nTask status is:" + taskStatus + "\nTask developer is:" + taskDeveloper;
    }
    public static int returnTotalHours(int hours[]) {
        int totalHours = IntStream.of(hours).sum();
        return totalHours;
    }

        
    }
    

