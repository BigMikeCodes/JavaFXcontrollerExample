package uk.co.michaelfarrant.javafxexample.model;

/**
 * A simple class to represent a Student
 */
public class Student {

    private String firstname;
    private String lastName;
    private String studentNumber;

    public Student(String firstName, String lastName, String studentNumber){
        //error checking omitted for brevity
        this.firstname = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
    }

    //accessor methods
    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    //mutator methods
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    //auto generated toString
    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                '}';
    }
}
