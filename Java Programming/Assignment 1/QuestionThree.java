import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        Days d = new Days();
        d.readDay();
        d.printDay();
    }
}

class Days {
    private int day = 0;

    public void readDay() {
        Scanner s = new Scanner(System.in);

        try {
            System.out.print("Enter day: ");
            day = s.nextInt();
        } catch (Exception e) {
            System.out.println("Data type mismatch.");
        }
    }

    public void printDay() {
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}