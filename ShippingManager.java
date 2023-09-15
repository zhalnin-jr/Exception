package HW2ex;

public class ShippingManager {
    public static void shipProduct(Product product, int quantity) {
        // Реализация доставки товара
        // В данном примере мы просто выводим информацию о доставке
        System.out.println("Shipping " + quantity + " units of " + product.getName() + " to the address.");
    }
}
