package Lesson_6;

public class Order {

    //#region Поля класса

    /**
     * Имя клиента
     */
    private String clientName;

    /**
     * Продукт
     */
    private String product;

    /**
     * Количество
     */
    private int qnt;

    /**
     * Цена
     */
    private double price;

    //#endregion

    //#region Конструктор класса

    /**
     * 
     * @param clientName Имя клиента
     * @param product Продукт
     * @param qnt Количество
     * @param price Цена
     */
    public Order(String clientName, String product, int qnt, double price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    //#endregion

    //#region Свойства класса

    /**
     * 
     * @return Возвращет имя клиента
     */
    public String getClientName() {
        return clientName;
    }


    /**
     * 
     * @return Возвращет наименование продукта
     */
    public String getProduct() {
        return product;
    }

    /**
     * 
     * @return Возвращет количество
     */
    public int getQnt() {
        return qnt;
    }

    /**
     * 
     * @return Возвращет цену
     */
    public double getPrice() {
        return price;
    }
    
    /**
     * Установить имя клиента
     * @param clientName
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * Установить наименование продукта
     * @param product
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * Установить количество
     * @param qnt
     */
    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    /**
     * Установить цену
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    //#endregion
}
