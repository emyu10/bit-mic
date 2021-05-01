/**
 * Print the multiplication table of numbers from 1 to 9.
 */
public class QuestionNineteen {
    public static void main(String[] args) {
        MulTable mt = new MulTable();
        mt.generate();
    }
}

class MulTable {
    public void generate() {
        System.out.println("\t1\t2\t3\t4\t5\t6\t7\t8\t9");
        System.out.println("\t--\t--\t--\t--\t--\t--\t--\t--\t--");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " |\t");
            for (int j = 1; j <= 9; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
}