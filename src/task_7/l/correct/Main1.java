package task_7.l.correct;


public class Main1 {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();

        System.out.println("Привилигированный клиент");
        Customer customer = new PriviligedCustomer(25);
        service.buyProducts(customer);
        System.out.println();


        System.out.println("VIP клиент");
        Customer customer1 = new VipCustomer(25);
        service.buyProducts(customer1);
        System.out.println();

        System.out.println("Новый клиент");
        Customer customer2 = new NewCustomer(25);
        service.buyProducts(customer2);
        System.out.println();


    }
}
