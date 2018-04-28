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

public class TestTextButton extends TestBenchTestCase {

  @Rule
  public ScreenshotOnFailureRule screenshotOnFailureRule = new ScreenshotOnFailureRule(this, true);

  @Before
  public void init() {
    final WebDriver driver = new LoadTestDriverBuilder().withIpAddress(LoadTestDriver.getLocalIpAddress())
      .withNumberOfConcurrentUsers(1).withRampUpTimeInSeconds(1).withTestName("TestTextButton")
      .withPath("gatling").withResourcesPath("./gatling").withStaticResourcesIngnoring().withTestRefactoring()
      .build();
    setDriver(driver);
  }

  @Test
  public void testIt() throws IOException {
    getDriver().get("http://xps13:8080/");
    $(ButtonElement.class).id("textButton").click();
    testBench().compareScreen("x");
  }
}