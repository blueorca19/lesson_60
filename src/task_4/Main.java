package task_4;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);

        new Car("Audi", semaphore);
        new Car("BMW", semaphore);
        new Car("KIA", semaphore);
        new Car("Toyota", semaphore);
        new Car("Honda", semaphore);
    }
}
