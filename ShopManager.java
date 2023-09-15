package HW2ex;

public class ShopManager {
    public static double purchaseProduct(int productId, int quantity) throws ProductNotFoundException {
        try {
            Product product = ProductDatabase.getProduct(productId);
            double totalPrice = product.getPrice() * quantity;
            PaymentProcessor.processPayment(totalPrice);
            ShippingManager.shipProduct(product, quantity);
            return totalPrice;
        } catch (ProductNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
            throw e;
        }
    }
}
