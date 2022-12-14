import java.util.*;
class Person {
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

class PersonAddress extends Person {
    String address;
    String job;
    
    void read() {
        super.read();
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("Enter address: ");
            address = s.next();
            System.out.print("Enter job: ");
            job = s.next();
        } catch (Exception e) {
            System.out.println("Data type mismatch.");
        }
    }
    
    void print() {
        super.print();
        System.out.println("Address: " + address);
        System.out.println("Job: " + job);
    }
}

class PersonExtra extends Person {
    int ot;
    String gender;
    
    void read() {
    	super.read();
    	Scanner s = new Scanner(System.in);
    	System.out.print("Enter OT: ");
    	ot = s.nextInt();
    	System.out.print("Enter gender: ");
    	gender = s.next();
    }
    
    void print() {
    	super.print();
    	System.out.println("OT: " + ot);
    	System.out.println("Gender: " + gender);
    }
}

class PersonMain {
    public static void main(String[] args) {
        PersonAddress obj = new PersonAddress();
        PersonExtra obj2 = new PersonExtra();
        obj.read();
        obj.print();
        
        obj2.read();
        obj2.print();
    }
}
