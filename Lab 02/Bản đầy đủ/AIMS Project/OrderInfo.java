package aims;

import java.util.List;

public class OrderInfo {
    private int orderID;
    private Customer customer;
    private List<DVD> orderItems;
    private double totalCost;
    private String deliveryInfo;
    private String status;

    public OrderInfo(int orderID, Customer customer, List<DVD> orderItems, String deliveryInfo) {
        this.orderID = orderID;
        this.customer = customer;
        this.orderItems = orderItems;
        this.deliveryInfo = deliveryInfo;
        this.status = "Pending";
        this.totalCost = calculateTotalCost();
    }

    private double calculateTotalCost() {
        double total = 0;
        for (DVD dvd : orderItems) {
            total += dvd.getPrice();
        }
        return total;
    }

    public double calculateDeliveryFee() {
        return 5.0; // Placeholder logic
    }

    public String generateInvoice() {
        return "Invoice for Order ID: " + orderID + "\nTotal Cost: " + totalCost;
    }

    // Getters and Setters
    public int getOrderID() { return orderID; }
    public Customer getCustomer() { return customer; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
