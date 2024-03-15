
// a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
// b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
// c. Для хранения фруктов внутри коробки можно использовать ArrayList;
// d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
// e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
// подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
// Можно сравнивать коробки с яблоками и апельсинами;
// f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
// Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
// Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
// g. Не забываем про метод добавления фрукта в коробку.

import java.util.ArrayList;

import Lesson_4.Apple;
import Lesson_4.Box;
import Lesson_4.Fruit;
import Lesson_4.FruitFabric;
import Lesson_4.Orange;

public class Lesson_4 {

    public static void main(String[] args) {

        Double maxWeightforTransport = 10d;
        System.out.println("========================== Фрукты выращенные в саду ==============================");
        ArrayList<Fruit> fruits = FruitFabric.generateFruits(10);
        System.out.println(fruits);
        System.out.println();

        System.out.println("Разбираем фрукты по коробкам с яблоками и апельсинами...");

        System.out.println("========================== Коробка с яблоками ==============================");
        Box<Apple> boxApples = new Box<Apple>(FruitFabric.getApples(fruits));
        System.out.println(boxApples);
        System.out.println();

        System.out.println("========================== Коробка с апельсинами ==============================");
        Box<Orange> boxOrange = new Box<Orange>(FruitFabric.getOranges(fruits));
        System.out.println(boxOrange);
        System.out.println();

        System.out.println("========================== Общий вес получившихся коробок ==============================");
        Double commonWeigh = boxApples.getWeight() + boxOrange.getWeight();
        System.out.println("Общий вес - " + commonWeigh);

        if (commonWeigh > maxWeightforTransport) {
            System.out.printf("Для траспортивки фруктов в магазин, общий вес коробок не должен превышать %s...", maxWeightforTransport);
            System.out.println("\nИщем коробку с наибольши весом...");

            if (!boxOrange.compare(boxApples)) {
                if (boxOrange.getWeight() > boxApples.getWeight()) {
                    System.out.println("Коробка с апельсинами тяжелее коробки с яблоками");
                }
                else {
                    System.out.println("Коробка с яблоками тяжелее коробки с апельсинами");
                }
            }

            System.out.println("========================== Переложим несколько апельсинов в свободную юкоробку ==============================");
            System.out.println();

            Box<Orange> boxOrange1 = new Box<Orange>(boxOrange.getFruits(2));

            System.out.println("========================== Итого: ==============================");
            System.out.println(boxApples);
            System.out.println(boxOrange);
            System.out.println(boxOrange1);
        }


        System.out.println();
        System.out.println("========================== Дальше демострация осташегося функционала условий ==============================");

        System.out.println("========================== Привезенная коробка с яблоками в магазин ==============================");
        Box<Apple> boxApples1 = new Box<Apple>(FruitFabric.generateApples(10));
        System.out.println(boxApples1);
        System.out.println();

        System.out.println("========================== Привезенная коробка с апельсинами в магазин ==============================");
        Box<Orange> boxOrange1 = new Box<Orange>(FruitFabric.generateOranges(10));
        System.out.println(boxOrange1);
        System.out.println();

        System.out.println("========================== Перекладываем все яблоки в магазинную коробку ==============================");
        Box<Apple> boxApples2 = new Box<Apple>(boxApples1.getFruits());
        System.out.println("Информация о привезенной коробки:" + boxApples1);
        System.out.println("Информация о получившейся магазинной коробки:" + boxApples2);

        System.out.println("========================== Перекладываем все апельсины в магазинную коробку ==============================");
        Box<Orange> boxOrange2= new Box<Orange>(boxOrange1.getFruits());
        System.out.println("Информация о привезенной коробки:" + boxOrange1);
        System.out.println("Информация о получившейся магазинной коробки:" + boxOrange2);

    }
}