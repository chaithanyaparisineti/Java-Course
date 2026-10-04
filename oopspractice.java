
public class oopspractice {

    // Student class
    static class Student {

        String name;
        int age;
        int marks;

        // Constructor
        Student(String name, int age, int marks) {
            this.name = name;
            this.age = age;
            this.marks = marks;
        }

        // Method
        void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Marks: " + marks);
        }

        // Method to check result
        void checkResult() {
            if (marks >= 40) {
                System.out.println("Result: Pass");
            } else {
                System.out.println("Result: Fail");
            }
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student("Rahul", 21, 85);
        Student s2 = new Student("Arjun", 20, 35);

        s1.displayDetails();
        s1.checkResult();

        System.out.println();

        s2.displayDetails();
        s2.checkResult();
    }
}