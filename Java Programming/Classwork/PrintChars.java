import java.util.Scanner;
public class PrintChars {
        public static void main(String[] args) {
                String name;
                int l;
                Scanner s = new Scanner(System.in);
                System.out.print("Enter a name: ");
                name = s.next();
                l = name.length();
                for (int i = 0; i < l; i++) {
                        System.out.println(name.charAt(i));
                }
        }
}
