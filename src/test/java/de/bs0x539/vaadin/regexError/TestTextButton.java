package de.bs0x539.vaadin.regexError;

import com.vaadin.testbench.ScreenshotOnFailureRule;
import com.vaadin.testbench.TestBenchTestCase;
import com.vaadin.testbench.elements.ButtonElement;
import de.bs0x539.vaadin.AbstractLoadTestDriverTest;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.vaadin.johannest.loadtestdriver.LoadTestDriver;
import org.vaadin.johannest.loadtestdriver.LoadTestDriverBuilder;

import java.io.IOException;

/**
 * Clicks on normal {@link com.vaadin.ui.Button} which has text as caption.
 *
 * This will result in valid scala script.
 */
public class TestTextButton extends AbstractLoadTestDriverTest {

  @Test
  public void testIt() {
    $(ButtonElement.class).id("textButton").click();
  }
}