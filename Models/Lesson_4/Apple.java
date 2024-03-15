package Lesson_4;

public class Apple extends Fruit {

    /**
     * Конструктор класаа. Создаем яблоко с весом - 1 у.е
     */
    public Apple() {
        super(1.0d);
    }

    /**
     * Метод вывода инфрмации на экран
     */
    @Override
    public String toString() {
        String info = "Яблоко: Вес - " + getWeight();
        return info;
    }
}
