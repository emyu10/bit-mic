class ABC {
    String name;
    int age;
    int salary;
    String address;

    /**
     * No-argument constructor
     */
    ABC() {
        name = "Jaufar";
        age = 20;
        salary = 5000;
        address = "Maldives";
    }

    /**
     * Parameterized contructor
     */
    ABC(String name, int age, int salary, String address) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.address = address;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("-------------------");
    }

    /**
     * Object constructor
     */
    ABC(ABC a) {
        name = a.name;
        age = a.age;
        salary = a.salary;
        address = a.address;
    }
}

class ConstructorExample {
    public static void main(String[] args) {
        ABC o1 = new ABC();
        o1.print();
        ABC o2 = new ABC("Nasrul", 22, 2000, "Maldives");
        o2.print();
        ABC o3 = new ABC(o1);
        o3.print();
    }
}