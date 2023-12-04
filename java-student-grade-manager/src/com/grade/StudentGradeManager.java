package com.grade;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentGradeManager {

    public static void main(String[] args) {
        List<String> studentNames = new ArrayList<>();
        List<Double> studentGrades = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\nStudent Grade Manager");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Grades");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent(scanner, studentNames, studentGrades);
                    break;
                case 2:
                    removeStudent(scanner, studentNames, studentGrades);
                    break;
                case 3:
                    displayGrades(studentNames, studentGrades);
                    break;
                case 4:
                    System.out.println("Exit program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void addStudent(Scanner scanner, List<String> studentNames, List<Double> studentGrades) {
        System.out.println("Enter name: ");
        String name = scanner.next();

        System.out.println("Enter grade: ");
        double grade = scanner.nextDouble();

        studentNames.add(name);
        studentGrades.add(grade);
        System.out.println(name + " is added with a grade of " + grade);
    }

    public static void removeStudent(Scanner scanner, List<String> studentNames, List<Double> studentGrades) {
        if (studentNames.isEmpty()){
            System.out.println("No students to remove");
            return;
        }

        System.out.println("Enter student name to remove: ");
        String nameToRemove = scanner.next();

        int index = studentNames.indexOf(nameToRemove);
        if (index != -1) {
            studentNames.remove(index);
            studentGrades.remove(index);
            System.out.println(nameToRemove + " has been removed");
        }else {
            System.out.println("Student not found");
        }
    }
    
    public static void displayGrades(List<String> studentNames, List<Double> studentGrades) {
        if (studentNames.isEmpty()) {
            System.out.println("No students to display");
            return;
        }
        System.out.println("Student Grades");

        for (int i = 0; i < studentNames.size(); i++) {
            System.out.println(studentNames.get(i) + ":" +studentGrades.get(i));
        }
    }
}