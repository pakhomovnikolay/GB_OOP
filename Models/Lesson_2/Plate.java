package Lesson_2;
public class Plate {
    private int food;

    /**
     * Конструктор класса
     * @param food Количество еды в тарелке при создании
     */
    public Plate(int food) {
        this.food = food;
    }

    /**
     * Конструктор класса
     * По умолчанию создаст 50 еды для тарелки
     */
    public Plate(){
        this(50);
    }

    /**
     * Метод запроса количества еды
     * @return Возвращает количество иду в тареклке
     */
    public int getFood() {
        return this.food;
    }

    /**
     * Метод добавления еды в тарелку
     * @param food Количество добавляемой еды
     */
    public void setFood(int food){
        if (validationSetFood(food)) {
            this.food = food;
        }
        else {
            this.food = 0;
        }
    }
    
    /**
     * Метод вывода информации об оставшейся еды в тарелки
     */
    public void info() {
        System.out.println("Количесвто оставшейся еды: " + food);
    }

    /**
     * Метод проверки корректности количество добавляемой еды
     * @param food Количество добавляемой еды
     * @return Возаращет истину, если количество боваляемой еду больше или равна минимальному количество - 50 еды.
     */
    private boolean validationSetFood(int food) {
        return food > 0;
    }
}
