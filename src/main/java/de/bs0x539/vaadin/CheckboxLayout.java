package de.bs0x539.vaadin;

import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.VerticalLayout;

public class CheckboxLayout extends VerticalLayout {

  public static final String ELEMENT_ID = "ID$WITH$SPECIAL$CHARS";

  private final CheckBox checkBox_1 = new CheckBox("First CheckBox");

  private CheckBox checkBox_2;

  private final Button.ClickListener clickListener = (e) -> {
    this.checkBox_2 = new CheckBox("Second CheckBox");

    this.checkBox_2.setId(ELEMENT_ID);
    this.checkBox_2.addValueChangeListener((x) -> {
      this.checkBox_1.setValue((Boolean)x.getProperty().getValue());
    });

    addComponent(this.checkBox_2);
  };

  public CheckboxLayout() {
    addComponent(this.checkBox_1);
    addComponent(new Button("Add second checkbox", this.clickListener));
  }
}