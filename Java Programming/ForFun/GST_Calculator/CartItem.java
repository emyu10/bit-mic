import java.util.Scanner;

class CartItem {
    private String name;
    private double price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void readValues() {
        Scanner nameScanner = new Scanner(System.in);
        Scanner priceScanner = new Scanner(System.in);
        System.out.print("Enter item name: ");
        setName(nameScanner.nextLine());
        System.out.print("Enter item price: ");
        setPrice(priceScanner.nextDouble());
        nameScanner.close();
        priceScanner.close();
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public void print() {
        System.out.println("Item name: " + this.name);
        System.out.println("Item price: " + this.price);
    }
}