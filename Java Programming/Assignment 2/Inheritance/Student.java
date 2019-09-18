package Inheritance;

import java.util.Scanner;

class Student extends Person {
    protected String gradeClass;

    public void readGradeClass() {
        s = new Scanner(System.in);
        System.out.print("Enter grade class: ");
        gradeClass = s.nextLine();
    }

    public void setValues() {
        s = new Scanner(System.in);
        System.out.print("Enter student name: ");
        super.readName(s.nextLine());
        s = new Scanner(System.in);
        System.out.print("Enter student age: ");
        super.readAge(s.nextInt());
        s = new Scanner(System.in);
        System.out.print("Enter student address: ");
        super.readAddress(s.nextLine());
        readGradeClass();
    }

    public String getGradeClass() {
        return gradeClass;
    }

    public void printInfo() {
        System.out.println("\n---------------------");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Address: " + getAddress());
        System.out.println("Class: " + gradeClass);
        System.out.println("---------------------\n");
    }
}