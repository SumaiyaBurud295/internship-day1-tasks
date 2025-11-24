// Product Class - Represents an item in a store
public class Product {

    public static void main(String[] args) {

        //Creating Product object
        Product p1 = new Product(101, "Laptop", 55000.50, 10);

        // Display product details
        p1.displayProduct();

        // Add stock
        p1.addStock(5);

        // Buy product
        p1.buyProduct(3);

        //Display again
        p1.displayProduct();
    }

    // Private attributes (Encapsulation)
    private int id;
    private String name;
    private double price;
    private int quantity;

    // Constructor to initialize product details
    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Method: Show product details
    public void displayProduct() {
        System.out.println(this.toString());
    }

    // Method: Increase stock quantity
    public void addStock(int amount) {
        quantity += amount;
        System.out.println(amount + " items added. New quantity: " + quantity);
    }

    // Method: Purchase product (reduce quantity)
    public void buyProduct(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
            System.out.println("Purchased " + amount + " units of " + name);
        } else {
            System.out.println("Not enough stock available!");
        }
    }

    // Getters & Setters (for accessing private fields)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // toString() method - neatly prints product info
    @Override
    public String toString() {
        return "Product {\n" +
                "    id = " + id + ",\n" +
                "    name = '" + name + "',\n" +
                "    price = " + price + ",\n" +
                "    quantity = " + quantity + "\n" +
                "}";
    }
}
