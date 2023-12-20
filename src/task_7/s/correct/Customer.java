package task_7.s.correct;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int age;
    List<Product> products = new ArrayList<>();

    public Customer(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public List<Product> getProducts() {
        return products;
    }
}
