package de.bs0x539.vaadin;

import com.vaadin.testbench.TestBenchTestCase;
import com.vaadin.testbench.elements.ButtonElement;
import com.vaadin.testbench.parallel.ParallelTest;
import com.vaadin.testbench.parallel.ParallelTestSuite;
import com.vaadin.ui.Button;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.vaadin.johannest.loadtestdriver.LoadTestDriver;
import org.vaadin.johannest.loadtestdriver.LoadTestDriverBuilder;

import java.io.IOException;

public class TestFontIconButton extends TestBenchTestCase {


  @Before
  public void init() {
      WebDriver driver = new LoadTestDriverBuilder().
          withIpAddress(LoadTestDriver.getLocalIpAddress()).
          withNumberOfConcurrentUsers(1).
          withRampUpTimeInSeconds(1).
          withTestName("TestFontIconButton").
          withPath("./gatling").
          withResourcesPath("./gatling").
          withStaticResourcesIngnoring().
          withTestRefactoring().
          build();
      setDriver(driver);
  }

  @Test
  public void testIt() throws IOException {
    $(ButtonElement.class).first().click();
    testBench().compareScreen("x");
  }
}