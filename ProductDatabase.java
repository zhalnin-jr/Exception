package HW2ex;

public class ProductDatabase {
    public static Product getProduct(int productId) throws ProductNotFoundException {
        // Подразумевается обращение к базе данных или хранилищу товаров
        // и получение информации о товаре по его ID
        // В данном примере мы используем заглушку
        if (productId == 1) {
            return new Product("Product 1", 10, 5.99);
        } else {
            throw new ProductNotFoundException("Product with ID " + productId + " not found.");
        }
    }
}
