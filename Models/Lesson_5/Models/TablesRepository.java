package Models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import Presenters.Model;

/**
 * Класс имитации БД
 */
public class TablesRepository implements Model {

    /**
     * Коллекция столов
     */
    private Collection<Table> tables;

    
    @Override
    public Collection<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }

        return tables;
    }

    @Override
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table : tables) {
            if (table.getNo() == tableNo) {
                Reservation reservation = new Reservation(table, reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Некорректный номер столика");
    }
    
    @Override
    public int reservationTableChange(int oldReservation, Date reservationDate, int tableNo, String name) {
        Boolean reservationDeleted = false;
        for (Table table : tables) {
            if (table.deleteReservation(oldReservation)) {
                reservationDeleted = true;

                // Чтобы не терять время. При совпадении номера броирования и стола, немедленно создаем новое бронирование, для указанного стола
                if (table.getNo() == tableNo) {
                    return reservationTable(reservationDate, tableNo, name);
                }
            }
        }
        if (!reservationDeleted) {
            throw new RuntimeException("Некорректный номер бронирования");
        }
        else {
            return reservationTable(reservationDate, tableNo, name);
        }
    }
}