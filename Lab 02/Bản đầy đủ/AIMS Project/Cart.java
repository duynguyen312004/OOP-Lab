package aims;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private int cartID;
    private List<DVD> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addDVD(DVD dvd) {
        items.add(dvd);
        System.out.println("DVD added to cart: " + dvd.getTitle());
    }

    public void removeDVD(DVD dvd) {
        items.remove(dvd);
        System.out.println("DVD removed from cart: " + dvd.getTitle());
    }

    public void updateQuantity(DVD dvd, int quantity) {
        System.out.println("Updated quantity for DVD: " + dvd.getTitle() + " to " + quantity);
    }

    public double calculateTotalCost() {
        double total = 0;
        for (DVD dvd : items) {
            total += dvd.getPrice();
        }
        return total;
    }

    public void sortDVDsByTitle() {
        // Logic to sort DVDs by title (placeholder)
    }

    public List<DVD> filterDVDsByTitle(String title) {
        // Logic to filter DVDs by title (placeholder)
        return null;
    }

    // Getters and Setters
    public int getCartID() { return cartID; }
    public List<DVD> getItems() { return items; }
    public void setCartID(int cartID) { this.cartID = cartID; }
}
