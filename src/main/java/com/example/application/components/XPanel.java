package com.example.application.components;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.icon.VaadinIcon;

public class XPanel extends Composite<Div> {


    public XPanel(String headerTitle) {
        getContent().addClassName("x-panel");
        Button closeButton = new Button(VaadinIcon.CLOSE_BIG.create());
        closeButton.addThemeVariants(ButtonVariant.LUMO_ICON, ButtonVariant.LUMO_TERTIARY);
        closeButton.addClickListener(e -> close());
        getContent().add(new H3(headerTitle), closeButton);
        setVisible(false);
    }

    public void open() {
        if (!isVisible()) {
            setVisible(true);
        }
    }

    public void close() {
        if (isVisible()) {
            setVisible(false);
        }
    }

    public void toggle() {
        if (isVisible()) {
            close();
        } else {
            open();
        }
    }

    public void add(Component... components) {
        getContent().add(components);
    }
}
