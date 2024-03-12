package Lesson_1;
public class Cheese extends Product {

    //#region Поля класса
    /**
     * Тип сыра
     */
    private String сheeseType;
    //#endregion

    //#region Контсрукторы класса
    /**
     * Контсруктор класса
     * @param name Наименование продукта
     * @param brand Бренд продукта
     * @param price Цена продукта
     * @param category Категория продукта
     * @param сheeseType Тип сыра
     */
    public Cheese(String name, String brand, Double price, String category, String сheeseType) {
        super(name, brand, price, category);
        this.сheeseType = сheeseType == null || сheeseType.length() <= 0 ? "Classic" : сheeseType;
    }

    /**
     * Контсруктор класса
     */
    public Cheese() {
        this("<NAME>", "<BRAND>", 1d, "<CATEGORY>", "<TYPE>");
    }

    /**
     * Контсруктор класса
     * @param name Наименование продукта
     * @param price Цена продукта
     */
    public Cheese(String name, Double price) {
        this(name, "<BRAND>", price, "<CATEGORY>", "<TYPE>");
    }
    //#endregion

    //#region Свойства получения данных
    /**
     * @return Возвращает тип сыра
     */
    public String getСheeseTypee(){
        return сheeseType;
    }
    //#endregion

    //#region Свойства записи данных
    /**
     * Метод записи типа сыра
     * @param _сheeseType Тип сыра
     */
    public void setСheeseTypee(String _сheeseType){
        if (validationСheeseType(_сheeseType)) {
            сheeseType = _сheeseType;
        }
    }
    //#endregion

    //#region Методы класса
    @Override
    public String toString() {
        return "\n============= Категория - " + super.category + " =============" +
                "\n\tНаименование - " + super.name +
                "\n\tБренд - " + super.brand +
                "\n\tСтоимость - " + super.price +
                "\n\tТип - " + сheeseType
                ;
    }
    //#endregion

    //#region Функции класса

    /**
     * Проверка введенного имени продукта
     * @param _сheeseType Тип сыра
     * @return Возвращает статус валидности введенного типы сыра
     */
    private Boolean validationСheeseType(String _сheeseType){
        if (_сheeseType == null) return false;
        else if (_сheeseType.length() <= 0) return false;
        return true;
    }
    //#endregion
}
