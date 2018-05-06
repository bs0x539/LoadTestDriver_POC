package de.bs0x539.vaadin;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Push;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.shared.communication.PushMode;
import com.vaadin.ui.*;

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

  public static final String TAB_SHEET_ELEMENT_BUTTON_CLICK_COUNT_CAPTION = "Button click count";
  public static final String TAB_SHEET_ELEMENT_REGEX_ERROR_CAPTION = "Regex Error";
  public static final String TAB_SHEET_ELEMENT_INVALID_RPC_CALL_ID_CAPTION = "Invalid RPC call ID";
  public static final String TAB_SHEET_ELEMENT_CHECKBOX = "CheckBox";

  @Override
  protected void init(VaadinRequest vaadinRequest) {
    final HorizontalLayout layout = new HorizontalLayout();
    TabSheet tabsheet = new TabSheet();
    layout.addComponent(tabsheet);

    tabsheet.addTab(new ButtonClickCountLayout(), TAB_SHEET_ELEMENT_BUTTON_CLICK_COUNT_CAPTION);
    tabsheet.addTab(new RegexErrorLayout(), TAB_SHEET_ELEMENT_REGEX_ERROR_CAPTION);
    tabsheet.addTab(new InvalidIDLayout(), TAB_SHEET_ELEMENT_INVALID_RPC_CALL_ID_CAPTION);
    tabsheet.addTab(new CheckboxLayout(), TAB_SHEET_ELEMENT_CHECKBOX);

    setContent(layout);
  }

  @WebServlet(urlPatterns = "/*", name = "LoadTestDriver Playground", asyncSupported = true)
  @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
  public static class MyUIServlet extends VaadinServlet {
  }
}