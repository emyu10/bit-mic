class MultiplicationTable {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + " x " + n + " = " + (i * n));
        }
    }
}