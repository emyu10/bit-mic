import java.util.Scanner;

class GSTCalculator {
    public static void main(String[] args) {
        float[] itemPrices = new float[100];
        String[] itemNames = new String[100];
        float sum = 0;
        char option = 'y';
        Scanner priceScanner = new Scanner(System.in);
        Scanner nameScanner = new Scanner(System.in);
        Scanner optionScanner = new Scanner(System.in);
        int i = 0;

        while (option == 'y' || option == 'Y') {
            System.out.print("Enter item: ");
            itemNames[i] = nameScanner.nextLine();
            System.out.print("Enter item price: ");
            itemPrices[i] = priceScanner.nextFloat();

            System.out.print("Want to add more items? (y/n): ");
            option = optionScanner.next().charAt(0);
            i++;
        }

        System.out.println("\n\nItem\t\tPrice\n---------------------");
        for (int j = 0; j < i; j++) {
            System.out.println(itemNames[j] + "\t\t" + itemPrices[j]);
            sum += itemPrices[j];
        }

        float gst = (sum * 0.06f) + sum;

        System.out.println("---------------------");
        System.out.println("Total:\t\t" + sum);
        System.out.println("Total with GST:\t" + gst);
    }
}