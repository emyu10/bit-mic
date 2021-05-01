import java.util.*;
class EnumDayToDigit {
    enum days {Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday}
    
    days a;
    
    EnumDayToDigit(days a) {
        this.a = a;
    }

    public void cal() {
        switch (a) {
            case Sunday:
                System.out.println(1);
                break;
            case Monday:
                System.out.println(2);
                break;
            case Tuesday:
                System.out.println(3);
                break;
            case Wednesday:
                System.out.println(4);
                break;
            case Thursday:
                System.out.println(5);
                break;
            case Friday:
                System.out.println(6);
                break;
            case Saturday:
                System.out.println(7);
                break;
        }
    }
    public static void main(String[] args) {
        String a;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a day: ");
        a = s.nextLine();
        EnumDayToDigit obj = new EnumDayToDigit(days.valueOf(a));
        obj.cal();
    }
}