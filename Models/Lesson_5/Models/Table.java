package Models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

public class Table {

    /**
     * Счетчик стола
     */
    private static int counter;

    /**
     * Номер стола
     */
    private int no;

    /**
     * Коллекция данных бронирования
     */
    private Collection<Reservation> reservations = new ArrayList<>();

    /**
     * Метод получения номера стола
     * @return Возвращает имя стола
     */
    public int getNo() {
        return no;
    }

    /**
     * Метод получения коллекции брониравния стола
     * @return Возвращает коллекцию брониравния стола
     */
    public Collection<Reservation> getReservations() {
        return reservations;
    }

    /**
     * TODO: Метод удаления указанного бронирования
     * @return Возвращает коллекцию брониравния стола
     */
    public Boolean deleteReservation(int noReservation) {
        for (Reservation reservation : getReservations()) {
            if (reservation.getId() == noReservation) {
                reservations.remove(reservation);
                return true;
            }
        }
        return false;
    }

    /**
     * Конструктор класса
     */
    public Table(){
        no = ++counter;
    }

    /**
     * Перегруженный метод получения информации по столу
     */
    @Override
    public String toString() {
        return String.format(Locale.getDefault(), "Столик #%d", no);
    }
}
