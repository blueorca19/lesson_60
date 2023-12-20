package task_7.l.incorrect;

public class Main1 {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        Customer customer = new Customer(25);
        service.buyProduct(customer);

        Customer customer1 = new PriviligedCustomer(25);
        service.buyProduct(customer1);

        Customer customer2 = new NewCustomer(25);
        service.buyProduct(customer2);


    }
}
