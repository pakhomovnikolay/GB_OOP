package Lesson_4;

import java.util.ArrayList;

public class FruitFabric {

    /**
     * Метод генерации фрукта типа яблоко
     * @return Возвращает фрукт типа яблоко
     */
    public static Apple generateApple(){
        Apple apple = new Apple();
        return apple;
    }

    /**
     * Метод генерации фрукта типа апельсин
     * @return Возвращает фрукт типа апельсин
     */
    public static Orange generateOrange(){
        Orange orange = new Orange();
        return orange;
    }
    
    /**
     * Метод генерации фруктов типа яблоко и апельсин
     * @param count Количество необходимых фруктов
     * @return Возвращает коллекцию фруктов
     */
    public static ArrayList<Fruit> generateFruits(int count){
        ArrayList<Fruit> fruit = new ArrayList<>();
        int length = count / 2;

        if (count % 2 != 0) {
            fruit.add(generateApple());
        }

        for (int i = 0; i < length; i++) {
            fruit.add(generateApple());
        }
        for (int i = 0; i < length; i++) {
            fruit.add(generateOrange());
        }
        return fruit;
    }

    /**
     * Метод генерации фруктов типа яблоко
     * @param count Необходимо количество яблок
     * @return Возвращает коллекцию яблок
     */
    public static ArrayList<Apple> generateApples(int count){
        ArrayList<Apple> apples = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            apples.add(generateApple());
        }
        return apples;
    }

    /**
     * Метод генерации фруктов типа апельсин
     * @param count Необходимо количество апельсинов
     * @return Возвращает коллекцию апельсин
     */
    public static ArrayList<Orange> generateOranges(int count){
        ArrayList<Orange> oranges = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            oranges.add(generateOrange());
        }
        return oranges;
    }

    /**
     * Метод получения яблок из коллекции фруктов
     * @param fruits Коллекиция фруктов
     * @return Возвращает коллекцию яблок
     */
    public static ArrayList<Apple> getApples(ArrayList<Fruit> fruits) {
        ArrayList<Apple> apples = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit instanceof Apple) {
                apples.add((Apple)fruit);
            }
        }
        return apples;
    }

    /**
     * Метод получения апельсинов из коллекции фруктов
     * @param fruits Коллекиция фруктов
     * @return Возвращает коллекцию апельсин
     */
    public static ArrayList<Orange> getOranges(ArrayList<Fruit> fruits) {
        ArrayList<Orange> oranges = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit instanceof Orange) {
                oranges.add((Orange)fruit);
            }
        }
        return oranges;
    }
}
