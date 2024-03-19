import java.util.Date;

import Views.BookingView;
import Models.TablesRepository;
import Presenters.BookingPresenter;


public class Lesson_5 {

     /**
     * TODO: ДОМАШНЯЯ РАБОТА
     * Метод changeReservationTable должен ЗАРАБОТАТЬ!
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        TablesRepository tablesRepository = new TablesRepository();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tablesRepository, bookingView);
        bookingPresenter.updateTablesView();
        bookingView.reservationTable(new Date(), 2, "Станислав");

        /**
         * TODO: ДОМАШНЯЯ РАБОТА
         * Метод changeReservationTable вроде заработал :)
         */
        bookingView.changeReservationTable(1001, new Date(), 4, "Станислав");

        bookingView.changeReservationTable(1002, new Date(), 4, "Николай");

        bookingView.changeReservationTable(1000, new Date(), 4, "Николай");

        bookingView.changeReservationTable(1003, new Date(), 10, "Николай");
    }
}
