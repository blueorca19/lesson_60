package task_7.i.correct;

public class Adult implements Parent, Employee, Student{
    @Override
    public void work() {
        System.out.println("Я работаю!");
    }

    @Override
    public void walkWithKid() {
        System.out.println("Я гуляю с ребенком!");
    }

    @Override
    public void study() {
        System.out.println("Я учусь!");
    }
}
