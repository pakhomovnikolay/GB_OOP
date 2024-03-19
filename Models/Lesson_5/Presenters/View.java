package Presenters;

import java.util.Collection;

import Models.Table;

public interface View {

    /**
     * Метод отображения коллекции столов
     * @param tables Возвращает коллекцию столов
     */
    void showTables(Collection<Table> tables);

    /**
     * Метод отображения номера бронирования
     * @param reservationNo Номер бронирования
     */
    void showReservationTableResult(int reservationNo);

    /**
     * TODO: Метод отображения номера бронирования после изменения броинрования
     * @param reservationNo Номер бронирования
     */
    void showChangeReservationTableResult(int reservationNo);

    /**
     * Метод регистрации наблюдателя
     * @param observer Наблюдатель для регистрации
     */
    void registerObserver(ViewObserver observer);
}
