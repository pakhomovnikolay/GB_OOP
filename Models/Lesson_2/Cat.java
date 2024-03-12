package Lesson_2;
public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    /**
     * Конструктор класса
     * @param name Имя создаваемого кота
     * @param appetite Объем еды, необходимый для сытости кота за прием пищи
     */
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    /**
     * Мотод получения имени коты
     * @return Возвращает имя кота
     */
    public String getName() {
        return this.name;
    }

    /**
     * Мотод получения аппетита кота
     * @return Возвращает аппетит кота
     */
    public int getAppetite() {
        return this.appetite;
    }

    /**
     * Мотод получения статуса сытости кота
     * @return Возвращает истину, если кот сыт
     */
    public boolean getSatiety() {
        return this.satiety;
    }
    
    /**
     * Метод запускает прием пищи для кота
     * @param plate Данные тарелки
     */
    public void eat(Plate plate) {
        if ((plate.getFood() - this.appetite) < 0) {
            this.satiety = false;
        }
        else {
            this.satiety = true;
            plate.setFood(plate.getFood() - this.appetite);
        }
    }

    public void info() {
        String n = "Имя кота - " + this.name + ", ";
        String a = "Аппетит кота - " + this.appetite + ", ";
        String satiety = "Сытость - " + (this.satiety ? "Сыт" : "Голоден");


        System.out.println(n + a + satiety);
    }
}
