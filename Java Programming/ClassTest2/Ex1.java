import java.util.Scanner;

/**
 * Read a name count vowels.
 */
class Ex1 {
    public static void main(String[] args) {
        String name, vowels = "aeiouAEIOU";
        int count = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = s.nextLine();

        for (int i = 0; i < name.length(); i++) {
            if (vowels.indexOf(name.charAt(i)) != -1) {
                count++;
            }
        }

        System.out.println("Number of vowels in '" + name + "': " + count);
    }
}