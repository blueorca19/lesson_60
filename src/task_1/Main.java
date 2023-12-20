package task_1;

public class Main {
    public static void main(String[] args) {
        // 2 основных способа создания потоков:
        // 1 способ - наследование от класса Thread
        // 2 способ - реализация интерфейса Runnable
        MyThread2 myThread2 = new MyThread2();
        MyThread1 myThread1 = new MyThread1();

        // Вызов метода run напрямую на самом деле не создаёт никаких потоков
//        myThread1.run();
//        myThread2.run();
        // При 1 способе новый поток запускается так:
        myThread1.start();
        // При 2 способе новый поток запускается так:
        Thread thread = new Thread(myThread2);
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Главный поток - " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
