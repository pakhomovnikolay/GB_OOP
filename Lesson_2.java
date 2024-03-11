import java.util.ArrayList;

public class Lesson_2 {

    public static void main(String[] args) {

        boolean EveryoneIsFull = true;
        Plate plate = new Plate(100);
        plate.info();

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Barsik", 5));
        cats.add(new Cat("Murzik", 15));
        cats.add(new Cat("Tarzik", 25));
        cats.add(new Cat("Zhorik", 50));
        cats.add(new Cat("Pushok", 35));
        cats.add(new Cat("Ryzhyk", 10));
        cats.add(new Cat("Murusya", 20));

        System.out.println("================== Информация о котиках ==================\n");
        for (Cat cat : cats) {
            cat.info();
        }

        System.out.println("\n================== Котики, пора кушать ==================\n");
        System.out.println("================== Ням-ням-ням ==================\n");
        for (Cat cat : cats) {
            cat.eat(plate);
            if (!cat.getSatiety()) {
                EveryoneIsFull = false;
            }
        }

        System.out.println("================== Информация о котиках ==================\n");
        for (Cat cat : cats) {
            cat.info();
        }
        plate.info();
        
        if (!EveryoneIsFull) {
            System.out.println("================== Минуточку... Нужно добавить корма, чтобы накормить всех котиков ==================\n");

            for (Cat cat : cats) {
                if (!cat.getSatiety()) {
                    plate.setFood(cat.getAppetite());
                    cat.eat(plate);
                }
            }
    
            for (Cat cat : cats) {
                cat.info();
            }
    
            plate.info();

            System.out.println("================== Вот как здорово! Все котики наелись ==================");
        }
    }
}
