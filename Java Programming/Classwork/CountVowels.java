/*
 * Counts the number of vowels in a string.
 */
import java.util.Scanner;
class CountVowels {
        public static void main(String[] args) {
                String a;
                int l, c = 0;
                Scanner s = new Scanner(System.in);
                a = s.next();
                l = a.length();
                for (int i = 0; i < l; i++) {
                        if (("aeiouAEIOU").indexOf(a.charAt(i)) >=0 ) {
                                c++;
                        }

                }
                System.out.println("number of vowels: " + c);
        }
}
