package task_7.s.correct;

public class CustomerService {
    public void addProduct(Customer customer, Product product) {
        customer.getProducts().add(product);

    }
}
