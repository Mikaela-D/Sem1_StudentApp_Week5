package atu.ie;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        //Created first instance of StudentDetails
        System.out.println("Please enter the student name");
        Scanner stringScanner = new Scanner(System.in);
        String name = stringScanner.nextLine();
        StudentDetails studentInfo = new StudentDetails(); //make a copy
        studentInfo.setName(name);
        System.out.println("You entered : " + studentInfo.getName());

        System.out.println("Please enter the student email");
        String email = stringScanner.nextLine();
        studentInfo.setEmail(email);
        System.out.println("You entered : " + studentInfo.getEmail());

        System.out.println("Please enter the course name");
        String course = stringScanner.nextLine();
        studentInfo.setCourse(course);
        System.out.println("You entered : " + studentInfo.getCourse());

        //Created second instance of StudentDetails
        StudentDetails studentInfo2 = new StudentDetails(); //make a copy
        System.out.println("Please enter the second student name");
        String name2 = stringScanner.nextLine();
        studentInfo2.setName(name2);
        System.out.println("You entered : " + studentInfo2.getName());

        System.out.println("Please enter the student email");
        String email2 = stringScanner.nextLine();
        studentInfo2.setEmail(email2);
        System.out.println("You entered : " + studentInfo2.getEmail());

        System.out.println("Please enter the course name");
        String course2 = stringScanner.nextLine();
        studentInfo2.setCourse(course2);
        System.out.println("You entered : " + studentInfo2.getCourse());
    }
}
