package com.jspiders.studentmanagementsystem.main;

import java.util.Scanner;

import com.jspiders.studentmanagementsystem.student.Student;
import com.jspiders.studentmanagementsystem.studentmanagement.StudentManagementSystem;

public class Main {

	public static void main(String[] args) {
	StudentManagementSystem sms = new StudentManagementSystem();
         Scanner scanner=new Scanner(System.in);
        
        boolean running = true;
        while (running) {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
            case 1:
                System.out.print("Enter student ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();
                System.out.print("Enter student age: ");
                int age = scanner.nextInt();
                Student student = new Student(id, name, age);
                sms.addstudent(student);
                break;
                
            case 2:
                System.out.print("Enter student ID: ");
                int removeId = scanner.nextInt();
                sms.removeStudent(removeId);
                break;
            
            case 4:
                running = false;
                break;
            default:
                System.out.println("Invalid choice!");
        }
            System.out.println();
        }
        
        System.out.println("Exiting Student Management System");
    }

            

	}


