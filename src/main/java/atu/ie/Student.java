package atu.ie;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        //Created first instance of StudentDetails (getter/setter)
        System.out.println("Please enter the student name");
        Scanner stringScanner = new Scanner(System.in);
        String name = stringScanner.nextLine();
        StudentDetails studentInfo = new StudentDetails(); //make a copy
        studentInfo.setName(name);

        System.out.println("Please enter the student email");
        String email = stringScanner.nextLine();
        studentInfo.setEmail(email);

        System.out.println("Please enter the course name");
        String course = stringScanner.nextLine();
        studentInfo.setCourse(course);


        //Created second instance of StudentDetails (constructor, getter/setter)
        System.out.println("Please enter the second student name");
        String name2 = stringScanner.nextLine();

        StudentDetails studentInfo2 = new StudentDetails(name2);

        System.out.println("Please enter the second student email");
        String email2 = stringScanner.nextLine();
        studentInfo2.setEmail(email2);

        System.out.println("Please enter the second course name");
        String course2 = stringScanner.nextLine();
        studentInfo2.setCourse(course2);


        //Created third instance of StudentDetails (constructor)
        System.out.println("Please enter the third student name");
        String name3 = stringScanner.nextLine();

        System.out.println("Please enter the third student email");
        String email3 = stringScanner.nextLine();

        System.out.println("Please enter the third course name");
        String course3 = stringScanner.nextLine();

        StudentDetails studentInfo3 = new StudentDetails(name3, email3, course3);


        //Print details of the three students
        System.out.println("\nFirst name : " + studentInfo.getName());
        System.out.println("First email : " + studentInfo.getEmail());
        System.out.println("First course : " + studentInfo.getCourse());

        System.out.println("Second name : " + studentInfo2.getName()); //
        System.out.println("Second email : " + studentInfo2.getEmail());
        System.out.println("Second course : " + studentInfo2.getCourse());

        System.out.println("Third name : " + studentInfo3.getName());
        System.out.println("Third email : " + studentInfo3.getEmail());
        System.out.println("Third course : " + studentInfo3.getCourse());
    }
}
