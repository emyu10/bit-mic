import java.util.Scanner;

class Person {
    private String name;
    private int age;
    private String address;
    protected Scanner s = new Scanner(System.in);

    public void readName() {
        s = new Scanner(System.in);
        System.out.print("Enter person name: ");
        name = s.nextLine();
    }

    public void readName(String name) {
        this.name = name;
    }

    public void readAge() {
        s = new Scanner(System.in);
        System.out.print("Enter person age: ");
        age = s.nextInt();
    }

    public void readAge(int age) {
        this.age = age;
    }

    public void readAddress() {
        s = new Scanner(System.in);
        System.out.print("Enter person address: ");
        address = s.nextLine();
    }

    public void readAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void printInfo() {
        System.out.println("\n---------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("---------------------\n");
    }
}