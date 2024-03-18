package org.example;

import org.example.models.TableService;
import org.example.presenters.BookingPresenter;
import org.example.presenters.Model;
import org.example.views.BookingView;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Model model = new TableService();
        BookingView view = new BookingView();
        BookingPresenter presenter = new BookingPresenter(model, view);
        presenter.updateTablesView();
        view.reservationTable(new Date(), 2, "Станислав");
        view.changeReservationTable(1001, new Date(), 4, "Станислав");

    }
}