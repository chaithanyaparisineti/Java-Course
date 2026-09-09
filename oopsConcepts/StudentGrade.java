package oopsConcepts;

import java.util.Scanner;

class Student12 {
    double marks;

    Student12(double marks) {
        this.marks = marks;
    }

    void calculateGrade() {
        System.out.println("General grade student");
    }
}

class EngineeringStudents extends Student12 {

    EngineeringStudents(double marks) {
        super(marks);
    }

    @Override
    void calculateGrade() {
        if (marks >= 90) {
            System.out.println("Engineering Grade: A");
        } else if (marks >= 80) {
            System.out.println("Engineering Grade: B");
        } else if (marks >= 65) {
            System.out.println("Engineering Grade: C");
        } else if (marks >= 55) {
            System.out.println("Engineering Grade: D");
        } else if (marks >= 35) {
            System.out.println("Engineering Grade: E");
        } else {
            System.out.println("Engineering Grade: Fail");
        }
    }
}

class MedicalStudents extends Student12 {

    MedicalStudents(double marks) {
        super(marks);
    }

    @Override
    void calculateGrade() {
        if (marks >= 90) {
            System.out.println("Medical Grade: A");
        } else if (marks >= 80) {
            System.out.println("Medical Grade: B");
        } else if (marks >= 65) {
            System.out.println("Medical Grade: C");
        } else if (marks >= 55) {
            System.out.println("Medical Grade: D");
        } else if (marks >= 35) {
            System.out.println("Medical Grade: E");
        } else {
            System.out.println("Medical Grade: Fail");
        }
    }
}

class ManagementStudents extends Student12 {

    ManagementStudents(double marks) {
        super(marks);
    }

    @Override
    void calculateGrade() {
        if (marks >= 90) {
            System.out.println("Management Grade: A");
        } else if (marks >= 80) {
            System.out.println("Management Grade: B");
        } else if (marks >= 65) {
            System.out.println("Management Grade: C");
        } else if (marks >= 55) {
            System.out.println("Management Grade: D");
        } else if (marks >= 35) {
            System.out.println("Management Grade: E");
        } else {
            System.out.println("Management Grade: Fail");
        }
    }
}

public class StudentGrade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Engineering Student Marks:");
        double engineeringStudent = sc.nextDouble();

        System.out.println("Enter Medical Student Marks:");
        double medicalStudent = sc.nextDouble();

        System.out.println("Enter Management Student Marks:");
        double managementStudent = sc.nextDouble();

        Student12 s1 = new EngineeringStudents(engineeringStudent);
        Student12 s2 = new MedicalStudents(medicalStudent);
        Student12 s3 = new ManagementStudents(managementStudent);

        s1.calculateGrade();
        s2.calculateGrade();
        s3.calculateGrade();

        sc.close();
    }
}