package task_7.i.incorrect;

public class Adult implements Person {

    @Override
    public void study() {
        //заглушка, метод здесь не нужен
    }

    @Override
    public void work() {
        System.out.println("Я работаю");

    }

    @Override
    public void walkWithKid() {
        System.out.println("Я гуляю с ребенком");

    }
}
