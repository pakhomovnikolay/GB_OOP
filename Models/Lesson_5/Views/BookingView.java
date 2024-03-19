package Views;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import Models.Table;
import Presenters.View;
import Presenters.ViewObserver;

public class BookingView implements View {

    private Collection<ViewObserver> observers;

    @Override
    public void registerObserver(ViewObserver observer) {
        if (observers == null)
            observers = new ArrayList<>();
        observers.add(observer);
    }

    @Override
    public void showTables(Collection<Table> tables) {
        for (Table table: tables) {
            System.out.println(table);
        }
    }

    @Override
    public void showReservationTableResult(int reservationNo) {
        if (reservationNo > 0){
            System.out.printf("Столик успешно забронирован. Номер брони: #%d\n", reservationNo);
        }
        else {
            System.out.println("Произошла ошибка при попытке забронировать столик.\nПовторите операцию позже.");
        }
    }

    @Override
    public void showChangeReservationTableResult(int reservationNo) {
        if (reservationNo > 0){
            System.out.printf("Бронирование упешно изменено. Новый номер брони: #%d\n", reservationNo);
        }
        else {
            System.out.println("Произошла ошибка при попытке изменения бронирования столика.\nПовторите операцию позже.");
        }
    }

    /**
     * Метод бронирования стола
     * @param orderDate Дата бронирования
     * @param tableNo Номер стола
     * @param name Имя гостя
     */
    public void reservationTable(Date orderDate, int tableNo, String name){
        if (observers != null)
            for (ViewObserver observer : observers){
                observer.onReservationTable(orderDate, tableNo, name);
            }
    }

    /**
     * Метод изменения бронирования стола
     * @param oldReservation Текущий номер брони
     * @param reservationDate Дата бронирования
     * @param tableNo Номер стола
     * @param name  Имя гостя
     */
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        if (observers != null)
            for (ViewObserver observer : observers){
                observer.onСhangeReservationTable(oldReservation, reservationDate, tableNo, name);
            }
    }
    
}

