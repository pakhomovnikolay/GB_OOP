package Models;

import java.util.Date;

public class Reservation {

    /**
     * Счетчик бронирования
     */
    private static int counter = 1000;

    /**
     * Номер бронирования
     */
    private int id;

    /**
     * Время бронирования
     */
    private Date date;

    /**
     * Имя гостя для бронирования
     */
    private String name;

    /**
     * Стол бронирования
     */
    private Table table;

    /**
     * Конструктор класса
     * @param table Стол бронирования
     * @param date Дата бронирования
     * @param name Имя гостя
     */
    public Reservation(Table table, Date date, String name) {
        id = ++counter;
        this.table = table;
        this.date = date;
        this.name = name;
    }

    /**
     * Метод указания стола для бронирования
     * @param table стол бронирования
     */
    public void setTable(Table table) {
        this.table = table;
    }

    /**
     * Метод получения идентификатора бронирования
     * @return Возвращает идентификатор бронирования
     */
    public int getId() {
        return id;
    }

    /**
     * Метод получения даты бронирования
     * @return Возвращет дату бронирования
     */
    public Date getDate() {
        return date;
    }

    /**
     * Метод получения имя гостя бронирования
     * @return Возвращет имя гостя бронирования
     */
    public String getName() {
        return name;
    }

    /**
     * Метод получения стола бронирования
     * @return Возвращет стол бронирования
     */
    public Table getTable() {
        return table;
    }
}
