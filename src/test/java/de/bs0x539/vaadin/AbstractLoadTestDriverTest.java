package de.bs0x539.vaadin;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.openqa.selenium.WebDriver;
import org.vaadin.johannest.loadtestdriver.LoadTestDriver;
import org.vaadin.johannest.loadtestdriver.LoadTestDriverBuilder;

import com.vaadin.testbench.ScreenshotOnFailureRule;
import com.vaadin.testbench.TestBenchTestCase;

public class AbstractLoadTestDriverTest extends TestBenchTestCase {
  // local hostname or IP address of this machine. Must not be loopback address!
  private static final String HOSTNAME = "10.0.2.50";

  @Rule
  public ScreenshotOnFailureRule screenshotOnFailureRule = new ScreenshotOnFailureRule(this, true);

  @Before
  public void init() {
    final WebDriver driver = new LoadTestDriverBuilder().withIpAddress(LoadTestDriver.getLocalIpAddress())
        .withNumberOfConcurrentUsers(1).withRampUpTimeInSeconds(1).withTestName(getClass().getSimpleName())
        .withPath("gatling").withResourcesPath("./gatling").withStaticResourcesIngnoring().withTestRefactoring()
        .build();
    setDriver(driver);
    driver.get("http://" + HOSTNAME + ":8080/");
  }

  @After
  public void teardown() throws IOException {
    testBench().compareScreen("");
  }

}