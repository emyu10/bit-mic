/**
 * Generate the following series using for loops
 * a) 5, 15, 25, ...105
 * b) 7, 14, 21, ...70
 * c) 100, 90, 80, ...0
 */
public class QuestionEighteen {
    public static void main(String[] args) {
        (new FPartA()).generate();
        (new FPartB()).generate();
        (new FPartC()).generate();
    }
}
abstract class BaseFor {
    protected int i;
    abstract public void generate();
}
class FPartA extends BaseFor {
    public void generate() {
        for (i = 5; i <= 105; i += 10) {
            System.out.print(i);
            if (i != 105) System.out.print(", ");
        }
        System.out.println("\n");
    }
}
class FPartB extends BaseFor {
    public void generate() {
        for (i = 7; i <= 70; i += 7) {
            System.out.print(i);
            if (i != 70) System.out.print(", ");
        }
        System.out.println("\n");
    }
}
class FPartC extends BaseFor {
    public void generate() {
        for (i = 100; i >= 0; i -= 10) {
            System.out.print(i);
            if (i != 0) System.out.print(", ");
        }
    }
}
