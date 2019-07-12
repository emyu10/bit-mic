import java.util.Scanner;
class PrintArrayReverse {
        public static void main(String[] args) {
                int i, a[] = new int[10];
                Scanner s = new Scanner(System.in);
                
                for (i = 0; i < 5; i++) {
                        System.out.print("Enter number " + (i + 1) + ": ");
                        a[i] = s.nextInt();
                }
		
		System.out.println("The array in reverse is ");
                for (i = 4; i >= 0; i--) {
                        System.out.println(a[i]);
                }
        }
}
                        
