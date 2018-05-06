package de.bs0x539.vaadin.checkbox;

import com.vaadin.testbench.elements.ButtonElement;
import com.vaadin.testbench.elements.CheckBoxElement;
import com.vaadin.testbench.elements.TabSheetElement;
import de.bs0x539.vaadin.AbstractLoadTestDriverTest;
import org.junit.Test;

import static de.bs0x539.vaadin.MyUI.TAB_SHEET_ELEMENT_BUTTON_CLICK_COUNT_CAPTION;
import static de.bs0x539.vaadin.MyUI.TAB_SHEET_ELEMENT_CHECKBOX;

/**
 * This checks/unchecks checkboxes.
 * One checkbox is identified via the "first" selector and has no ID set.
 * The other checkbox has an ID by which it is selected and then checked.
 */
public class TestCheckBoxClick extends AbstractLoadTestDriverTest {

  @Test
  public void should_Click_On_First_CheckBox() {
    $(TabSheetElement.class).first().openTab(TAB_SHEET_ELEMENT_CHECKBOX);

//    $(CheckBoxElement.class).first().click();
    $(CheckBoxElement.class).id("second_checkbox").click();

  }

//  @Test
//  public void should_Click_On_CheckBox_With_ID() {
//    $(TabSheetElement.class).first().openTab(TAB_SHEET_ELEMENT_CHECKBOX);
//    $(CheckBoxElement.class).id("second_checkbox").click();
//  }
}