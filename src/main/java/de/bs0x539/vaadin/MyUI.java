package de.bs0x539.vaadin;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Push;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.*;

import java.util.Date;

/**
 * This UI is the application entry point. A UI may either represent a browser window
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
@Push
public class MyUI extends UI {

  @Override
  protected void init(VaadinRequest vaadinRequest) {
    final HorizontalLayout layout = new HorizontalLayout();
    TabSheet tabsheet = new TabSheet();
    layout.addComponent(tabsheet);

    tabsheet.addTab(new ButtonClickCountLayout(), "Button click count");
    tabsheet.addTab(new RegexErrorLayout(), "Regex Error");
    tabsheet.addTab(new InvalidIDLayout(), "Invalid RPC call ID");

    setContent(layout);
  }

  @WebServlet(urlPatterns = "/*", name = "LoadTestDriver Playground", asyncSupported = true)
  @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
  public static class MyUIServlet extends VaadinServlet {
  }
}