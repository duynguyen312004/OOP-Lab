package aims;

public class StoreManager {
    private int managerID;
    private String name;

    public StoreManager(int managerID, String name) {
        this.managerID = managerID;
        this.name = name;
    }

    public void approveOrder(OrderInfo order) {
        order.setStatus("Approved");
        System.out.println("Order " + order.getOrderID() + " approved.");
    }

    public void rejectOrder(OrderInfo order) {
        order.setStatus("Rejected");
        System.out.println("Order " + order.getOrderID() + " rejected.");
    }

    public void addDVD(DVD dvd) {
        System.out.println("Added DVD: " + dvd.getTitle());
    }

    public void removeDVD(DVD dvd) {
        System.out.println("Removed DVD: " + dvd.getTitle());
    }

    public void addPromotion(Discount promotion) {
        System.out.println("Added Promotion ID: " + promotion.getPromoID());
    }

    public void moderateReview(Review review) {
        System.out.println("Moderated review ID: " + review.getReviewID());
    }

    public void respondToReview(Review review, String response) {
        review.setResponse(response);
        System.out.println("Responded to review ID: " + review.getReviewID());
    }

    // Getters and Setters
    public int getManagerID() { return managerID; }
    public String getName() { return name; }
}
