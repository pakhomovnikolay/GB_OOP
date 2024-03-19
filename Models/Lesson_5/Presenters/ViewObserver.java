package Presenters;

import java.util.Date;

public interface ViewObserver {

    /**
     * Метод подписания за наблюдением бронирования столов
     * @param orderDate Дата бронирования
     * @param tableNo Номер стола
     * @param name Имя гостя
     */
    void onReservationTable(Date orderDate, int tableNo, String name);

    /**
     * TODO: Метод подписания за наблюдением изменения бронирования столов
     * @param oldReservation Текущий номер бронироания
     * @param reservationDate Дата бронирования
     * @param tableNo Номер стола
     * @param name Имя гостя
     */
    void onСhangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);

}
