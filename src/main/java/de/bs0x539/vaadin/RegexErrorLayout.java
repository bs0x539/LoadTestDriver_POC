package de.bs0x539.vaadin;

import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import java.util.Date;

public class RegexErrorLayout extends VerticalLayout {

  private final Button.ClickListener clickListener = (e) -> {
    String content = "Clicked: " + new Date().toString();
    addComponent(new Label(content));
  };

  private final Button iconButton = new Button(FontAwesome.PLAY);
  private final Button textButton = new Button("click");

  public RegexErrorLayout() {
    // iconButton.setId("iconButton"); // Do NOT set ID. This will break this Proof Of Concept
    textButton.setId("textButton");

    iconButton.addClickListener(clickListener);
    textButton.addClickListener(clickListener);

    addComponent(iconButton);
    addComponent(textButton);
  }
}