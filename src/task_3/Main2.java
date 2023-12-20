package task_3;

import java.util.concurrent.CountDownLatch;

public class Main2 {
    public static void main(String[] args) {

        // CountDownLatch
        // Синхронизировать потоки так,
        // чтобы несмотря на их разную скорость,
        // все пассажиры вылетали одновременно на одном самолёте

        int count = 5;
        CountDownLatch latch = new CountDownLatch(count);


        new Passenger2("Иван", latch);
        new Passenger2("Пётр", latch);
        new Passenger2("Сидор", latch);
        new Passenger2("Поликарп", latch);
        new Passenger2("Ефистафий", latch);

        try {
            latch.await();
            System.out.println("Все пассажиры сели в самолет. Взлетаем!");
        } catch (InterruptedException e) {
            System.out.println("Ошибка!");
        }
    }

}


