package Lesson_3;

/**
 * Рабочий (работает с 9 до 18,
 * получает фиксированную заработную плату)
 */
public class Worker extends Employee {
    private Worker(String surName, String name, double salary, Integer age) {
        super(surName, name, salary, age);
    }

    public static Worker create(String surName, String name, double salary, Integer age){
        return new Worker(surName, name, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; ставка: %.2f руб.; заработная плата: %.2f руб.; возраст: %s",
                surName, name, salary, calculateSalary(), age);
    }
}
