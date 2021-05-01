import java.util.Scanner;

class GSTCalculator {
    public static void main(String[] args) {
        CartItem[] items = new CartItem[100];
        Scanner optionScanner = new Scanner(System.in);
        double sum = 0;
        char option = 'y';
        int i = 0;

        while (option == 'y' || option == 'Y') {
            items[i] = new CartItem();
            items[i].readValues();

            System.out.print("Want to add more items? (y/n): ");
            option = optionScanner.next().charAt(0);
            i++;
        }

        System.out.println("\n\nItem\t\tPrice\n---------------------");
        for (int j = 0; j < i; j++) {
            System.out.println(items[j].getName() + "\t\t" + items[j].getPrice());
            sum += items[j].getPrice();
        }

        double gst = (sum * 0.06) + sum;

        System.out.println("---------------------");
        System.out.println("Total:\t\t" + sum);
        System.out.println("Total with GST:\t" + gst);
    }
}