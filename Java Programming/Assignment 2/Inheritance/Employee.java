package Inheritance;

import java.util.Scanner;

class Employee extends Person {
    protected float salary;

    public void readSalary() {
        s = new Scanner(System.in);
        System.out.print("Enter employee salary: ");
        salary = s.nextFloat();
    }

    public void setValues() {
        super.readName();
        super.readAddress();
        super.readAge();
        readSalary();
    }

    public Float getSalary() {
        return salary;
    }

    public void printInfo() {
        System.out.println("\n---------------------");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Address: " + getAddress());
        System.out.println("Salary: " + salary);
        System.out.println("---------------------\n");
    }
}