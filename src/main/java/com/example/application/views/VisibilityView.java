package com.example.application.views;

import com.example.application.components.XPanel;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import de.f0rce.ace.AceEditor;
import de.f0rce.ace.enums.AceMode;
import de.f0rce.ace.enums.AceTheme;

@PageTitle("Visibility")
@Route(value = "visibility", layout = MainLayout.class)
public class VisibilityView extends HorizontalLayout {


    public VisibilityView() {
        XPanel xPanel = new XPanel("test");
        add(new Button("toggle panel", e -> xPanel.toggle()));
        add(xPanel);
    }

}
