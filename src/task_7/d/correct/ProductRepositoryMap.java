package task_7.d.correct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepositoryMap implements ProductRepository{
    Map<String, Product> products = new HashMap<>();

    public ProductRepositoryMap() {
        products.put("Banana", new Product("Banana"));
        products.put("Orange", new Product("Orange"));
        products.put("Apple", new Product("Apple"));
    }

    public List<Product> getAll() {
        return new ArrayList<>(products.values());
    }

    public Product getByName(String name) {
        return products.get(name);
    }

}
