import java.util.*;
class Student {
    String name;
    int age;
    int salary;
    
    void read() {
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("Enter student name: ");
            name = s.nextLine();
            System.out.print("Enter student age: ");
            age = s.nextInt();
            System.out.print("Enter salary: ");
            salary = s.nextInt();
        } catch (Exception e) {
            System.out.println("Data type mismatch.");
        }
    }
    
    void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

class StudentAddress extends Student {
    String address;
    String job;
    
    void accept() {
        read();
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("Enter address: ");
            address = s.nextLine();
            System.out.print("Enter job: ");
            job = s.nextLine();
        } catch (Exception e) {
            System.out.println("Data type mismatch.");
        }
    }
    
    void display() {
        print();
        System.out.println("Address: " + address);
        System.out.println("Job: " + job);
    }
}

class StudentMain {
    public static void main(String[] args) {
        StudentAddress obj = new StudentAddress();
        obj.accept();
        obj.display();
    }
}
