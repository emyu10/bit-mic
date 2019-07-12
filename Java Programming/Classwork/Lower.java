import java.util.Scanner;

class Lower {
        public static void main(String[] args) {
                String name;
                Scanner s = new Scanner(System.in);
                System.out.print("Enter a name: ");
                name = s.next();
                System.out.println("Lowercase: " + name.toLowerCase());
        }
}
