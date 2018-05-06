package de.bs0x539.vaadin;

import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import java.util.Date;

public class CheckboxLayout extends VerticalLayout {

  private final CheckBox checkBox_1 = new CheckBox("First CheckBox");
  private final CheckBox checkBox_2 = new CheckBox("Second CheckBox");

  public CheckboxLayout() {
     checkBox_1.setId("first_checkbox"); // Do NOT set ID. This will break this Proof Of Concept
     checkBox_2.setId("second_checkbox"); // Do NOT set ID. This will break this Proof Of Concept

    checkBox_2.addValueChangeListener((x) -> {System.out.println();});

    addComponent(checkBox_1);
    addComponent(checkBox_2);
  }
}