package Lesson_4;

public abstract class Fruit {

    /**
     * Вес фрукта
     */
    protected double weight;

    /**
     * Кончтруктор класса
     * @param weight Вес фрукта
     */
    public Fruit(double weight) {
        this.weight = weight;
    }

    /**
     * Метод получения веса фрукта
     * @return
     */
    public double getWeight() {
        return this.weight;
    }
}
