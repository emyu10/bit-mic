import java.util.Scanner;

/**
 * Student grade program. Output the grade of the student when marks is entered.
 */
public class QuestionThirteen {
    public static void main(String[] args) {
        Grade g = new Grade();
        g.readMarks();
        g.evaluate();
    }
}

class Grade {
    private int marks;

    public void readMarks() {
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("Enter marks: ");
            marks = s.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid marks");
        }
    }

    public void evaluate() {
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
        } else {
            if (marks < 40) System.out.println("Grade F");
            else if (marks < 50) System.out.println("Grade E");
            else if (marks < 65) System.out.println("Grade D");
            else if (marks < 75) System.out.println("Grade C");
            else if (marks < 85) System.out.println("Grade B");
            else System.out.println("Grade A");
        }
    }
}