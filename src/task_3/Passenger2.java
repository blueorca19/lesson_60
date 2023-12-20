package task_3;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Passenger2 extends Thread {
    private final CountDownLatch latch;
    private static long timeFly;

    public Passenger2(String name, CountDownLatch latch) {
        this.latch = latch;
        setName(name);
        start();
    }

    @Override
    public void run() {
        try {
            long start = System.currentTimeMillis();
            Random random = new Random();
            int millis = random.nextInt(9000) + 1000;
            Thread.sleep(millis);
            System.out.printf("%s вошёл в аэропорт.%n", getName());
            Thread.sleep(millis);
            System.out.printf("%s сдал багаж и зарегистрировался.%n", getName());
            Thread.sleep(millis);
            System.out.printf("%s прошёл паспортный контроль.%n", getName());
            Thread.sleep(millis);
            System.out.printf("%s совершает посадку в самолёт.%n", getName());
            Thread.sleep(millis);
            Thread.sleep(2000);
            System.out.printf("%s завершил посадку в самолёт.%n", getName());

            synchronized (Passenger2.class) {
                if (timeFly == 0) {
                    timeFly = System.currentTimeMillis();
                }
            }
            latch.countDown();

            latch.await();

            System.out.printf("%s вылетел, время вылета - %d.%n",
                    getName(), (System.currentTimeMillis() - start) / 1000);


        } catch (InterruptedException e) {
            System.out.println("Ошибка!");
        }
    }
}