package VendingMachineLLD;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Product, Integer> productInventory = new HashMap<>();

    public void addProduct(Product product, int quantity) {
        productInventory.put(product, productInventory.getOrDefault(product, 0) + quantity);
    }

    public boolean isAvailable(Product product) {
        return productInventory.getOrDefault(product, 0) > 0;
    }

    public void dispenseProduct(Product product) {
        if (isAvailable(product)) {
            productInventory.put(product, productInventory.get(product) - 1);
        }
    }
}
