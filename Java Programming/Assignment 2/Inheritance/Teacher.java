package Inheritance;

import java.util.Scanner;

class Teacher extends Employee {
    protected String subject;

    public void readSubject() {
        s = new Scanner(System.in);
        System.out.print("Enter subject: ");
        subject = s.nextLine();
    }

    public void setValues() {
        super.setValues();
        readSubject();
    }

    public String getSubject() {
        return subject;
    }

    public void printInfo() {
        System.out.println("\n---------------------");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Address: " + getAddress());
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("---------------------\n");
    }
}