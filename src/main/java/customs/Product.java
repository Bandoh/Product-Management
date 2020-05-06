package customs;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private int id;

    public Product(String name, double price, int quantity, int id) {
        this.setName(name);
        this.setPrice(price);
        this.setQuantity(quantity);
        this.setId(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

}