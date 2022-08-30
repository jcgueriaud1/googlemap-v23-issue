package com.example.application.views;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import org.vaadin.stefan.fullcalendar.Entry;
import org.vaadin.stefan.fullcalendar.FullCalendar;
import org.vaadin.stefan.fullcalendar.FullCalendarBuilder;
import org.vaadin.stefan.table.Table;
import org.vaadin.stefan.table.TableRow;

import java.time.LocalDate;

@PageTitle("Html table")
@Route(value = "htmltable", layout = MainLayout.class)
public class HtmlTableWorldView extends HorizontalLayout {


    public HtmlTableWorldView() {
        setSizeFull();
        Table table = new Table();

        TableRow headerRow = table.addRow();
        headerRow.addHeaderCell().setText("Hello");
        headerRow.addHeaderCell().setText("World");

        TableRow detailsRow = table.addRow();
        detailsRow.addDataCell().setText("Hello");
        detailsRow.addDataCell().setText("World");
        add(table);
    }

}
