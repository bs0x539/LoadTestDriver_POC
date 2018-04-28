package de.bs0x539.vaadin;

import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ButtonClickCountLayout extends VerticalLayout {

  private final Button.ClickListener clickListener = (e) -> {
    sleep();
    doIt();
    String content = "Clicked: " + new Date().toString() + " - Please wait for new button to show up...";
    addComponent(new Label(content));
  };

  private final Button.ClickListener newClickListener = (e) -> {
    String content = "Clicked on new button: " + new Date().toString();
    addComponent(new Label(content));
  };

  private void sleep() {
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e1) {
      e1.printStackTrace();
    }
  }

  private void doIt() {
    ExecutorService executor = Executors.newSingleThreadExecutor();
    executor.execute(() -> {
      sleep();
      Label newLabel = new Label("Slept 2s in background." + new Date().toString());
      Button newButton = new Button("New Button", ButtonClickCountLayout.this.newClickListener);
      UI.getCurrent().access(() -> {
        ButtonClickCountLayout.this.addComponent(newLabel);
        ButtonClickCountLayout.this.addComponent(newButton);
      });
    });
    executor.shutdown();
  }

  private final Button myButton = new Button("sleep 2s");

  public ButtonClickCountLayout() {
    myButton.setId("myButton");
    myButton.addClickListener(clickListener);
    addComponent(myButton);
  }
}
