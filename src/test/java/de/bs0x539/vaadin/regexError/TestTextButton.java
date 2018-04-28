package de.bs0x539.vaadin.regexError;

import com.vaadin.testbench.elements.ButtonElement;
import com.vaadin.testbench.elements.TabSheetElement;
import de.bs0x539.vaadin.AbstractLoadTestDriverTest;
import org.junit.Test;

import static de.bs0x539.vaadin.MyUI.TAB_SHEET_ELEMENT_REGEX_ERROR_CAPTION;

/**
 * Clicks on normal {@link com.vaadin.ui.Button} which has text as caption.
 *
 * This will result in valid scala script.
 */
public class TestTextButton extends AbstractLoadTestDriverTest {

  @Test
  public void testIt() {
    $(TabSheetElement.class).first().openTab(TAB_SHEET_ELEMENT_REGEX_ERROR_CAPTION);
    $(ButtonElement.class).id("textButton").click();
  }
}