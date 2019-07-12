import java.util.Scanner;
class PrintArray {
        public static void main(String[] args) {
                int i, a[] = new int[10];
                Scanner s = new Scanner(System.in);
                
                for (i = 0; i < 5; i++) {
                        System.out.print("Enter number " + (i + 1) + ":");
                        a[i] = s.nextInt();
                }

                for (i = 0; i < 5; i++) {
                        System.out.println(a[i]);
                }
        }
}
                        
