public class QuestionTwenty {
    public static void main(String[] args) {
        MulTableRev mt = new MulTableRev();
        mt.generate();
    }
}
class MulTableRev {
    public void generate() {
        System.out.println("\t9\t8\t7\t6\t5\t4\t3\t2\t1");
        System.out.println("\t--\t--\t--\t--\t--\t--\t--\t--\t--");
        for (int i = 9; i >= 1; i--) {
            System.out.print(i + " |\t");
            for (int j = 9; j >= 1; j--) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
}