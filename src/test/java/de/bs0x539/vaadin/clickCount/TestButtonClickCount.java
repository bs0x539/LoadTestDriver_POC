package de.bs0x539.vaadin.clickCount;

import com.vaadin.testbench.elements.ButtonElement;
import com.vaadin.testbench.elements.TabSheetElement;
import com.vaadin.ui.TabSheet;
import de.bs0x539.vaadin.AbstractLoadTestDriverTest;
import org.junit.Test;

import static de.bs0x539.vaadin.MyUI.TAB_SHEET_ELEMENT_BUTTON_CLICK_COUNT_CAPTION;

/**
 * This clicks on a button, waits for some time for a new button to appear and then clicks on that (new) button.
 * When clicking the first button, the application will do the following:
 * - sleep the UI thread for 2 seconds
 * - update the UI
 * - launch another thread which
 *   - sleeps for 2 seconds
 *   - updates the UI
 */
public class TestButtonClickCount extends AbstractLoadTestDriverTest {

  @Test
  public void testIt() {
    $(TabSheetElement.class).first().openTab(TAB_SHEET_ELEMENT_BUTTON_CLICK_COUNT_CAPTION);
    $(ButtonElement.class).first().click();
    sleep(5000);
    $(ButtonElement.class).id("newButton").click();
  }

  private void sleep(final int milliseconds) {
    try {
      Thread.sleep(milliseconds);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}