class Test03 {
    public static void check(int a) throws ArithmeticException {
        if (a == 0) {
            throw new ArithmeticException("cannot use zero");
        }
        System.out.println("Inside check function");
    }

    public static void main(String... args) {
        try {
            check(0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}