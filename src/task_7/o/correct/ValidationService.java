package task_7.o.correct;


public class ValidationService {
    public boolean checkPassword(String password) {
        return password.length() >= 5;

    }

    public void checkAge(Customer customer) {
        if (customer.getAge() < 12) {
            System.out.println("Возраст слишком мал");
        }
    }
}
