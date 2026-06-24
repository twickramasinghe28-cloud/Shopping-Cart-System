import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCartSystem {
    public static void main(String[] args) {

        //Available Product
        Product[] shopProducts = {
                new Product("Laptop", 999.99),
                new Product("Mouse", 25.50),
                new Product("Keyboard", 45.00),
                new Product("Headphones", 80.00)
    };

        //Cart
        ArrayList<Product> cart = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Shopping Cart ---");
            System.out.println("1. View Available Products");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. View My Cart & Total Bill");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Products in Shop ---");
                    for (int i = 0; i < shopProducts.length; i++) {
                        System.out.println((i + 1) + ". " + shopProducts[i]);
                    }
                    break;

                case 2:
                    System.out.println("\n Select product number to add (1-4): ");
                    int prodNum = scanner.nextInt();
                    if (prodNum >= 1 && prodNum <= shopProducts.length) {
                        cart.add(shopProducts[prodNum - 1]);
                        System.out.println(shopProducts[prodNum - 1].getName() + " added to cart!");
                    } else {
                        System.out.println("Invalid product number!");
                    }
                    break;

                case 3:
                System.out.println("\n--- Your Cart Items ---");
                if (cart.isEmpty()) {
                    System.out.println("Your cart is empty.");
                } else {
                    double total = 0;
                    for (Product p : cart) {
                        System.out.println("- " + p);
                        total += p.getPrice();
                    }
                    System.out.println("------------------------");
                    System.out.println("Total Amount to Pay: $" + total);
                }
                    break;

                case 4:
                    System.out.println("Thank you for shopping!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }
}