/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog_poe_part_2;

import javax.swing.JOptionPane;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RC_Student_lab
 */
public class Prog_POE_PART_2 {
    static String FirstName;
    static String LastName;
    
    static String registeredUsername;
    static String registeredPassword;
    
    static String username;
    static String password;
   
    static  String TaskName;
    static  String TaskId = "";
    static  int    TaskNumber = 0;
    static  int    TaskCount = 0;
    static  int    TaskDuration = 0;
    static String  Developerdetails;
    static  String TaskDescription;
    static final String[] statusOptions = {"To Do", "Doing", "Done"};
   
    public static void main(String[] args) {
   
        register();
        
        login();
        
        ADDTask();
        
        
        // Display the numeric menu after login
        boolean exitMenu = false; // Control for menu loop
        while (!exitMenu) {
            String menuInput = JOptionPane.showInputDialog(
                "Please select an option:\n" +
                "1. Add Task\n" +
                "2. Display Task Report(Coming soon.)\n" +
                "3. Quit");
            
            switch (menuInput) {
                case "1":
                    ADDTask(); // Call to add a new task
                    break;
                case "2":
                    displayReport(); // Call to display task report
                    break;
                case "3":
                    exitMenu = true; // Exit the loop and program
                    JOptionPane.showMessageDialog(null, "Thank you for using the Task Management System!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option. Please select a valid option.");
            }
        }
}
    
public static void register() {

     boolean validusername = false;
     boolean validpassword = false;
     boolean RegisterSuccess = false;
     
       FirstName = JOptionPane.showInputDialog("Please enter your first Name");
       LastName = JOptionPane.showInputDialog("please enter your last Name");
     
      while (!validusername){
       registeredUsername = JOptionPane.showInputDialog("Please enter your username");
        if(registeredUsername.contains("_") && registeredUsername.length() <= 5){
         JOptionPane.showMessageDialog(null,"Username captured successfully");
         validusername = true;
        }else{
        JOptionPane.showMessageDialog(null,"username is invalid, please ensure that your usernme contains"
                + "an underscore(_) and is less than 5 characters");
        continue;
        }
        while(!validpassword){
       registeredPassword = JOptionPane.showInputDialog("please enter your password");
          if (registeredPassword!= null &&registeredPassword.length()>=8 &&
              registeredPassword.matches(".*[A-Z]*.")&&
               registeredPassword.matches(".*[0-9]*.") &&
               registeredPassword.matches(".*[!@#$%^&*()]*.")){
         JOptionPane.showMessageDialog(null,"password successfully captured");
         validpassword = true;
        }else{
        JOptionPane.showMessageDialog(null,"Password is not correctly formatted, please ensure that the password contains atleast 8 characters"
        + ", a capital letter, a number and a special character");
        continue;
        }
          if (!RegisterSuccess) {
            JOptionPane.showMessageDialog(null, 
            "Registered successfully! welcome " + FirstName  + LastName + "/n" + ", It is great to see you.");
            RegisterSuccess = true;
        } else {
            JOptionPane.showMessageDialog(null, "Unsuccessfully registered! Invalid username or password.");
        }
    }
      
        JOptionPane.showMessageDialog( null,
                "First Name :" + FirstName + 
                "\n" + "Last Name : " + LastName +
                "\n" + "Username : " + registeredUsername +
                "\n" + "password : " + registeredPassword);
        
       
        }
     }
   public static void login()  {
        boolean validusername = false;
        boolean validpassword = false;
        boolean loginSuccess = false;
        
        while (!validusername){
        username = JOptionPane.showInputDialog("Please enter your registered username");
        if(username.equals(registeredUsername)){
         JOptionPane.showMessageDialog(null,"Username captured successfully");
         validusername = true;
        }else{
        JOptionPane.showMessageDialog(null,"username is invalid, please ensure that your usernme contains"
                + "an underscore(_) and is less than 5 characters");
        continue;
        }
        while(!validpassword){
        password = JOptionPane.showInputDialog("please enter your registered password");
         if(password.equals(registeredPassword)){
         JOptionPane.showMessageDialog(null,"password successfully captured");
         validpassword = true;
        }else{
        JOptionPane.showMessageDialog(null,"Password is not correctly formatted, please ensure that the password contains atleast 8 characters"
        + ", a capital letter, a number and a special character");
        continue;
        }
          if (!loginSuccess) {
            JOptionPane.showMessageDialog(null, "Welcome " + FirstName + " " + LastName + 
            "/n " + ",It is great to see you, again.");
            loginSuccess = true;
        } else {
            JOptionPane.showMessageDialog(null, "Username or Password incorrect, please try again.");
        }
    }  
}
    }
    /**
     *
     */
   public static void ADDTask() {
    TaskName = JOptionPane.showInputDialog(null, "Please enter your task name.");

    TaskDescription = JOptionPane.showInputDialog(null, "Please describe your task.");
    if (TaskDescription.length() <= 50) {
        JOptionPane.showMessageDialog(null, "Task description successfully captured.");
    } else {
        JOptionPane.showMessageDialog(null, "Please enter a description of 50 characters or less.");
        return;
    }

    String inputTaskDuration = JOptionPane.showInputDialog(null, "Please enter the task duration in hours.");
    try {
        TaskDuration = Integer.parseInt(inputTaskDuration); // Convert input to integer
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid number for task duration.");
        return; // Exit if invalid input
    }

    // Select the task status
    int selectedOption = JOptionPane.showOptionDialog(null,
            "Select the task status:",
            "Task Status",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null,
            statusOptions,
            statusOptions[0]);
    
    String taskStatus;
    if (selectedOption != -1) {
        taskStatus = statusOptions[selectedOption];
        JOptionPane.showMessageDialog(null, "Task status selected: " + taskStatus);
    } else {
        JOptionPane.showMessageDialog(null, "No status selected.");
        return; // Exit if no status is selected
    }

    TaskNumber++; // Increment task number for each task
    TaskId = generateTaskID(FirstName, LastName, TaskName, TaskNumber);

    Developerdetails = FirstName + " " + LastName;

    JOptionPane.showMessageDialog(null, 
        "Task Summary:\n" +
        "Task Name: " + TaskName + "\n" +
        "Task ID: " + TaskId + "\n" +
        "Task Description: " + TaskDescription + "\n" +
        "Task Duration: " + TaskDuration + " hours\n" +
        "Task Status: " + taskStatus + "\n" +
        "Task Number: " + TaskNumber + "\n" +
        "Developer Details: " + Developerdetails);
}

public static String generateTaskID(String firstName, String lastName, String taskName, int taskNumber) {
    // Example TaskID format: First letter of first name + last name + task name + task number
    return firstName.substring(0, 1).toUpperCase() + 
           lastName.substring(0, 1).toUpperCase() + 
           "-" + taskName.toUpperCase() + "-" + taskNumber;
}

    private static void displayReport() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    }

      




    
  

