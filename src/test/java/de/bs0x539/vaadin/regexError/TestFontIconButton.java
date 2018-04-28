package de.bs0x539.vaadin.regexError;

import java.io.IOException;

import com.vaadin.testbench.ScreenshotOnFailureRule;
import de.bs0x539.vaadin.AbstractLoadTestDriverTest;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.vaadin.johannest.loadtestdriver.LoadTestDriver;
import org.vaadin.johannest.loadtestdriver.LoadTestDriverBuilder;

import com.vaadin.testbench.TestBenchTestCase;
import com.vaadin.testbench.elements.ButtonElement;

/**
 * Clicks on a regexError which has a {@link com.vaadin.server.FontIcon} as caption.
 *
 * This results in invalid scala script.
 */
public class TestFontIconButton extends AbstractLoadTestDriverTest {

  @Test
  public void testIt() {
    $(ButtonElement.class).first().click();
  }
}