package de.bs0x539.vaadin.regexError;

import com.vaadin.testbench.elements.TabSheetElement;
import de.bs0x539.vaadin.AbstractLoadTestDriverTest;
import org.junit.Test;

import com.vaadin.testbench.elements.ButtonElement;

import static de.bs0x539.vaadin.MyUI.TAB_SHEET_ELEMENT_REGEX_ERROR_CAPTION;

/**
 * Clicks on a regexError which has a {@link com.vaadin.server.FontIcon} as caption.
 *
 * This results in invalid scala script.
 */
public class TestFontIconButton extends AbstractLoadTestDriverTest {

  @Test
  public void testIt() {
    $(TabSheetElement.class).first().openTab(TAB_SHEET_ELEMENT_REGEX_ERROR_CAPTION);
    $(ButtonElement.class).first().click();
  }
}