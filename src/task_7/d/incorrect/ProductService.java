package task_7.d.incorrect;

import java.util.List;

public class ProductService {
    private ProductRepositoryMap repository;

    public ProductService(ProductRepositoryMap repository) {
        this.repository = repository;
    }

    public List<Product> getAll() {
        return repository.getAll();
    }

    public Product getByName(String name) {
        return repository.getByName(name);
    }
}
