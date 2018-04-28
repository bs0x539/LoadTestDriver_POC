package de.bs0x539.vaadin;

import java.io.IOException;

import com.vaadin.testbench.ScreenshotOnFailureRule;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.vaadin.johannest.loadtestdriver.LoadTestDriver;
import org.vaadin.johannest.loadtestdriver.LoadTestDriverBuilder;

import com.vaadin.testbench.TestBenchTestCase;
import com.vaadin.testbench.elements.ButtonElement;

public class TestFontIconButton extends TestBenchTestCase {

  @Test
  public void testIt() throws IOException {
    $(ButtonElement.class).first().click();
  }
}