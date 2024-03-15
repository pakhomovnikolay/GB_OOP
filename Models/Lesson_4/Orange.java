package Lesson_4;

public class Orange extends Fruit {

    /**
     * Конструктор класаа. Создаем апельсин с весом - 1.5 у.е
     */
    public Orange() {
        super(1.5d);
    }

    /**
     * Метод вывода инфрмации на экран
     */
    @Override
    public String toString() {
        String info = "Апельсин: Вес - " + getWeight();
        return info;
    }
}
