import java.util.Scanner;

class ArrayFive {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        int needle;
        boolean found = false;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter " + i + ": ");
            a[i] = s.nextInt();
        }
        System.out.print("Enter the number to search for: ");
        needle = s.nextInt();
        s.close();
        
        for (int i = 0; i < 10; i++) {
            if (a[i] == needle){
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(needle + " found in array.");
        } else {
            System.out.println(needle + " not found in array.");
        }
    }
}