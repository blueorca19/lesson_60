package task_2;


public class Main {
    private static int counter = 0;

    public static synchronized void increment() {
        counter++;
    }

    public static void main(String[] args) {
        // Есть 3 потока.
        // Задача каждого потока - увеличить переменную на единицу миллион раз.
        // После этого вывести значение переменной в консоль.
        // Ожидаемый результат - 3 000 000.
//        for (int i = 0; i < 1_000_000; i++) {
//            counter++;
//            System.out.println(counter);

//        }
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();

        myThread1.start();
        myThread2.start();
        myThread3.start();
        try {
            myThread1.join();
            myThread2.join();
            myThread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Окончательное значение - " + counter);
    }
}
