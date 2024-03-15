package Lesson_4;
import java.util.ArrayList;

public class Box<T extends Fruit> {

    /**
     * Коллекция фруктов
     */
    private ArrayList<T> fruits;

    /**
     * Конструктор класса
     * @param fruits Коллекция фруктов укладываемая в коробку при её создании
     */
    public Box(ArrayList<T> fruits) {
        this.fruits = new ArrayList<>(fruits);
    }

    /**
     * Метод получения количества фруктов в коробке
     * @return Возвращает количество фруктов в коробке
     */
    public int countFruit(){
        return fruits.size();
    }

    /**
     * Метод получения веса коробки
     * @return Возвращает вес коробки с учетом веса каждого фрукта
     */
    public double getWeight(){
        double sum = 0;
        for (T t : fruits) {
            sum += t.getWeight();
        }
        return sum;
    }

    /**
     * Метод забирает все фруты из коробки
     * @return Возвращает все фрукты коробки
     */
    public ArrayList<T> getFruits() {
        ArrayList<T> result = this.fruits;
        this.fruits = new ArrayList<>();
        return result;
    }

    /**
     * Метод забирает указанное количество фрутов из коробки
     * @return Возвращает все фрукты коробки
     */
    public ArrayList<T> getFruits(int count) {
        ArrayList<T> result = new ArrayList<>();
        while (count > 0) {
            result.add(this.fruits.get(count - 1));
            this.fruits.remove(count - 1);
            count--;
        }
        return result;
    }

    /**
     * Метод добавления фрукта в коробку
     * @param fruit Фрукт для добавления
     */
    public void addFruit(T fruit) {
        this.fruits.add(fruit);
    }

    /**
     * Метод добавления фруктов в коробку
     * @param fruits Коллекция фруктов для добавления
     */
    public void addFruits(ArrayList<T> fruits) {
        this.fruits.addAll(fruits);
    }

    /**
     * Метод сравнения коробок по весу
     * @param box Коробка с фруктами
     * @return Фозвращает истину если коробки равны
     */
    public Boolean compare(Box box) {
        if (this.getWeight() == box.getWeight()) {
            return true;
        }
        else return false;
    }

    /**
     * Метод вывода инфрмации на экран
     */
    @Override
    public String toString() {
        String info = "Вес коробки - " + getWeight() + "\nДанные по фруктам: " +  fruits.toString();
        return info;
        
    }
}
