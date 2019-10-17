class OuterTwo {
    int count;
    public void display() {
        for (int i = 0; i < 5; i++) {
            class Inner {
                public void show() {
                    System.out.println("Inner inside " + count++);
                }
            }
            Inner in = new Inner();
            in.show();
        }
    }
}