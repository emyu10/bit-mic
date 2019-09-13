import java.util.Scanner;
/**
 * Read a name, find length, uppercase, lowercase.
 */
class Ex4 {
    public static void main(String[] args) {
        String name;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a name: ");
        name = s.nextLine();

        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
    }
}