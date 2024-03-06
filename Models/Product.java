package Models;

/**
 * Шаблон продукта
 */
public class Product {

    //#region Поля класса
    protected String name;
    protected String brand;
    protected Double price;
    protected String category;
    //#endregion

    //#region Контсрукторы класса
    /**
     * Контсруктор класса
     * @param name Наименование продукта
     * @param brand Бренд продукта
     * @param price Цена продукта
     * @param category Категория продукта
     */
    public Product(String name, String brand, Double price, String category) {
        this.name = name == null || name.length() < 3 ? "<NAME>" : name;
        this.brand = brand == null || brand.length() < 3 ? "<BRAND>" : brand;
        this.price = price <= 0 ? 1d : price;
        this.category = category == null || category.length() < 3 ? "<CATEGORY>" : category;
    }

    /**
     * Контсруктор класса
     */
    public Product() {
        this("<NAME>", "<BRAND>", 1d, "<CATEGORY>");
    }

    /**
     * Контсруктор класса
     * @param _nnameame Наименование продукта
     * @param price Цена продукта
     */
    public Product(String name, Double price) {
        this(name, "<BRAND>", price, "<CATEGORY>");
    }
    //#endregion

    //#region Свойства получения данных
    /**
     * @return Возвращает наименование продукта
     */
    public String getName(){
        return name;
    }

    /**
     * @return Возвращает бренд продукта
     */
    public String getBrand(){
        return brand;
    }

    /**
     * @return Возвращает цену продукта
     */
    public Double getPrice(){
        return price;
    }

    /**
     * @return Возвращает категорию принадлежности продукта
     */
    public String getCategory(){
        return category;
    }
    //#endregion

    //#region Свойства записи данных
    /**
     * Метод записи наименования продукта
     * @param _name Наименование продукта
     */
    public void setName(String _name){
        if (validationName(_name)) {
            name = _name;
        }
        else {
            sendMessage("Неверный формат имени. Повторите ввод");
        }
    }

    /**
     * Метод записи бренда продукта
     * @param _brand Бренд продукта
     */
    public void setBrand(String _brand){
        if (validationBrand(_brand)) {
            brand = _brand;
        }
        else {
            sendMessage("Неверный формат бренда. Повторите ввод");
        }
    }

    /**
     * Метод записи стоимости продукта
     * @param _price Стоимость продукта
     */
    public void setPrice(Double _price){
        if (validationPrice(_price)) {
            price = _price;
        }
        else {
            sendMessage("Неверный формат стоимости. Повторите ввод");
        }
    }

    /**
     * Метод записи категории принадлежности продукта
     * @param _category Категории принадлежности продукта
     */
    public void setCategory(String _category){
        if (validationCategory(_category)) {
            category = _category;
        }
        else {
            sendMessage("Неверный формат категории. Повторите ввод");
        }
    }
    //#endregion

    //#region Методы класса
    public void getInfoProduct() {
        System.out.printf("Наименование - %s, Бренд - %s, Стоимость - %s, Категория - %s", this.name, this.brand, this.price, this.category);
    }
    //#endregion

    //#region Функции класса

    /**
     * Проверка введенного имени продукта
     * @param name Имя продукта
     * @return Возвращает статус валидности введенного наименования продукта
     */
    private Boolean validationName(String name){
        if (name == null) return false;
        else if (name.length() <= 0) return false;
        else if (name.contains("[],{},||,<>,//")) return false;
        return true;
    }

    /**
     * Проверка введенного бренда продукта
     * @param brand Бренд продукта
     * @return Возвращает статус валидности введенного бренда продукта
     */
    private Boolean validationBrand(String brand){
        if (brand == null) return false;
        else if (brand.length() <= 0) return false;
        return true;
    }

    /**
     * Проверка введенной стоимости продукта
     * @param price Стоимость продукта
     * @return Возвращает статус валидности введенной стоимости продукта
     */
    private Boolean validationPrice(Double price){
        if (price < 200) return false;
        return true;
    }

    /**
     * Проверка введенной категории продукта
     * @param category Категория продукта
     * @return Возвращает статус валидности введенной категории продукта
     */
    private Boolean validationCategory(String category){
        if (brand == null) return false;
        else if (brand.length() <= 0) return false;
        return true;
    }

    private void sendMessage(String message){

        System.out.println(message);
    }
    //#endregion

}
