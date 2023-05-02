package com.mycompany.st10036997;

import javax.swing.JOptionPane;

public class Report {

    public static void makeReport(String[] taskName, String[] taskDescription, String[] taskTime, String[] taskStatus,
            String[] taskDeveloper, String[] taskID) {
        String[] name = taskName.clone();
        String[] description = taskDescription.clone();
        String[] time = taskTime.clone();
        String[] status = taskStatus.clone();
        String[] developer = taskDeveloper.clone();
        String[] ID = taskID.clone();
        boolean quitFlag = false;
        while (!quitFlag) {
            Integer reportChoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Enter 1 to show report \n2 to Search using task name\n3 to search all tasks assigned to a developer\n4 Delete task \n5 to show a full report\n6 to quit the program"));
            switch (reportChoice) {
                case 1:
                    display(name, developer, time, status);
                    break;
                case 2:
                    searchTask(name, developer, status);
                    break;

                case 3:
                    searchDeveloper(name, developer, status);
                    break;
                case 4:
                    deleteTask(name, developer, status);
                    break;
                case 5:
                    fullDetails(name, developer, time, status, description, ID);
                    break;
                case 6:
                    quitFlag = true;
                    break;
                default:
                    System.out.println("incorrect input");
                    break;

            }
        }
    }

    public static void display(String[] name, String[] developer, String[] time, String[] status) {
        for (int i = 0; i < status.length; i++) {
            int hours = 0;
            if (status[i].contains("Done")) {
                JOptionPane.showMessageDialog(null, "Tasks marked as \"Done\"\nTask developer: " + developer[i]
                        + "\nTask name: " + name[i] + "\nTask time: " + time[i]);
            }
            if (Integer.parseInt(time[i]) < hours) {
                hours = Integer.parseInt(time[i]);
            }
            if (Integer.parseInt(time[i]) == hours) {
                JOptionPane.showMessageDialog(null,
                        "Tasks with most hours\nTask developer: " + developer[i] + "\nTask time: " + time[i]);
            }

        }
    }

    public static void searchTask(String[] name, String[] developer, String[] status) {
        String searchName = JOptionPane.showInputDialog(null, "Enter a task name to search");
        for (int i = 0; i < name.length; i++) {
            if (name[i].contains(searchName)) {
                JOptionPane.showMessageDialog(null, "\nTask name: " + name[i] + "\nTask developer: " + developer[i]
                        + "\nTask status: " + status[i]);
            } else {
                JOptionPane.showMessageDialog(null, "Task name not found");
            }
        }
    }

    public static void searchDeveloper(String[] name, String[] developer, String[] status) {
        String searchDeveloper = JOptionPane.showInputDialog(null, "Enter a developer name to search");
        for (int i = 0; i < name.length; i++) {
            if (developer[i].contains(searchDeveloper)) {
                JOptionPane.showMessageDialog(null, "\nTask name: " + name[i]
                        + "\nTask status: " + status[i]);
            } else {
                JOptionPane.showMessageDialog(null, "Developer not found");
            }
        }
    }

    public static void deleteTask(String[] name,String[] description, String[] time, String[] developer, String[] status) {
        String deleteName = JOptionPane.showInputDialog(null, "Enter a task name to delete");
        for (int i = 0; i < name.length; i++) {
            if (name[i].contains(deleteName)) {
                for (int y = i; y < name.length - 1; y++) {
                    name[i] = name[i + 1];
                    description[i] = description[i + 1];
                    time[i] = time[i + 1];
                    developer[i] = developer[i + 1];
                    status[i] = status[i + 1];

                }
            }

        }
    }
    public static void fullDetails(String[] name, String[] developer, String[] time, String[] status, String[] description, String[] ID) {
        JOptionPane.showMessageDialog(null, name);
    }
}
