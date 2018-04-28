package de.bs0x539.vaadin;

import com.vaadin.testbench.ScreenshotOnFailureRule;
import com.vaadin.testbench.TestBenchTestCase;
import com.vaadin.testbench.elements.ButtonElement;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.vaadin.johannest.loadtestdriver.LoadTestDriver;
import org.vaadin.johannest.loadtestdriver.LoadTestDriverBuilder;

import java.io.IOException;

public class TestTextButton extends AbstractLoadTestDriverTest {

  @Test
  public void testIt() throws IOException {
    $(ButtonElement.class).id("textButton").click();
  }
}