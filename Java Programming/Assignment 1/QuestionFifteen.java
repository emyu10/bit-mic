
/**
 * Triangle program.
 * Tell if a triangle is either equilateral, isosceles, right-angled or invalid
 * when user input the 3 angles of the triangle.
 */
import java.util.Scanner;

public class QuestionFifteen {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.readAngles();
        t.show();
    }
}

class Triangle {
    private int angle1, angle2, angle3;

    public void readAngles() {
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("Enter angle 1: ");
            angle1 = s.nextInt();
            System.out.print("Enter angle 2: ");
            angle2 = s.nextInt();
            System.out.print("Enter angle 3: ");
            angle3 = s.nextInt();
        } catch (Exception e) {
            System.out.println("Data type mismatch.");
        }
    }

    public void show() {
        boolean invalid = (angle1 + angle2 + angle3) != 180;
        boolean equilateral = angle1 == angle2 && angle1 == angle3;
        boolean isosceles = angle1 == angle2 || angle1 == angle3 || angle2 == angle3;
        boolean rightAngled = angle1 == 90 || angle2 == 90 || angle3 == 90;
        if (invalid) System.out.println("Invalid triangle");
        else if (equilateral) System.out.println("Equilateral tiangle");
        else if (isosceles) System.out.println("Isosceles triangle");
        else if (rightAngled) System.out.println("Right-angled triangle");
        else System.out.println("Normal triangle");
    }
}