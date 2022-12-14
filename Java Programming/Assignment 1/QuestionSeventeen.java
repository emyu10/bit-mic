/**
 * Generate the following series using while loop.
 * a) 10, 20, 30, ...100
 * b) 100, 95, 90, 85, ...5
 * c) 5, 15, 25, 35, ...105
 * d) 100, 90, 80, ...0
 * e) 1, 2, 4, 8, 16, ...1024
 */
public class QuestionSeventeen {
    public static void main(String[] args) {
        (new WPartA()).generate();
        (new WPartB()).generate();
        (new WPartC()).generate();
        (new WPartD()).generate();
        (new WPartE()).generate();
    }
}
abstract class BaseWhile {
    protected int i;
    abstract public void generate();
}
class WPartA extends BaseWhile {
    public void generate() {
        i = 10;
        while (i <= 100) {
            System.out.print(i);
            if (i != 100) {
                System.out.print(", ");
            }
            i += 10;
        }
        System.out.println("\n");
    }
}
class WPartB extends BaseWhile {
    public void generate() {
        int i = 100;
        while (i >= 5) {
            System.out.print(i);
            if (i != 5) {
                System.out.print(", ");
            }
            i -= 5;
        }
        System.out.println("\n");
    }
}
class WPartC extends BaseWhile {
    public void generate() {
        int i = 5;
        while (i <= 105) {
            System.out.print(i);
            if (i != 105) System.out.print(", ");
            i += 10;
        }
        System.out.println("\n");
    }
}
class WPartD extends BaseWhile {
    public void generate() {
        int i = 100;
        while (i >= 0) {
            System.out.print(i);
            if (i != 0) System.out.print(", ");
            i -= 10;
        }
        System.out.println("\n");
    }
}
class WPartE extends BaseWhile {
    public void generate() {
        int i = 1;
        while (i <= 1024) {
            System.out.print(i);
            if (i != 1024) System.out.print(", ");
            i *= 2;
        }
    }
}