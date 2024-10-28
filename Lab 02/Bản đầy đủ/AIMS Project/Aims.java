package aims;

import java.util.ArrayList;
import java.util.List;

public class Aims {
    public static void main(String[] args) {
        // Tạo một số DVD mẫu
        DVD dvd1 = new DVD(1, "The Matrix", "Action", 19.99, "Wachowski", 120);
        DVD dvd2 = new DVD(2, "Inception", "Sci-Fi", 15.99, "Nolan", 148);
        DVD dvd3 = new DVD(3, "Interstellar", "Sci-Fi", 17.99, "Nolan", 169);

        // Tạo một khách hàng
        Customer customer = new Customer(101, "John Doe", "johndoe@example.com");

        // Thêm DVD vào giỏ hàng của khách hàng
        customer.addToCart(dvd1);
        customer.addToCart(dvd2);
        customer.addToCart(dvd3);

        // Tính tổng chi phí trong giỏ hàng
        double totalCost = customer.getCart().calculateTotalCost();
        System.out.println("Total cost in cart: $" + totalCost);

        // Tạo đơn hàng cho khách hàng
        List<DVD> orderItems = new ArrayList<>(customer.getCart().getItems());
        OrderInfo order = new OrderInfo(1001, customer, orderItems, "123 Main St");
        
        // Tạo một store manager và phê duyệt đơn hàng
        StoreManager manager = new StoreManager(201, "Alice");
        manager.approveOrder(order);
        
        // In hóa đơn
        String invoice = order.generateInvoice();
        System.out.println(invoice);

        // Sử dụng discount
        Discount discount = new Discount(1, "FixedAmount", 5.0);
        double discountedTotal = discount.applyPromotion(customer.getCart());
        System.out.println("Discounted total cost: $" + discountedTotal);

        // Tạo và xử lý review cho DVD
        Review review = new Review(301, dvd1, 5, "Excellent movie!");
        manager.respondToReview(review, "Thank you for your feedback!");
        System.out.println("Review response: " + review.getResponse());
    }
}
