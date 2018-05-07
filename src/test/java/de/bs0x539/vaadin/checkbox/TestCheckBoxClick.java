package de.bs0x539.vaadin.checkbox;

import static de.bs0x539.vaadin.MyUI.TAB_SHEET_ELEMENT_CHECKBOX;

import org.junit.Test;

import com.vaadin.testbench.elements.ButtonElement;
import com.vaadin.testbench.elements.CheckBoxElement;
import com.vaadin.testbench.elements.TabSheetElement;

import de.bs0x539.vaadin.AbstractLoadTestDriverTest;
import de.bs0x539.vaadin.CheckboxLayout;

/**
 * This checks a checkbox referenced via it's ID in the DOM.
 *
 * It should show, that if the ID contains special chars, these special chars are not escaped properly before
 * being put into the regular expression to extract Vaadin's internal ID of the element.
 */
public class TestCheckBoxClick extends AbstractLoadTestDriverTest {

  @Test
  public void testIt() {
    $(TabSheetElement.class).first().openTab(TAB_SHEET_ELEMENT_CHECKBOX);

    $(ButtonElement.class).first().click();
    $(CheckBoxElement.class).id(CheckboxLayout.ELEMENT_ID).click();
  }

}