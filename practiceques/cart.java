package practiceques;
import java.util.ArrayList;
import java.util.List;

public class cart {
    public static void main(String[] args) {
    
    Product p1 = new Product("Lenovo LOQ 16", 185000);
    Product p2 = new Product("HP Omen 16", 200000);
    Product p3 = new Product("Acer Nitro 5", 150000);
    ShoppingCart cart1= new ShoppingCart(1,"Asrim");
    cart1.addItem(p1);
    cart1.addItem(p2);
    cart1.addItem(p3);
    cart1.removeItems(p3);
    cart1.printCart();
    }
}
/*Create a ShoppingCart class to simulate an online shopping cart. The class should have
the following attributes: cart ID, customer name, and items (a list of products). Include
methods to addltem(), removeltem(), and calculateTotal(). Implement functionality to
create new shopping carts, add/remove items, and calculate the total cost of items in the
cart. */
class ShoppingCart{
    private int cartID;
    private String customerName;
    private List<Product> items;

    public ShoppingCart(int cartID,String customerName){
        this.cartID = cartID;
        this.customerName = customerName;
        this.items = new ArrayList<>();
    }
    public void addItem(Product product){
        items.add(product);
        System.out.println("Added : " + product.getName());
    }
    public void removeItems(Product product){
        if (items.remove(product)) {
            System.out.println("removed : " + product.getName());
        }
        else{
            System.out.println("No product found");
        }
    }
    public double calculateTotal(){
        double total = 0;
        for(Product product :items){
            total +=product.getPrice();
        }
        return total;
    }
    public void printCart() {
        System.out.println("Cart ID: " + cartID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Items in the cart:");
        for (Product product : items) {
            System.out.println("- " + product.getName() + " ($" + product.getPrice() + ")");
        }
        System.out.println("Total: $" + calculateTotal());
    }
}
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
    