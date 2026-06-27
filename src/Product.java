public class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock;}

    // Minimise the stock when add the cart
    public void reduceStock (int quantity) {
        this.stock -= quantity;
    }

    //Increase the stock when remove the cart
    public void increaseStock (int quantity) {
        this.stock += quantity;
    }

    //Show the Product name, Price & stock
    @Override
    public String toString() {
        return name + " - $" + price + " [Stock: " + stock + "]";
    }
}
