package aims;

public class Discount {
    private int promoID;
    private String type;
    private double value;

    public Discount(int promoID, String type, double value) {
        this.promoID = promoID;
        this.type = type;
        this.value = value;
    }

    public double applyPromotion(Cart cart) {
        double discount = value;
        return cart.calculateTotalCost() - discount;
    }

    // Getters and Setters
    public int getPromoID() { return promoID; }
    public String getType() { return type; }
    public double getValue() { return value; }
}
