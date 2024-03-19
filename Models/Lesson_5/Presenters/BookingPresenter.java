package Presenters;

import java.util.Date;

public class BookingPresenter implements ViewObserver {

    /**
     * Модель данных
     */
    private Model model;

    /**
     * Представление данных
     */
    private View view;

    /**
     * Конструктор класса
     * @param model Модель данных
     * @param view Представление данных
     */
    public BookingPresenter(Model model, View view){
        this.model = model;
        this.view = view;
        this.view.registerObserver(this);
    }

    /**
     * Метод обновления данных стола
     */
    public void updateTablesView(){
        view.showTables(model.loadTables());
    }

    /**
     * Метод обновления данных бронирования
     * @param reservationNo номер бронирования
     */
    private void updateReservationTableView(int reservationNo){
        view.showReservationTableResult(reservationNo);
    }
    
    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        try {
            int reservationNo = model.reservationTable(orderDate, tableNo, name);
            updateReservationTableView(reservationNo);
        }
        catch (Exception e){
            updateReservationTableView(-1);
        }
    }

    /**
     * TODO: Метод обновления данных бронирования после изменения
     * @param reservationNo номер бронирования
     */
    private void updateChangeReservationTableView(int reservationNo){
        view.showChangeReservationTableResult(reservationNo);
    }

    @Override
    public void onСhangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        try {
            int reservationNo = model.reservationTableChange(oldReservation, reservationDate, tableNo, name);
            updateChangeReservationTableView(reservationNo);
            
        } catch (Exception e) {
            updateChangeReservationTableView(-1);
            System.out.println(e);
        }
    }
}
