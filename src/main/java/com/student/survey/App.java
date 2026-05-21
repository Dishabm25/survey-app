package com.student.survey;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== COLLEGE STUDENT SURVEY =====");

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Year (1/2/3/4): ");
        int year = sc.nextInt();
        sc.nextLine();

        System.out.print("Rate Campus Facilities (1-5): ");
        int campusRating = sc.nextInt();

        System.out.print("Rate Academic Quality (1-5): ");
        int academicRating = sc.nextInt();

        System.out.println("\n===== SURVEY RESULT =====");
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("Year: " + year);
        System.out.println("Campus Rating: " + campusRating);
        System.out.println("Academic Rating: " + academicRating);

        System.out.println("\nThank you for your feedback!");
    }
}
