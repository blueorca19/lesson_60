package task_7.l.incorrect;

public class NewCustomer extends Customer {
    public NewCustomer(int age) {
        super(age);
    }

    @Override
    public void applyDiscaunt() {
        throw new UnsupportedOperationException("Скидка не применима!");
    }
}
