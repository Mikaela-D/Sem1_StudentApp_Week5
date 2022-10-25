package atu.ie;

public class StudentDetails {
    private String name;
    private String email;
    private String course;


    public StudentDetails() { //default constructor
        this.name = "";
        this.email = "";
        this.course = "";
    }

    public StudentDetails(String name2) { //constructor 2
        this.name = name2;
    }

    public StudentDetails(String name3, String email3, String course3) { //constructor 3
        this.name = name3;
        this.email = email3;
        this.course = course3;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}




