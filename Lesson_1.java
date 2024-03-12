import Lesson_1.Cheese;

public class Lesson_1 {

    public static void main(String[] args) {
        
        Cheese cheese1 = new Cheese();
        Cheese cheese2 = new Cheese("Брест литовский", 190d);
        Cheese cheese3 = new Cheese("Белорусский", "Белсыр", 250d, "Сыры", "Классический");

        System.out.println(cheese1);
        System.out.println(cheese2);
        System.out.println(cheese3);
    }
}