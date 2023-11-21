package order;

import model.Product;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private List<Product> products;

    public Order(String orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public String getOrderId() { return orderId; }
    public List<Product> getProducts() { return products; }
}
