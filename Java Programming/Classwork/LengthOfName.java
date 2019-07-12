import java.util.*;
class LengthOfName {
        public static void main(String[] args) {
                String name;
                int length;
                Scanner s = new Scanner(System.in);
                System.out.println("Enter a name: ");
                name = s.next();
                length = name.length();
                System.out.println("The length is " + length);
        }
}
