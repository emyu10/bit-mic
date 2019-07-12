import java.util.Scanner;
public class QuestionSixteen {
    public static void main(String[] args) {
        Quad q = new Quad();
        q.readNumber();
        q.show();
    }
}
class Quad {
    private int angle;
    public void readNumber() {
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("Enter number: ");
            angle = s.nextInt();
        } catch (Exception e) {
            System.out.println("Data type mismatch.");
        }
    }
    public void show() {
        if (angle >= 0 && angle <= 90) {
            System.out.println("Quadrant one");
        } else if (angle > 90 && angle <= 180) {
            System.out.println("Quadrant two");
        } else if (angle > 180 && angle <= 270) {
            System.out.println("Quadrant three");
        } else if (angle > 270 && angle <= 360) {
            System.out.println("Quadrant four");
        } else {
            System.out.println("Invalid angle");
        }
    }
}