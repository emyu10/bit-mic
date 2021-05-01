package Inheritance;

/**
 * To show inheritance examples.
 */
class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setValues();
        e.printInfo();

        Teacher t = new Teacher();
        t.setValues();
        t.printInfo();

        Student s = new Student();
        s.setValues();
        s.printInfo();
    }
}