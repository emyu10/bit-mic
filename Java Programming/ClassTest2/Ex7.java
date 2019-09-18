import java.util.Scanner;

/**
 * Read four names and merge
 */
class Ex7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter name 1: ");
        String name1 = s.nextLine();

        System.out.print("Enter name 2: ");
        String name2 = s.nextLine();

        System.out.print("Enter name 3: ");
        String name3 = s.nextLine();

        System.out.print("Enter name 4: ");
        String name4 = s.nextLine();

        System.out.println("Names merged: " + name1.concat(" ").concat(name2).concat(" ").concat(name3).concat(" ").concat(name4));
    }
}