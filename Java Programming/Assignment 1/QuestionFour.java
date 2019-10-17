import java.util.Scanner;

/**
 * Digit to month. Output the corresponding month when the user inputs a number from
 * 1 to 12. Any other number is invalid.
 */
public class QuestionFour {
    public static void main(String[] args) {
        Months m = new Months();
        m.readMonth();
        m.showMonth();
    }
}

class Months {
    private int month = 0;

    public void readMonth() {
        Scanner s = new Scanner(System.in);

        try {
            System.out.print("Enter month: ");
            month = s.nextInt();
        } catch (Exception e) {
            System.out.println("Data type mismatch.");
        }
    }

    public void showMonth() {
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month");
        }
    }
}