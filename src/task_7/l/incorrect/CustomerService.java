package task_7.l.incorrect;

public class CustomerService {
    public void buyProduct(Customer customer){
        customer.applyDiscaunt();
        customer.getProducts().clear();
        System.out.println("Покупка успешна!");
    }

}
