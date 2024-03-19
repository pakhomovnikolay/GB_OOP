package Presenters;

import java.util.Collection;
import java.util.Date;

import Models.Table;

public interface Model {

    /**
     * Метод получения столов
     * @return Возвращает коллекцию стлов
     */
    Collection<Table> loadTables();

    /**
     * Метод бронирования стола
     * @param reservationDate Дата бронирования
     * @param tableNo Номер столика
     * @param name Имя гостя
     * @return Возвращет номер бронирования
     */
    int reservationTable(Date reservationDate, int tableNo, String name);

    /**
     * TODO: Метод изменения бронирования стола
     * @param oldReservation Текущий номер броинрования
     * @param reservationDate Дата бронирования
     * @param tableNo Номер столика
     * @param name Имя гостя
     * @return Возвращет номер бронирования
     */
    int reservationTableChange(int oldReservation, Date reservationDate, int tableNo, String name);
}
