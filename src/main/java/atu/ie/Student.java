package atu.ie;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        System.out.println("Please enter the student name");
        Scanner stringScanner = new Scanner(System.in);
        String name = stringScanner.next();
        System.out.println("You entered : " + name);

        System.out.println("Please enter the student email");
        String email = stringScanner.next();
        System.out.println("You entered : " + email);

        System.out.println("Please enter the course name");
        String course = stringScanner.next();
        System.out.println("You entered : " + course);
    }
}
