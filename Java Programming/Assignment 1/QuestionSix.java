import java.util.Scanner;

public class QuestionSix {
    public static void main(String[] args) {
        Leaper l = new Leaper();
        l.readYear();
        l.leapOrNot();
    }
}

class Leaper {
    private int year;

    public void readYear() {
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("Enter year: ");
            year = s.nextInt();
        } catch (Exception e) {
            System.out.println("Data type mismatch.");
        }
    }

    public void leapOrNot() {
        if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}