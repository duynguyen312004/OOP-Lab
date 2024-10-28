package aims;

import java.util.List;

public class Customer {
    private int customerID;
    private String name;
    private String email;
    private Cart cart;

    public Customer(int customerID, String name, String email) {
        this.customerID = customerID;
        this.name = name;
        this.email = email;
        this.cart = new Cart();
    }

    public List<DVD> searchDVD(String title) {
        return null; // Placeholder logic for search
    }

    public void addToCart(DVD dvd) {
        cart.addDVD(dvd);
    }

    public void placeOrder(OrderInfo order) {
        System.out.println("Placing order: " + order.getOrderID());
    }

    public String trackOrder(int orderID) {
        return "Order Status for Order ID " + orderID;
    }

    // Getters and Setters
    public int getCustomerID() { return customerID; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public Cart getCart() { return cart; }
}
