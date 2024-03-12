package Lesson_3;

import java.util.Random;

public class EmployeeFabric {
    private static Random random = new Random();

    public static Worker generateWorker(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int salary = random.nextInt(60000, 120001);
        Integer age = random.nextInt(21, 65);
        return Worker.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                salary, age);
    }

    public static Freelancer generateFreelancer(){
        String[] names = new String[] { "Иван", "Максим", "Андрей", "Клим", "Марк", "Тихон", "Альберт", "Тимофей", "Кирилл", "Максим" };
        String[] surnames = new String[] { "Лебедев", "Кириллов", "Князев", "Никифоров", "Попов", "Мальцев", "Никифоров", "Никольский", "Романов", "Колесников" };
        int salary = random.nextInt(4500, 12000);
        Integer age = random.nextInt(21, 65);
        return Freelancer.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                salary, age);
    }

    /**
     * TODO: Переработать метод generateEmployees, метод должен генерировать рабочих
     *  разных типов (Worker, Freelancer) в рамках домашней работы
     * @param count
     * @return
     */
    public static Employee[] generateEmployees(int count){
        Employee[] workers = new Employee[count];
        int length = count / 2;

        if (count % 2 != 0) {
            workers[count - 1] = generateFreelancer();
        }

        for (int i = 0; i < length; i++) {
            int iSh = i * 2;
            workers[iSh] = generateWorker();
            workers[iSh + 1] = generateFreelancer();
        }
        return workers;
    }
}
