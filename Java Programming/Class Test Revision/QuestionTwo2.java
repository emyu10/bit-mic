import java.util.Scanner;

class QuestionTwo2 {
    public static void main(String... args) {
        Fact f = new Fact();
        f.read();
        f.show();
    }
}

class Fact {
    int n, f = 1;

    public void read() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = s.nextInt();
    }
    
    public void show() {
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
    
        System.out.println("The factorial is " + f);
    }
}