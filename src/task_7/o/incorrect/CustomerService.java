package task_7.o.incorrect;

public class CustomerService {
    public void addProduct(Customer customer, Product product) {
        customer.getProducts().add(product);

    }
}
