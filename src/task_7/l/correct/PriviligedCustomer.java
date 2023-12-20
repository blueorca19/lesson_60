package task_7.l.correct;

public class PriviligedCustomer extends Customer {
    public PriviligedCustomer(int age) {
        super(age);
    }

    public void applyDiscount() {
        System.out.println("Скидка применена!");
    }

    @Override
    public void buyProduct() {
        applyDiscount();
        super.buyProduct();
    }
}
