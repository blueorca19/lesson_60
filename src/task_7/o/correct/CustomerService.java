package task_7.o.correct;

public class CustomerService {
    public void addProduct(Customer customer, Product product) {
        customer.getProducts().add(product);

    }
}
