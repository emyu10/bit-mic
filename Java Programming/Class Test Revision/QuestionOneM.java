import java.util.Scanner;

class QuestionOneM {
    public static void main(String... args) {
        OneMul obj = new OneMul();
        obj.read();
        obj.generate();
    }
}

class OneMul {
    private int num;

    public void read() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = s.nextInt();
    }

    public void generate() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}