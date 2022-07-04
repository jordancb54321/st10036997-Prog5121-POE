package com.mycompany.st10036997;

import javax.swing.JOptionPane;

import scala.collection.mutable.StringBuilder;

import java.util.stream.*;

public class Task2 {
    public static void taskArrays() {
        int hours=0;
        String taskDescriptionCheck;
        int sum = 0;
        int taskNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of tasks"));
        int[] taskNumArray = new int[taskNumber];
        StringBuilder[] taskName = new String[taskNumber];
        String[] taskDescription = new String[taskNumber];
        String[] taskTime = new String[taskNumber];
        String[] taskStatus = new String[taskNumber];
        String[] taskDeveloper = new String[taskNumber];

        for(int y = 0; y < taskNumber; y++) {
            taskName[y] = JOptionPane.showInputDialog(null, "Enter the task name");
            taskNumArray[y] = taskNumber;

            do{
                taskDescriptionCheck = JOptionPane.showInputDialog(null, "Enter a task description that is less than 50 characters");
            }while(!checkTaskDescription(taskDescriptionCheck));
            taskDescription[y] = taskDescriptionCheck;
            taskTime[y] = JOptionPane.showInputDialog(null, "Enter the time in hours to complete the task");
            taskStatus[y] = JOptionPane.showInputDialog(null, "Task status: \nEnter \"To Do\"\nEnter \"Doing\"\nEnter \"Done\"");
<<<<<<< Updated upstream:st10036997/src/main/java/com/mycompany/st10036997/Task.java
            taskDeveloper[y] = JOptionPane.showInputDialog(null, "Enter the task name");
            printTaskDetails(taskNumArray[y], taskName[y], taskDescription[y], taskTime[y], taskStatus[y], taskDeveloper[y]);
        }

=======
            taskDeveloper[y] = JOptionPane.showInputDialog(null, "Enter the task developer");
            taskID[y] = TaskId(taskName[y], taskNumArray[y], taskDeveloper[y]);
            JOptionPane.showMessageDialog(null, printTaskDetails(taskNumArray[y], taskName[y], taskDescription[y], taskTime[y], taskStatus[y], taskDeveloper[y], taskID[y])); 
            
        }
        JOptionPane.showMessageDialog(null, "The total hours are: " + returnTotalHours(taskTime, sum));
        Report.makeReport(taskName, taskDescription, taskTime, taskStatus, taskDeveloper, taskID);
         
>>>>>>> Stashed changes:st10036997/src/main/java/com/mycompany/st10036997/Task2.java

        
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
<<<<<<< Updated upstream:st10036997/src/main/java/com/mycompany/st10036997/Task.java
    public static String printTaskDetails(int number, String name, String taskDescription, int taskTime, String taskStatus, String taskDeveloper) {
        return "Task number is:" + number + "\nTask name is:" + name + "\nTask description is:" + taskDescription + "\nTask time is:" + taskTime + "\nTask status is:" + taskStatus + "\nTask developer is:" + taskDeveloper;
    }
    public static int returnTotalHours(int hours[]) {
        int totalHours = IntStream.of(hours).sum();
        return totalHours;
=======
    public static String printTaskDetails(int number, String name, String taskDescription, String taskTime, String taskStatus, String taskDeveloper, String taskID) {
        return "Task number is: " + number + "\nTask name is: " + name + "\nTask description is: " + taskDescription + "\nTask time is: " + taskTime + "\nTask status is: " + taskStatus + "\nTask developer is: " + taskDeveloper + "\nTask ID is: " + taskID;
    }
    public static int returnTotalHours(String [] taskTime, int sum) {
        for (int i = 0; i < taskTime.length; i++) {
            sum = sum + Integer.parseInt(taskTime[i]);
        }
        return sum;

>>>>>>> Stashed changes:st10036997/src/main/java/com/mycompany/st10036997/Task2.java
    }


    }
    

